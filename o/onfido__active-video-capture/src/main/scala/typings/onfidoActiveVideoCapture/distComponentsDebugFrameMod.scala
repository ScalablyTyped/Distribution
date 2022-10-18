package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.distTypesMod.BoundingBox
import typings.preact.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsDebugFrameMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/DebugFrame", "DebugFrame")
  @js.native
  val DebugFrame: FunctionComponent[DebugFrameProps] = js.native
  
  trait DebugFrameProps extends StObject {
    
    var centerBounds: BoundingBox | Null
    
    var faceBounds: BoundingBox | Null
    
    var videoBounds: BoundingBox
    
    var warningMessage: String
  }
  object DebugFrameProps {
    
    inline def apply(videoBounds: BoundingBox, warningMessage: String): DebugFrameProps = {
      val __obj = js.Dynamic.literal(videoBounds = videoBounds.asInstanceOf[js.Any], warningMessage = warningMessage.asInstanceOf[js.Any], centerBounds = null, faceBounds = null)
      __obj.asInstanceOf[DebugFrameProps]
    }
    
    extension [Self <: DebugFrameProps](x: Self) {
      
      inline def setCenterBounds(value: BoundingBox): Self = StObject.set(x, "centerBounds", value.asInstanceOf[js.Any])
      
      inline def setCenterBoundsNull: Self = StObject.set(x, "centerBounds", null)
      
      inline def setFaceBounds(value: BoundingBox): Self = StObject.set(x, "faceBounds", value.asInstanceOf[js.Any])
      
      inline def setFaceBoundsNull: Self = StObject.set(x, "faceBounds", null)
      
      inline def setVideoBounds(value: BoundingBox): Self = StObject.set(x, "videoBounds", value.asInstanceOf[js.Any])
      
      inline def setWarningMessage(value: String): Self = StObject.set(x, "warningMessage", value.asInstanceOf[js.Any])
    }
  }
}
