package typings.openpgp.anon

import typings.openpgp.openpgpBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Passphrase extends StObject {
  
  var passphrase: String
  
  var sign: `true`
}
object Passphrase {
  
  inline def apply(passphrase: String): Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], sign = true)
    __obj.asInstanceOf[Passphrase]
  }
  
  extension [Self <: Passphrase](x: Self) {
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setSign(value: `true`): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
  }
}
