package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficPercentStrategy extends StObject {
  
  /**
    * Maps service configuration IDs to their corresponding traffic percentage. Key is the service configuration ID, Value is the traffic percentage which must be greater than 0.0 and the
    * sum must equal to 100.0.
    */
  var percentages: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typings.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.TrafficPercentStrategy & TopLevel[Any]
  ] = js.undefined
}
object TrafficPercentStrategy {
  
  inline def apply(): TrafficPercentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficPercentStrategy]
  }
  
  extension [Self <: TrafficPercentStrategy](x: Self) {
    
    inline def setPercentages(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.TrafficPercentStrategy & TopLevel[Any]
    ): Self = StObject.set(x, "percentages", value.asInstanceOf[js.Any])
    
    inline def setPercentagesUndefined: Self = StObject.set(x, "percentages", js.undefined)
  }
}
