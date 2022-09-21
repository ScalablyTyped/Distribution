package typings.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGenerator extends StObject {
  
  var arcGenerator: typings.nivoChord.typesMod.ArcGenerator
  
  var center: js.Tuple2[Double, Double]
  
  var innerRadius: Double
  
  var radius: Double
  
  var ribbonGenerator: typings.nivoChord.typesMod.RibbonGenerator
}
object ArcGenerator {
  
  inline def apply(
    arcGenerator: typings.nivoChord.typesMod.ArcGenerator,
    center: js.Tuple2[Double, Double],
    innerRadius: Double,
    radius: Double,
    ribbonGenerator: typings.nivoChord.typesMod.RibbonGenerator
  ): ArcGenerator = {
    val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ribbonGenerator = ribbonGenerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGenerator]
  }
  
  extension [Self <: ArcGenerator](x: Self) {
    
    inline def setArcGenerator(value: typings.nivoChord.typesMod.ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRibbonGenerator(value: typings.nivoChord.typesMod.RibbonGenerator): Self = StObject.set(x, "ribbonGenerator", value.asInstanceOf[js.Any])
  }
}
