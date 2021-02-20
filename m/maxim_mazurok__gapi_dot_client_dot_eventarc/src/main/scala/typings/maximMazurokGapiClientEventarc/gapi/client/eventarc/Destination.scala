package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destination extends StObject {
  
  /** Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger. */
  var cloudRunService: js.UndefOr[CloudRunService] = js.native
}
object Destination {
  
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudRunService(value: CloudRunService): Self = StObject.set(x, "cloudRunService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudRunServiceUndefined: Self = StObject.set(x, "cloudRunService", js.undefined)
  }
}
