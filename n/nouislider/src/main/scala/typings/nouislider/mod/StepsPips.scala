package typings.nouislider.mod

import typings.nouislider.mod.PipsMode.Steps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepsPips
  extends StObject
     with BasePips
     with Pips {
  
  @JSName("mode")
  var mode_StepsPips: Steps
}
object StepsPips {
  
  inline def apply(mode: Steps): StepsPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsPips]
  }
  
  extension [Self <: StepsPips](x: Self) {
    
    inline def setMode(value: Steps): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
