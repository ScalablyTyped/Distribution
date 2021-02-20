package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataDownloadParameters extends StObject {
  
  /** gdata */
  var allowGzipCompression: js.UndefOr[Boolean] = js.native
  
  /** gdata */
  var ignoreRange: js.UndefOr[Boolean] = js.native
}
object GdataDownloadParameters {
  
  @scala.inline
  def apply(): GdataDownloadParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDownloadParameters]
  }
  
  @scala.inline
  implicit class GdataDownloadParametersMutableBuilder[Self <: GdataDownloadParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowGzipCompression(value: Boolean): Self = StObject.set(x, "allowGzipCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowGzipCompressionUndefined: Self = StObject.set(x, "allowGzipCompression", js.undefined)
    
    @scala.inline
    def setIgnoreRange(value: Boolean): Self = StObject.set(x, "ignoreRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreRangeUndefined: Self = StObject.set(x, "ignoreRange", js.undefined)
  }
}
