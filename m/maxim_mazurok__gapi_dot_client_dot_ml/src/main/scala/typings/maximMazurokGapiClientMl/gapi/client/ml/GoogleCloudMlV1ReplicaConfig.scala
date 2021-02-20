package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ReplicaConfig extends StObject {
  
  /**
    * Represents the type and number of accelerators used by the replica. [Learn about restrictions on accelerator configurations for
    * training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu)
    */
  var acceleratorConfig: js.UndefOr[GoogleCloudMlV1AcceleratorConfig] = js.native
  
  /**
    * Arguments to the entrypoint command. The following rules apply for container_command and container_args: - If you do not supply command or args: The defaults defined in the Docker
    * image are used. - If you supply a command but no args: The default EntryPoint and the default Cmd defined in the Docker image are ignored. Your command is run without any arguments.
    * - If you supply only args: The default Entrypoint defined in the Docker image is run with the args that you supplied. - If you supply a command and args: The default Entrypoint and
    * the default Cmd defined in the Docker image are ignored. Your command is run with your args. It cannot be set if custom container image is not provided. Note that this field and
    * [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
    */
  var containerArgs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The command with which the replica's custom container is run. If provided, it will override default ENTRYPOINT of the docker image. If not provided, the docker image's ENTRYPOINT is
    * used. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
    */
  var containerCommand: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The Docker image to run on the replica. This image must be in Container Registry. Learn more about [configuring custom
    * containers](/ai-platform/training/docs/distributed-training-containers).
    */
  var imageUri: js.UndefOr[String] = js.native
  
  /**
    * The AI Platform runtime version that includes a TensorFlow version matching the one used in the custom container. This field is required if the replica is a TPU worker that uses a
    * custom container. Otherwise, do not specify this field. This must be a [runtime version that currently supports training with
    * TPUs](/ml-engine/docs/tensorflow/runtime-version-list#tpu-support). Note that the version of TensorFlow included in a runtime version may differ from the numbering of the runtime
    * version itself, because it may have a different [patch version](https://www.tensorflow.org/guide/version_compat#semantic_versioning_20). In this field, you must specify the runtime
    * version (TensorFlow minor version). For example, if your custom container runs TensorFlow `1.x.y`, specify `1.x`.
    */
  var tpuTfVersion: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1ReplicaConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ReplicaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ReplicaConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ReplicaConfigMutableBuilder[Self <: GoogleCloudMlV1ReplicaConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorConfig(value: GoogleCloudMlV1AcceleratorConfig): Self = StObject.set(x, "acceleratorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorConfigUndefined: Self = StObject.set(x, "acceleratorConfig", js.undefined)
    
    @scala.inline
    def setContainerArgs(value: js.Array[String]): Self = StObject.set(x, "containerArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerArgsUndefined: Self = StObject.set(x, "containerArgs", js.undefined)
    
    @scala.inline
    def setContainerArgsVarargs(value: String*): Self = StObject.set(x, "containerArgs", js.Array(value :_*))
    
    @scala.inline
    def setContainerCommand(value: js.Array[String]): Self = StObject.set(x, "containerCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerCommandUndefined: Self = StObject.set(x, "containerCommand", js.undefined)
    
    @scala.inline
    def setContainerCommandVarargs(value: String*): Self = StObject.set(x, "containerCommand", js.Array(value :_*))
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    @scala.inline
    def setTpuTfVersion(value: String): Self = StObject.set(x, "tpuTfVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpuTfVersionUndefined: Self = StObject.set(x, "tpuTfVersion", js.undefined)
  }
}
