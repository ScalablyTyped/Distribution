package typings.playcanvas.anon

import typings.playcanvas.mod.XrErrorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  var callback: js.UndefOr[XrErrorCallback] = js.undefined
  
  var depthSensing: js.UndefOr[DataFormatPreference] = js.undefined
  
  var imageTracking: js.UndefOr[Boolean] = js.undefined
  
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  var planeDetection: js.UndefOr[Boolean] = js.undefined
}
object Callback {
  
  inline def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: /* err */ js.Error | Null => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDepthSensing(value: DataFormatPreference): Self = StObject.set(x, "depthSensing", value.asInstanceOf[js.Any])
    
    inline def setDepthSensingUndefined: Self = StObject.set(x, "depthSensing", js.undefined)
    
    inline def setImageTracking(value: Boolean): Self = StObject.set(x, "imageTracking", value.asInstanceOf[js.Any])
    
    inline def setImageTrackingUndefined: Self = StObject.set(x, "imageTracking", js.undefined)
    
    inline def setOptionalFeatures(value: js.Array[String]): Self = StObject.set(x, "optionalFeatures", value.asInstanceOf[js.Any])
    
    inline def setOptionalFeaturesUndefined: Self = StObject.set(x, "optionalFeatures", js.undefined)
    
    inline def setOptionalFeaturesVarargs(value: String*): Self = StObject.set(x, "optionalFeatures", js.Array(value*))
    
    inline def setPlaneDetection(value: Boolean): Self = StObject.set(x, "planeDetection", value.asInstanceOf[js.Any])
    
    inline def setPlaneDetectionUndefined: Self = StObject.set(x, "planeDetection", js.undefined)
  }
}
