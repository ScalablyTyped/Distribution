package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileRenamedStats extends StObject {
  
  /** modified file name */
  var fileName: String
  
  /** modified path name */
  var path: String
  
  /** original file name */
  var prevFileName: String
  
  /** original path name */
  var prevPath: String
}
object FileRenamedStats {
  
  inline def apply(fileName: String, path: String, prevFileName: String, prevPath: String): FileRenamedStats = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prevFileName = prevFileName.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRenamedStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileRenamedStats] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPrevFileName(value: String): Self = StObject.set(x, "prevFileName", value.asInstanceOf[js.Any])
    
    inline def setPrevPath(value: String): Self = StObject.set(x, "prevPath", value.asInstanceOf[js.Any])
  }
}
