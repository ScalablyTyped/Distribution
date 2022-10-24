package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersTodoistMod {
  
  @JSImport("next-auth/providers/todoist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: TodoistProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /**
    * @see https://developer.todoist.com/sync/v9/#user
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait TodoistProfile extends StObject {
    
    var avatar_big: String
    
    var email: String
    
    var full_name: String
    
    var id: String
  }
  object TodoistProfile {
    
    inline def apply(avatar_big: String, email: String, full_name: String, id: String): TodoistProfile = {
      val __obj = js.Dynamic.literal(avatar_big = avatar_big.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TodoistProfile]
    }
    
    extension [Self <: TodoistProfile](x: Self) {
      
      inline def setAvatar_big(value: String): Self = StObject.set(x, "avatar_big", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
