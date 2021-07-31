package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeOptions extends StObject {
  
  var idLength: js.UndefOr[Double] = js.undefined
  
  var sessionKey: js.UndefOr[String] = js.undefined
}
object AuthorizeOptions {
  
  @scala.inline
  def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  @scala.inline
  implicit class AuthorizeOptionsMutableBuilder[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdLength(value: Double): Self = StObject.set(x, "idLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdLengthUndefined: Self = StObject.set(x, "idLength", js.undefined)
    
    @scala.inline
    def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
  }
}
