package typings.nivoBar.typesMod

import typings.nivoBar.nivoBarBooleans.`false`
import typings.nivoBar.nivoBarNumbers.`0`
import typings.nivoBar.nivoBarStrings._empty
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@nivo/bar.@nivo/bar/dist/types/types.ComputedDatum<RawDatum>> & {  id :string | number,   hidden :boolean} */
trait LegendLabelDatum[RawDatum] extends StObject {
  
  var data: js.UndefOr[Exclude[RawDatum, js.UndefOr[Null | `false` | _empty | `0`]]] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var formattedValue: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] & Boolean
  
  var id: (js.UndefOr[String | Double]) & (String | Double)
  
  var index: js.UndefOr[Double] = js.undefined
  
  var indexValue: js.UndefOr[String | Double] = js.undefined
  
  var value: js.UndefOr[Double | Null] = js.undefined
}
object LegendLabelDatum {
  
  inline def apply[RawDatum](hidden: js.UndefOr[Boolean] & Boolean, id: (js.UndefOr[String | Double]) & (String | Double)): LegendLabelDatum[RawDatum] = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendLabelDatum[RawDatum]]
  }
  
  extension [Self <: LegendLabelDatum[?], RawDatum](x: Self & LegendLabelDatum[RawDatum]) {
    
    inline def setData(value: Exclude[RawDatum, js.UndefOr[Null | `false` | _empty | `0`]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    inline def setHidden(value: js.UndefOr[Boolean] & Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setId(value: (js.UndefOr[String | Double]) & (String | Double)): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexValue(value: String | Double): Self = StObject.set(x, "indexValue", value.asInstanceOf[js.Any])
    
    inline def setIndexValueUndefined: Self = StObject.set(x, "indexValue", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
