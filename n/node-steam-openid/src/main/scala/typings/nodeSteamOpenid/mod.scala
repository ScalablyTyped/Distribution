package typings.nodeSteamOpenid

import typings.express.mod.Request_
import typings.nodeSteamOpenid.anon.Large
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-steam-openid", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SteamAuth {
    /**
      * `realm` - Site name displayed to users on logon
      *
      * `returnUrl` - Your return route
      *
      * `apiKey` - Steam API key
      *
      * ```
      * const steam = new SteamAuth({
      *   realm: "http://localhost:5000",
      *   returnUrl: "http://localhost:5000/auth/steam/authenticate",
      *   apiKey: "XXXXXXXXXXXXXXXXXXXXXXXXXX"
      * });
      * ```
      */
    def this(steamAuthOptions: SteamAuthOptions) = this()
  }
  
  @js.native
  trait SteamAuth extends StObject {
    
    def authenticate(request: js.Object): js.Promise[UserObject] = js.native
    /**
      * Authenticates the user with oAuth.
      * @async
      * @param request
      */
    def authenticate(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Promise[UserObject] = js.native
    
    /**
      * Gets the redirect URL to Steam.
      * @async
      */
    def getRedirectUrl(): js.Promise[String] = js.native
  }
  
  trait SteamAuthOptions extends StObject {
    
    var apiKey: String
    
    var realm: String
    
    var returnUrl: String
  }
  object SteamAuthOptions {
    
    inline def apply(apiKey: String, realm: String, returnUrl: String): SteamAuthOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], returnUrl = returnUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SteamAuthOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SteamAuthOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Object which holds all the authenticated user's data.
    * The key _json holds the raw response from Steam API.
    */
  trait UserObject extends StObject {
    
    var _json: Record[String, Any]
    
    var avatar: Large
    
    var name: String
    
    var profile: String
    
    var steamid: String
    
    var username: String
  }
  object UserObject {
    
    inline def apply(
      _json: Record[String, Any],
      avatar: Large,
      name: String,
      profile: String,
      steamid: String,
      username: String
    ): UserObject = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserObject] (val x: Self) extends AnyVal {
      
      inline def setAvatar(value: Large): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setSteamid(value: String): Self = StObject.set(x, "steamid", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def set_json(value: Record[String, Any]): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
    }
  }
}
