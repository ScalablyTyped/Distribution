package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersSpotifyMod {
  
  @JSImport("next-auth/providers/spotify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: SpotifyProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  trait SpotifyImage extends StObject {
    
    var url: String
  }
  object SpotifyImage {
    
    inline def apply(url: String): SpotifyImage = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpotifyImage]
    }
    
    extension [Self <: SpotifyImage](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait SpotifyProfile extends StObject {
    
    var display_name: String
    
    var email: String
    
    var id: String
    
    var images: js.Array[SpotifyImage]
  }
  object SpotifyProfile {
    
    inline def apply(display_name: String, email: String, id: String, images: js.Array[SpotifyImage]): SpotifyProfile = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpotifyProfile]
    }
    
    extension [Self <: SpotifyProfile](x: Self) {
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[SpotifyImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: SpotifyImage*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
}
