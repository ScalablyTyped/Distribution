package typings.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveLayer extends StObject {
  
  var tooltip: Tooltip
}
object InteractiveLayer {
  
  @scala.inline
  def apply(tooltip: Tooltip): InteractiveLayer = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveLayer]
  }
  
  @scala.inline
  implicit class InteractiveLayerMutableBuilder[Self <: InteractiveLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
