package typings.openpgp.anon

import typings.openpgp.openpgpBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Passphrase extends StObject {
  
  var passphrase: String = js.native
  
  var sign: `true` = js.native
}
object Passphrase {
  
  @scala.inline
  def apply(passphrase: String, sign: `true`): Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passphrase]
  }
  
  @scala.inline
  implicit class PassphraseMutableBuilder[Self <: Passphrase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSign(value: `true`): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
  }
}
