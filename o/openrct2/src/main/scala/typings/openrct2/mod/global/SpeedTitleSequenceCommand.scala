package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.speed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeedTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var speed: Double
  
  var `type`: speed
}
object SpeedTitleSequenceCommand {
  
  inline def apply(speed: Double): SpeedTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("speed")
    __obj.asInstanceOf[SpeedTitleSequenceCommand]
  }
  
  extension [Self <: SpeedTitleSequenceCommand](x: Self) {
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setType(value: speed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
