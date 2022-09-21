package typings.netlifyIdentityWidget

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApiURL extends StObject {
    
    var _sameOrigin: js.UndefOr[Boolean] = js.undefined
    
    var apiURL: String
    
    var defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]]
  }
  object ApiURL {
    
    inline def apply(apiURL: String, defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]]): ApiURL = {
      val __obj = js.Dynamic.literal(apiURL = apiURL.asInstanceOf[js.Any], defaultHeaders = defaultHeaders.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiURL]
    }
    
    extension [Self <: ApiURL](x: Self) {
      
      inline def setApiURL(value: String): Self = StObject.set(x, "apiURL", value.asInstanceOf[js.Any])
      
      inline def setDefaultHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "defaultHeaders", value.asInstanceOf[js.Any])
      
      inline def set_sameOrigin(value: Boolean): Self = StObject.set(x, "_sameOrigin", value.asInstanceOf[js.Any])
      
      inline def set_sameOriginUndefined: Self = StObject.set(x, "_sameOrigin", js.undefined)
    }
  }
  
  trait Avatarurl extends StObject {
    
    var avatar_url: js.UndefOr[String] = js.undefined
    
    var full_name: js.UndefOr[String] = js.undefined
  }
  object Avatarurl {
    
    inline def apply(): Avatarurl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Avatarurl]
    }
    
    extension [Self <: Avatarurl](x: Self) {
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    }
  }
  
  trait Provider extends StObject {
    
    var provider: String
    
    var roles: js.Array[String]
  }
  object Provider {
    
    inline def apply(provider: String, roles: js.Array[String]): Provider = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    extension [Self <: Provider](x: Self) {
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    }
  }
}
