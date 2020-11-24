package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployedFleetAutoscaler extends js.Object {
  
  /** The name of the Agones autoscaler. */
  var autoscaler: js.UndefOr[String] = js.native
  
  /** The autoscaler spec retrieved from Agones. */
  var fleetAutoscalerSpec: js.UndefOr[String] = js.native
  
  /** The source spec that is used to create the autoscaler. The GameServerConfig resource may no longer exist in the system. */
  var specSource: js.UndefOr[SpecSource] = js.native
}
object DeployedFleetAutoscaler {
  
  @scala.inline
  def apply(): DeployedFleetAutoscaler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedFleetAutoscaler]
  }
  
  @scala.inline
  implicit class DeployedFleetAutoscalerOps[Self <: DeployedFleetAutoscaler] (val x: Self) extends AnyVal {
    
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
    def setAutoscaler(value: String): Self = this.set("autoscaler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscaler: Self = this.set("autoscaler", js.undefined)
    
    @scala.inline
    def setFleetAutoscalerSpec(value: String): Self = this.set("fleetAutoscalerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetAutoscalerSpec: Self = this.set("fleetAutoscalerSpec", js.undefined)
    
    @scala.inline
    def setSpecSource(value: SpecSource): Self = this.set("specSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecSource: Self = this.set("specSource", js.undefined)
  }
}
