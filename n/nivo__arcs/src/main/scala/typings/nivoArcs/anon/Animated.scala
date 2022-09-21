package typings.nivoArcs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animated extends StObject {
  
  var animated: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<{  radius :number,   startAngle :number,   endAngle :number,   opacity :number}> */ Any
}
object Animated {
  
  inline def apply(
    animated: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<{  radius :number,   startAngle :number,   endAngle :number,   opacity :number}> */ Any
  ): Animated = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
  
  extension [Self <: Animated](x: Self) {
    
    inline def setAnimated(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<{  radius :number,   startAngle :number,   endAngle :number,   opacity :number}> */ Any
    ): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
  }
}
