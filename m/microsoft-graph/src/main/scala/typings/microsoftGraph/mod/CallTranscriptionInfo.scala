package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallTranscriptionInfo extends StObject {
  
  // The state modified time in UTC.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Possible values are: notStarted, active, inactive.
  var state: js.UndefOr[CallTranscriptionState] = js.native
}
object CallTranscriptionInfo {
  
  @scala.inline
  def apply(): CallTranscriptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallTranscriptionInfo]
  }
  
  @scala.inline
  implicit class CallTranscriptionInfoMutableBuilder[Self <: CallTranscriptionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setState(value: CallTranscriptionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
