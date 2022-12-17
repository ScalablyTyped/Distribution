package typings.nivoBar.anon

import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.nivoBarBooleans.`false`
import typings.nivoBar.nivoBarInts.`0`
import typings.nivoBar.nivoBarStrings._empty
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @nivo/bar.@nivo/bar/dist/types/types.ComputedDatum<@nivo/bar.@nivo/bar/dist/types/types.BarDatum> & {  color :string} */
trait ComputedDatumBarDatumcolo extends StObject {
  
  var color: String
  
  var data: Exclude[BarDatum, js.UndefOr[Null | `false` | _empty | `0`]]
  
  var fill: js.UndefOr[String] = js.undefined
  
  var formattedValue: String
  
  var hidden: Boolean
  
  var id: String | Double
  
  var index: Double
  
  var indexValue: String | Double
  
  var value: Double | Null
}
object ComputedDatumBarDatumcolo {
  
  inline def apply(
    color: String,
    data: Exclude[BarDatum, js.UndefOr[Null | `false` | _empty | `0`]],
    formattedValue: String,
    hidden: Boolean,
    id: String | Double,
    index: Double,
    indexValue: String | Double
  ): ComputedDatumBarDatumcolo = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexValue = indexValue.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[ComputedDatumBarDatumcolo]
  }
  
  extension [Self <: ComputedDatumBarDatumcolo](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: Exclude[BarDatum, js.UndefOr[Null | `false` | _empty | `0`]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexValue(value: String | Double): Self = StObject.set(x, "indexValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
