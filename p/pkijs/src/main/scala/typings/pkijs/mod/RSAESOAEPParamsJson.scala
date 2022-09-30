package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSAESOAEPParamsJson extends StObject {
  
  var hashAlgorithm: js.UndefOr[AlgorithmIdentifierJson] = js.undefined
  
  var maskGenAlgorithm: js.UndefOr[AlgorithmIdentifierJson] = js.undefined
  
  var pSourceAlgorithm: js.UndefOr[AlgorithmIdentifierJson] = js.undefined
}
object RSAESOAEPParamsJson {
  
  inline def apply(): RSAESOAEPParamsJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RSAESOAEPParamsJson]
  }
  
  extension [Self <: RSAESOAEPParamsJson](x: Self) {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setMaskGenAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMaskGenAlgorithmUndefined: Self = StObject.set(x, "maskGenAlgorithm", js.undefined)
    
    inline def setPSourceAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "pSourceAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPSourceAlgorithmUndefined: Self = StObject.set(x, "pSourceAlgorithm", js.undefined)
  }
}
