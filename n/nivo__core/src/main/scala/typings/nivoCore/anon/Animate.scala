package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animate extends StObject {
  
  var animate: Boolean
  
  var config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any
  
  var springConfig: Damping
}
object Animate {
  
  inline def apply(
    animate: Boolean,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any,
    springConfig: Damping
  ): Animate = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animate]
  }
  
  extension [Self <: Animate](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setConfig(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any
    ): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setSpringConfig(value: Damping): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
  }
}
