package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseStats extends StObject {
  
  /** the downloaded amount */
  var downloadedSize: Double
  
  /** original file name */
  var fileName: String
  
  /** original path name */
  var filePath: String
  
  /** total file size got from the server */
  var totalSize: Double | Null
}
object BaseStats {
  
  inline def apply(downloadedSize: Double, fileName: String, filePath: String): BaseStats = {
    val __obj = js.Dynamic.literal(downloadedSize = downloadedSize.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], totalSize = null)
    __obj.asInstanceOf[BaseStats]
  }
  
  extension [Self <: BaseStats](x: Self) {
    
    inline def setDownloadedSize(value: Double): Self = StObject.set(x, "downloadedSize", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
  }
}
