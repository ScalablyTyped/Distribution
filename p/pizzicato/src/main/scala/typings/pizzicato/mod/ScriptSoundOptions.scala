package typings.pizzicato.mod

import typings.std.AudioProcessingEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptSoundOptions
  extends StObject
     with SoundOptions {
  
  def audioFunction(e: AudioProcessingEvent): Unit
  @JSName("audioFunction")
  var audioFunction_Original: AudioFunction
  
  var bufferSize: js.UndefOr[Double] = js.undefined
}
object ScriptSoundOptions {
  
  inline def apply(audioFunction: /* e */ AudioProcessingEvent => Unit): ScriptSoundOptions = {
    val __obj = js.Dynamic.literal(audioFunction = js.Any.fromFunction1(audioFunction))
    __obj.asInstanceOf[ScriptSoundOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptSoundOptions] (val x: Self) extends AnyVal {
    
    inline def setAudioFunction(value: /* e */ AudioProcessingEvent => Unit): Self = StObject.set(x, "audioFunction", js.Any.fromFunction1(value))
    
    inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
  }
}
