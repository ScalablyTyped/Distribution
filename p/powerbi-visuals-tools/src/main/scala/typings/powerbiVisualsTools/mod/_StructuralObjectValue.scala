package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.mod.data.ISQConstantExpr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _StructuralObjectValue extends StObject
object _StructuralObjectValue {
  
  inline def DataBars(
    axisColor: Fill,
    hideText: Boolean,
    negativeColor: Fill,
    positiveColor: Fill,
    reverseDirection: Boolean
  ): typings.powerbiVisualsTools.mod.DataBars = {
    val __obj = js.Dynamic.literal(axisColor = axisColor.asInstanceOf[js.Any], hideText = hideText.asInstanceOf[js.Any], negativeColor = negativeColor.asInstanceOf[js.Any], positiveColor = positiveColor.asInstanceOf[js.Any], reverseDirection = reverseDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.powerbiVisualsTools.mod.DataBars]
  }
  
  inline def DefaultValueDefinition(value: ISQConstantExpr): typings.powerbiVisualsTools.mod.DefaultValueDefinition = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.powerbiVisualsTools.mod.DefaultValueDefinition]
  }
  
  inline def Fill(): typings.powerbiVisualsTools.mod.Fill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.powerbiVisualsTools.mod.Fill]
  }
}
