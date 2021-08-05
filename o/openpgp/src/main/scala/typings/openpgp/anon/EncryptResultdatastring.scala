package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptResult & {  data :string} */
trait EncryptResultdatastring extends StObject {
  
  var data: String
  
  var sessionKey: AeadAlgorithm
}
object EncryptResultdatastring {
  
  inline def apply(data: String, sessionKey: AeadAlgorithm): EncryptResultdatastring = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultdatastring]
  }
  
  extension [Self <: EncryptResultdatastring](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSessionKey(value: AeadAlgorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
  }
}
