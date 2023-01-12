package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameAnimationEvent extends StObject {
  
  var animation: typings.plotlyJs.anon.Frame
  
  var frame: Frame
  
  var name: String
}
object FrameAnimationEvent {
  
  inline def apply(animation: typings.plotlyJs.anon.Frame, frame: Frame, name: String): FrameAnimationEvent = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameAnimationEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameAnimationEvent] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: typings.plotlyJs.anon.Frame): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
