package typings.nivoArcs

import typings.d3Shape.mod.Arc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait Arc extends StObject {
    
    var endAngle: Double
    
    var innerRadius: Double
    
    var outerRadius: Double
    
    var startAngle: Double
  }
  object Arc {
    
    inline def apply(endAngle: Double, innerRadius: Double, outerRadius: Double, startAngle: Double): Arc = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arc]
    }
    
    extension [Self <: Arc](x: Self) {
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    }
  }
  
  type ArcGenerator = Arc_[Any, Arc]
  
  trait DatumWithArc extends StObject {
    
    var arc: Arc
    
    var id: String | Double
  }
  object DatumWithArc {
    
    inline def apply(arc: Arc, id: String | Double): DatumWithArc = {
      val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatumWithArc]
    }
    
    extension [Self <: DatumWithArc](x: Self) {
      
      inline def setArc(value: Arc): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatumWithArcAndColor
    extends StObject
       with DatumWithArc {
    
    var color: String
    
    var fill: js.UndefOr[String] = js.undefined
  }
  object DatumWithArcAndColor {
    
    inline def apply(arc: Arc, color: String, id: String | Double): DatumWithArcAndColor = {
      val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatumWithArcAndColor]
    }
    
    extension [Self <: DatumWithArcAndColor](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
