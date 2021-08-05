package typings.npmProfile

import org.scalablytyped.runtime.StringDictionary
import typings.npmProfile.npmProfileStrings.`auth-and-writes`
import typings.npmProfile.npmProfileStrings.`auth-only`
import typings.npmProfile.npmProfileStrings.`log `
import typings.npmProfile.npmProfileStrings.disable
import typings.npmProfile.npmProfileStrings.log
import typings.std.Date
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-profile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createToken(password: String, readonly: Boolean, cidr_whitelist: js.Array[String]): js.Promise[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("createToken")(password.asInstanceOf[js.Any], readonly.asInstanceOf[js.Any], cidr_whitelist.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Token]]
  inline def createToken(password: String, readonly: Boolean, cidr_whitelist: js.Array[String], options: Options): js.Promise[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("createToken")(password.asInstanceOf[js.Any], readonly.asInstanceOf[js.Any], cidr_whitelist.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Token]]
  
  inline def get(): js.Promise[ProfileData] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[ProfileData]]
  inline def get(options: Options): js.Promise[ProfileData] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProfileData]]
  
  inline def listTokens(): js.Promise[js.Array[Token]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTokens")().asInstanceOf[js.Promise[js.Array[Token]]]
  inline def listTokens(options: Options): js.Promise[js.Array[Token]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTokens")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Token]]]
  
  inline def removeToken(tokenOrKey: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeToken")(tokenOrKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeToken(tokenOrKey: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeToken")(tokenOrKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def set(updateOptions: UpdateProfileData): js.Promise[ProfileData] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(updateOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProfileData]]
  inline def set(updateOptions: UpdateProfileData, options: Options): js.Promise[ProfileData] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(updateOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileData]]
  
  trait FetchProfileError
    extends StObject
       with Error {
    
    var body: Uint8Array
    
    var code: String
    
    var headers: StringDictionary[js.Any]
    
    var method: String
    
    var pkgid: js.UndefOr[String] = js.undefined
    
    var statucCode: Double
    
    var uri: String
  }
  object FetchProfileError {
    
    inline def apply(
      body: Uint8Array,
      code: String,
      headers: StringDictionary[js.Any],
      message: String,
      method: String,
      name: String,
      statucCode: Double,
      uri: String
    ): FetchProfileError = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statucCode = statucCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchProfileError]
    }
    
    extension [Self <: FetchProfileError](x: Self) {
      
      inline def setBody(value: Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPkgid(value: String): Self = StObject.set(x, "pkgid", value.asInstanceOf[js.Any])
      
      inline def setPkgidUndefined: Self = StObject.set(x, "pkgid", js.undefined)
      
      inline def setStatucCode(value: Double): Self = StObject.set(x, "statucCode", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.npmProfile.npmProfileStrings.error
    - typings.npmProfile.npmProfileStrings.warn
    - typings.npmProfile.npmProfileStrings.notice
    - typings.npmProfile.npmProfileStrings.http
    - typings.npmProfile.npmProfileStrings.timing
    - typings.npmProfile.npmProfileStrings.info
    - typings.npmProfile.npmProfileStrings.verbose
    - typings.npmProfile.npmProfileStrings.silly
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def error: typings.npmProfile.npmProfileStrings.error = "error".asInstanceOf[typings.npmProfile.npmProfileStrings.error]
    
    inline def http: typings.npmProfile.npmProfileStrings.http = "http".asInstanceOf[typings.npmProfile.npmProfileStrings.http]
    
    inline def info: typings.npmProfile.npmProfileStrings.info = "info".asInstanceOf[typings.npmProfile.npmProfileStrings.info]
    
    inline def notice: typings.npmProfile.npmProfileStrings.notice = "notice".asInstanceOf[typings.npmProfile.npmProfileStrings.notice]
    
    inline def silly: typings.npmProfile.npmProfileStrings.silly = "silly".asInstanceOf[typings.npmProfile.npmProfileStrings.silly]
    
    inline def timing: typings.npmProfile.npmProfileStrings.timing = "timing".asInstanceOf[typings.npmProfile.npmProfileStrings.timing]
    
    inline def verbose: typings.npmProfile.npmProfileStrings.verbose = "verbose".asInstanceOf[typings.npmProfile.npmProfileStrings.verbose]
    
    inline def warn: typings.npmProfile.npmProfileStrings.warn = "warn".asInstanceOf[typings.npmProfile.npmProfileStrings.warn]
  }
  
  trait Options
    extends StObject
       with typings.npmRegistryFetch.mod.Options
       with ProfileFetchOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  trait PasswordUpdate extends StObject {
    
    var `new`: String
    
    var old: String
  }
  object PasswordUpdate {
    
    inline def apply(`new`: String, old: String): PasswordUpdate = {
      val __obj = js.Dynamic.literal(old = old.asInstanceOf[js.Any])
      __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PasswordUpdate]
    }
    
    extension [Self <: PasswordUpdate](x: Self) {
      
      inline def setNew(value: String): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
      
      inline def setOld(value: String): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProfileCredentials extends StObject {
    
    /**
      * default value for email
      */
    var email: String
    
    /**
      * default value for username
      */
    var username: String
  }
  object ProfileCredentials {
    
    inline def apply(email: String, username: String): ProfileCredentials = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileCredentials]
    }
    
    extension [Self <: ProfileCredentials](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProfileData extends StObject {
    
    var cidr_whitelist: Null | js.Array[String]
    
    var created: Date | String
    
    var email: String
    
    var email_verified: Boolean
    
    var freenode: js.UndefOr[String] = js.undefined
    
    var fullname: js.UndefOr[String] = js.undefined
    
    var github: js.UndefOr[String] = js.undefined
    
    var homepage: js.UndefOr[String] = js.undefined
    
    var name: String
    
    /**
      * two-factor authentication status
      */
    var tfa: TFAStatus
    
    var twitter: js.UndefOr[String] = js.undefined
    
    var updated: Date | String
  }
  object ProfileData {
    
    inline def apply(
      created: Date | String,
      email: String,
      email_verified: Boolean,
      name: String,
      updated: Date | String
    ): ProfileData = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], cidr_whitelist = null, tfa = null)
      __obj.asInstanceOf[ProfileData]
    }
    
    extension [Self <: ProfileData](x: Self) {
      
      inline def setCidr_whitelist(value: js.Array[String]): Self = StObject.set(x, "cidr_whitelist", value.asInstanceOf[js.Any])
      
      inline def setCidr_whitelistNull: Self = StObject.set(x, "cidr_whitelist", null)
      
      inline def setCidr_whitelistVarargs(value: String*): Self = StObject.set(x, "cidr_whitelist", js.Array(value :_*))
      
      inline def setCreated(value: Date | String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setFreenode(value: String): Self = StObject.set(x, "freenode", value.asInstanceOf[js.Any])
      
      inline def setFreenodeUndefined: Self = StObject.set(x, "freenode", js.undefined)
      
      inline def setFullname(value: String): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
      
      inline def setFullnameUndefined: Self = StObject.set(x, "fullname", js.undefined)
      
      inline def setGithub(value: String): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
      
      inline def setGithubUndefined: Self = StObject.set(x, "github", js.undefined)
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTfa(value: TFAStatus): Self = StObject.set(x, "tfa", value.asInstanceOf[js.Any])
      
      inline def setTfaNull: Self = StObject.set(x, "tfa", null)
      
      inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
      
      inline def setUpdated(value: Date | String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProfileFetchOptions extends StObject {
    
    /** passed through to prompter */
    var creds: js.UndefOr[ProfileCredentials] = js.undefined
    
    /**
      * the hostname of the current machine, to show the user during the WebAuth flow.
      * @default os.hostname()
      */
    var hostname: js.UndefOr[String] = js.undefined
  }
  object ProfileFetchOptions {
    
    inline def apply(): ProfileFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProfileFetchOptions]
    }
    
    extension [Self <: ProfileFetchOptions](x: Self) {
      
      inline def setCreds(value: ProfileCredentials): Self = StObject.set(x, "creds", value.asInstanceOf[js.Any])
      
      inline def setCredsUndefined: Self = StObject.set(x, "creds", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.npmProfile.npmProfileBooleans.`false`
    - typings.npmProfile.anon.Dictkey
    - js.Tuple2[java.lang.String, java.lang.String]
    - java.lang.String
  */
  type TFAStatus = _TFAStatus | (js.Tuple2[String, String]) | Null | String
  
  trait TFAStatusUpdate extends StObject {
    
    var mode: disable | `auth-only` | `auth-and-writes`
    
    var password: String
  }
  object TFAStatusUpdate {
    
    inline def apply(mode: disable | `auth-only` | `auth-and-writes`, password: String): TFAStatusUpdate = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[TFAStatusUpdate]
    }
    
    extension [Self <: TFAStatusUpdate](x: Self) {
      
      inline def setMode(value: disable | `auth-only` | `auth-and-writes`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait Token extends StObject {
    
    /**
      * An array of CIDR ranges that this token is allowed to be used from.
      */
    var cidr_whitelist: js.Array[String]
    
    /**
      * The date and time the token was created
      */
    var created: Date | String
    
    /**
      * A sha512 that can be used to remove this token.
      */
    var key: String
    
    /**
      * If true, this token can only be used to download private modules. Critically, it CAN NOT be used to publish.
      */
    var readonly: Boolean
    
    /**
      * The first six characters of the token UUID. This should be used by the user to identify which token this is.
      */
    var token: String | Null
    
    /**
      * The date and time the token was updated
      */
    var updated: Date | String
  }
  object Token {
    
    inline def apply(
      cidr_whitelist: js.Array[String],
      created: Date | String,
      key: String,
      readonly: Boolean,
      updated: Date | String
    ): Token = {
      val __obj = js.Dynamic.literal(cidr_whitelist = cidr_whitelist.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], token = null)
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setCidr_whitelist(value: js.Array[String]): Self = StObject.set(x, "cidr_whitelist", value.asInstanceOf[js.Any])
      
      inline def setCidr_whitelistVarargs(value: String*): Self = StObject.set(x, "cidr_whitelist", js.Array(value :_*))
      
      inline def setCreated(value: Date | String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenNull: Self = StObject.set(x, "token", null)
      
      inline def setUpdated(value: Date | String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateOptions extends StObject {
    
    /**
      * This is used to change your password and is not visible (for obvious reasons) through the get() API.
      * The value should be an object with old and new properties, where the former has the user's current password and the latter has the desired new password.
      */
    var password: js.UndefOr[PasswordUpdate] = js.undefined
    
    var tfa: js.UndefOr[TFAStatusUpdate] = js.undefined
  }
  object UpdateOptions {
    
    inline def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    extension [Self <: UpdateOptions](x: Self) {
      
      inline def setPassword(value: PasswordUpdate): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setTfa(value: TFAStatusUpdate): Self = StObject.set(x, "tfa", value.asInstanceOf[js.Any])
      
      inline def setTfaUndefined: Self = StObject.set(x, "tfa", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Omit<npm-profile.npm-profile.ProfileData, 'tfa' | 'created' | 'updated' | 'email_verified'>> & npm-profile.npm-profile.UpdateOptions */
  trait UpdateProfileData extends StObject {
    
    var cidr_whitelist: js.UndefOr[Null | js.Array[String]] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var freenode: js.UndefOr[String] = js.undefined
    
    var fullname: js.UndefOr[String] = js.undefined
    
    var github: js.UndefOr[String] = js.undefined
    
    var homepage: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * This is used to change your password and is not visible (for obvious reasons) through the get() API.
      * The value should be an object with old and new properties, where the former has the user's current password and the latter has the desired new password.
      */
    var password: js.UndefOr[PasswordUpdate] = js.undefined
    
    var tfa: js.UndefOr[TFAStatusUpdate] = js.undefined
    
    var twitter: js.UndefOr[String] = js.undefined
  }
  object UpdateProfileData {
    
    inline def apply(): UpdateProfileData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateProfileData]
    }
    
    extension [Self <: UpdateProfileData](x: Self) {
      
      inline def setCidr_whitelist(value: js.Array[String]): Self = StObject.set(x, "cidr_whitelist", value.asInstanceOf[js.Any])
      
      inline def setCidr_whitelistNull: Self = StObject.set(x, "cidr_whitelist", null)
      
      inline def setCidr_whitelistUndefined: Self = StObject.set(x, "cidr_whitelist", js.undefined)
      
      inline def setCidr_whitelistVarargs(value: String*): Self = StObject.set(x, "cidr_whitelist", js.Array(value :_*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFreenode(value: String): Self = StObject.set(x, "freenode", value.asInstanceOf[js.Any])
      
      inline def setFreenodeUndefined: Self = StObject.set(x, "freenode", js.undefined)
      
      inline def setFullname(value: String): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
      
      inline def setFullnameUndefined: Self = StObject.set(x, "fullname", js.undefined)
      
      inline def setGithub(value: String): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
      
      inline def setGithubUndefined: Self = StObject.set(x, "github", js.undefined)
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPassword(value: PasswordUpdate): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setTfa(value: TFAStatusUpdate): Self = StObject.set(x, "tfa", value.asInstanceOf[js.Any])
      
      inline def setTfaUndefined: Self = StObject.set(x, "tfa", js.undefined)
      
      inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
    }
  }
  
  trait _TFAStatus extends StObject
  
  object global {
    
    object NodeJS {
      
      trait Process extends StObject {
        
        @JSName("emit")
        def emit_log(event: log, logLevel: LogLevel, any: String*): Boolean
        
        @JSName("on")
        def on_log(event: `log `, listener: js.Function1[/* logLevel */ LogLevel, Unit]): this.type
      }
      object Process {
        
        inline def apply(
          emit: (log, LogLevel, /* repeated */ String) => Boolean,
          on: (`log `, js.Function1[/* logLevel */ LogLevel, Unit]) => Process
        ): Process = {
          val __obj = js.Dynamic.literal(emit = js.Any.fromFunction3(emit), on = js.Any.fromFunction2(on))
          __obj.asInstanceOf[Process]
        }
        
        extension [Self <: Process](x: Self) {
          
          inline def setEmit(value: (log, LogLevel, /* repeated */ String) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction3(value))
          
          inline def setOn(value: (`log `, js.Function1[/* logLevel */ LogLevel, Unit]) => Process): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
