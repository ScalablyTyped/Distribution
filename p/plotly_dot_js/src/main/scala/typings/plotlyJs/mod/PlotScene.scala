package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotScene extends StObject {
  
  var center: Point
  
  var eye: Point
  
  var up: Point
}
object PlotScene {
  
  inline def apply(center: Point, eye: Point, up: Point): PlotScene = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScene]
  }
  
  extension [Self <: PlotScene](x: Self) {
    
    inline def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setEye(value: Point): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    inline def setUp(value: Point): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
