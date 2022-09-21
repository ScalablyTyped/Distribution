package typings.openfin.anon

import typings.openfin.shapesMod.ContextMenuSettings
import typings.openfin.viewViewMod.AutoResizeOptions
import typings.openfin.windowOptionMod.Api
import typings.openfin.windowOptionMod.ContentNavigation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<openfin.openfin/_v2/api/view/view.ViewOptions> */
trait PartialViewOptions extends StObject {
  
  var api: js.UndefOr[Api] = js.undefined
  
  var autoResize: js.UndefOr[AutoResizeOptions] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var contentNavigation: js.UndefOr[ContentNavigation] = js.undefined
  
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  
  var customContext: js.UndefOr[Any] = js.undefined
  
  var customData: js.UndefOr[Any] = js.undefined
  
  var experimental: js.UndefOr[Any] = js.undefined
}
object PartialViewOptions {
  
  inline def apply(): PartialViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialViewOptions]
  }
  
  extension [Self <: PartialViewOptions](x: Self) {
    
    inline def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setAutoResize(value: AutoResizeOptions): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setContentNavigation(value: ContentNavigation): Self = StObject.set(x, "contentNavigation", value.asInstanceOf[js.Any])
    
    inline def setContentNavigationUndefined: Self = StObject.set(x, "contentNavigation", js.undefined)
    
    inline def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
    
    inline def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
    
    inline def setCustomContext(value: Any): Self = StObject.set(x, "customContext", value.asInstanceOf[js.Any])
    
    inline def setCustomContextUndefined: Self = StObject.set(x, "customContext", js.undefined)
    
    inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setExperimental(value: Any): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
  }
}
