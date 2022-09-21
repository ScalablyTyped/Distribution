package typings.passportDiscord

import typings.express.mod.Request_
import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportDiscord.passportDiscordBooleans.`false`
import typings.passportDiscord.passportDiscordBooleans.`true`
import typings.passportOauth2.mod.OAuth2Strategy
import typings.passportOauth2.mod.StateStore
import typings.passportOauth2.mod.VerifyCallback
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-discord", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Strategy {
    def this(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptions */ Any,
      verify: js.Function4[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ Any, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    // NOTE: A union of function types prevents contextual typing of arguments.
    // tslint:disable-next-line:unified-signatures
    def this(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptionsWithRequest */ Any,
      verify: js.Function5[
            (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) | (/* accessToken */ String), 
            /* refreshToken */ /* accessToken */ String, 
            (/* params */ Any) | (/* refreshToken */ String), 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ Any, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    // NOTE: A union of function types prevents contextual typing of arguments.
    // tslint:disable-next-line:unified-signatures max-line-length
    def this(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptionsWithRequest */ Any,
      verify: js.Function6[
            /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], 
            /* accessToken */ String, 
            /* params */ Any, 
            /* refreshToken */ String, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ Any, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
  }
  
  trait ConnectionInfo extends StObject {
    
    var id: String
    
    var name: String
    
    var show_activity: Boolean
    
    var `type`: String
    
    var verified: Boolean
    
    var visibility: Double
  }
  object ConnectionInfo {
    
    inline def apply(
      id: String,
      name: String,
      show_activity: Boolean,
      `type`: String,
      verified: Boolean,
      visibility: Double
    ): ConnectionInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], show_activity = show_activity.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionInfo]
    }
    
    extension [Self <: ConnectionInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShow_activity(value: Boolean): Self = StObject.set(x, "show_activity", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      inline def setVisibility(value: Double): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
  
  trait GuildInfo extends StObject {
    
    var features: js.UndefOr[js.Array[String]] = js.undefined
    
    var icon: String | Null
    
    var id: String
    
    var name: String
    
    var owner: Boolean
    
    var permissions: Double
  }
  object GuildInfo {
    
    inline def apply(id: String, name: String, owner: Boolean, permissions: Double): GuildInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], icon = null)
      __obj.asInstanceOf[GuildInfo]
    }
    
    extension [Self <: GuildInfo](x: Self) {
      
      inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: Boolean): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: Double): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Profile
    extends StObject
       with typings.passport.mod.Profile {
    
    var accent_color: Double | Null
    
    var avatar: String | Null
    
    var banner: String | Null
    
    // requires "email" scope
    var connections: js.UndefOr[js.Array[ConnectionInfo]] = js.undefined
    
    var discriminator: String
    
    var email: js.UndefOr[String] = js.undefined
    
    var fetchedAt: String
    
    var flags: Double
    
    // requires "connection" scope
    var guilds: js.UndefOr[js.Array[GuildInfo]] = js.undefined
    
    var locale: String
    
    var mfa_enabled: Boolean
    
    var verified: Boolean
  }
  object Profile {
    
    inline def apply(
      discriminator: String,
      displayName: String,
      fetchedAt: String,
      flags: Double,
      id: String,
      locale: String,
      mfa_enabled: Boolean,
      provider: String,
      verified: Boolean
    ): Profile = {
      val __obj = js.Dynamic.literal(discriminator = discriminator.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fetchedAt = fetchedAt.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mfa_enabled = mfa_enabled.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], accent_color = null, avatar = null, banner = null)
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def setAccent_color(value: Double): Self = StObject.set(x, "accent_color", value.asInstanceOf[js.Any])
      
      inline def setAccent_colorNull: Self = StObject.set(x, "accent_color", null)
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarNull: Self = StObject.set(x, "avatar", null)
      
      inline def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      inline def setBannerNull: Self = StObject.set(x, "banner", null)
      
      inline def setConnections(value: js.Array[ConnectionInfo]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      inline def setConnectionsVarargs(value: ConnectionInfo*): Self = StObject.set(x, "connections", js.Array(value*))
      
      inline def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFetchedAt(value: String): Self = StObject.set(x, "fetchedAt", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setGuilds(value: js.Array[GuildInfo]): Self = StObject.set(x, "guilds", value.asInstanceOf[js.Any])
      
      inline def setGuildsUndefined: Self = StObject.set(x, "guilds", js.undefined)
      
      inline def setGuildsVarargs(value: GuildInfo*): Self = StObject.set(x, "guilds", js.Array(value*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMfa_enabled(value: Boolean): Self = StObject.set(x, "mfa_enabled", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Strategy
    extends StObject
       with OAuth2Strategy {
    
    def checkScope(
      scope: String,
      accessToken: String,
      cb: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* value */ js.UndefOr[Any], Unit]
    ): Unit = js.native
  }
  
  trait StrategyOptions
    extends StObject
       with StrategyOptionsBase {
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    extension [Self <: StrategyOptions](x: Self) {
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  trait StrategyOptionsBase extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String
    
    var clientSecret: String
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    /** @see https://discordapp.com/developers/docs/topics/oauth2#shared-resources-oauth2-scopes */
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object StrategyOptionsBase {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptionsBase = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsBase]
    }
    
    extension [Self <: StrategyOptionsBase](x: Self) {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  trait StrategyOptionsWithRequest
    extends StObject
       with StrategyOptionsBase {
    
    var passReqToCallback: `true`
  }
  object StrategyOptionsWithRequest {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    extension [Self <: StrategyOptionsWithRequest](x: Self) {
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
}
