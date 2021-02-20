package typings.netlifyIdentityWidget

import typings.netlifyIdentityWidget.anon.ApiURL
import typings.netlifyIdentityWidget.anon.Avatarurl
import typings.netlifyIdentityWidget.anon.Provider
import typings.netlifyIdentityWidget.netlifyIdentityWidgetStrings.close
import typings.netlifyIdentityWidget.netlifyIdentityWidgetStrings.error
import typings.netlifyIdentityWidget.netlifyIdentityWidgetStrings.init
import typings.netlifyIdentityWidget.netlifyIdentityWidgetStrings.login
import typings.netlifyIdentityWidget.netlifyIdentityWidgetStrings.logout
import typings.netlifyIdentityWidget.netlifyIdentityWidgetStrings.open
import typings.netlifyIdentityWidget.netlifyIdentityWidgetStrings.signup
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("netlify-identity-widget", "close")
  @js.native
  def close(): Unit = js.native
  
  @JSImport("netlify-identity-widget", "currentUser")
  @js.native
  def currentUser(): User | Null = js.native
  
  @JSImport("netlify-identity-widget", "init")
  @js.native
  def init(): Unit = js.native
  @JSImport("netlify-identity-widget", "init")
  @js.native
  def init(opts: InitOptions): Unit = js.native
  
  @JSImport("netlify-identity-widget", "logout")
  @js.native
  def logout(): js.UndefOr[js.Promise[Unit]] = js.native
  
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_close(event: close): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_close(event: close, cb: js.Function0[Unit]): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_error(event: error): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_error(event: error, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_init(event: init): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_init(event: init, cb: js.Function1[/* user */ User | Null, Unit]): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_login(event: login): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_login(event: login, cb: js.Function1[/* user */ User, Unit]): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_logout(event: logout): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_logout(event: logout, cb: js.Function0[Unit]): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_open(event: open): Unit = js.native
  @JSImport("netlify-identity-widget", "off")
  @js.native
  def off_open(event: open, cb: js.Function0[Unit]): Unit = js.native
  
  @JSImport("netlify-identity-widget", "on")
  @js.native
  def on_close(event: close, cb: js.Function0[Unit]): Unit = js.native
  @JSImport("netlify-identity-widget", "on")
  @js.native
  def on_error(event: error, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("netlify-identity-widget", "on")
  @js.native
  def on_init(event: init, cb: js.Function1[/* user */ User | Null, Unit]): Unit = js.native
  @JSImport("netlify-identity-widget", "on")
  @js.native
  def on_login(event: login, cb: js.Function1[/* user */ User, Unit]): Unit = js.native
  @JSImport("netlify-identity-widget", "on")
  @js.native
  def on_logout(event: logout, cb: js.Function0[Unit]): Unit = js.native
  @JSImport("netlify-identity-widget", "on")
  @js.native
  def on_open(event: open, cb: js.Function0[Unit]): Unit = js.native
  
  @JSImport("netlify-identity-widget", "open")
  @js.native
  def open(): Unit = js.native
  @JSImport("netlify-identity-widget", "open")
  @js.native
  def open_login(tabName: login): Unit = js.native
  @JSImport("netlify-identity-widget", "open")
  @js.native
  def open_signup(tabName: signup): Unit = js.native
  
  @JSImport("netlify-identity-widget", "refresh")
  @js.native
  def refresh(): js.Promise[String] = js.native
  @JSImport("netlify-identity-widget", "refresh")
  @js.native
  def refresh(force: Boolean): js.Promise[String] = js.native
  
  @JSImport("netlify-identity-widget", "setLocale")
  @js.native
  def setLocale(locale: String): Unit = js.native
  
  @js.native
  trait InitOptions extends StObject {
    
    // Absolute url to endpoint. ONLY USE IN SPECIAL CASES!
    // e.g. https://www.example.com/.netlify/functions/identity
    // Generally avoid setting the APIUrl. You should only set this when
    // your app is served from a domain that differs from where the
    // identity endpoint is served.This is common for Cordova or Electron
    // apps where you host from localhost or a file.
    var APIUrl: js.UndefOr[String] = js.native
    
    // The container to attach to. e.g.: '#some-query-selector'
    var container: js.UndefOr[String] = js.native
    
    // Initial language
    var locale: js.UndefOr[String] = js.native
    
    // Enable Netlify logo
    var logo: js.UndefOr[Boolean] = js.native
    
    // custom placeholder for name input form
    var namePlaceholder: js.UndefOr[String] = js.native
  }
  object InitOptions {
    
    @scala.inline
    def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAPIUrl(value: String): Self = StObject.set(x, "APIUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAPIUrlUndefined: Self = StObject.set(x, "APIUrl", js.undefined)
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLogo(value: Boolean): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      @scala.inline
      def setNamePlaceholder(value: String): Self = StObject.set(x, "namePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePlaceholderUndefined: Self = StObject.set(x, "namePlaceholder", js.undefined)
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    var access_token: String = js.native
    
    var expires_at: String | Double = js.native
    
    var expires_in: String | Double = js.native
    
    var refresh_token: String = js.native
    
    var token_type: String = js.native
  }
  object Token {
    
    @scala.inline
    def apply(
      access_token: String,
      expires_at: String | Double,
      expires_in: String | Double,
      refresh_token: String,
      token_type: String
    ): Token = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_at(value: String | Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_in(value: String | Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait User extends StObject {
    
    var api: ApiURL = js.native
    
    var app_metadata: Provider = js.native
    
    var aud: String = js.native
    
    var audience: js.UndefOr[js.Any] = js.native
    
    var confirmed_at: String = js.native
    
    var created_at: String = js.native
    
    var email: String = js.native
    
    var id: String = js.native
    
    var invited_at: String = js.native
    
    var recovery_sent_at: String = js.native
    
    var role: String = js.native
    
    var token: js.UndefOr[Token] = js.native
    
    var updated_at: String = js.native
    
    var url: String = js.native
    
    var user_metadata: Avatarurl = js.native
  }
  object User {
    
    @scala.inline
    def apply(
      api: ApiURL,
      app_metadata: Provider,
      aud: String,
      confirmed_at: String,
      created_at: String,
      email: String,
      id: String,
      invited_at: String,
      recovery_sent_at: String,
      role: String,
      updated_at: String,
      url: String,
      user_metadata: Avatarurl
    ): User = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], app_metadata = app_metadata.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], confirmed_at = confirmed_at.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invited_at = invited_at.asInstanceOf[js.Any], recovery_sent_at = recovery_sent_at.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_metadata = user_metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: ApiURL): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_metadata(value: Provider): Self = StObject.set(x, "app_metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudience(value: js.Any): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setConfirmed_at(value: String): Self = StObject.set(x, "confirmed_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvited_at(value: String): Self = StObject.set(x, "invited_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecovery_sent_at(value: String): Self = StObject.set(x, "recovery_sent_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_metadata(value: Avatarurl): Self = StObject.set(x, "user_metadata", value.asInstanceOf[js.Any])
    }
  }
}
