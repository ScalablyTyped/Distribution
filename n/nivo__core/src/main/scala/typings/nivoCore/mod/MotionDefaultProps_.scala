package typings.nivoCore.mod

import typings.nivoCore.nivoCoreBooleans.`true`
import typings.nivoCore.nivoCoreNumbers.`15`
import typings.nivoCore.nivoCoreNumbers.`90`
import typings.nivoCore.nivoCoreStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionDefaultProps_ extends StObject {
  
  var animate: `true`
  
  var config: default
  
  var damping: `15`
  
  var stiffness: `90`
}
object MotionDefaultProps_ {
  
  inline def apply(): MotionDefaultProps_ = {
    val __obj = js.Dynamic.literal(animate = true, config = "default", damping = 15, stiffness = 90)
    __obj.asInstanceOf[MotionDefaultProps_]
  }
  
  extension [Self <: MotionDefaultProps_](x: Self) {
    
    inline def setAnimate(value: `true`): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: default): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDamping(value: `15`): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setStiffness(value: `90`): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
  }
}
