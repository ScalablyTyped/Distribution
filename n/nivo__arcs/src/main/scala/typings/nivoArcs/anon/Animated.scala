package typings.nivoArcs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animated extends StObject {
  
  var animated: AnimatedPropsradiusnumber
}
object Animated {
  
  inline def apply(animated: AnimatedPropsradiusnumber): Animated = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animated] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: AnimatedPropsradiusnumber): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
  }
}
