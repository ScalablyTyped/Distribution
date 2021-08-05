package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GdataDownloadParameters extends StObject {
  
  /** gdata */
  var allowGzipCompression: js.UndefOr[Boolean] = js.undefined
  
  /** gdata */
  var ignoreRange: js.UndefOr[Boolean] = js.undefined
}
object GdataDownloadParameters {
  
  inline def apply(): GdataDownloadParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDownloadParameters]
  }
  
  extension [Self <: GdataDownloadParameters](x: Self) {
    
    inline def setAllowGzipCompression(value: Boolean): Self = StObject.set(x, "allowGzipCompression", value.asInstanceOf[js.Any])
    
    inline def setAllowGzipCompressionUndefined: Self = StObject.set(x, "allowGzipCompression", js.undefined)
    
    inline def setIgnoreRange(value: Boolean): Self = StObject.set(x, "ignoreRange", value.asInstanceOf[js.Any])
    
    inline def setIgnoreRangeUndefined: Self = StObject.set(x, "ignoreRange", js.undefined)
  }
}
