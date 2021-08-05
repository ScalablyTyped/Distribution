package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// TELEGRAM TYPES ///
trait PassportFile extends StObject {
  
  var file_date: Double
  
  var file_id: String
  
  var file_size: Double
}
object PassportFile {
  
  inline def apply(file_date: Double, file_id: String, file_size: Double): PassportFile = {
    val __obj = js.Dynamic.literal(file_date = file_date.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportFile]
  }
  
  extension [Self <: PassportFile](x: Self) {
    
    inline def setFile_date(value: Double): Self = StObject.set(x, "file_date", value.asInstanceOf[js.Any])
    
    inline def setFile_id(value: String): Self = StObject.set(x, "file_id", value.asInstanceOf[js.Any])
    
    inline def setFile_size(value: Double): Self = StObject.set(x, "file_size", value.asInstanceOf[js.Any])
  }
}
