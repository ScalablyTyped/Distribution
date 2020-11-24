package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1BuiltInAlgorithmOutput extends js.Object {
  
  /** Framework on which the built-in algorithm was trained. */
  var framework: js.UndefOr[String] = js.native
  
  /** The Cloud Storage path to the `model/` directory where the training job saves the trained model. Only set for successful jobs that don't use hyperparameter tuning. */
  var modelPath: js.UndefOr[String] = js.native
  
  /** Python version on which the built-in algorithm was trained. */
  var pythonVersion: js.UndefOr[String] = js.native
  
  /** AI Platform runtime version on which the built-in algorithm was trained. */
  var runtimeVersion: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1BuiltInAlgorithmOutput {
  
  @scala.inline
  def apply(): GoogleCloudMlV1BuiltInAlgorithmOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1BuiltInAlgorithmOutput]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1BuiltInAlgorithmOutputOps[Self <: GoogleCloudMlV1BuiltInAlgorithmOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFramework(value: String): Self = this.set("framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    
    @scala.inline
    def setModelPath(value: String): Self = this.set("modelPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelPath: Self = this.set("modelPath", js.undefined)
    
    @scala.inline
    def setPythonVersion(value: String): Self = this.set("pythonVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePythonVersion: Self = this.set("pythonVersion", js.undefined)
    
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("runtimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeVersion: Self = this.set("runtimeVersion", js.undefined)
  }
}
