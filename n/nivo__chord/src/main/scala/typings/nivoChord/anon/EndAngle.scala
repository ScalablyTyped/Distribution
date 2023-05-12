package typings.nivoChord.anon

import typings.reactSpringCore.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndAngle extends StObject {
  
  var arcGenerator: typings.nivoChord.distTypesTypesMod.ArcGenerator
  
  var endAngle: SpringValue[Double]
  
  var startAngle: SpringValue[Double]
}
object EndAngle {
  
  inline def apply(
    arcGenerator: typings.nivoChord.distTypesTypesMod.ArcGenerator,
    endAngle: SpringValue[Double],
    startAngle: SpringValue[Double]
  ): EndAngle = {
    val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndAngle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndAngle] (val x: Self) extends AnyVal {
    
    inline def setArcGenerator(value: typings.nivoChord.distTypesTypesMod.ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
    
    inline def setEndAngle(value: SpringValue[Double]): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: SpringValue[Double]): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
