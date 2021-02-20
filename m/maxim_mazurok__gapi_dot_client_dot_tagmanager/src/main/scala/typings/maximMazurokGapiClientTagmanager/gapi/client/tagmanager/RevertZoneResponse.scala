package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevertZoneResponse extends StObject {
  
  /**
    * Zone as it appears in the latest container version since the last workspace synchronization operation. If no zone is present, that means the zone was deleted in the latest container
    * version.
    */
  var zone: js.UndefOr[Zone] = js.native
}
object RevertZoneResponse {
  
  @scala.inline
  def apply(): RevertZoneResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertZoneResponse]
  }
  
  @scala.inline
  implicit class RevertZoneResponseMutableBuilder[Self <: RevertZoneResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
