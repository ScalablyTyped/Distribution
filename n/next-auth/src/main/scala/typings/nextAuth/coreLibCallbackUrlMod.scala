package typings.nextAuth

import typings.nextAuth.anon.CallbackUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibCallbackUrlMod {
  
  @JSImport("next-auth/core/lib/callback-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCallbackUrl(hasOptionsParamValueCookieValue: CreateCallbackUrlParams): js.Promise[CallbackUrl] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCallbackUrl")(hasOptionsParamValueCookieValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CallbackUrl]]
  
  trait CreateCallbackUrlParams extends StObject {
    
    var cookieValue: js.UndefOr[String] = js.undefined
    
    var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
    
    /** Try reading value from request body (POST) then from query param (GET) */
    var paramValue: js.UndefOr[String] = js.undefined
  }
  object CreateCallbackUrlParams {
    
    inline def apply(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
    ): CreateCallbackUrlParams = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCallbackUrlParams]
    }
    
    extension [Self <: CreateCallbackUrlParams](x: Self) {
      
      inline def setCookieValue(value: String): Self = StObject.set(x, "cookieValue", value.asInstanceOf[js.Any])
      
      inline def setCookieValueUndefined: Self = StObject.set(x, "cookieValue", js.undefined)
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParamValue(value: String): Self = StObject.set(x, "paramValue", value.asInstanceOf[js.Any])
      
      inline def setParamValueUndefined: Self = StObject.set(x, "paramValue", js.undefined)
    }
  }
}
