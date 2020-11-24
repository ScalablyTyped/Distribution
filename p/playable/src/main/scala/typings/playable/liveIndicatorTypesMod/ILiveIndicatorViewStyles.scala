package typings.playable.liveIndicatorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILiveIndicatorViewStyles extends js.Object {
  
  var active: String = js.native
  
  var clickable: String = js.native
  
  var ended: String = js.native
  
  var hidden: String = js.native
  
  var liveIndicator: String = js.native
  
  var liveIndicatorButton: String = js.native
}
object ILiveIndicatorViewStyles {
  
  @scala.inline
  def apply(
    active: String,
    clickable: String,
    ended: String,
    hidden: String,
    liveIndicator: String,
    liveIndicatorButton: String
  ): ILiveIndicatorViewStyles = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], liveIndicator = liveIndicator.asInstanceOf[js.Any], liveIndicatorButton = liveIndicatorButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILiveIndicatorViewStyles]
  }
  
  @scala.inline
  implicit class ILiveIndicatorViewStylesOps[Self <: ILiveIndicatorViewStyles] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickable(value: String): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnded(value: String): Self = this.set("ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveIndicator(value: String): Self = this.set("liveIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveIndicatorButton(value: String): Self = this.set("liveIndicatorButton", value.asInstanceOf[js.Any])
  }
}
