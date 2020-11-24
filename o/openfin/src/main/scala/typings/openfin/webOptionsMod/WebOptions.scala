package typings.openfin.webOptionsMod

import typings.openfin.preloadScriptMod.PreloadScript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebOptions extends js.Object {
  
  var contentRedirect: js.UndefOr[js.Any] = js.native
  
  var customContext: js.UndefOr[js.Any] = js.native
  
  var experimental: js.UndefOr[js.Any] = js.native
  
  var name: String = js.native
  
  var preloadScripts: js.UndefOr[js.Array[PreloadScript]] = js.native
  
  var uuid: String = js.native
}
object WebOptions {
  
  @scala.inline
  def apply(name: String, uuid: String): WebOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebOptions]
  }
  
  @scala.inline
  implicit class WebOptionsOps[Self <: WebOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRedirect(value: js.Any): Self = this.set("contentRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRedirect: Self = this.set("contentRedirect", js.undefined)
    
    @scala.inline
    def setCustomContext(value: js.Any): Self = this.set("customContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomContext: Self = this.set("customContext", js.undefined)
    
    @scala.inline
    def setExperimental(value: js.Any): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setPreloadScriptsVarargs(value: PreloadScript*): Self = this.set("preloadScripts", js.Array(value :_*))
    
    @scala.inline
    def setPreloadScripts(value: js.Array[PreloadScript]): Self = this.set("preloadScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadScripts: Self = this.set("preloadScripts", js.undefined)
  }
}
