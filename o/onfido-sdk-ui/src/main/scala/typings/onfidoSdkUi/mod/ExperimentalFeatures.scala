package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentalFeatures extends StObject {
  
  var enable_image_quality_service: js.UndefOr[Boolean] = js.undefined
  
  var enable_multi_frame_capture: js.UndefOr[Boolean] = js.undefined
  
  var motion_experiment: js.UndefOr[Enabled] = js.undefined
}
object ExperimentalFeatures {
  
  inline def apply(): ExperimentalFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentalFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentalFeatures] (val x: Self) extends AnyVal {
    
    inline def setEnable_image_quality_service(value: Boolean): Self = StObject.set(x, "enable_image_quality_service", value.asInstanceOf[js.Any])
    
    inline def setEnable_image_quality_serviceUndefined: Self = StObject.set(x, "enable_image_quality_service", js.undefined)
    
    inline def setEnable_multi_frame_capture(value: Boolean): Self = StObject.set(x, "enable_multi_frame_capture", value.asInstanceOf[js.Any])
    
    inline def setEnable_multi_frame_captureUndefined: Self = StObject.set(x, "enable_multi_frame_capture", js.undefined)
    
    inline def setMotion_experiment(value: Enabled): Self = StObject.set(x, "motion_experiment", value.asInstanceOf[js.Any])
    
    inline def setMotion_experimentUndefined: Self = StObject.set(x, "motion_experiment", js.undefined)
  }
}
