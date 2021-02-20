package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetFleetDetails extends StObject {
  
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
  implicit class TargetFleetDetailsMutableBuilder[Self <: TargetFleetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscaler(value: TargetFleetAutoscaler): Self = StObject.set(x, "autoscaler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalerUndefined: Self = StObject.set(x, "autoscaler", js.undefined)
    
    @scala.inline
    def setFleet(value: TargetFleet): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
  }
}
