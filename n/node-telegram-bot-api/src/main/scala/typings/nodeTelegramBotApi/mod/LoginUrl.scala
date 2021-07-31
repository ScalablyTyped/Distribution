package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginUrl extends StObject {
  
  var bot_username: js.UndefOr[String] = js.undefined
  
  var forward_text: js.UndefOr[String] = js.undefined
  
  var request_write_acces: js.UndefOr[Boolean] = js.undefined
  
  var url: String
}
object LoginUrl {
  
  @scala.inline
  def apply(url: String): LoginUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginUrl]
  }
  
  @scala.inline
  implicit class LoginUrlMutableBuilder[Self <: LoginUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBot_username(value: String): Self = StObject.set(x, "bot_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBot_usernameUndefined: Self = StObject.set(x, "bot_username", js.undefined)
    
    @scala.inline
    def setForward_text(value: String): Self = StObject.set(x, "forward_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward_textUndefined: Self = StObject.set(x, "forward_text", js.undefined)
    
    @scala.inline
    def setRequest_write_acces(value: Boolean): Self = StObject.set(x, "request_write_acces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_write_accesUndefined: Self = StObject.set(x, "request_write_acces", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
