package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// TELEGRAM TYPES ///
@js.native
trait PassportFile extends js.Object {
  
  var file_date: Double = js.native
  
  var file_id: String = js.native
  
  var file_size: Double = js.native
}
object PassportFile {
  
  @scala.inline
  def apply(file_date: Double, file_id: String, file_size: Double): PassportFile = {
    val __obj = js.Dynamic.literal(file_date = file_date.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportFile]
  }
  
  @scala.inline
  implicit class PassportFileOps[Self <: PassportFile] (val x: Self) extends AnyVal {
    
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
    def setFile_date(value: Double): Self = this.set("file_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_id(value: String): Self = this.set("file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_size(value: Double): Self = this.set("file_size", value.asInstanceOf[js.Any])
  }
}
