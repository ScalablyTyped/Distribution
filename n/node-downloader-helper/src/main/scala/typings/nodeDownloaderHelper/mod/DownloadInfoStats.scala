package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadInfoStats
  extends StObject
     with BaseStats {
  
  /** if the download is a resume */
  var isResumed: Boolean
}
object DownloadInfoStats {
  
  inline def apply(downloadedSize: Double, fileName: String, filePath: String, isResumed: Boolean): DownloadInfoStats = {
    val __obj = js.Dynamic.literal(downloadedSize = downloadedSize.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isResumed = isResumed.asInstanceOf[js.Any], totalSize = null)
    __obj.asInstanceOf[DownloadInfoStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadInfoStats] (val x: Self) extends AnyVal {
    
    inline def setIsResumed(value: Boolean): Self = StObject.set(x, "isResumed", value.asInstanceOf[js.Any])
  }
}
