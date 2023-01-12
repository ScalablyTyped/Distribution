package typings.nivoPie.distTypesTypesMod

import typings.nivoArcs.distTypesTypesMod.ArcGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieCustomLayerProps[RawDatum] extends StObject {
  
  var arcGenerator: ArcGenerator
  
  var centerX: Double
  
  var centerY: Double
  
  var dataWithArc: js.Array[ComputedDatum[RawDatum]]
  
  var innerRadius: Double
  
  var radius: Double
}
object PieCustomLayerProps {
  
  inline def apply[RawDatum](
    arcGenerator: ArcGenerator,
    centerX: Double,
    centerY: Double,
    dataWithArc: js.Array[ComputedDatum[RawDatum]],
    innerRadius: Double,
    radius: Double
  ): PieCustomLayerProps[RawDatum] = {
    val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], dataWithArc = dataWithArc.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieCustomLayerProps[RawDatum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieCustomLayerProps[?], RawDatum] (val x: Self & PieCustomLayerProps[RawDatum]) extends AnyVal {
    
    inline def setArcGenerator(value: ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
    
    inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setDataWithArc(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "dataWithArc", value.asInstanceOf[js.Any])
    
    inline def setDataWithArcVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "dataWithArc", js.Array(value*))
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
