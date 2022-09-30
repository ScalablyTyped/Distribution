package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSASSAPSSParamsJson extends StObject {
  
  var hashAlgorithm: js.UndefOr[AlgorithmIdentifierJson] = js.undefined
  
  var maskGenAlgorithm: js.UndefOr[AlgorithmIdentifierJson] = js.undefined
  
  var saltLength: js.UndefOr[Double] = js.undefined
  
  var trailerField: js.UndefOr[Double] = js.undefined
}
object RSASSAPSSParamsJson {
  
  inline def apply(): RSASSAPSSParamsJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RSASSAPSSParamsJson]
  }
  
  extension [Self <: RSASSAPSSParamsJson](x: Self) {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setMaskGenAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMaskGenAlgorithmUndefined: Self = StObject.set(x, "maskGenAlgorithm", js.undefined)
    
    inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
    
    inline def setTrailerField(value: Double): Self = StObject.set(x, "trailerField", value.asInstanceOf[js.Any])
    
    inline def setTrailerFieldUndefined: Self = StObject.set(x, "trailerField", js.undefined)
  }
}
