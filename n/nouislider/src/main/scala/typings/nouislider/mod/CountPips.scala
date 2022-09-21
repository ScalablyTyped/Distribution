package typings.nouislider.mod

import typings.nouislider.mod.PipsMode.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountPips
  extends StObject
     with BasePips
     with Pips {
  
  @JSName("mode")
  var mode_CountPips: Count
  
  var stepped: js.UndefOr[Boolean] = js.undefined
  
  var values: Double
}
object CountPips {
  
  inline def apply(mode: Count, values: Double): CountPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountPips]
  }
  
  extension [Self <: CountPips](x: Self) {
    
    inline def setMode(value: Count): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setStepped(value: Boolean): Self = StObject.set(x, "stepped", value.asInstanceOf[js.Any])
    
    inline def setSteppedUndefined: Self = StObject.set(x, "stepped", js.undefined)
    
    inline def setValues(value: Double): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
