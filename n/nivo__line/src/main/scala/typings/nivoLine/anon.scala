package typings.nivoLine

import typings.nivoLine.mod.Datum
import typings.nivoLine.mod.DatumValue
import typings.nivoLine.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var id: DatumValue
    
    var points: js.Array[Point]
    
    var width: Double
    
    var x: Double
    
    var x0: Double
    
    var y: Double
    
    var y0: Double
  }
  object Height {
    
    inline def apply(
      height: Double,
      id: DatumValue,
      points: js.Array[Point],
      width: Double,
      x: Double,
      x0: Double,
      y: Double,
      y0: Double
    ): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: DatumValue): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@nivo/line.@nivo/line.PointSymbolProps> */
  trait ReadonlyPointSymbolProps extends StObject {
    
    val borderColor: String
    
    val borderWidth: Double
    
    val color: String
    
    val datum: Datum
    
    val size: Double
  }
  object ReadonlyPointSymbolProps {
    
    inline def apply(borderColor: String, borderWidth: Double, color: String, datum: Datum, size: Double): ReadonlyPointSymbolProps = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyPointSymbolProps]
    }
    
    extension [Self <: ReadonlyPointSymbolProps](x: Self) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: DatumValue
    
    var xFormatted: String | Double
    
    var y: DatumValue
    
    var yFormatted: String | Double
    
    var yStacked: js.UndefOr[Double] = js.undefined
  }
  object X {
    
    inline def apply(x: DatumValue, xFormatted: String | Double, y: DatumValue, yFormatted: String | Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xFormatted = xFormatted.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yFormatted = yFormatted.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: DatumValue): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXFormatted(value: String | Double): Self = StObject.set(x, "xFormatted", value.asInstanceOf[js.Any])
      
      inline def setY(value: DatumValue): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYFormatted(value: String | Double): Self = StObject.set(x, "yFormatted", value.asInstanceOf[js.Any])
      
      inline def setYStacked(value: Double): Self = StObject.set(x, "yStacked", value.asInstanceOf[js.Any])
      
      inline def setYStackedUndefined: Self = StObject.set(x, "yStacked", js.undefined)
    }
  }
  
  trait Y extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Y {
    
    inline def apply(x: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    extension [Self <: Y](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
