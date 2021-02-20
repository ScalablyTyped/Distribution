package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordOperation extends CommsOperation {
  
  // The access token required to retrieve the recording.
  var recordingAccessToken: js.UndefOr[NullableOption[String]] = js.native
  
  // The location where the recording is located.
  var recordingLocation: js.UndefOr[NullableOption[String]] = js.native
}
object RecordOperation {
  
  @scala.inline
  def apply(): RecordOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordOperation]
  }
  
  @scala.inline
  implicit class RecordOperationMutableBuilder[Self <: RecordOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordingAccessToken(value: NullableOption[String]): Self = StObject.set(x, "recordingAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingAccessTokenNull: Self = StObject.set(x, "recordingAccessToken", null)
    
    @scala.inline
    def setRecordingAccessTokenUndefined: Self = StObject.set(x, "recordingAccessToken", js.undefined)
    
    @scala.inline
    def setRecordingLocation(value: NullableOption[String]): Self = StObject.set(x, "recordingLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingLocationNull: Self = StObject.set(x, "recordingLocation", null)
    
    @scala.inline
    def setRecordingLocationUndefined: Self = StObject.set(x, "recordingLocation", js.undefined)
  }
}
