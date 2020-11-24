package typings.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventLoopMonitorOptions extends js.Object {
  
  /**
    * The sampling rate in milliseconds.
    * Must be greater than zero.
    * @default 10
    */
  var resolution: js.UndefOr[Double] = js.native
}
object EventLoopMonitorOptions {
  
  @scala.inline
  def apply(): EventLoopMonitorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventLoopMonitorOptions]
  }
  
  @scala.inline
  implicit class EventLoopMonitorOptionsOps[Self <: EventLoopMonitorOptions] (val x: Self) extends AnyVal {
    
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
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
}
