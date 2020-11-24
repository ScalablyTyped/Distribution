package typings.openfin.viewViewMod

import typings.openfin.identityMod.Identity
import typings.openfin.preloadScriptMod.PreloadScript
import typings.openfin.shapesMod.Hotkey
import typings.openfin.shapesMod.ViewBounds
import typings.openfin.windowOptionMod.CustomRequestHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewCreationOptions extends ViewOptions {
  
  var bounds: js.UndefOr[ViewBounds] = js.native
  
  var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
  
  var hotkeys: js.UndefOr[js.Array[Hotkey]] = js.native
  
  var name: String = js.native
  
  var preloadScripts: js.UndefOr[js.Array[PreloadScript]] = js.native
  
  var processAffinity: js.UndefOr[String] = js.native
  
  var target: Identity = js.native
  
  var url: String = js.native
}
object ViewCreationOptions {
  
  @scala.inline
  def apply(name: String, target: Identity, url: String): ViewCreationOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewCreationOptions]
  }
  
  @scala.inline
  implicit class ViewCreationOptionsOps[Self <: ViewCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: Identity): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: ViewBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setCustomRequestHeadersVarargs(value: CustomRequestHeaders*): Self = this.set("customRequestHeaders", js.Array(value :_*))
    
    @scala.inline
    def setCustomRequestHeaders(value: js.Array[CustomRequestHeaders]): Self = this.set("customRequestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRequestHeaders: Self = this.set("customRequestHeaders", js.undefined)
    
    @scala.inline
    def setHotkeysVarargs(value: Hotkey*): Self = this.set("hotkeys", js.Array(value :_*))
    
    @scala.inline
    def setHotkeys(value: js.Array[Hotkey]): Self = this.set("hotkeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotkeys: Self = this.set("hotkeys", js.undefined)
    
    @scala.inline
    def setPreloadScriptsVarargs(value: PreloadScript*): Self = this.set("preloadScripts", js.Array(value :_*))
    
    @scala.inline
    def setPreloadScripts(value: js.Array[PreloadScript]): Self = this.set("preloadScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadScripts: Self = this.set("preloadScripts", js.undefined)
    
    @scala.inline
    def setProcessAffinity(value: String): Self = this.set("processAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessAffinity: Self = this.set("processAffinity", js.undefined)
  }
}
