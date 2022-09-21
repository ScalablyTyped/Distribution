package typings.nouislider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangePips
  extends StObject
     with BasePips
     with Pips {
  
  @JSName("mode")
  var mode_RangePips: typings.nouislider.mod.PipsMode.Range
}
object RangePips {
  
  inline def apply(mode: typings.nouislider.mod.PipsMode.Range): RangePips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePips]
  }
  
  extension [Self <: RangePips](x: Self) {
    
    inline def setMode(value: typings.nouislider.mod.PipsMode.Range): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
