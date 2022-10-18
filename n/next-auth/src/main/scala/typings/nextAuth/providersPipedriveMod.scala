package typings.nextAuth

import typings.nextAuth.anon.Activated
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersPipedriveMod {
  
  @JSImport("next-auth/providers/pipedrive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: PipedriveProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait PipedriveProfile extends StObject {
    
    var data: Activated
    
    var success: Boolean
  }
  object PipedriveProfile {
    
    inline def apply(data: Activated, success: Boolean): PipedriveProfile = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipedriveProfile]
    }
    
    extension [Self <: PipedriveProfile](x: Self) {
      
      inline def setData(value: Activated): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
