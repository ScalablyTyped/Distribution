package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceManagementTroubleshootingEvent
  extends StObject
     with Entity {
  
  // Id used for tracing the failure in the service.
  var correlationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Time when the event occurred .
  var eventDateTime: js.UndefOr[String] = js.undefined
}
object DeviceManagementTroubleshootingEvent {
  
  inline def apply(): DeviceManagementTroubleshootingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementTroubleshootingEvent]
  }
  
  extension [Self <: DeviceManagementTroubleshootingEvent](x: Self) {
    
    inline def setCorrelationId(value: NullableOption[String]): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdNull: Self = StObject.set(x, "correlationId", null)
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setEventDateTime(value: String): Self = StObject.set(x, "eventDateTime", value.asInstanceOf[js.Any])
    
    inline def setEventDateTimeUndefined: Self = StObject.set(x, "eventDateTime", js.undefined)
  }
}
