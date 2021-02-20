package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Valid extends StObject {
  
  var keyid: typings.openpgp.mod.`type`.keyid.Keyid = js.native
  
  var valid: Boolean = js.native
  
  var verified: js.Promise[Boolean] = js.native
}
object Valid {
  
  @scala.inline
  def apply(keyid: typings.openpgp.mod.`type`.keyid.Keyid, valid: Boolean, verified: js.Promise[Boolean]): Valid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Valid]
  }
  
  @scala.inline
  implicit class ValidMutableBuilder[Self <: Valid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyid(value: typings.openpgp.mod.`type`.keyid.Keyid): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: js.Promise[Boolean]): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
