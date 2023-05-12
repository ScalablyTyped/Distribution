package typings.onfidoSdkUi.anon

import typings.onfidoSdkUi.mod.BiometricsLiveness
import typings.onfidoSdkUi.mod.DeviceIntelligence
import typings.onfidoSdkUi.mod.DocumentCapture
import typings.onfidoSdkUi.mod.ExperimentalFeatures
import typings.onfidoSdkUi.mod.MotionCapture
import typings.onfidoSdkUi.mod.SdkConfigurationValidations
import typings.onfidoSdkUi.mod.SdkFeatures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<onfido-sdk-ui.onfido-sdk-ui.SdkConfiguration> */
trait PartialSdkConfiguration extends StObject {
  
  var biometrics_liveness: js.UndefOr[BiometricsLiveness] = js.undefined
  
  var device_intelligence: js.UndefOr[DeviceIntelligence] = js.undefined
  
  var document_capture: js.UndefOr[DocumentCapture] = js.undefined
  
  var experimental_features: js.UndefOr[ExperimentalFeatures] = js.undefined
  
  var motion_capture: js.UndefOr[MotionCapture] = js.undefined
  
  var sdk_features: js.UndefOr[SdkFeatures] = js.undefined
  
  var validations: js.UndefOr[SdkConfigurationValidations] = js.undefined
}
object PartialSdkConfiguration {
  
  inline def apply(): PartialSdkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSdkConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSdkConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBiometrics_liveness(value: BiometricsLiveness): Self = StObject.set(x, "biometrics_liveness", value.asInstanceOf[js.Any])
    
    inline def setBiometrics_livenessUndefined: Self = StObject.set(x, "biometrics_liveness", js.undefined)
    
    inline def setDevice_intelligence(value: DeviceIntelligence): Self = StObject.set(x, "device_intelligence", value.asInstanceOf[js.Any])
    
    inline def setDevice_intelligenceUndefined: Self = StObject.set(x, "device_intelligence", js.undefined)
    
    inline def setDocument_capture(value: DocumentCapture): Self = StObject.set(x, "document_capture", value.asInstanceOf[js.Any])
    
    inline def setDocument_captureUndefined: Self = StObject.set(x, "document_capture", js.undefined)
    
    inline def setExperimental_features(value: ExperimentalFeatures): Self = StObject.set(x, "experimental_features", value.asInstanceOf[js.Any])
    
    inline def setExperimental_featuresUndefined: Self = StObject.set(x, "experimental_features", js.undefined)
    
    inline def setMotion_capture(value: MotionCapture): Self = StObject.set(x, "motion_capture", value.asInstanceOf[js.Any])
    
    inline def setMotion_captureUndefined: Self = StObject.set(x, "motion_capture", js.undefined)
    
    inline def setSdk_features(value: SdkFeatures): Self = StObject.set(x, "sdk_features", value.asInstanceOf[js.Any])
    
    inline def setSdk_featuresUndefined: Self = StObject.set(x, "sdk_features", js.undefined)
    
    inline def setValidations(value: SdkConfigurationValidations): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
  }
}
