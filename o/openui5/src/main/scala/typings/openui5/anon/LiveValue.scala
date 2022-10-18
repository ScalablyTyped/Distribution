package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveValue extends StObject {
  
  /**
    * Current visible value of the `TextField`.
    */
  var liveValue: js.UndefOr[String] = js.undefined
}
object LiveValue {
  
  inline def apply(): LiveValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveValue]
  }
  
  extension [Self <: LiveValue](x: Self) {
    
    inline def setLiveValue(value: String): Self = StObject.set(x, "liveValue", value.asInstanceOf[js.Any])
    
    inline def setLiveValueUndefined: Self = StObject.set(x, "liveValue", js.undefined)
  }
}
