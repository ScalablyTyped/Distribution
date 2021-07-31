package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Express {
    
    trait Request extends StObject {
      
      var oauth2: js.UndefOr[OAuth2] = js.undefined
    }
    object Request {
      
      @scala.inline
      def apply(): Request = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOauth2(value: OAuth2): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
      }
    }
  }
}
