package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadSizeEvidence extends StObject {
  
  /** Download size broken down by URLs with the top download size. */
  var topUrlDownloadSizeBreakdowns: js.UndefOr[js.Array[UrlDownloadSize]] = js.undefined
  
  /** Total download size (in kilobytes) for all the resources in the creative. */
  var totalDownloadSizeKb: js.UndefOr[Double] = js.undefined
}
object DownloadSizeEvidence {
  
  inline def apply(): DownloadSizeEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadSizeEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadSizeEvidence] (val x: Self) extends AnyVal {
    
    inline def setTopUrlDownloadSizeBreakdowns(value: js.Array[UrlDownloadSize]): Self = StObject.set(x, "topUrlDownloadSizeBreakdowns", value.asInstanceOf[js.Any])
    
    inline def setTopUrlDownloadSizeBreakdownsUndefined: Self = StObject.set(x, "topUrlDownloadSizeBreakdowns", js.undefined)
    
    inline def setTopUrlDownloadSizeBreakdownsVarargs(value: UrlDownloadSize*): Self = StObject.set(x, "topUrlDownloadSizeBreakdowns", js.Array(value*))
    
    inline def setTotalDownloadSizeKb(value: Double): Self = StObject.set(x, "totalDownloadSizeKb", value.asInstanceOf[js.Any])
    
    inline def setTotalDownloadSizeKbUndefined: Self = StObject.set(x, "totalDownloadSizeKb", js.undefined)
  }
}
