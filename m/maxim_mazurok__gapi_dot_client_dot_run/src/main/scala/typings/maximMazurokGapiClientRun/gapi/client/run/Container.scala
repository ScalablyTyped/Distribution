package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
  /**
    * (Optional) Cloud Run fully managed: supported Cloud Run for Anthos: supported Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable
    * references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax
    * can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  var command: js.UndefOr[js.Array[String]] = js.native
  
  /** (Optional) Cloud Run fully managed: supported Cloud Run for Anthos: supported List of environment variables to set in the container. */
  var env: js.UndefOr[js.Array[EnvVar]] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported List of sources to populate environment variables in the container. The keys defined within a
    * source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the
    * last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
    */
  var envFrom: js.UndefOr[js.Array[EnvFromSource]] = js.native
  
  /**
    * Cloud Run fully managed: only supports containers from Google Container Registry Cloud Run for Anthos: supported URL of the Container image. More info:
    * https://kubernetes.io/docs/concepts/containers/images
    */
  var image: js.UndefOr[String] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is
    * specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: js.UndefOr[String] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Periodic probe of container liveness. Container will be restarted if the probe fails. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var livenessProbe: js.UndefOr[Probe] = js.native
  
  /** (Optional) Name of the container specified as a DNS_LABEL. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to
    * be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
    */
  var ports: js.UndefOr[js.Array[ContainerPort]] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Periodic probe of container service readiness. Container will be removed from service endpoints if
    * the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var readinessProbe: js.UndefOr[Probe] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: supported Cloud Run for Anthos: supported Compute Resources required by this container. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  var resources: js.UndefOr[ResourceRequirements] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Security options the pod should run with. More info:
    * https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var securityContext: js.UndefOr[SecurityContext] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Path at which the file to which the container's termination message will be written is mounted into
    * the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The
    * total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
    */
  var terminationMessagePath: js.UndefOr[String] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Indicate how the termination message should be populated. File will use the contents of
    * terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination
    * message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
    */
  var terminationMessagePolicy: js.UndefOr[String] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Pod volumes to mount into the container's filesystem. */
  var volumeMounts: js.UndefOr[js.Array[VolumeMount]] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Container's working directory. If not specified, the container runtime's default will be used,
    * which might be configured in the container image.
    */
  var workingDir: js.UndefOr[String] = js.native
}
object Container {
  
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = this.set("command", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: EnvVar*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[EnvVar]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setEnvFromVarargs(value: EnvFromSource*): Self = this.set("envFrom", js.Array(value :_*))
    
    @scala.inline
    def setEnvFrom(value: js.Array[EnvFromSource]): Self = this.set("envFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvFrom: Self = this.set("envFrom", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImagePullPolicy(value: String): Self = this.set("imagePullPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePullPolicy: Self = this.set("imagePullPolicy", js.undefined)
    
    @scala.inline
    def setLivenessProbe(value: Probe): Self = this.set("livenessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLivenessProbe: Self = this.set("livenessProbe", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: ContainerPort*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[ContainerPort]): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
    
    @scala.inline
    def setReadinessProbe(value: Probe): Self = this.set("readinessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadinessProbe: Self = this.set("readinessProbe", js.undefined)
    
    @scala.inline
    def setResources(value: ResourceRequirements): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setSecurityContext(value: SecurityContext): Self = this.set("securityContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityContext: Self = this.set("securityContext", js.undefined)
    
    @scala.inline
    def setTerminationMessagePath(value: String): Self = this.set("terminationMessagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminationMessagePath: Self = this.set("terminationMessagePath", js.undefined)
    
    @scala.inline
    def setTerminationMessagePolicy(value: String): Self = this.set("terminationMessagePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminationMessagePolicy: Self = this.set("terminationMessagePolicy", js.undefined)
    
    @scala.inline
    def setVolumeMountsVarargs(value: VolumeMount*): Self = this.set("volumeMounts", js.Array(value :_*))
    
    @scala.inline
    def setVolumeMounts(value: js.Array[VolumeMount]): Self = this.set("volumeMounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeMounts: Self = this.set("volumeMounts", js.undefined)
    
    @scala.inline
    def setWorkingDir(value: String): Self = this.set("workingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingDir: Self = this.set("workingDir", js.undefined)
  }
}
