package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2Container extends StObject {
  
  /**
    * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable
    * cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be
    * expanded, regardless of whether the variable exists or not. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's
    * environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
    * references will never be expanded, regardless of whether the variable exists or not. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var command: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of environment variables to set in the container. */
  var env: js.UndefOr[js.Array[GoogleCloudRunV2EnvVar]] = js.undefined
  
  /** Required. URL of the Container image in Google Container Registry or Google Artifact Registry. More info: https://kubernetes.io/docs/concepts/containers/images */
  var image: js.UndefOr[String] = js.undefined
  
  /** Name of the container specified as a DNS_LABEL. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be
    * accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
    */
  var ports: js.UndefOr[js.Array[GoogleCloudRunV2ContainerPort]] = js.undefined
  
  /** Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
  var resources: js.UndefOr[GoogleCloudRunV2ResourceRequirements] = js.undefined
  
  /** Volume to mount into the container's filesystem. */
  var volumeMounts: js.UndefOr[js.Array[GoogleCloudRunV2VolumeMount]] = js.undefined
  
  /** Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. */
  var workingDir: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2Container {
  
  inline def apply(): GoogleCloudRunV2Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRunV2Container] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setCommand(value: js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setEnv(value: js.Array[GoogleCloudRunV2EnvVar]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVarargs(value: GoogleCloudRunV2EnvVar*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPorts(value: js.Array[GoogleCloudRunV2ContainerPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: GoogleCloudRunV2ContainerPort*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setResources(value: GoogleCloudRunV2ResourceRequirements): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setVolumeMounts(value: js.Array[GoogleCloudRunV2VolumeMount]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
    
    inline def setVolumeMountsUndefined: Self = StObject.set(x, "volumeMounts", js.undefined)
    
    inline def setVolumeMountsVarargs(value: GoogleCloudRunV2VolumeMount*): Self = StObject.set(x, "volumeMounts", js.Array(value*))
    
    inline def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
  }
}
