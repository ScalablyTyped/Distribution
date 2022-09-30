package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON representation of {@link Accuracy}
  */
trait AccuracyJson extends StObject {
  
  var micros: js.UndefOr[Double] = js.undefined
  
  var millis: js.UndefOr[Double] = js.undefined
  
  var seconds: js.UndefOr[Double] = js.undefined
}
object AccuracyJson {
  
  inline def apply(): AccuracyJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccuracyJson]
  }
  
  extension [Self <: AccuracyJson](x: Self) {
    
    inline def setMicros(value: Double): Self = StObject.set(x, "micros", value.asInstanceOf[js.Any])
    
    inline def setMicrosUndefined: Self = StObject.set(x, "micros", js.undefined)
    
    inline def setMillis(value: Double): Self = StObject.set(x, "millis", value.asInstanceOf[js.Any])
    
    inline def setMillisUndefined: Self = StObject.set(x, "millis", js.undefined)
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
