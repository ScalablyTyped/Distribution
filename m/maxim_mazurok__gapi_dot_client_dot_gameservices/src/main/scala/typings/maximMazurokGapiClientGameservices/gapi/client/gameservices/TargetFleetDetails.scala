package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetFleetDetails extends js.Object {
  
  /** Reference to target Agones fleet autoscaling policy. */
  var autoscaler: js.UndefOr[TargetFleetAutoscaler] = js.native
  
  /** Reference to target Agones fleet. */
  var fleet: js.UndefOr[TargetFleet] = js.native
}
object TargetFleetDetails {
  
  @scala.inline
  def apply(): TargetFleetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetFleetDetails]
  }
  
  @scala.inline
  implicit class TargetFleetDetailsOps[Self <: TargetFleetDetails] (val x: Self) extends AnyVal {
    
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
    def setAutoscaler(value: TargetFleetAutoscaler): Self = this.set("autoscaler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscaler: Self = this.set("autoscaler", js.undefined)
    
    @scala.inline
    def setFleet(value: TargetFleet): Self = this.set("fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleet: Self = this.set("fleet", js.undefined)
  }
}
