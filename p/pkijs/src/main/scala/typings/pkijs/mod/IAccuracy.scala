package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccuracy extends StObject {
  
  /**
    * Microseconds
    */
  var micros: js.UndefOr[Double] = js.undefined
  
  /**
    * Milliseconds
    */
  var millis: js.UndefOr[Double] = js.undefined
  
  /**
    * Seconds
    */
  var seconds: js.UndefOr[Double] = js.undefined
}
object IAccuracy {
  
  inline def apply(): IAccuracy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccuracy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAccuracy] (val x: Self) extends AnyVal {
    
    inline def setMicros(value: Double): Self = StObject.set(x, "micros", value.asInstanceOf[js.Any])
    
    inline def setMicrosUndefined: Self = StObject.set(x, "micros", js.undefined)
    
    inline def setMillis(value: Double): Self = StObject.set(x, "millis", value.asInstanceOf[js.Any])
    
    inline def setMillisUndefined: Self = StObject.set(x, "millis", js.undefined)
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
