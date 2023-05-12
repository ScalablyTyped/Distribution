package typings.nivoChord.anon

import typings.reactSpringCore.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RibbonGenerator extends StObject {
  
  var ribbonGenerator: typings.nivoChord.distTypesTypesMod.RibbonGenerator
  
  var sourceEndAngle: SpringValue[Double]
  
  var sourceStartAngle: SpringValue[Double]
  
  var targetEndAngle: SpringValue[Double]
  
  var targetStartAngle: SpringValue[Double]
}
object RibbonGenerator {
  
  inline def apply(
    ribbonGenerator: typings.nivoChord.distTypesTypesMod.RibbonGenerator,
    sourceEndAngle: SpringValue[Double],
    sourceStartAngle: SpringValue[Double],
    targetEndAngle: SpringValue[Double],
    targetStartAngle: SpringValue[Double]
  ): RibbonGenerator = {
    val __obj = js.Dynamic.literal(ribbonGenerator = ribbonGenerator.asInstanceOf[js.Any], sourceEndAngle = sourceEndAngle.asInstanceOf[js.Any], sourceStartAngle = sourceStartAngle.asInstanceOf[js.Any], targetEndAngle = targetEndAngle.asInstanceOf[js.Any], targetStartAngle = targetStartAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonGenerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RibbonGenerator] (val x: Self) extends AnyVal {
    
    inline def setRibbonGenerator(value: typings.nivoChord.distTypesTypesMod.RibbonGenerator): Self = StObject.set(x, "ribbonGenerator", value.asInstanceOf[js.Any])
    
    inline def setSourceEndAngle(value: SpringValue[Double]): Self = StObject.set(x, "sourceEndAngle", value.asInstanceOf[js.Any])
    
    inline def setSourceStartAngle(value: SpringValue[Double]): Self = StObject.set(x, "sourceStartAngle", value.asInstanceOf[js.Any])
    
    inline def setTargetEndAngle(value: SpringValue[Double]): Self = StObject.set(x, "targetEndAngle", value.asInstanceOf[js.Any])
    
    inline def setTargetStartAngle(value: SpringValue[Double]): Self = StObject.set(x, "targetStartAngle", value.asInstanceOf[js.Any])
  }
}
