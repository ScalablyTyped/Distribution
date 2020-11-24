package typings.nextAuth.mod

import typings.nextAuth.adaptersMod.Adapter
import typings.nextAuth.providersMod.PossibleProviders
import typings.std.ReturnType
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitOptions extends js.Object {
  
  var adapter: js.UndefOr[Adapter[_, _, _, _]] = js.native
  
  var callbacks: js.UndefOr[Callbacks] = js.native
  
  var cookies: js.UndefOr[Cookies] = js.native
  
  var database: js.UndefOr[String | ConnectionOptions] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var events: js.UndefOr[Events] = js.native
  
  var jwt: js.UndefOr[JWTOptions] = js.native
  
  var pages: js.UndefOr[PageOptions] = js.native
  
  var providers: js.Array[ReturnType[PossibleProviders]] = js.native
  
  var secret: js.UndefOr[String] = js.native
  
  var session: js.UndefOr[Session] = js.native
  
  var useSecureCookies: js.UndefOr[Boolean] = js.native
}
object InitOptions {
  
  @scala.inline
  def apply(providers: js.Array[ReturnType[PossibleProviders]]): InitOptions = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    
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
    def setProvidersVarargs(value: ReturnType[PossibleProviders]*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[ReturnType[PossibleProviders]]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdapter(value: Adapter[_, _, _, _]): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    
    @scala.inline
    def setCallbacks(value: Callbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    
    @scala.inline
    def setCookies(value: Cookies): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setDatabase(value: String | ConnectionOptions): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setEvents(value: Events): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setJwt(value: JWTOptions): Self = this.set("jwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwt: Self = this.set("jwt", js.undefined)
    
    @scala.inline
    def setPages(value: PageOptions): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setUseSecureCookies(value: Boolean): Self = this.set("useSecureCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSecureCookies: Self = this.set("useSecureCookies", js.undefined)
  }
}
