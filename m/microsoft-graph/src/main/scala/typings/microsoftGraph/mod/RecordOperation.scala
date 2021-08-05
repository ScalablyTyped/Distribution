package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordOperation
  extends StObject
     with CommsOperation {
  
  // The access token required to retrieve the recording.
  var recordingAccessToken: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The location where the recording is located.
  var recordingLocation: js.UndefOr[NullableOption[String]] = js.undefined
}
object RecordOperation {
  
  inline def apply(): RecordOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordOperation]
  }
  
  extension [Self <: RecordOperation](x: Self) {
    
    inline def setRecordingAccessToken(value: NullableOption[String]): Self = StObject.set(x, "recordingAccessToken", value.asInstanceOf[js.Any])
    
    inline def setRecordingAccessTokenNull: Self = StObject.set(x, "recordingAccessToken", null)
    
    inline def setRecordingAccessTokenUndefined: Self = StObject.set(x, "recordingAccessToken", js.undefined)
    
    inline def setRecordingLocation(value: NullableOption[String]): Self = StObject.set(x, "recordingLocation", value.asInstanceOf[js.Any])
    
    inline def setRecordingLocationNull: Self = StObject.set(x, "recordingLocation", null)
    
    inline def setRecordingLocationUndefined: Self = StObject.set(x, "recordingLocation", js.undefined)
  }
}
