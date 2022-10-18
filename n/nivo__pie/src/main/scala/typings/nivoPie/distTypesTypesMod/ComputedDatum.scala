package typings.nivoPie.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedDatum[RawDatum] extends StObject {
  
  var arc: PieArc
  
  var color: String
  
  var data: RawDatum
  
  var fill: js.UndefOr[String] = js.undefined
  
  var formattedValue: String
  
  var hidden: Boolean
  
  var id: DatumId
  
  var label: DatumId
  
  var value: Double
}
object ComputedDatum {
  
  inline def apply[RawDatum](
    arc: PieArc,
    color: String,
    data: RawDatum,
    formattedValue: String,
    hidden: Boolean,
    id: DatumId,
    label: DatumId,
    value: Double
  ): ComputedDatum[RawDatum] = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedDatum[RawDatum]]
  }
  
  extension [Self <: ComputedDatum[?], RawDatum](x: Self & ComputedDatum[RawDatum]) {
    
    inline def setArc(value: PieArc): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: DatumId): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
