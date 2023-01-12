package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Micros extends StObject {
  
  var micros: js.UndefOr[String] = js.undefined
  
  var millis: js.UndefOr[String] = js.undefined
  
  var seconds: js.UndefOr[String] = js.undefined
}
object Micros {
  
  inline def apply(): Micros = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Micros]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Micros] (val x: Self) extends AnyVal {
    
    inline def setMicros(value: String): Self = StObject.set(x, "micros", value.asInstanceOf[js.Any])
    
    inline def setMicrosUndefined: Self = StObject.set(x, "micros", js.undefined)
    
    inline def setMillis(value: String): Self = StObject.set(x, "millis", value.asInstanceOf[js.Any])
    
    inline def setMillisUndefined: Self = StObject.set(x, "millis", js.undefined)
    
    inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
