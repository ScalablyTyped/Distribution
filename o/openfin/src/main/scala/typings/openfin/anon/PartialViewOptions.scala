package typings.openfin.anon

import typings.openfin.shapesMod.ContextMenuSettings
import typings.openfin.viewViewMod.AutoResizeOptions
import typings.openfin.windowOptionMod.Api
import typings.openfin.windowOptionMod.ContentNavigation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<openfin.openfin/_v2/api/view/view.ViewOptions> */
@js.native
trait PartialViewOptions extends StObject {
  
  var api: js.UndefOr[Api] = js.native
  
  var autoResize: js.UndefOr[AutoResizeOptions] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var contentNavigation: js.UndefOr[ContentNavigation] = js.native
  
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  
  var customContext: js.UndefOr[js.Any] = js.native
  
  var customData: js.UndefOr[js.Any] = js.native
  
  var experimental: js.UndefOr[js.Any] = js.native
}
object PartialViewOptions {
  
  @scala.inline
  def apply(): PartialViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialViewOptions]
  }
  
  @scala.inline
  implicit class PartialViewOptionsMutableBuilder[Self <: PartialViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    @scala.inline
    def setAutoResize(value: AutoResizeOptions): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setContentNavigation(value: ContentNavigation): Self = StObject.set(x, "contentNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNavigationUndefined: Self = StObject.set(x, "contentNavigation", js.undefined)
    
    @scala.inline
    def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
    
    @scala.inline
    def setCustomContext(value: js.Any): Self = StObject.set(x, "customContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomContextUndefined: Self = StObject.set(x, "customContext", js.undefined)
    
    @scala.inline
    def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    @scala.inline
    def setExperimental(value: js.Any): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
  }
}
