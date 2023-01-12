package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var cameraFar: js.UndefOr[Double] = js.undefined
  
  var cameraNear: js.UndefOr[Double] = js.undefined
  
  var cameraVerticalFovDegrees: js.UndefOr[Double] = js.undefined
  
  var enableFaceGeometry: js.UndefOr[Boolean] = js.undefined
  
  var maxNumFaces: js.UndefOr[Double] = js.undefined
  
  var minDetectionConfidence: js.UndefOr[Double] = js.undefined
  
  var minTrackingConfidence: js.UndefOr[Double] = js.undefined
  
  var refineLandmarks: js.UndefOr[Boolean] = js.undefined
  
  var selfieMode: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setCameraFar(value: Double): Self = StObject.set(x, "cameraFar", value.asInstanceOf[js.Any])
    
    inline def setCameraFarUndefined: Self = StObject.set(x, "cameraFar", js.undefined)
    
    inline def setCameraNear(value: Double): Self = StObject.set(x, "cameraNear", value.asInstanceOf[js.Any])
    
    inline def setCameraNearUndefined: Self = StObject.set(x, "cameraNear", js.undefined)
    
    inline def setCameraVerticalFovDegrees(value: Double): Self = StObject.set(x, "cameraVerticalFovDegrees", value.asInstanceOf[js.Any])
    
    inline def setCameraVerticalFovDegreesUndefined: Self = StObject.set(x, "cameraVerticalFovDegrees", js.undefined)
    
    inline def setEnableFaceGeometry(value: Boolean): Self = StObject.set(x, "enableFaceGeometry", value.asInstanceOf[js.Any])
    
    inline def setEnableFaceGeometryUndefined: Self = StObject.set(x, "enableFaceGeometry", js.undefined)
    
    inline def setMaxNumFaces(value: Double): Self = StObject.set(x, "maxNumFaces", value.asInstanceOf[js.Any])
    
    inline def setMaxNumFacesUndefined: Self = StObject.set(x, "maxNumFaces", js.undefined)
    
    inline def setMinDetectionConfidence(value: Double): Self = StObject.set(x, "minDetectionConfidence", value.asInstanceOf[js.Any])
    
    inline def setMinDetectionConfidenceUndefined: Self = StObject.set(x, "minDetectionConfidence", js.undefined)
    
    inline def setMinTrackingConfidence(value: Double): Self = StObject.set(x, "minTrackingConfidence", value.asInstanceOf[js.Any])
    
    inline def setMinTrackingConfidenceUndefined: Self = StObject.set(x, "minTrackingConfidence", js.undefined)
    
    inline def setRefineLandmarks(value: Boolean): Self = StObject.set(x, "refineLandmarks", value.asInstanceOf[js.Any])
    
    inline def setRefineLandmarksUndefined: Self = StObject.set(x, "refineLandmarks", js.undefined)
    
    inline def setSelfieMode(value: Boolean): Self = StObject.set(x, "selfieMode", value.asInstanceOf[js.Any])
    
    inline def setSelfieModeUndefined: Self = StObject.set(x, "selfieMode", js.undefined)
  }
}
