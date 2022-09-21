package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Printer
  extends StObject
     with PrinterBase {
  
  // The connectors that are associated with the printer.
  var connectors: js.UndefOr[NullableOption[js.Array[PrintConnector]]] = js.undefined
  
  // True if the printer has a physical device for printing. Read-only.
  var hasPhysicalDevice: js.UndefOr[Boolean] = js.undefined
  
  // True if the printer is shared; false otherwise. Read-only.
  var isShared: js.UndefOr[Boolean] = js.undefined
  
  // The most recent dateTimeOffset when a printer interacted with Universal Print. Read-only.
  var lastSeenDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The DateTimeOffset when the printer was registered. Read-only.
  var registeredDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The list of printerShares that are associated with the printer. Currently, only one printerShare can be associated with
    * the printer. Read-only. Nullable.
    */
  var shares: js.UndefOr[NullableOption[js.Array[PrinterShare]]] = js.undefined
  
  // A list of task triggers that are associated with the printer.
  var taskTriggers: js.UndefOr[NullableOption[js.Array[PrintTaskTrigger]]] = js.undefined
}
object Printer {
  
  inline def apply(): Printer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Printer]
  }
  
  extension [Self <: Printer](x: Self) {
    
    inline def setConnectors(value: NullableOption[js.Array[PrintConnector]]): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    inline def setConnectorsNull: Self = StObject.set(x, "connectors", null)
    
    inline def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    inline def setConnectorsVarargs(value: PrintConnector*): Self = StObject.set(x, "connectors", js.Array(value*))
    
    inline def setHasPhysicalDevice(value: Boolean): Self = StObject.set(x, "hasPhysicalDevice", value.asInstanceOf[js.Any])
    
    inline def setHasPhysicalDeviceUndefined: Self = StObject.set(x, "hasPhysicalDevice", js.undefined)
    
    inline def setIsShared(value: Boolean): Self = StObject.set(x, "isShared", value.asInstanceOf[js.Any])
    
    inline def setIsSharedUndefined: Self = StObject.set(x, "isShared", js.undefined)
    
    inline def setLastSeenDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastSeenDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSeenDateTimeNull: Self = StObject.set(x, "lastSeenDateTime", null)
    
    inline def setLastSeenDateTimeUndefined: Self = StObject.set(x, "lastSeenDateTime", js.undefined)
    
    inline def setRegisteredDateTime(value: String): Self = StObject.set(x, "registeredDateTime", value.asInstanceOf[js.Any])
    
    inline def setRegisteredDateTimeUndefined: Self = StObject.set(x, "registeredDateTime", js.undefined)
    
    inline def setShares(value: NullableOption[js.Array[PrinterShare]]): Self = StObject.set(x, "shares", value.asInstanceOf[js.Any])
    
    inline def setSharesNull: Self = StObject.set(x, "shares", null)
    
    inline def setSharesUndefined: Self = StObject.set(x, "shares", js.undefined)
    
    inline def setSharesVarargs(value: PrinterShare*): Self = StObject.set(x, "shares", js.Array(value*))
    
    inline def setTaskTriggers(value: NullableOption[js.Array[PrintTaskTrigger]]): Self = StObject.set(x, "taskTriggers", value.asInstanceOf[js.Any])
    
    inline def setTaskTriggersNull: Self = StObject.set(x, "taskTriggers", null)
    
    inline def setTaskTriggersUndefined: Self = StObject.set(x, "taskTriggers", js.undefined)
    
    inline def setTaskTriggersVarargs(value: PrintTaskTrigger*): Self = StObject.set(x, "taskTriggers", js.Array(value*))
  }
}
