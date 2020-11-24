package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingConfig extends js.Object {
  
  /** Required. Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/ */
  var fleetAutoscalerSpec: js.UndefOr[String] = js.native
  
  /** Required. The name of the Scaling Config */
  var name: js.UndefOr[String] = js.native
  
  /** The schedules to which this Scaling Config applies. */
  var schedules: js.UndefOr[js.Array[Schedule]] = js.native
  
  /**
    * Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any
    * of the selector entries.
    */
  var selectors: js.UndefOr[js.Array[LabelSelector]] = js.native
}
object ScalingConfig {
  
  @scala.inline
  def apply(): ScalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingConfig]
  }
  
  @scala.inline
  implicit class ScalingConfigOps[Self <: ScalingConfig] (val x: Self) extends AnyVal {
    
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
    def setFleetAutoscalerSpec(value: String): Self = this.set("fleetAutoscalerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetAutoscalerSpec: Self = this.set("fleetAutoscalerSpec", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSchedulesVarargs(value: Schedule*): Self = this.set("schedules", js.Array(value :_*))
    
    @scala.inline
    def setSchedules(value: js.Array[Schedule]): Self = this.set("schedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedules: Self = this.set("schedules", js.undefined)
    
    @scala.inline
    def setSelectorsVarargs(value: LabelSelector*): Self = this.set("selectors", js.Array(value :_*))
    
    @scala.inline
    def setSelectors(value: js.Array[LabelSelector]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
  }
}
