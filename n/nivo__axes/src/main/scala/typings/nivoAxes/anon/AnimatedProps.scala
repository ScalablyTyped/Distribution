package typings.nivoAxes.anon

import typings.reactSpringCore.mod.SpringValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedProps extends StObject {
  
  var animatedProps: SpringValues[Opacity]
}
object AnimatedProps {
  
  inline def apply(animatedProps: SpringValues[Opacity]): AnimatedProps = {
    val __obj = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimatedProps] (val x: Self) extends AnyVal {
    
    inline def setAnimatedProps(value: SpringValues[Opacity]): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
  }
}
