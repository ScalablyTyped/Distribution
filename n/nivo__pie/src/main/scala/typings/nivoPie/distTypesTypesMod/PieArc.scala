package typings.nivoPie.distTypesTypesMod

import typings.nivoArcs.distTypesTypesMod.Arc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieArc
  extends StObject
     with Arc {
  
  var angle: Double
  
  var angleDeg: Double
  
  var index: Double
  
  var padAngle: Double
  
  var thickness: Double
}
object PieArc {
  
  inline def apply(
    angle: Double,
    angleDeg: Double,
    endAngle: Double,
    index: Double,
    innerRadius: Double,
    outerRadius: Double,
    padAngle: Double,
    startAngle: Double,
    thickness: Double
  ): PieArc = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], angleDeg = angleDeg.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], padAngle = padAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieArc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieArc] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleDeg(value: Double): Self = StObject.set(x, "angleDeg", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
