package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadedBytes extends StObject {
  
  var downloadedBytes: Double
  
  var totalBytes: Double
}
object DownloadedBytes {
  
  inline def apply(downloadedBytes: Double, totalBytes: Double): DownloadedBytes = {
    val __obj = js.Dynamic.literal(downloadedBytes = downloadedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadedBytes]
  }
  
  extension [Self <: DownloadedBytes](x: Self) {
    
    inline def setDownloadedBytes(value: Double): Self = StObject.set(x, "downloadedBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
  }
}
