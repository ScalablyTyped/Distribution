package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsDetails extends StObject {
  
  /** The Analytics Property object associated with the specified `FirebaseProject`. This object contains the details of the Google Analytics property associated with the Project. */
  var analyticsProperty: js.UndefOr[AnalyticsProperty] = js.undefined
  
  /**
    * - For `AndroidApps` and `IosApps`: a map of `app` to `streamId` for each Firebase App in the specified `FirebaseProject`. Each `app` and `streamId` appears only once. - For
    * `WebApps`: a map of `app` to `streamId` and `measurementId` for each `WebApp` in the specified `FirebaseProject`. Each `app`, `streamId`, and `measurementId` appears only once.
    */
  var streamMappings: js.UndefOr[js.Array[StreamMapping]] = js.undefined
}
object AnalyticsDetails {
  
  inline def apply(): AnalyticsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyticsDetails] (val x: Self) extends AnyVal {
    
    inline def setAnalyticsProperty(value: AnalyticsProperty): Self = StObject.set(x, "analyticsProperty", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsPropertyUndefined: Self = StObject.set(x, "analyticsProperty", js.undefined)
    
    inline def setStreamMappings(value: js.Array[StreamMapping]): Self = StObject.set(x, "streamMappings", value.asInstanceOf[js.Any])
    
    inline def setStreamMappingsUndefined: Self = StObject.set(x, "streamMappings", js.undefined)
    
    inline def setStreamMappingsVarargs(value: StreamMapping*): Self = StObject.set(x, "streamMappings", js.Array(value*))
  }
}
