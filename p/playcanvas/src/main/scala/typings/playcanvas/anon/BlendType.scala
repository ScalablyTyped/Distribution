package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlendType extends StObject {
  
  var blendType: Any
  
  var mask: Any
  
  var name: Any
  
  var states: Any
  
  var transitions: Any
  
  var weight: Any
}
object BlendType {
  
  inline def apply(blendType: Any, mask: Any, name: Any, states: Any, transitions: Any, weight: Any): BlendType = {
    val __obj = js.Dynamic.literal(blendType = blendType.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlendType] (val x: Self) extends AnyVal {
    
    inline def setBlendType(value: Any): Self = StObject.set(x, "blendType", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Any): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStates(value: Any): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setTransitions(value: Any): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Any): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
