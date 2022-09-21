package typings.nivoGenerators.anon

import typings.nivoGenerators.xySeriesMod.XYRangeValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerieIds extends StObject {
  
  var serieIds: js.Array[String]
  
  var x: XYRangeValues
  
  var y: XYRangeValues
}
object SerieIds {
  
  inline def apply(serieIds: js.Array[String], x: XYRangeValues, y: XYRangeValues): SerieIds = {
    val __obj = js.Dynamic.literal(serieIds = serieIds.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerieIds]
  }
  
  extension [Self <: SerieIds](x: Self) {
    
    inline def setSerieIds(value: js.Array[String]): Self = StObject.set(x, "serieIds", value.asInstanceOf[js.Any])
    
    inline def setSerieIdsVarargs(value: String*): Self = StObject.set(x, "serieIds", js.Array(value*))
    
    inline def setX(value: XYRangeValues): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: XYRangeValues): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
