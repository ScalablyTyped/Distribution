package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamMapping extends StObject {
  
  /**
    * The resource name of the Firebase App associated with the Google Analytics data stream, in the format: projects/PROJECT_IDENTIFIER/androidApps/APP_ID or
    * projects/PROJECT_IDENTIFIER/iosApps/APP_ID or projects/PROJECT_IDENTIFIER /webApps/APP_ID Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for
    * details about PROJECT_IDENTIFIER values.
    */
  var app: js.UndefOr[String] = js.native
  
  /**
    * Applicable for Firebase Web Apps only. The unique Google-assigned identifier of the Google Analytics web stream associated with the Firebase Web App. Firebase SDKs use this ID to
    * interact with Google Analytics APIs. Learn more about this ID and Google Analytics web streams in the [Analytics documentation](https://support.google.com/analytics/topic/9303475).
    */
  var measurementId: js.UndefOr[String] = js.native
  
  /**
    * The unique Google-assigned identifier of the Google Analytics data stream associated with the Firebase App. Learn more about Google Analytics data streams in the [Analytics
    * documentation](https://support.google.com/analytics/answer/9303323).
    */
  var streamId: js.UndefOr[String] = js.native
}
object StreamMapping {
  
  @scala.inline
  def apply(): StreamMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamMapping]
  }
  
  @scala.inline
  implicit class StreamMappingMutableBuilder[Self <: StreamMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    @scala.inline
    def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
    
    @scala.inline
    def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
  }
}
