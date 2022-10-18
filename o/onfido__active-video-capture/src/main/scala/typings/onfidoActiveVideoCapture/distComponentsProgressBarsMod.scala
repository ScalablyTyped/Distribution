package typings.onfidoActiveVideoCapture

import typings.preact.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsProgressBarsMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/ProgressBars", "ProgressBars")
  @js.native
  val ProgressBars: FunctionComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var left: Double
    
    var right: Double
  }
  object Props {
    
    inline def apply(left: Double, right: Double): Props = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
}
