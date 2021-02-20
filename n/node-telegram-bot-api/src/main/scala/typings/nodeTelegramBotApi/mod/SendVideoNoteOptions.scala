package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendVideoNoteOptions extends SendBasicOptions {
  
  var duration: js.UndefOr[Double] = js.native
  
  var length: js.UndefOr[Double] = js.native
}
object SendVideoNoteOptions {
  
  @scala.inline
  def apply(): SendVideoNoteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVideoNoteOptions]
  }
  
  @scala.inline
  implicit class SendVideoNoteOptionsMutableBuilder[Self <: SendVideoNoteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
