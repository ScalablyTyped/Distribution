package typings.nodeDownloaderHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePaths extends js.Object {
  
   // modified path name
  var fileName: String = js.native
  
  var path: String = js.native
  
   // original path name
  var prevFileName: String = js.native
  
   // modified file name
  var prevPath: String = js.native
}
object FilePaths {
  
  @scala.inline
  def apply(fileName: String, path: String, prevFileName: String, prevPath: String): FilePaths = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prevFileName = prevFileName.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePaths]
  }
  
  @scala.inline
  implicit class FilePathsOps[Self <: FilePaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevFileName(value: String): Self = this.set("prevFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPath(value: String): Self = this.set("prevPath", value.asInstanceOf[js.Any])
  }
}
