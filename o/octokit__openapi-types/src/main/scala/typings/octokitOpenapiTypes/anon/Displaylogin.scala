package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displaylogin extends StObject {
  
  /** Format: uri */
  var avatar_url: String
  
  var display_login: js.UndefOr[String] = js.undefined
  
  var gravatar_id: String | Null
  
  var id: Double
  
  var login: String
  
  /** Format: uri */
  var url: String
}
object Displaylogin {
  
  inline def apply(avatar_url: String, id: Double, login: String, url: String): Displaylogin = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], gravatar_id = null)
    __obj.asInstanceOf[Displaylogin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Displaylogin] (val x: Self) extends AnyVal {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setDisplay_login(value: String): Self = StObject.set(x, "display_login", value.asInstanceOf[js.Any])
    
    inline def setDisplay_loginUndefined: Self = StObject.set(x, "display_login", js.undefined)
    
    inline def setGravatar_id(value: String): Self = StObject.set(x, "gravatar_id", value.asInstanceOf[js.Any])
    
    inline def setGravatar_idNull: Self = StObject.set(x, "gravatar_id", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
