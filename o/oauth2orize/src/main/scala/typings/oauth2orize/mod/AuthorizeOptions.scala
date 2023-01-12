package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeOptions extends StObject {
  
  var idLength: js.UndefOr[Double] = js.undefined
  
  var sessionKey: js.UndefOr[String] = js.undefined
}
object AuthorizeOptions {
  
  inline def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    
    inline def setIdLength(value: Double): Self = StObject.set(x, "idLength", value.asInstanceOf[js.Any])
    
    inline def setIdLengthUndefined: Self = StObject.set(x, "idLength", js.undefined)
    
    inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
  }
}
