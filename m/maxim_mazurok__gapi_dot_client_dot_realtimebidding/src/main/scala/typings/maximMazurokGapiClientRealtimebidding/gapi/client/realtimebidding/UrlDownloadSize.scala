package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlDownloadSize extends StObject {
  
  /** Download size of the URL in kilobytes. */
  var downloadSizeKb: js.UndefOr[Double] = js.undefined
  
  /** The normalized URL with query parameters and fragment removed. */
  var normalizedUrl: js.UndefOr[String] = js.undefined
}
object UrlDownloadSize {
  
  @scala.inline
  def apply(): UrlDownloadSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlDownloadSize]
  }
  
  @scala.inline
  implicit class UrlDownloadSizeMutableBuilder[Self <: UrlDownloadSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadSizeKb(value: Double): Self = StObject.set(x, "downloadSizeKb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadSizeKbUndefined: Self = StObject.set(x, "downloadSizeKb", js.undefined)
    
    @scala.inline
    def setNormalizedUrl(value: String): Self = StObject.set(x, "normalizedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedUrlUndefined: Self = StObject.set(x, "normalizedUrl", js.undefined)
  }
}
