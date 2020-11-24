package typings.openfin.viewViewMod

import typings.openfin.shapesMod.ContextMenuSettings
import typings.openfin.windowOptionMod.Api
import typings.openfin.windowOptionMod.ContentNavigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewOptions extends js.Object {
  
  var api: js.UndefOr[Api] = js.native
  
  var autoResize: js.UndefOr[AutoResizeOptions] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var contentNavigation: js.UndefOr[ContentNavigation] = js.native
  
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  
  var customContext: js.UndefOr[js.Any] = js.native
  
  var customData: js.UndefOr[js.Any] = js.native
  
  var experimental: js.UndefOr[js.Any] = js.native
}
object ViewOptions {
  
  @scala.inline
  def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions] (val x: Self) extends AnyVal {
    
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
    def setApi(value: Api): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    
    @scala.inline
    def setAutoResize(value: AutoResizeOptions): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setContentNavigation(value: ContentNavigation): Self = this.set("contentNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentNavigation: Self = this.set("contentNavigation", js.undefined)
    
    @scala.inline
    def setContextMenuSettings(value: ContextMenuSettings): Self = this.set("contextMenuSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuSettings: Self = this.set("contextMenuSettings", js.undefined)
    
    @scala.inline
    def setCustomContext(value: js.Any): Self = this.set("customContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomContext: Self = this.set("customContext", js.undefined)
    
    @scala.inline
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    
    @scala.inline
    def setExperimental(value: js.Any): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
  }
}
