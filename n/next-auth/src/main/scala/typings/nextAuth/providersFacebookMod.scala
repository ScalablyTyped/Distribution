package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersFacebookMod {
  
  @JSImport("next-auth/providers/facebook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: FacebookProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  trait FacebookPicture extends StObject {
    
    var data: FacebookPictureData
  }
  object FacebookPicture {
    
    inline def apply(data: FacebookPictureData): FacebookPicture = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacebookPicture]
    }
    
    extension [Self <: FacebookPicture](x: Self) {
      
      inline def setData(value: FacebookPictureData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait FacebookPictureData extends StObject {
    
    var url: String
  }
  object FacebookPictureData {
    
    inline def apply(url: String): FacebookPictureData = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacebookPictureData]
    }
    
    extension [Self <: FacebookPictureData](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait FacebookProfile extends StObject {
    
    var id: String
    
    var picture: FacebookPicture
  }
  object FacebookProfile {
    
    inline def apply(id: String, picture: FacebookPicture): FacebookProfile = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacebookProfile]
    }
    
    extension [Self <: FacebookProfile](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: FacebookPicture): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    }
  }
}
