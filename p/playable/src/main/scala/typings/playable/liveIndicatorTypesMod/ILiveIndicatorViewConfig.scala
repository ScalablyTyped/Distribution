package typings.playable.liveIndicatorTypesMod

import typings.playable.textMapTypesMod.ITextMap
import typings.playable.tooltipTypesMod.ITooltipService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILiveIndicatorViewConfig extends js.Object {
  
  var callbacks: ILiveIndicatorViewCallbacks = js.native
  
  var textMap: ITextMap = js.native
  
  var tooltipService: ITooltipService = js.native
}
object ILiveIndicatorViewConfig {
  
  @scala.inline
  def apply(callbacks: ILiveIndicatorViewCallbacks, textMap: ITextMap, tooltipService: ITooltipService): ILiveIndicatorViewConfig = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILiveIndicatorViewConfig]
  }
  
  @scala.inline
  implicit class ILiveIndicatorViewConfigOps[Self <: ILiveIndicatorViewConfig] (val x: Self) extends AnyVal {
    
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
    def setCallbacks(value: ILiveIndicatorViewCallbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMap(value: ITextMap): Self = this.set("textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipService(value: ITooltipService): Self = this.set("tooltipService", value.asInstanceOf[js.Any])
  }
}
