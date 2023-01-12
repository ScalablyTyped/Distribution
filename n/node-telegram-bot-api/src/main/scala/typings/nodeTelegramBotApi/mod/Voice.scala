package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Voice
  extends StObject
     with FileBase {
  
  var duration: Double
  
  var mime_type: js.UndefOr[String] = js.undefined
}
object Voice {
  
  inline def apply(duration: Double, file_id: String, file_unique_id: String): Voice = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any], file_unique_id = file_unique_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Voice] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    inline def setMime_typeUndefined: Self = StObject.set(x, "mime_type", js.undefined)
  }
}
