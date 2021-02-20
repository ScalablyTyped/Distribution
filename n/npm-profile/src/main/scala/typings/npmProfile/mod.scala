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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-profile", "createToken")
  @js.native
  def createToken(password: String, readonly: Boolean, cidr_whitelist: js.Array[String]): js.Promise[Token] = js.native
  @JSImport("npm-profile", "createToken")
  @js.native
  def createToken(password: String, readonly: Boolean, cidr_whitelist: js.Array[String], options: Options): js.Promise[Token] = js.native
  
  @JSImport("npm-profile", "get")
  @js.native
  def get(): js.Promise[ProfileData] = js.native
  @JSImport("npm-profile", "get")
  @js.native
  def get(options: Options): js.Promise[ProfileData] = js.native
  
  @JSImport("npm-profile", "listTokens")
  @js.native
  def listTokens(): js.Promise[js.Array[Token]] = js.native
  @JSImport("npm-profile", "listTokens")
  @js.native
  def listTokens(options: Options): js.Promise[js.Array[Token]] = js.native
  
  @JSImport("npm-profile", "removeToken")
  @js.native
  def removeToken(tokenOrKey: String): js.Promise[Unit] = js.native
  @JSImport("npm-profile", "removeToken")
  @js.native
  def removeToken(tokenOrKey: String, options: Options): js.Promise[Unit] = js.native
  
  @JSImport("npm-profile", "set")
  @js.native
  def set(updateOptions: UpdateProfileData): js.Promise[ProfileData] = js.native
  @JSImport("npm-profile", "set")
  @js.native
  def set(updateOptions: UpdateProfileData, options: Options): js.Promise[ProfileData] = js.native
  
  @js.native
  trait FetchProfileError extends Error {
    
    var body: Uint8Array = js.native
    
    var code: String = js.native
    
    var headers: StringDictionary[js.Any] = js.native
    
    var method: String = js.native
    
    var pkgid: js.UndefOr[String] = js.native
    
    var statucCode: Double = js.native
    
    var uri: String = js.native
  }
  object FetchProfileError {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FetchProfileErrorMutableBuilder[Self <: FetchProfileError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgid(value: String): Self = StObject.set(x, "pkgid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgidUndefined: Self = StObject.set(x, "pkgid", js.undefined)
      
      @scala.inline
      def setStatucCode(value: Double): Self = StObject.set(x, "statucCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def error: typings.npmProfile.npmProfileStrings.error = "error".asInstanceOf[typings.npmProfile.npmProfileStrings.error]
    
    @scala.inline
    def http: typings.npmProfile.npmProfileStrings.http = "http".asInstanceOf[typings.npmProfile.npmProfileStrings.http]
    
    @scala.inline
    def info: typings.npmProfile.npmProfileStrings.info = "info".asInstanceOf[typings.npmProfile.npmProfileStrings.info]
    
    @scala.inline
    def notice: typings.npmProfile.npmProfileStrings.notice = "notice".asInstanceOf[typings.npmProfile.npmProfileStrings.notice]
    
    @scala.inline
    def silly: typings.npmProfile.npmProfileStrings.silly = "silly".asInstanceOf[typings.npmProfile.npmProfileStrings.silly]
    
    @scala.inline
    def timing: typings.npmProfile.npmProfileStrings.timing = "timing".asInstanceOf[typings.npmProfile.npmProfileStrings.timing]
    
    @scala.inline
    def verbose: typings.npmProfile.npmProfileStrings.verbose = "verbose".asInstanceOf[typings.npmProfile.npmProfileStrings.verbose]
    
    @scala.inline
    def warn: typings.npmProfile.npmProfileStrings.warn = "warn".asInstanceOf[typings.npmProfile.npmProfileStrings.warn]
  }
  
  type Options = typings.npmRegistryFetch.mod.Options with ProfileFetchOptions
  
  @js.native
  trait PasswordUpdate extends StObject {
    
    var `new`: String = js.native
    
    var old: String = js.native
  }
  object PasswordUpdate {
    
    @scala.inline
    def apply(`new`: String, old: String): PasswordUpdate = {
      val __obj = js.Dynamic.literal(old = old.asInstanceOf[js.Any])
      __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PasswordUpdate]
    }
    
    @scala.inline
    implicit class PasswordUpdateMutableBuilder[Self <: PasswordUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNew(value: String): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOld(value: String): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProfileCredentials extends StObject {
    
    /**
      * default value for email
      */
    var email: String = js.native
    
    /**
      * default value for username
      */
    var username: String = js.native
  }
  object ProfileCredentials {
    
    @scala.inline
    def apply(email: String, username: String): ProfileCredentials = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileCredentials]
    }
    
    @scala.inline
    implicit class ProfileCredentialsMutableBuilder[Self <: ProfileCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProfileData extends StObject {
    
    var cidr_whitelist: Null | js.Array[String] = js.native
    
    var created: Date | String = js.native
    
    var email: String = js.native
    
    var email_verified: Boolean = js.native
    
    var freenode: js.UndefOr[String] = js.native
    
    var fullname: js.UndefOr[String] = js.native
    
    var github: js.UndefOr[String] = js.native
    
    var homepage: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    /**
      * two-factor authentication status
      */
    var tfa: TFAStatus = js.native
    
    var twitter: js.UndefOr[String] = js.native
    
    var updated: Date | String = js.native
  }
  object ProfileData {
    
    @scala.inline
    def apply(
      created: Date | String,
      email: String,
      email_verified: Boolean,
      name: String,
      updated: Date | String
    ): ProfileData = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileData]
    }
    
    @scala.inline
    implicit class ProfileDataMutableBuilder[Self <: ProfileData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidr_whitelist(value: js.Array[String]): Self = StObject.set(x, "cidr_whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidr_whitelistNull: Self = StObject.set(x, "cidr_whitelist", null)
      
      @scala.inline
      def setCidr_whitelistVarargs(value: String*): Self = StObject.set(x, "cidr_whitelist", js.Array(value :_*))
      
      @scala.inline
      def setCreated(value: Date | String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreenode(value: String): Self = StObject.set(x, "freenode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreenodeUndefined: Self = StObject.set(x, "freenode", js.undefined)
      
      @scala.inline
      def setFullname(value: String): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullnameUndefined: Self = StObject.set(x, "fullname", js.undefined)
      
      @scala.inline
      def setGithub(value: String): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGithubUndefined: Self = StObject.set(x, "github", js.undefined)
      
      @scala.inline
      def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTfa(value: TFAStatus): Self = StObject.set(x, "tfa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTfaNull: Self = StObject.set(x, "tfa", null)
      
      @scala.inline
      def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
      
      @scala.inline
      def setUpdated(value: Date | String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProfileFetchOptions extends StObject {
    
    /** passed through to prompter */
    var creds: js.UndefOr[ProfileCredentials] = js.native
    
    /**
      * the hostname of the current machine, to show the user during the WebAuth flow.
      * @default os.hostname()
      */
    var hostname: js.UndefOr[String] = js.native
  }
  object ProfileFetchOptions {
    
    @scala.inline
    def apply(): ProfileFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProfileFetchOptions]
    }
    
    @scala.inline
    implicit class ProfileFetchOptionsMutableBuilder[Self <: ProfileFetchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreds(value: ProfileCredentials): Self = StObject.set(x, "creds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredsUndefined: Self = StObject.set(x, "creds", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
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
  
  @js.native
  trait TFAStatusUpdate extends StObject {
    
    var mode: disable | `auth-only` | `auth-and-writes` = js.native
    
    var password: String = js.native
  }
  object TFAStatusUpdate {
    
    @scala.inline
    def apply(mode: disable | `auth-only` | `auth-and-writes`, password: String): TFAStatusUpdate = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[TFAStatusUpdate]
    }
    
    @scala.inline
    implicit class TFAStatusUpdateMutableBuilder[Self <: TFAStatusUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: disable | `auth-only` | `auth-and-writes`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    /**
      * An array of CIDR ranges that this token is allowed to be used from.
      */
    var cidr_whitelist: js.Array[String] = js.native
    
    /**
      * The date and time the token was created
      */
    var created: Date | String = js.native
    
    /**
      * A sha512 that can be used to remove this token.
      */
    var key: String = js.native
    
    /**
      * If true, this token can only be used to download private modules. Critically, it CAN NOT be used to publish.
      */
    var readonly: Boolean = js.native
    
    /**
      * The first six characters of the token UUID. This should be used by the user to identify which token this is.
      */
    var token: String | Null = js.native
    
    /**
      * The date and time the token was updated
      */
    var updated: Date | String = js.native
  }
  object Token {
    
    @scala.inline
    def apply(
      cidr_whitelist: js.Array[String],
      created: Date | String,
      key: String,
      readonly: Boolean,
      updated: Date | String
    ): Token = {
      val __obj = js.Dynamic.literal(cidr_whitelist = cidr_whitelist.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidr_whitelist(value: js.Array[String]): Self = StObject.set(x, "cidr_whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidr_whitelistVarargs(value: String*): Self = StObject.set(x, "cidr_whitelist", js.Array(value :_*))
      
      @scala.inline
      def setCreated(value: Date | String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenNull: Self = StObject.set(x, "token", null)
      
      @scala.inline
      def setUpdated(value: Date | String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateOptions extends StObject {
    
    /**
      * This is used to change your password and is not visible (for obvious reasons) through the get() API.
      * The value should be an object with old and new properties, where the former has the user's current password and the latter has the desired new password.
      */
    var password: js.UndefOr[PasswordUpdate] = js.native
    
    var tfa: js.UndefOr[TFAStatusUpdate] = js.native
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: PasswordUpdate): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setTfa(value: TFAStatusUpdate): Self = StObject.set(x, "tfa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTfaUndefined: Self = StObject.set(x, "tfa", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Omit<npm-profile.npm-profile.ProfileData, 'tfa' | 'created' | 'updated' | 'email_verified'>> & npm-profile.npm-profile.UpdateOptions */
  @js.native
  trait UpdateProfileData extends StObject {
    
    var cidr_whitelist: js.UndefOr[Null | js.Array[String]] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var freenode: js.UndefOr[String] = js.native
    
    var fullname: js.UndefOr[String] = js.native
    
    var github: js.UndefOr[String] = js.native
    
    var homepage: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    /**
      * This is used to change your password and is not visible (for obvious reasons) through the get() API.
      * The value should be an object with old and new properties, where the former has the user's current password and the latter has the desired new password.
      */
    var password: js.UndefOr[PasswordUpdate] = js.native
    
    var tfa: js.UndefOr[TFAStatusUpdate] = js.native
    
    var twitter: js.UndefOr[String] = js.native
  }
  object UpdateProfileData {
    
    @scala.inline
    def apply(): UpdateProfileData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateProfileData]
    }
    
    @scala.inline
    implicit class UpdateProfileDataMutableBuilder[Self <: UpdateProfileData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidr_whitelist(value: js.Array[String]): Self = StObject.set(x, "cidr_whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidr_whitelistNull: Self = StObject.set(x, "cidr_whitelist", null)
      
      @scala.inline
      def setCidr_whitelistUndefined: Self = StObject.set(x, "cidr_whitelist", js.undefined)
      
      @scala.inline
      def setCidr_whitelistVarargs(value: String*): Self = StObject.set(x, "cidr_whitelist", js.Array(value :_*))
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setFreenode(value: String): Self = StObject.set(x, "freenode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreenodeUndefined: Self = StObject.set(x, "freenode", js.undefined)
      
      @scala.inline
      def setFullname(value: String): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullnameUndefined: Self = StObject.set(x, "fullname", js.undefined)
      
      @scala.inline
      def setGithub(value: String): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGithubUndefined: Self = StObject.set(x, "github", js.undefined)
      
      @scala.inline
      def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPassword(value: PasswordUpdate): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setTfa(value: TFAStatusUpdate): Self = StObject.set(x, "tfa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTfaUndefined: Self = StObject.set(x, "tfa", js.undefined)
      
      @scala.inline
      def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
    }
  }
  
  trait _TFAStatus extends StObject
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait Process extends StObject {
        
        @JSName("emit")
        def emit_log(event: log, logLevel: LogLevel, any: String*): Boolean = js.native
        
        @JSName("on")
        def on_log(event: `log `, listener: js.Function1[/* logLevel */ LogLevel, Unit]): this.type = js.native
      }
      object Process {
        
        @scala.inline
        def apply(
          emit: (log, LogLevel, /* repeated */ String) => Boolean,
          on: (`log `, js.Function1[/* logLevel */ LogLevel, Unit]) => Process
        ): Process = {
          val __obj = js.Dynamic.literal(emit = js.Any.fromFunction3(emit), on = js.Any.fromFunction2(on))
          __obj.asInstanceOf[Process]
        }
        
        @scala.inline
        implicit class ProcessMutableBuilder[Self <: Process] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEmit(value: (log, LogLevel, /* repeated */ String) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction3(value))
          
          @scala.inline
          def setOn(value: (`log `, js.Function1[/* logLevel */ LogLevel, Unit]) => Process): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
