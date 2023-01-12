package typings.nouislider.mod

import typings.nouislider.mod.PipsMode.Positions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionsPips
  extends StObject
     with BasePips
     with Pips {
  
  @JSName("mode")
  var mode_PositionsPips: Positions
  
  var stepped: js.UndefOr[Boolean] = js.undefined
  
  var values: js.Array[Double]
}
object PositionsPips {
  
  inline def apply(mode: Positions, values: js.Array[Double]): PositionsPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionsPips]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionsPips] (val x: Self) extends AnyVal {
    
    inline def setMode(value: Positions): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setStepped(value: Boolean): Self = StObject.set(x, "stepped", value.asInstanceOf[js.Any])
    
    inline def setSteppedUndefined: Self = StObject.set(x, "stepped", js.undefined)
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
