package typings.onfidoActiveVideoCapture

import typings.preact.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsDebugStatsMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/DebugStats", "DebugStats")
  @js.native
  val DebugStats: FunctionComponent[DebugStatsProps] = js.native
  
  trait DebugStatsProps extends StObject {
    
    var detectionsPerSecond: Double
    
    var elapsedTime: Double
    
    var faceRotation: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Euler */ Any) | Null
    
    var inferenceTime: Double
    
    var videoHeight: Double
    
    var videoWidth: Double
  }
  object DebugStatsProps {
    
    inline def apply(
      detectionsPerSecond: Double,
      elapsedTime: Double,
      inferenceTime: Double,
      videoHeight: Double,
      videoWidth: Double
    ): DebugStatsProps = {
      val __obj = js.Dynamic.literal(detectionsPerSecond = detectionsPerSecond.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], inferenceTime = inferenceTime.asInstanceOf[js.Any], videoHeight = videoHeight.asInstanceOf[js.Any], videoWidth = videoWidth.asInstanceOf[js.Any], faceRotation = null)
      __obj.asInstanceOf[DebugStatsProps]
    }
    
    extension [Self <: DebugStatsProps](x: Self) {
      
      inline def setDetectionsPerSecond(value: Double): Self = StObject.set(x, "detectionsPerSecond", value.asInstanceOf[js.Any])
      
      inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
      
      inline def setFaceRotation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Euler */ Any
      ): Self = StObject.set(x, "faceRotation", value.asInstanceOf[js.Any])
      
      inline def setFaceRotationNull: Self = StObject.set(x, "faceRotation", null)
      
      inline def setInferenceTime(value: Double): Self = StObject.set(x, "inferenceTime", value.asInstanceOf[js.Any])
      
      inline def setVideoHeight(value: Double): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
      
      inline def setVideoWidth(value: Double): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
    }
  }
}
