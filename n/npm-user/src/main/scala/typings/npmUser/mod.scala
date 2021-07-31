package typings.npmUser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get user info of an npm user.
  	@param name - User's username on npm.
  	@example
  	```
  	import npmUser = require('npm-user');
  	(async () => {
  		console.log(await npmUser('sindresorhus'));
  		// {
  		// 	name: 'Sindre Sorhus',
  		// 	avatar: 'https://gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9?size=496',
  		// 	email: 'sindresorhus@gmail.com',
  		// 	github: 'sindresorhus',
  		// 	twitter: 'sindresorhus'
  		// }
  	})();
  	```
  	*/
  @scala.inline
  def apply(name: String): js.Promise[UserInfo] = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserInfo]]
  
  @JSImport("npm-user", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function npmUser(name: string): Promise<npmUser.UserInfo>;
  // export = npmUser;
  @JSImport("npm-user", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof npmUser */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof npmUser */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait UserInfo extends StObject {
    
    /**
    		URL to user's avatar.
    		*/
    var avatar: String | Null
    
    /**
    		User's email.
    		*/
    var email: String | Null
    
    /**
    		User's associated GitHub account.
    		*/
    var github: String | Null
    
    /**
    		User's name.
    		*/
    var name: String | Null
    
    /**
    		User's associated Twitter account.
    		*/
    var twitter: String | Null
  }
  object UserInfo {
    
    @scala.inline
    def apply(): UserInfo = {
      val __obj = js.Dynamic.literal(avatar = null, email = null, github = null, name = null, twitter = null)
      __obj.asInstanceOf[UserInfo]
    }
    
    @scala.inline
    implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarNull: Self = StObject.set(x, "avatar", null)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailNull: Self = StObject.set(x, "email", null)
      
      @scala.inline
      def setGithub(value: String): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGithubNull: Self = StObject.set(x, "github", null)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwitterNull: Self = StObject.set(x, "twitter", null)
    }
  }
}
