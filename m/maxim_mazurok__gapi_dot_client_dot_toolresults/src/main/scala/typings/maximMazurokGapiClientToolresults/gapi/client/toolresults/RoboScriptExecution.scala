package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoboScriptExecution extends js.Object {
  
  /** The number of Robo script actions executed successfully. */
  var successfulActions: js.UndefOr[Double] = js.native
  
  /** The total number of actions in the Robo script. */
  var totalActions: js.UndefOr[Double] = js.native
}
object RoboScriptExecution {
  
  @scala.inline
  def apply(): RoboScriptExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoboScriptExecution]
  }
  
  @scala.inline
  implicit class RoboScriptExecutionOps[Self <: RoboScriptExecution] (val x: Self) extends AnyVal {
    
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
    def setSuccessfulActions(value: Double): Self = this.set("successfulActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulActions: Self = this.set("successfulActions", js.undefined)
    
    @scala.inline
    def setTotalActions(value: Double): Self = this.set("totalActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalActions: Self = this.set("totalActions", js.undefined)
  }
}
