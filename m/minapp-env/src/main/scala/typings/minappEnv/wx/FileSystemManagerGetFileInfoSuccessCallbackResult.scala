package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemManagerGetFileInfoSuccessCallbackResult extends StObject {
  
  /** 文件大小，以字节为单位 */
  var size: Double = js.native
}
object FileSystemManagerGetFileInfoSuccessCallbackResult {
  
  @scala.inline
  def apply(size: Double): FileSystemManagerGetFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerGetFileInfoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class FileSystemManagerGetFileInfoSuccessCallbackResultMutableBuilder[Self <: FileSystemManagerGetFileInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
