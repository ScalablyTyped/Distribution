package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoAbuseReportReason extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The ID of this abuse report reason. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string `"youtube#videoAbuseReportReason"`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The `snippet` object contains basic details about the abuse report reason. */
  var snippet: js.UndefOr[VideoAbuseReportReasonSnippet] = js.undefined
}
object VideoAbuseReportReason {
  
  @scala.inline
  def apply(): VideoAbuseReportReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAbuseReportReason]
  }
  
  @scala.inline
  implicit class VideoAbuseReportReasonMutableBuilder[Self <: VideoAbuseReportReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: VideoAbuseReportReasonSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
