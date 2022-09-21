package typings.microseconds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("microseconds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def parse(timestamp: Double): ParsedTimeStamp = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(timestamp.asInstanceOf[js.Any]).asInstanceOf[ParsedTimeStamp]
  
  inline def since(timestamp: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("since")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait ParsedTimeStamp extends StObject {
    
    var days: Double
    
    var hours: Double
    
    var microseconds: Double
    
    var milliseconds: Double
    
    var minutes: Double
    
    var seconds: Double
  }
  object ParsedTimeStamp {
    
    inline def apply(
      days: Double,
      hours: Double,
      microseconds: Double,
      milliseconds: Double,
      minutes: Double,
      seconds: Double
    ): ParsedTimeStamp = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], microseconds = microseconds.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedTimeStamp]
    }
    
    extension [Self <: ParsedTimeStamp](x: Self) {
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMicroseconds(value: Double): Self = StObject.set(x, "microseconds", value.asInstanceOf[js.Any])
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
