package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Userid extends StObject {
  
  var keyid: typings.openpgp.mod.`type`.keyid.Keyid
  
  var userid: String
  
  var valid: Boolean
}
object Userid {
  
  inline def apply(keyid: typings.openpgp.mod.`type`.keyid.Keyid, userid: String, valid: Boolean): Userid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Userid] (val x: Self) extends AnyVal {
    
    inline def setKeyid(value: typings.openpgp.mod.`type`.keyid.Keyid): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    inline def setUserid(value: String): Self = StObject.set(x, "userid", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
