package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gravatarid extends StObject {
  
  var avatar_url: String
  
  var gravatar_id: String
  
  var id: Double
  
  var login: String
  
  var url: String
}
object Gravatarid {
  
  @scala.inline
  def apply(avatar_url: String, gravatar_id: String, id: Double, login: String, url: String): Gravatarid = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gravatarid]
  }
  
  @scala.inline
  implicit class GravataridMutableBuilder[Self <: Gravatarid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravatar_id(value: String): Self = StObject.set(x, "gravatar_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
