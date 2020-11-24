package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileBase extends js.Object {
  
  var file_id: String = js.native
  
  var file_size: js.UndefOr[Double] = js.native
}
object FileBase {
  
  @scala.inline
  def apply(file_id: String): FileBase = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBase]
  }
  
  @scala.inline
  implicit class FileBaseOps[Self <: FileBase] (val x: Self) extends AnyVal {
    
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
    def setFile_id(value: String): Self = this.set("file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_size(value: Double): Self = this.set("file_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_size: Self = this.set("file_size", js.undefined)
  }
}
