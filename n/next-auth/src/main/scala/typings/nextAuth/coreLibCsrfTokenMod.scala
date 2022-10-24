package typings.nextAuth

import typings.nextAuth.anon.Cookie
import typings.nextAuth.anon.CsrfToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibCsrfTokenMod {
  
  @JSImport("next-auth/core/lib/csrf-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCSRFToken(param0: CreateCSRFTokenParams): Cookie | CsrfToken = ^.asInstanceOf[js.Dynamic].applyDynamic("createCSRFToken")(param0.asInstanceOf[js.Any]).asInstanceOf[Cookie | CsrfToken]
  
  trait CreateCSRFTokenParams extends StObject {
    
    var bodyValue: js.UndefOr[String] = js.undefined
    
    var cookieValue: js.UndefOr[String] = js.undefined
    
    var isPost: Boolean
    
    var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
  }
  object CreateCSRFTokenParams {
    
    inline def apply(
      isPost: Boolean,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
    ): CreateCSRFTokenParams = {
      val __obj = js.Dynamic.literal(isPost = isPost.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCSRFTokenParams]
    }
    
    extension [Self <: CreateCSRFTokenParams](x: Self) {
      
      inline def setBodyValue(value: String): Self = StObject.set(x, "bodyValue", value.asInstanceOf[js.Any])
      
      inline def setBodyValueUndefined: Self = StObject.set(x, "bodyValue", js.undefined)
      
      inline def setCookieValue(value: String): Self = StObject.set(x, "cookieValue", value.asInstanceOf[js.Any])
      
      inline def setCookieValueUndefined: Self = StObject.set(x, "cookieValue", js.undefined)
      
      inline def setIsPost(value: Boolean): Self = StObject.set(x, "isPost", value.asInstanceOf[js.Any])
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
