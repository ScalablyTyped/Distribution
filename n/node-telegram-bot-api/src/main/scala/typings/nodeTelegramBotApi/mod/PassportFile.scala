package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// TELEGRAM TYPES ///
@js.native
trait PassportFile extends StObject {
  
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
  implicit class PassportFileMutableBuilder[Self <: PassportFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile_date(value: Double): Self = StObject.set(x, "file_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_id(value: String): Self = StObject.set(x, "file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_size(value: Double): Self = StObject.set(x, "file_size", value.asInstanceOf[js.Any])
  }
}
