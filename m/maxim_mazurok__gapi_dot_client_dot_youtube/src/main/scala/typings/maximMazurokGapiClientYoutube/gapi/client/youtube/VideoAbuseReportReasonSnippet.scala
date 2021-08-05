package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoAbuseReportReasonSnippet extends StObject {
  
  /** The localized label belonging to this abuse report reason. */
  var label: js.UndefOr[String] = js.undefined
  
  /** The secondary reasons associated with this reason, if any are available. (There might be 0 or more.) */
  var secondaryReasons: js.UndefOr[js.Array[VideoAbuseReportSecondaryReason]] = js.undefined
}
object VideoAbuseReportReasonSnippet {
  
  inline def apply(): VideoAbuseReportReasonSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAbuseReportReasonSnippet]
  }
  
  extension [Self <: VideoAbuseReportReasonSnippet](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSecondaryReasons(value: js.Array[VideoAbuseReportSecondaryReason]): Self = StObject.set(x, "secondaryReasons", value.asInstanceOf[js.Any])
    
    inline def setSecondaryReasonsUndefined: Self = StObject.set(x, "secondaryReasons", js.undefined)
    
    inline def setSecondaryReasonsVarargs(value: VideoAbuseReportSecondaryReason*): Self = StObject.set(x, "secondaryReasons", js.Array(value :_*))
  }
}
