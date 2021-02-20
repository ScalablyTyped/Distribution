package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadSizeEvidence extends StObject {
  
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
  implicit class DownloadSizeEvidenceMutableBuilder[Self <: DownloadSizeEvidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopUrlDownloadSizeBreakdowns(value: js.Array[UrlDownloadSize]): Self = StObject.set(x, "topUrlDownloadSizeBreakdowns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUrlDownloadSizeBreakdownsUndefined: Self = StObject.set(x, "topUrlDownloadSizeBreakdowns", js.undefined)
    
    @scala.inline
    def setTopUrlDownloadSizeBreakdownsVarargs(value: UrlDownloadSize*): Self = StObject.set(x, "topUrlDownloadSizeBreakdowns", js.Array(value :_*))
    
    @scala.inline
    def setTotalDownloadSizeKb(value: Double): Self = StObject.set(x, "totalDownloadSizeKb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDownloadSizeKbUndefined: Self = StObject.set(x, "totalDownloadSizeKb", js.undefined)
  }
}
