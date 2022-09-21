package typings.musickitJs.anon

import typings.musickitJs.MusicKit.PlaybackState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldState extends StObject {
  
  var oldState: PlaybackState
  
  var state: PlaybackState
}
object OldState {
  
  inline def apply(oldState: PlaybackState, state: PlaybackState): OldState = {
    val __obj = js.Dynamic.literal(oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldState]
  }
  
  extension [Self <: OldState](x: Self) {
    
    inline def setOldState(value: PlaybackState): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    inline def setState(value: PlaybackState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
