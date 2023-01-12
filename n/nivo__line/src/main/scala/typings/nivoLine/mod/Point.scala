package typings.nivoLine.mod

import typings.nivoLine.anon.XFormatted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  var borderColor: String
  
  var color: String
  
  var data: XFormatted
  
  var id: String
  
  var index: Double
  
  var serieColor: String
  
  var serieId: String | Double
  
  var x: Double
  
  var y: Double
}
object Point {
  
  inline def apply(
    borderColor: String,
    color: String,
    data: XFormatted,
    id: String,
    index: Double,
    serieColor: String,
    serieId: String | Double,
    x: Double,
    y: Double
  ): Point = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], serieColor = serieColor.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: XFormatted): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSerieColor(value: String): Self = StObject.set(x, "serieColor", value.asInstanceOf[js.Any])
    
    inline def setSerieId(value: String | Double): Self = StObject.set(x, "serieId", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
