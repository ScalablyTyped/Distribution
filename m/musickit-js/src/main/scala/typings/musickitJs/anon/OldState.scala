package typings.musickitJs.anon

import typings.musickitJs.MusicKit.PlaybackStates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldState extends StObject {
  
  var oldState: PlaybackStates
  
  var state: PlaybackStates
}
object OldState {
  
  inline def apply(oldState: PlaybackStates, state: PlaybackStates): OldState = {
    val __obj = js.Dynamic.literal(oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OldState] (val x: Self) extends AnyVal {
    
    inline def setOldState(value: PlaybackStates): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    inline def setState(value: PlaybackStates): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
