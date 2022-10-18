package typings.nivoBar.distTypesTypesMod

import typings.nivoBar.nivoBarBooleans.`false`
import typings.nivoBar.nivoBarInts.`0`
import typings.nivoBar.nivoBarStrings._empty
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarTooltipProps[RawDatum]
  extends StObject
     with ComputedDatum[RawDatum] {
  
  var color: String
  
  var label: String
  
  @JSName("value")
  var value_BarTooltipProps: Double
}
object BarTooltipProps {
  
  inline def apply[RawDatum](
    color: String,
    data: Exclude[RawDatum, js.UndefOr[Null | `false` | _empty | `0`]],
    formattedValue: String,
    hidden: Boolean,
    id: String | Double,
    index: Double,
    indexValue: String | Double,
    label: String,
    value: Double
  ): BarTooltipProps[RawDatum] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexValue = indexValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarTooltipProps[RawDatum]]
  }
  
  extension [Self <: BarTooltipProps[?], RawDatum](x: Self & BarTooltipProps[RawDatum]) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
