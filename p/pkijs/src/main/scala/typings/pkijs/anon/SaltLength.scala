package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaltLength extends StObject {
  
  var hashAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var maskGenAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var saltLength: js.UndefOr[String] = js.undefined
  
  var trailerField: js.UndefOr[String] = js.undefined
}
object SaltLength {
  
  inline def apply(): SaltLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaltLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaltLength] (val x: Self) extends AnyVal {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setMaskGenAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMaskGenAlgorithmUndefined: Self = StObject.set(x, "maskGenAlgorithm", js.undefined)
    
    inline def setSaltLength(value: String): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
    
    inline def setTrailerField(value: String): Self = StObject.set(x, "trailerField", value.asInstanceOf[js.Any])
    
    inline def setTrailerFieldUndefined: Self = StObject.set(x, "trailerField", js.undefined)
  }
}
