package typings.passportDiscord

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportDiscord.passportDiscordBooleans.`false`
import typings.passportDiscord.passportDiscordBooleans.`true`
import typings.passportOauth2.mod.OAuth2Strategy
import typings.passportOauth2.mod.StateStore
import typings.passportOauth2.mod.VerifyCallback
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-discord", JSImport.Namespace)
  @js.native
  class ^ protected () extends Strategy {
    def this(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptions */ js.Any,
      verify: js.Function4[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    // NOTE: A union of function types prevents contextual typing of arguments.
    // tslint:disable-next-line:unified-signatures
    def this(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptionsWithRequest */ js.Any,
      verify: js.Function5[
            (/* req */ Request_[ParamsDictionary, _, _, Query]) | (/* accessToken */ String), 
            /* refreshToken */ /* accessToken */ String, 
            (/* params */ js.Any) | (/* refreshToken */ String), 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    // NOTE: A union of function types prevents contextual typing of arguments.
    // tslint:disable-next-line:unified-signatures max-line-length
    def this(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptionsWithRequest */ js.Any,
      verify: js.Function6[
            /* req */ Request_[ParamsDictionary, _, _, Query], 
            /* accessToken */ String, 
            /* params */ js.Any, 
            /* refreshToken */ String, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
  }
  
  @js.native
  trait ConnectionInfo extends StObject {
    
    var id: String = js.native
    
    var name: String = js.native
    
    var show_activity: Boolean = js.native
    
    var `type`: String = js.native
    
    var verified: Boolean = js.native
    
    var visibility: Double = js.native
  }
  object ConnectionInfo {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ConnectionInfoMutableBuilder[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_activity(value: Boolean): Self = StObject.set(x, "show_activity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibility(value: Double): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GuildInfo extends StObject {
    
    var icon: String = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var owner: Boolean = js.native
    
    var permissions: Double = js.native
  }
  object GuildInfo {
    
    @scala.inline
    def apply(icon: String, id: String, name: String, owner: Boolean, permissions: Double): GuildInfo = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[GuildInfo]
    }
    
    @scala.inline
    implicit class GuildInfoMutableBuilder[Self <: GuildInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: Boolean): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissions(value: Double): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Profile
    extends typings.passport.mod.Profile {
    
    var avatar: String = js.native
    
    // requires "email" scope
    var connections: js.UndefOr[js.Array[ConnectionInfo]] = js.native
    
    var discriminator: String = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var fetchedAt: String = js.native
    
    var flags: Double = js.native
    
    // requires "connection" scope
    var guilds: js.UndefOr[js.Array[GuildInfo]] = js.native
    
    var locale: String = js.native
    
    var mfa_enabled: Boolean = js.native
    
    var verified: Boolean = js.native
  }
  object Profile {
    
    @scala.inline
    def apply(
      avatar: String,
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
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], discriminator = discriminator.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fetchedAt = fetchedAt.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mfa_enabled = mfa_enabled.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnections(value: js.Array[ConnectionInfo]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      @scala.inline
      def setConnectionsVarargs(value: ConnectionInfo*): Self = StObject.set(x, "connections", js.Array(value :_*))
      
      @scala.inline
      def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setFetchedAt(value: String): Self = StObject.set(x, "fetchedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuilds(value: js.Array[GuildInfo]): Self = StObject.set(x, "guilds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuildsUndefined: Self = StObject.set(x, "guilds", js.undefined)
      
      @scala.inline
      def setGuildsVarargs(value: GuildInfo*): Self = StObject.set(x, "guilds", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMfa_enabled(value: Boolean): Self = StObject.set(x, "mfa_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Strategy extends OAuth2Strategy {
    
    def checkScope(
      scope: String,
      accessToken: String,
      cb: js.Function2[/* err */ js.UndefOr[Error | Null], /* value */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait StrategyOptions extends StrategyOptionsBase {
    
    var passReqToCallback: js.UndefOr[`false`] = js.native
  }
  object StrategyOptions {
    
    @scala.inline
    def apply(clientID: String, clientSecret: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  @js.native
  trait StrategyOptionsBase extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.native
    
    var callbackURL: js.UndefOr[String] = js.native
    
    var clientID: String = js.native
    
    var clientSecret: String = js.native
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    /** @see https://discordapp.com/developers/docs/topics/oauth2#shared-resources-oauth2-scopes */
    var scope: js.UndefOr[String | js.Array[String]] = js.native
    
    var scopeSeparator: js.UndefOr[String] = js.native
    
    var sessionKey: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[js.Any] = js.native
    
    var store: js.UndefOr[StateStore] = js.native
    
    var tokenURL: js.UndefOr[String] = js.native
  }
  object StrategyOptionsBase {
    
    @scala.inline
    def apply(clientID: String, clientSecret: String): StrategyOptionsBase = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsBase]
    }
    
    @scala.inline
    implicit class StrategyOptionsBaseMutableBuilder[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  @js.native
  trait StrategyOptionsWithRequest extends StrategyOptionsBase {
    
    var passReqToCallback: `true` = js.native
  }
  object StrategyOptionsWithRequest {
    
    @scala.inline
    def apply(clientID: String, clientSecret: String, passReqToCallback: `true`): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionsWithRequestMutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
}
