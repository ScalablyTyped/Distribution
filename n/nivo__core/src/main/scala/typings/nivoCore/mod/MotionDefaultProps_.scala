package typings.nivoCore.mod

import typings.nivoCore.nivoCoreBooleans.`true`
import typings.nivoCore.nivoCoreStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionDefaultProps_ extends StObject {
  
  var animate: `true`
  
  var config: default
}
object MotionDefaultProps_ {
  
  inline def apply(): MotionDefaultProps_ = {
    val __obj = js.Dynamic.literal(animate = true, config = "default")
    __obj.asInstanceOf[MotionDefaultProps_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionDefaultProps_] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: `true`): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: default): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
