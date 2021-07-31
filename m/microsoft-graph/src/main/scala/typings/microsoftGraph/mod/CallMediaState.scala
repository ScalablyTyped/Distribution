package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallMediaState extends StObject {
  
  // The audio media state. Possible values are: active, inactive.
  var audio: js.UndefOr[NullableOption[MediaState]] = js.undefined
}
object CallMediaState {
  
  @scala.inline
  def apply(): CallMediaState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallMediaState]
  }
  
  @scala.inline
  implicit class CallMediaStateMutableBuilder[Self <: CallMediaState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: NullableOption[MediaState]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioNull: Self = StObject.set(x, "audio", null)
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
  }
}
