package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PBKDF2ParamsJson extends StObject {
  
  var iterationCount: Double
  
  var keyLength: js.UndefOr[Double] = js.undefined
  
  var prf: js.UndefOr[AlgorithmIdentifierJson] = js.undefined
  
  var salt: Any
}
object PBKDF2ParamsJson {
  
  inline def apply(iterationCount: Double, salt: Any): PBKDF2ParamsJson = {
    val __obj = js.Dynamic.literal(iterationCount = iterationCount.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PBKDF2ParamsJson]
  }
  
  extension [Self <: PBKDF2ParamsJson](x: Self) {
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    inline def setPrf(value: AlgorithmIdentifierJson): Self = StObject.set(x, "prf", value.asInstanceOf[js.Any])
    
    inline def setPrfUndefined: Self = StObject.set(x, "prf", js.undefined)
    
    inline def setSalt(value: Any): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
  }
}
