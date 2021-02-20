package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatPhoto extends StObject {
  
  var big_file_id: String = js.native
  
  var small_file_id: String = js.native
}
object ChatPhoto {
  
  @scala.inline
  def apply(big_file_id: String, small_file_id: String): ChatPhoto = {
    val __obj = js.Dynamic.literal(big_file_id = big_file_id.asInstanceOf[js.Any], small_file_id = small_file_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatPhoto]
  }
  
  @scala.inline
  implicit class ChatPhotoMutableBuilder[Self <: ChatPhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBig_file_id(value: String): Self = StObject.set(x, "big_file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall_file_id(value: String): Self = StObject.set(x, "small_file_id", value.asInstanceOf[js.Any])
  }
}
