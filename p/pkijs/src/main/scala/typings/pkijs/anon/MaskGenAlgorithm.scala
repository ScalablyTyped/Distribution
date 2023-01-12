package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskGenAlgorithm extends StObject {
  
  var hashAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var maskGenAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var pSourceAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
}
object MaskGenAlgorithm {
  
  inline def apply(): MaskGenAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskGenAlgorithm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaskGenAlgorithm] (val x: Self) extends AnyVal {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setMaskGenAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMaskGenAlgorithmUndefined: Self = StObject.set(x, "maskGenAlgorithm", js.undefined)
    
    inline def setPSourceAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "pSourceAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPSourceAlgorithmUndefined: Self = StObject.set(x, "pSourceAlgorithm", js.undefined)
  }
}
