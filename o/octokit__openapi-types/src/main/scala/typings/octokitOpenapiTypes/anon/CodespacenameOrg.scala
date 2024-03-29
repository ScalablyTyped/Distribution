package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodespacenameOrg extends StObject {
  
  var codespace_name: String
  
  @JSName("org")
  var org_ : String
  
  var username: String
}
object CodespacenameOrg {
  
  inline def apply(codespace_name: String, org_ : String, username: String): CodespacenameOrg = {
    val __obj = js.Dynamic.literal(codespace_name = codespace_name.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodespacenameOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodespacenameOrg] (val x: Self) extends AnyVal {
    
    inline def setCodespace_name(value: String): Self = StObject.set(x, "codespace_name", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
