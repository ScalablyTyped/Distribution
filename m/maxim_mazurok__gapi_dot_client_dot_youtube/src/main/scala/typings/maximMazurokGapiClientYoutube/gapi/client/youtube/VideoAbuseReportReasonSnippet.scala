package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoAbuseReportReasonSnippet extends js.Object {
  
  /** The localized label belonging to this abuse report reason. */
  var label: js.UndefOr[String] = js.native
  
  /** The secondary reasons associated with this reason, if any are available. (There might be 0 or more.) */
  var secondaryReasons: js.UndefOr[js.Array[VideoAbuseReportSecondaryReason]] = js.native
}
object VideoAbuseReportReasonSnippet {
  
  @scala.inline
  def apply(): VideoAbuseReportReasonSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAbuseReportReasonSnippet]
  }
  
  @scala.inline
  implicit class VideoAbuseReportReasonSnippetOps[Self <: VideoAbuseReportReasonSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSecondaryReasonsVarargs(value: VideoAbuseReportSecondaryReason*): Self = this.set("secondaryReasons", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryReasons(value: js.Array[VideoAbuseReportSecondaryReason]): Self = this.set("secondaryReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryReasons: Self = this.set("secondaryReasons", js.undefined)
  }
}
