package typings.npmUser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-user", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String): js.Promise[UserInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserInfo]]
  
  trait UserInfo extends StObject {
    
    /**
    	The URL to user's avatar.
    	*/
    var avatar: js.UndefOr[String] = js.undefined
    
    /**
    	The user's email.
    	*/
    var email: js.UndefOr[String] = js.undefined
    
    /**
    	The user's associated GitHub account.
    	*/
    var github: js.UndefOr[String] = js.undefined
    
    /**
    	The user's name.
    	*/
    var name: js.UndefOr[String] = js.undefined
    
    /**
    	The user's associated Twitter account.
    	*/
    var twitter: js.UndefOr[String] = js.undefined
  }
  object UserInfo {
    
    inline def apply(): UserInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserInfo]
    }
    
    extension [Self <: UserInfo](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setGithub(value: String): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
      
      inline def setGithubUndefined: Self = StObject.set(x, "github", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
    }
  }
}
