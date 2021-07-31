package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoAbuseReportSecondaryReason extends StObject {
  
  /** The ID of this abuse report secondary reason. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The localized label for this abuse report secondary reason. */
  var label: js.UndefOr[String] = js.undefined
}
object VideoAbuseReportSecondaryReason {
  
  @scala.inline
  def apply(): VideoAbuseReportSecondaryReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAbuseReportSecondaryReason]
  }
  
  @scala.inline
  implicit class VideoAbuseReportSecondaryReasonMutableBuilder[Self <: VideoAbuseReportSecondaryReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
