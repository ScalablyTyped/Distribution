package typings.nextAuth.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nextAuth.adaptersMod.Adapter
import typings.nextAuth.clientMod.SessionProvider
import typings.nextAuth.nextAuthStrings.`verify-request`
import typings.nextAuth.nextAuthStrings.callback
import typings.nextAuth.nextAuthStrings.csrf
import typings.nextAuth.nextAuthStrings.error
import typings.nextAuth.nextAuthStrings.providers
import typings.nextAuth.nextAuthStrings.session
import typings.nextAuth.nextAuthStrings.signin
import typings.nextAuth.nextAuthStrings.signout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppOptions extends js.Object {
  
  var action: providers | session | csrf | signin | signout | callback | `verify-request` | error = js.native
  
  var adapter: Adapter[_, _, _, _] = js.native
  
  var basePath: String = js.native
  
  var baseUrl: String = js.native
  
  var callbackUrl: String = js.native
  
  var callbacks: Callbacks = js.native
  
  var cookies: Cookies = js.native
  
  var csrfToken: String = js.native
  
  var debug: Boolean = js.native
  
  var events: Events = js.native
  
  var jwt: JWTOptions = js.native
  
  var pages: PageOptions = js.native
  
  var provider: js.UndefOr[String] = js.native
  
  var providers: StringDictionary[SessionProvider] = js.native
  
  var secret: String = js.native
  
  var session: Session = js.native
}
object AppOptions {
  
  @scala.inline
  def apply(
    action: providers | session | csrf | signin | signout | callback | `verify-request` | error,
    adapter: Adapter[_, _, _, _],
    basePath: String,
    baseUrl: String,
    callbackUrl: String,
    callbacks: Callbacks,
    cookies: Cookies,
    csrfToken: String,
    debug: Boolean,
    events: Events,
    jwt: JWTOptions,
    pages: PageOptions,
    providers: StringDictionary[SessionProvider],
    secret: String,
    session: Session
  ): AppOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], adapter = adapter.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], callbackUrl = callbackUrl.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], csrfToken = csrfToken.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], jwt = jwt.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppOptions]
  }
  
  @scala.inline
  implicit class AppOptionsOps[Self <: AppOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: providers | session | csrf | signin | signout | callback | `verify-request` | error): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdapter(value: Adapter[_, _, _, _]): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUrl(value: String): Self = this.set("callbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbacks(value: Callbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: Cookies): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsrfToken(value: String): Self = this.set("csrfToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: Events): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwt(value: JWTOptions): Self = this.set("jwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: PageOptions): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(value: StringDictionary[SessionProvider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
}
