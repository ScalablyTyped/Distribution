package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAnalyticsRequest extends StObject {
  
  /**
    * Optional. The ID of the Google Analytics property associated with the specified `FirebaseProject`. - If not set, then the Google Analytics property that is currently associated with
    * the specified `FirebaseProject` is removed. - If set, and the specified `FirebaseProject` is currently associated with a *different* Google Analytics property, then the response is
    * a `412 Precondition Failed` error.
    */
  var analyticsPropertyId: js.UndefOr[String] = js.undefined
}
object RemoveAnalyticsRequest {
  
  inline def apply(): RemoveAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveAnalyticsRequest]
  }
  
  extension [Self <: RemoveAnalyticsRequest](x: Self) {
    
    inline def setAnalyticsPropertyId(value: String): Self = StObject.set(x, "analyticsPropertyId", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsPropertyIdUndefined: Self = StObject.set(x, "analyticsPropertyId", js.undefined)
  }
}
