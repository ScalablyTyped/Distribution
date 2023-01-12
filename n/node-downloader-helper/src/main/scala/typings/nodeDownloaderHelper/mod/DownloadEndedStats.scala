package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadEndedStats
  extends StObject
     with BaseStats {
  
  /** true/false if the download endend but still incomplete */
  var incomplete: Boolean
  
  /** total size of file on the disk */
  var onDiskSize: Double
}
object DownloadEndedStats {
  
  inline def apply(
    downloadedSize: Double,
    fileName: String,
    filePath: String,
    incomplete: Boolean,
    onDiskSize: Double
  ): DownloadEndedStats = {
    val __obj = js.Dynamic.literal(downloadedSize = downloadedSize.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], onDiskSize = onDiskSize.asInstanceOf[js.Any], totalSize = null)
    __obj.asInstanceOf[DownloadEndedStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadEndedStats] (val x: Self) extends AnyVal {
    
    inline def setIncomplete(value: Boolean): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
    
    inline def setOnDiskSize(value: Double): Self = StObject.set(x, "onDiskSize", value.asInstanceOf[js.Any])
  }
}
