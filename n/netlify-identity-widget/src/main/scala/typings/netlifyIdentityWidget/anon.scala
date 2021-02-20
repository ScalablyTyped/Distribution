package typings.netlifyIdentityWidget

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ApiURL extends StObject {
    
    var _sameOrigin: js.UndefOr[Boolean] = js.native
    
    var apiURL: String = js.native
    
    var defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]] = js.native
  }
  object ApiURL {
    
    @scala.inline
    def apply(apiURL: String, defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]]): ApiURL = {
      val __obj = js.Dynamic.literal(apiURL = apiURL.asInstanceOf[js.Any], defaultHeaders = defaultHeaders.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiURL]
    }
    
    @scala.inline
    implicit class ApiURLMutableBuilder[Self <: ApiURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiURL(value: String): Self = StObject.set(x, "apiURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "defaultHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_sameOrigin(value: Boolean): Self = StObject.set(x, "_sameOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_sameOriginUndefined: Self = StObject.set(x, "_sameOrigin", js.undefined)
    }
  }
  
  @js.native
  trait Avatarurl extends StObject {
    
    var avatar_url: String = js.native
    
    var full_name: String = js.native
  }
  object Avatarurl {
    
    @scala.inline
    def apply(avatar_url: String, full_name: String): Avatarurl = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatarurl]
    }
    
    @scala.inline
    implicit class AvatarurlMutableBuilder[Self <: Avatarurl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Provider extends StObject {
    
    var provider: String = js.native
    
    var roles: js.Array[String] = js.native
  }
  object Provider {
    
    @scala.inline
    def apply(provider: String, roles: js.Array[String]): Provider = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    }
  }
}
