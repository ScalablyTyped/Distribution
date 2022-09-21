package typings.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/chord.@nivo/chord/dist/types/types.ArcDatum, 'label' | 'color'> */
trait OmitArcDatumlabelcolor extends StObject {
  
  var endAngle: Double
  
  var formattedValue: Double | String
  
  var id: String
  
  var index: Double
  
  var startAngle: Double
  
  var value: Double
}
object OmitArcDatumlabelcolor {
  
  inline def apply(
    endAngle: Double,
    formattedValue: Double | String,
    id: String,
    index: Double,
    startAngle: Double,
    value: Double
  ): OmitArcDatumlabelcolor = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitArcDatumlabelcolor]
  }
  
  extension [Self <: OmitArcDatumlabelcolor](x: Self) {
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setFormattedValue(value: Double | String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
