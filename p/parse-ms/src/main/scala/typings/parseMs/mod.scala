package typings.parseMs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Parse milliseconds into an object.
  @example
  ```
  import parseMilliseconds = require('parse-ms');
  parseMilliseconds(1337000001);
  // {
  // 	days: 15,
  // 	hours: 11,
  // 	minutes: 23,
  // 	seconds: 20,
  // 	milliseconds: 1,
  // 	microseconds: 0,
  // 	nanoseconds: 0
  // }
  ```
  */
  inline def apply(milliseconds: Double): Parsed = ^.asInstanceOf[js.Dynamic].apply(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Parsed]
  
  @JSImport("parse-ms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Parsed extends StObject {
    
    var days: Double
    
    var hours: Double
    
    var microseconds: Double
    
    var milliseconds: Double
    
    var minutes: Double
    
    var nanoseconds: Double
    
    var seconds: Double
  }
  object Parsed {
    
    inline def apply(
      days: Double,
      hours: Double,
      microseconds: Double,
      milliseconds: Double,
      minutes: Double,
      nanoseconds: Double,
      seconds: Double
    ): Parsed = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], microseconds = microseconds.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parsed]
    }
    
    extension [Self <: Parsed](x: Self) {
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMicroseconds(value: Double): Self = StObject.set(x, "microseconds", value.asInstanceOf[js.Any])
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setNanoseconds(value: Double): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
