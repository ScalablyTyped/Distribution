package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileBase extends StObject {
  
  var file_id: String
  
  var file_size: js.UndefOr[Double] = js.undefined
}
object FileBase {
  
  inline def apply(file_id: String): FileBase = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBase]
  }
  
  extension [Self <: FileBase](x: Self) {
    
    inline def setFile_id(value: String): Self = StObject.set(x, "file_id", value.asInstanceOf[js.Any])
    
    inline def setFile_size(value: Double): Self = StObject.set(x, "file_size", value.asInstanceOf[js.Any])
    
    inline def setFile_sizeUndefined: Self = StObject.set(x, "file_size", js.undefined)
  }
}
