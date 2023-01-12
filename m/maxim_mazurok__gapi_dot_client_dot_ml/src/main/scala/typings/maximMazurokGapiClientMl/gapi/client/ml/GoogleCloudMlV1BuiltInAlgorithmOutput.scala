package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1BuiltInAlgorithmOutput extends StObject {
  
  /** Framework on which the built-in algorithm was trained. */
  var framework: js.UndefOr[String] = js.undefined
  
  /** The Cloud Storage path to the `model/` directory where the training job saves the trained model. Only set for successful jobs that don't use hyperparameter tuning. */
  var modelPath: js.UndefOr[String] = js.undefined
  
  /** Python version on which the built-in algorithm was trained. */
  var pythonVersion: js.UndefOr[String] = js.undefined
  
  /** AI Platform runtime version on which the built-in algorithm was trained. */
  var runtimeVersion: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1BuiltInAlgorithmOutput {
  
  inline def apply(): GoogleCloudMlV1BuiltInAlgorithmOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1BuiltInAlgorithmOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudMlV1BuiltInAlgorithmOutput] (val x: Self) extends AnyVal {
    
    inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    inline def setModelPath(value: String): Self = StObject.set(x, "modelPath", value.asInstanceOf[js.Any])
    
    inline def setModelPathUndefined: Self = StObject.set(x, "modelPath", js.undefined)
    
    inline def setPythonVersion(value: String): Self = StObject.set(x, "pythonVersion", value.asInstanceOf[js.Any])
    
    inline def setPythonVersionUndefined: Self = StObject.set(x, "pythonVersion", js.undefined)
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
  }
}
