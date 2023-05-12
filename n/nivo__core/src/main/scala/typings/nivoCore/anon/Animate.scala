package typings.nivoCore.anon

import typings.reactSpringCore.mod.SpringConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animate extends StObject {
  
  var animate: Boolean
  
  var config: SpringConfig
}
object Animate {
  
  inline def apply(animate: Boolean, config: SpringConfig): Animate = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animate] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: SpringConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
