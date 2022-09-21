package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFailureState extends StObject {
  
  /** Details about the last failed update attempt. */
  var details: js.UndefOr[String] = js.undefined
  
  /** What the component configuration would have been if the update had succeeded. */
  var failedConfiguration: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.UpdateFailureState & TopLevel[Any]
  ] = js.undefined
  
  /** Time of the latest failed update attempt. */
  var lastUpdateAttempt: js.UndefOr[String] = js.undefined
}
object UpdateFailureState {
  
  inline def apply(): UpdateFailureState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFailureState]
  }
  
  extension [Self <: UpdateFailureState](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setFailedConfiguration(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.UpdateFailureState & TopLevel[Any]
    ): Self = StObject.set(x, "failedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFailedConfigurationUndefined: Self = StObject.set(x, "failedConfiguration", js.undefined)
    
    inline def setLastUpdateAttempt(value: String): Self = StObject.set(x, "lastUpdateAttempt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateAttemptUndefined: Self = StObject.set(x, "lastUpdateAttempt", js.undefined)
  }
}
