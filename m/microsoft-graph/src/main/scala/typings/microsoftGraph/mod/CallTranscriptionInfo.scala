package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallTranscriptionInfo extends StObject {
  
  // The state modified time in UTC.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Possible values are: notStarted, active, inactive.
  var state: js.UndefOr[CallTranscriptionState] = js.undefined
}
object CallTranscriptionInfo {
  
  inline def apply(): CallTranscriptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallTranscriptionInfo]
  }
  
  extension [Self <: CallTranscriptionInfo](x: Self) {
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setState(value: CallTranscriptionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
