package typings.openpgp.mod

import typings.openpgp.anon.AeadAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptResult extends StObject {
  
  var sessionKey: AeadAlgorithm
}
object EncryptResult {
  
  inline def apply(sessionKey: AeadAlgorithm): EncryptResult = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptResult] (val x: Self) extends AnyVal {
    
    inline def setSessionKey(value: AeadAlgorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
  }
}
