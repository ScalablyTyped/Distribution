package typings.nouislider.mod

import typings.nouislider.mod.PipsMode.Count
import typings.nouislider.mod.PipsMode.Positions
import typings.nouislider.mod.PipsMode.Steps
import typings.nouislider.mod.PipsMode.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nouislider.mod.PositionsPips
  - typings.nouislider.mod.ValuesPips
  - typings.nouislider.mod.CountPips
  - typings.nouislider.mod.StepsPips
  - typings.nouislider.mod.RangePips
*/
trait Pips extends StObject
object Pips {
  
  inline def CountPips(mode: Count, values: Double): typings.nouislider.mod.CountPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nouislider.mod.CountPips]
  }
  
  inline def PositionsPips(mode: Positions, values: js.Array[Double]): typings.nouislider.mod.PositionsPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nouislider.mod.PositionsPips]
  }
  
  inline def RangePips(mode: typings.nouislider.mod.PipsMode.Range): typings.nouislider.mod.RangePips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nouislider.mod.RangePips]
  }
  
  inline def StepsPips(mode: Steps): typings.nouislider.mod.StepsPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nouislider.mod.StepsPips]
  }
  
  inline def ValuesPips(mode: Values, values: js.Array[Double]): typings.nouislider.mod.ValuesPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nouislider.mod.ValuesPips]
  }
}
