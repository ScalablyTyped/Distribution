package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemManagerSaveFileSuccessCallbackResult extends StObject {
  
  /** 存储后的文件路径 */
  var savedFilePath: Double
}
object FileSystemManagerSaveFileSuccessCallbackResult {
  
  inline def apply(savedFilePath: Double): FileSystemManagerSaveFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerSaveFileSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemManagerSaveFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setSavedFilePath(value: Double): Self = StObject.set(x, "savedFilePath", value.asInstanceOf[js.Any])
  }
}
