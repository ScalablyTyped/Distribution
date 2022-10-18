package typings.nextAuth

import typings.nextAuth.anon.Avatar
import typings.nextAuth.anon.Slug
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersTraktMod {
  
  @JSImport("next-auth/providers/trakt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: TraktUser */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait TraktUser extends StObject {
    
    var about: String | Null
    
    var age: Double | Null
    
    var gender: String | Null
    
    var ids: Slug
    
    var images: Avatar
    
    var joined_at: String
    
    var location: String | Null
    
    var name: String
    
    var `private`: Boolean
    
    var username: String
    
    var vip: Boolean
    
    var vip_ep: Boolean
  }
  object TraktUser {
    
    inline def apply(
      ids: Slug,
      images: Avatar,
      joined_at: String,
      name: String,
      `private`: Boolean,
      username: String,
      vip: Boolean,
      vip_ep: Boolean
    ): TraktUser = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], joined_at = joined_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], vip = vip.asInstanceOf[js.Any], vip_ep = vip_ep.asInstanceOf[js.Any], about = null, age = null, gender = null, location = null)
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraktUser]
    }
    
    extension [Self <: TraktUser](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutNull: Self = StObject.set(x, "about", null)
      
      inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setAgeNull: Self = StObject.set(x, "age", null)
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderNull: Self = StObject.set(x, "gender", null)
      
      inline def setIds(value: Slug): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setImages(value: Avatar): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setJoined_at(value: String): Self = StObject.set(x, "joined_at", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setVip(value: Boolean): Self = StObject.set(x, "vip", value.asInstanceOf[js.Any])
      
      inline def setVip_ep(value: Boolean): Self = StObject.set(x, "vip_ep", value.asInstanceOf[js.Any])
    }
  }
}
