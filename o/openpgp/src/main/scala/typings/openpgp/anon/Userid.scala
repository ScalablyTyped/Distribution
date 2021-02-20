package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Userid extends StObject {
  
  var keyid: typings.openpgp.mod.`type`.keyid.Keyid = js.native
  
  var userid: String = js.native
  
  var valid: Boolean = js.native
}
object Userid {
  
  @scala.inline
  def apply(keyid: typings.openpgp.mod.`type`.keyid.Keyid, userid: String, valid: Boolean): Userid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userid]
  }
  
  @scala.inline
  implicit class UseridMutableBuilder[Self <: Userid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyid(value: typings.openpgp.mod.`type`.keyid.Keyid): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserid(value: String): Self = StObject.set(x, "userid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
