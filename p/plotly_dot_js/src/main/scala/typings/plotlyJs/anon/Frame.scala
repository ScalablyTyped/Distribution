package typings.plotlyJs.anon

import typings.plotlyJs.mod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  var frame: Duration
  
  var transition: Transition
}
object Frame {
  
  inline def apply(frame: Duration, transition: Transition): Frame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  extension [Self <: Frame](x: Self) {
    
    inline def setFrame(value: Duration): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
