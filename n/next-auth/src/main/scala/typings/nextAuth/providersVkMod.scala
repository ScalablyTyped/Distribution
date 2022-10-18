package typings.nextAuth

import typings.nextAuth.anon.About
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersVkMod {
  
  @JSImport("next-auth/providers/vk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: Record[String, Any] */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  trait VkProfile extends StObject {
    
    var response: js.Array[About]
  }
  object VkProfile {
    
    inline def apply(response: js.Array[About]): VkProfile = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[VkProfile]
    }
    
    extension [Self <: VkProfile](x: Self) {
      
      inline def setResponse(value: js.Array[About]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseVarargs(value: About*): Self = StObject.set(x, "response", js.Array(value*))
    }
  }
}
