package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * By default, after an action fails, no further actions are run. This flag indicates that this action must be run even if the pipeline has already failed. This is useful for actions
    * that copy output files off of the VM or for debugging. Note that no actions will be run if image prefetching fails.
    */
  var alwaysRun: js.UndefOr[Boolean] = js.undefined
  
  /** Prevents the container from accessing the external network. */
  var blockExternalNetwork: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If specified, overrides the `CMD` specified in the container. If the container also has an `ENTRYPOINT` the values are used as entrypoint arguments. Otherwise, they are used as a
    * command and arguments to run inside the container.
    */
  var commands: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An optional name for the container. The container hostname will be set to this name, making it useful for inter-container communication. The name must contain only upper and
    * lowercase alphanumeric characters and hyphens and cannot start with a hyphen.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * If the specified image is hosted on a private registry other than Google Container Registry, the credentials required to pull the image must be specified here as an encrypted
    * secret. The secret must decrypt to a JSON-encoded dictionary containing both `username` and `password` keys.
    */
  var credentials: js.UndefOr[Secret] = js.undefined
  
  /**
    * All container images are typically downloaded before any actions are executed. This helps prevent typos in URIs or issues like lack of disk space from wasting large amounts of
    * compute resources. If set, this flag prevents the worker from downloading the image until just before the action is executed.
    */
  var disableImagePrefetch: js.UndefOr[Boolean] = js.undefined
  
  /** A small portion of the container's standard error stream is typically captured and returned inside the `ContainerStoppedEvent`. Setting this flag disables this functionality. */
  var disableStandardErrorCapture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable access to the FUSE device for this action. Filesystems can then be mounted into disks shared with other actions. The other actions do not need the `enable_fuse` flag to
    * access the mounted filesystem. This has the effect of causing the container to be executed with `CAP_SYS_ADMIN` and exposes `/dev/fuse` to the container, so use it only for
    * containers you trust.
    */
  var enableFuse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The encrypted environment to pass into the container. This environment is merged with values specified in the google.cloud.lifesciences.v2beta.Pipeline message, overwriting any
    * duplicate values. The secret must decrypt to a JSON-encoded dictionary where key-value pairs serve as environment variable names and their values. The decoded environment variables
    * can overwrite the values specified by the `environment` field.
    */
  var encryptedEnvironment: js.UndefOr[Secret] = js.undefined
  
  /** If specified, overrides the `ENTRYPOINT` specified in the container. */
  var entrypoint: js.UndefOr[String] = js.undefined
  
  /**
    * The environment to pass into the container. This environment is merged with values specified in the google.cloud.lifesciences.v2beta.Pipeline message, overwriting any duplicate
    * values. In addition to the values passed here, a few other values are automatically injected into the environment. These cannot be hidden or overwritten. `GOOGLE_PIPELINE_FAILED`
    * will be set to "1" if the pipeline failed because an action has exited with a non-zero status (and did not have the `IGNORE_EXIT_STATUS` flag set). This can be used to determine if
    * additional debug or logging actions should execute. `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last non-background action that executed. This can be used by
    * workflow engine authors to determine whether an individual action has succeeded or failed.
    */
  var environment: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Normally, a non-zero exit status causes the pipeline to fail. This flag allows execution of other actions to continue instead. */
  var ignoreExitStatus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The URI to pull the container image from. Note that all images referenced by actions in the pipeline are pulled before the first action runs. If multiple actions reference
    * the same image, it is only pulled once, ensuring that the same image is used for all actions in a single pipeline. The image URI can be either a complete host and image
    * specification (e.g., quay.io/biocontainers/samtools), a library and image name (e.g., google/cloud-sdk) or a bare image name ('bash') to pull from the default library. No schema is
    * required in any of these cases. If the specified image is not public, the service account specified for the Virtual Machine must have access to pull the images from GCR, or
    * appropriate credentials must be specified in the google.cloud.lifesciences.v2beta.Action.credentials field.
    */
  var imageUri: js.UndefOr[String] = js.undefined
  
  /**
    * Labels to associate with the action. This field is provided to assist workflow engine authors in identifying actions (for example, to indicate what sort of action they perform, such
    * as localization or debugging). They are returned in the operation metadata, but are otherwise ignored.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * A list of mounts to make available to the action. In addition to the values specified here, every action has a special virtual disk mounted under `/google` that contains log files
    * and other operational components. - /google/logs All logs written during the pipeline execution. - /google/logs/output The combined standard output and standard error of all actions
    * run as part of the pipeline execution. - /google/logs/action/ *‍/stdout The complete contents of each individual action's standard output. - /google/logs/action/ *‍/stderr The
    * complete contents of each individual action's standard error output.
    */
  var mounts: js.UndefOr[js.Array[Mount]] = js.undefined
  
  /**
    * An optional identifier for a PID namespace to run the action inside. Multiple actions should use the same string to share a namespace. If unspecified, a separate isolated namespace
    * is used.
    */
  var pidNamespace: js.UndefOr[String] = js.undefined
  
  /**
    * A map of containers to host port mappings for this container. If the container already specifies exposed ports, use the `PUBLISH_EXPOSED_PORTS` flag instead. The host port number
    * must be less than 65536. If it is zero, an unused random port is assigned. To determine the resulting port number, consult the `ContainerStartedEvent` in the operation metadata.
    */
  var portMappings: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: number} */ js.Any
  ] = js.undefined
  
  /** Exposes all ports specified by `EXPOSE` statements in the container. To discover the host side port numbers, consult the `ACTION_STARTED` event in the operation metadata. */
  var publishExposedPorts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This flag allows an action to continue running in the background while executing subsequent actions. This is useful to provide services to other actions (or to provide debugging
    * support tools like SSH servers).
    */
  var runInBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum amount of time to give the action to complete. If the action fails to complete before the timeout, it will be terminated and the exit status will be non-zero. The
    * pipeline will continue or terminate based on the rules defined by the `ALWAYS_RUN` and `IGNORE_EXIT_STATUS` flags.
    */
  var timeout: js.UndefOr[String] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAlwaysRun(value: Boolean): Self = StObject.set(x, "alwaysRun", value.asInstanceOf[js.Any])
    
    inline def setAlwaysRunUndefined: Self = StObject.set(x, "alwaysRun", js.undefined)
    
    inline def setBlockExternalNetwork(value: Boolean): Self = StObject.set(x, "blockExternalNetwork", value.asInstanceOf[js.Any])
    
    inline def setBlockExternalNetworkUndefined: Self = StObject.set(x, "blockExternalNetwork", js.undefined)
    
    inline def setCommands(value: js.Array[String]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: String*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setCredentials(value: Secret): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setDisableImagePrefetch(value: Boolean): Self = StObject.set(x, "disableImagePrefetch", value.asInstanceOf[js.Any])
    
    inline def setDisableImagePrefetchUndefined: Self = StObject.set(x, "disableImagePrefetch", js.undefined)
    
    inline def setDisableStandardErrorCapture(value: Boolean): Self = StObject.set(x, "disableStandardErrorCapture", value.asInstanceOf[js.Any])
    
    inline def setDisableStandardErrorCaptureUndefined: Self = StObject.set(x, "disableStandardErrorCapture", js.undefined)
    
    inline def setEnableFuse(value: Boolean): Self = StObject.set(x, "enableFuse", value.asInstanceOf[js.Any])
    
    inline def setEnableFuseUndefined: Self = StObject.set(x, "enableFuse", js.undefined)
    
    inline def setEncryptedEnvironment(value: Secret): Self = StObject.set(x, "encryptedEnvironment", value.asInstanceOf[js.Any])
    
    inline def setEncryptedEnvironmentUndefined: Self = StObject.set(x, "encryptedEnvironment", js.undefined)
    
    inline def setEntrypoint(value: String): Self = StObject.set(x, "entrypoint", value.asInstanceOf[js.Any])
    
    inline def setEntrypointUndefined: Self = StObject.set(x, "entrypoint", js.undefined)
    
    inline def setEnvironment(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setIgnoreExitStatus(value: Boolean): Self = StObject.set(x, "ignoreExitStatus", value.asInstanceOf[js.Any])
    
    inline def setIgnoreExitStatusUndefined: Self = StObject.set(x, "ignoreExitStatus", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMounts(value: js.Array[Mount]): Self = StObject.set(x, "mounts", value.asInstanceOf[js.Any])
    
    inline def setMountsUndefined: Self = StObject.set(x, "mounts", js.undefined)
    
    inline def setMountsVarargs(value: Mount*): Self = StObject.set(x, "mounts", js.Array(value*))
    
    inline def setPidNamespace(value: String): Self = StObject.set(x, "pidNamespace", value.asInstanceOf[js.Any])
    
    inline def setPidNamespaceUndefined: Self = StObject.set(x, "pidNamespace", js.undefined)
    
    inline def setPortMappings(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: number} */ js.Any
    ): Self = StObject.set(x, "portMappings", value.asInstanceOf[js.Any])
    
    inline def setPortMappingsUndefined: Self = StObject.set(x, "portMappings", js.undefined)
    
    inline def setPublishExposedPorts(value: Boolean): Self = StObject.set(x, "publishExposedPorts", value.asInstanceOf[js.Any])
    
    inline def setPublishExposedPortsUndefined: Self = StObject.set(x, "publishExposedPorts", js.undefined)
    
    inline def setRunInBackground(value: Boolean): Self = StObject.set(x, "runInBackground", value.asInstanceOf[js.Any])
    
    inline def setRunInBackgroundUndefined: Self = StObject.set(x, "runInBackground", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
