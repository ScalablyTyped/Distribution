package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononEventObject extends StObject {
  
  var animationEnd: String
  
  var transitionEnd: String
}
object PhononEventObject {
  
  inline def apply(animationEnd: String, transitionEnd: String): PhononEventObject = {
    val __obj = js.Dynamic.literal(animationEnd = animationEnd.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononEventObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhononEventObject] (val x: Self) extends AnyVal {
    
    inline def setAnimationEnd(value: String): Self = StObject.set(x, "animationEnd", value.asInstanceOf[js.Any])
    
    inline def setTransitionEnd(value: String): Self = StObject.set(x, "transitionEnd", value.asInstanceOf[js.Any])
  }
}
