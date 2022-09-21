package typings.nivoWaffle.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedDatum[RawDatum]
  extends StObject
     with Datum {
  
  var color: String
  
  var data: RawDatum
  
  var endAt: Double
  
  var fill: js.UndefOr[String] = js.undefined
  
  var formattedValue: DatumFormattedValue
  
  var groupIndex: Double
  
  var startAt: Double
}
object ComputedDatum {
  
  inline def apply[RawDatum](
    color: String,
    data: RawDatum,
    endAt: Double,
    formattedValue: DatumFormattedValue,
    groupIndex: Double,
    id: DatumId,
    label: DatumLabel,
    startAt: Double,
    value: DatumValue
  ): ComputedDatum[RawDatum] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], endAt = endAt.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedDatum[RawDatum]]
  }
  
  extension [Self <: ComputedDatum[?], RawDatum](x: Self & ComputedDatum[RawDatum]) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEndAt(value: Double): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFormattedValue(value: DatumFormattedValue): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
  }
}
