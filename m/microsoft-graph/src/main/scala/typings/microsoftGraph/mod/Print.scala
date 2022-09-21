package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Print extends StObject {
  
  // The list of available print connectors.
  var connectors: js.UndefOr[NullableOption[js.Array[PrintConnector]]] = js.undefined
  
  // The list of print long running operations.
  var operations: js.UndefOr[NullableOption[js.Array[PrintOperation]]] = js.undefined
  
  // The list of printers registered in the tenant.
  var printers: js.UndefOr[NullableOption[js.Array[Printer]]] = js.undefined
  
  // The list of available Universal Print service endpoints.
  var services: js.UndefOr[NullableOption[js.Array[PrintService]]] = js.undefined
  
  // Tenant-wide settings for the Universal Print service.
  var settings: js.UndefOr[NullableOption[PrintSettings]] = js.undefined
  
  // The list of printer shares registered in the tenant.
  var shares: js.UndefOr[NullableOption[js.Array[PrinterShare]]] = js.undefined
  
  // List of abstract definition for a task that can be triggered when various events occur within Universal Print.
  var taskDefinitions: js.UndefOr[NullableOption[js.Array[PrintTaskDefinition]]] = js.undefined
}
object Print {
  
  inline def apply(): Print = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Print]
  }
  
  extension [Self <: Print](x: Self) {
    
    inline def setConnectors(value: NullableOption[js.Array[PrintConnector]]): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    inline def setConnectorsNull: Self = StObject.set(x, "connectors", null)
    
    inline def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    inline def setConnectorsVarargs(value: PrintConnector*): Self = StObject.set(x, "connectors", js.Array(value*))
    
    inline def setOperations(value: NullableOption[js.Array[PrintOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: PrintOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setPrinters(value: NullableOption[js.Array[Printer]]): Self = StObject.set(x, "printers", value.asInstanceOf[js.Any])
    
    inline def setPrintersNull: Self = StObject.set(x, "printers", null)
    
    inline def setPrintersUndefined: Self = StObject.set(x, "printers", js.undefined)
    
    inline def setPrintersVarargs(value: Printer*): Self = StObject.set(x, "printers", js.Array(value*))
    
    inline def setServices(value: NullableOption[js.Array[PrintService]]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesNull: Self = StObject.set(x, "services", null)
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: PrintService*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSettings(value: NullableOption[PrintSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setShares(value: NullableOption[js.Array[PrinterShare]]): Self = StObject.set(x, "shares", value.asInstanceOf[js.Any])
    
    inline def setSharesNull: Self = StObject.set(x, "shares", null)
    
    inline def setSharesUndefined: Self = StObject.set(x, "shares", js.undefined)
    
    inline def setSharesVarargs(value: PrinterShare*): Self = StObject.set(x, "shares", js.Array(value*))
    
    inline def setTaskDefinitions(value: NullableOption[js.Array[PrintTaskDefinition]]): Self = StObject.set(x, "taskDefinitions", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionsNull: Self = StObject.set(x, "taskDefinitions", null)
    
    inline def setTaskDefinitionsUndefined: Self = StObject.set(x, "taskDefinitions", js.undefined)
    
    inline def setTaskDefinitionsVarargs(value: PrintTaskDefinition*): Self = StObject.set(x, "taskDefinitions", js.Array(value*))
  }
}
