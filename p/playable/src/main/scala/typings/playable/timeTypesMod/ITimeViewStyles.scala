package typings.playable.timeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeViewStyles extends js.Object {
  
  var current: String = js.native
  
  var duration: String = js.native
  
  var hidden: String = js.native
  
  var separator: String = js.native
  
  var time: String = js.native
  
  var timeWrapper: String = js.native
}
object ITimeViewStyles {
  
  @scala.inline
  def apply(
    current: String,
    duration: String,
    hidden: String,
    separator: String,
    time: String,
    timeWrapper: String
  ): ITimeViewStyles = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeWrapper = timeWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeViewStyles]
  }
  
  @scala.inline
  implicit class ITimeViewStylesOps[Self <: ITimeViewStyles] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeWrapper(value: String): Self = this.set("timeWrapper", value.asInstanceOf[js.Any])
  }
}
