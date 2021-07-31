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
    */ typings.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.TrafficPercentStrategy & TopLevel[js.Any]
  ] = js.undefined
}
object TrafficPercentStrategy {
  
  @scala.inline
  def apply(): TrafficPercentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficPercentStrategy]
  }
  
  @scala.inline
  implicit class TrafficPercentStrategyMutableBuilder[Self <: TrafficPercentStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercentages(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.TrafficPercentStrategy & TopLevel[js.Any]
    ): Self = StObject.set(x, "percentages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentagesUndefined: Self = StObject.set(x, "percentages", js.undefined)
  }
}
