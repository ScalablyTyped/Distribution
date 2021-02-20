package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerKilledEvent extends StObject {
  
  /** The numeric ID of the action that started the container. */
  var actionId: js.UndefOr[Double] = js.native
}
object ContainerKilledEvent {
  
  @scala.inline
  def apply(): ContainerKilledEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerKilledEvent]
  }
  
  @scala.inline
  implicit class ContainerKilledEventMutableBuilder[Self <: ContainerKilledEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
  }
}
