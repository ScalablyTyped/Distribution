package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File
  extends StObject
     with FileBase {
  
  var file_path: js.UndefOr[String] = js.undefined
}
object File {
  
  @scala.inline
  def apply(file_id: String): File = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile_path(value: String): Self = StObject.set(x, "file_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_pathUndefined: Self = StObject.set(x, "file_path", js.undefined)
  }
}
