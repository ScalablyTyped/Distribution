package typings.nivoBullet.typesMod

import typings.nivoScales.typesMod.ScaleLinear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhancedDatum
  extends StObject
     with Datum {
  
  var scale: ScaleLinear[Double]
}
object EnhancedDatum {
  
  inline def apply(id: DatumId, measures: js.Array[Double], ranges: js.Array[Double], scale: ScaleLinear[Double]): EnhancedDatum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedDatum]
  }
  
  extension [Self <: EnhancedDatum](x: Self) {
    
    inline def setScale(value: ScaleLinear[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
