package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendVideoNoteOptions
  extends StObject
     with SendBasicOptions {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
}
object SendVideoNoteOptions {
  
  inline def apply(): SendVideoNoteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVideoNoteOptions]
  }
  
  extension [Self <: SendVideoNoteOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
