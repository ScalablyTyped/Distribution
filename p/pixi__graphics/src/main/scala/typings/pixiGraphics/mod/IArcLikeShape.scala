package typings.pixiGraphics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IArcLikeShape extends StObject {
  
  var anticlockwise: Boolean
  
  var cx: Double
  
  var cy: Double
  
  var endAngle: Double
  
  var radius: Double
  
  var startAngle: Double
}
object IArcLikeShape {
  
  inline def apply(
    anticlockwise: Boolean,
    cx: Double,
    cy: Double,
    endAngle: Double,
    radius: Double,
    startAngle: Double
  ): IArcLikeShape = {
    val __obj = js.Dynamic.literal(anticlockwise = anticlockwise.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArcLikeShape]
  }
  
  extension [Self <: IArcLikeShape](x: Self) {
    
    inline def setAnticlockwise(value: Boolean): Self = StObject.set(x, "anticlockwise", value.asInstanceOf[js.Any])
    
    inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
