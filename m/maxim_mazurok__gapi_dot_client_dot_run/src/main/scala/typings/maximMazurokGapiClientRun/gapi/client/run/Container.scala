package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  /**
    * (Optional) Cloud Run fully managed: supported Cloud Run for Anthos: supported Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable
    * references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax
    * can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  var command: js.UndefOr[js.Array[String]] = js.undefined
  
  /** (Optional) Cloud Run fully managed: supported Cloud Run for Anthos: supported List of environment variables to set in the container. */
  var env: js.UndefOr[js.Array[EnvVar]] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported List of sources to populate environment variables in the container. The keys defined within a
    * source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the
    * last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
    */
  var envFrom: js.UndefOr[js.Array[EnvFromSource]] = js.undefined
  
  /**
    * Cloud Run fully managed: only supports containers from Google Container Registry Cloud Run for Anthos: supported URL of the Container image. More info:
    * https://kubernetes.io/docs/concepts/containers/images
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is
    * specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Periodic probe of container liveness. Container will be restarted if the probe fails. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var livenessProbe: js.UndefOr[Probe] = js.undefined
  
  /** (Optional) Name of the container specified as a DNS_LABEL. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to
    * be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
    */
  var ports: js.UndefOr[js.Array[ContainerPort]] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Periodic probe of container service readiness. Container will be removed from service endpoints if
    * the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var readinessProbe: js.UndefOr[Probe] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: supported Cloud Run for Anthos: supported Compute Resources required by this container. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  var resources: js.UndefOr[ResourceRequirements] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Security options the pod should run with. More info:
    * https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var securityContext: js.UndefOr[SecurityContext] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Path at which the file to which the container's termination message will be written is mounted into
    * the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The
    * total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
    */
  var terminationMessagePath: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Indicate how the termination message should be populated. File will use the contents of
    * terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination
    * message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
    */
  var terminationMessagePolicy: js.UndefOr[String] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Pod volumes to mount into the container's filesystem. */
  var volumeMounts: js.UndefOr[js.Array[VolumeMount]] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Container's working directory. If not specified, the container runtime's default will be used,
    * which might be configured in the container image.
    */
  var workingDir: js.UndefOr[String] = js.undefined
}
object Container {
  
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[EnvVar]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvFrom(value: js.Array[EnvFromSource]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvFromUndefined: Self = StObject.set(x, "envFrom", js.undefined)
    
    @scala.inline
    def setEnvFromVarargs(value: EnvFromSource*): Self = StObject.set(x, "envFrom", js.Array(value :_*))
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: EnvVar*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullPolicy(value: String): Self = StObject.set(x, "imagePullPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullPolicyUndefined: Self = StObject.set(x, "imagePullPolicy", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLivenessProbe(value: Probe): Self = StObject.set(x, "livenessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivenessProbeUndefined: Self = StObject.set(x, "livenessProbe", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPorts(value: js.Array[ContainerPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: ContainerPort*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setReadinessProbe(value: Probe): Self = StObject.set(x, "readinessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadinessProbeUndefined: Self = StObject.set(x, "readinessProbe", js.undefined)
    
    @scala.inline
    def setResources(value: ResourceRequirements): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setSecurityContext(value: SecurityContext): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityContextUndefined: Self = StObject.set(x, "securityContext", js.undefined)
    
    @scala.inline
    def setTerminationMessagePath(value: String): Self = StObject.set(x, "terminationMessagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationMessagePathUndefined: Self = StObject.set(x, "terminationMessagePath", js.undefined)
    
    @scala.inline
    def setTerminationMessagePolicy(value: String): Self = StObject.set(x, "terminationMessagePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationMessagePolicyUndefined: Self = StObject.set(x, "terminationMessagePolicy", js.undefined)
    
    @scala.inline
    def setVolumeMounts(value: js.Array[VolumeMount]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeMountsUndefined: Self = StObject.set(x, "volumeMounts", js.undefined)
    
    @scala.inline
    def setVolumeMountsVarargs(value: VolumeMount*): Self = StObject.set(x, "volumeMounts", js.Array(value :_*))
    
    @scala.inline
    def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
  }
}
