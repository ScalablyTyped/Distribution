package typings.playable.overlayTypesMod

import typings.playable.themeTypesMod.IThemeService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayViewConfig extends js.Object {
  
  var callbacks: IOverlayViewCallbacks = js.native
  
  var theme: IThemeService = js.native
}
object IOverlayViewConfig {
  
  @scala.inline
  def apply(callbacks: IOverlayViewCallbacks, theme: IThemeService): IOverlayViewConfig = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverlayViewConfig]
  }
  
  @scala.inline
  implicit class IOverlayViewConfigOps[Self <: IOverlayViewConfig] (val x: Self) extends AnyVal {
    
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
    def setCallbacks(value: IOverlayViewCallbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
