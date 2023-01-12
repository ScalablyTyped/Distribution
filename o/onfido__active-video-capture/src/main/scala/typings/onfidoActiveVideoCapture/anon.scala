package typings.onfidoActiveVideoCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AvgFps extends StObject {
    
    var avgFps: String
    
    var currentFps: Double
    
    var fps: js.Array[Double]
    
    var maxFps: Double
  }
  object AvgFps {
    
    inline def apply(avgFps: String, currentFps: Double, fps: js.Array[Double], maxFps: Double): AvgFps = {
      val __obj = js.Dynamic.literal(avgFps = avgFps.asInstanceOf[js.Any], currentFps = currentFps.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], maxFps = maxFps.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvgFps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvgFps] (val x: Self) extends AnyVal {
      
      inline def setAvgFps(value: String): Self = StObject.set(x, "avgFps", value.asInstanceOf[js.Any])
      
      inline def setCurrentFps(value: Double): Self = StObject.set(x, "currentFps", value.asInstanceOf[js.Any])
      
      inline def setFps(value: js.Array[Double]): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsVarargs(value: Double*): Self = StObject.set(x, "fps", js.Array(value*))
      
      inline def setMaxFps(value: Double): Self = StObject.set(x, "maxFps", value.asInstanceOf[js.Any])
    }
  }
}
