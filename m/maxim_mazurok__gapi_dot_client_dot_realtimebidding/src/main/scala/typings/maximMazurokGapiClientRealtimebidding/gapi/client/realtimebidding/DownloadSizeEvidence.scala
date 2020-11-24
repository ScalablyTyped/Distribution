package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadSizeEvidence extends js.Object {
  
  /** Download size broken down by URLs with the top download size. */
  var topUrlDownloadSizeBreakdowns: js.UndefOr[js.Array[UrlDownloadSize]] = js.native
  
  /** Total download size (in kilobytes) for all the resources in the creative. */
  var totalDownloadSizeKb: js.UndefOr[Double] = js.native
}
object DownloadSizeEvidence {
  
  @scala.inline
  def apply(): DownloadSizeEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadSizeEvidence]
  }
  
  @scala.inline
  implicit class DownloadSizeEvidenceOps[Self <: DownloadSizeEvidence] (val x: Self) extends AnyVal {
    
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
    def setTopUrlDownloadSizeBreakdownsVarargs(value: UrlDownloadSize*): Self = this.set("topUrlDownloadSizeBreakdowns", js.Array(value :_*))
    
    @scala.inline
    def setTopUrlDownloadSizeBreakdowns(value: js.Array[UrlDownloadSize]): Self = this.set("topUrlDownloadSizeBreakdowns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopUrlDownloadSizeBreakdowns: Self = this.set("topUrlDownloadSizeBreakdowns", js.undefined)
    
    @scala.inline
    def setTotalDownloadSizeKb(value: Double): Self = this.set("totalDownloadSizeKb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalDownloadSizeKb: Self = this.set("totalDownloadSizeKb", js.undefined)
  }
}
