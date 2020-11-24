package typings.opentelemetryResources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/resources/build/src/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  @js.native
  object CLOUD_RESOURCE extends js.Object {
    
    /** The cloud account id used to identify different entities. */
    var ACCOUNT_ID: String = js.native
    
    /** Name of the cloud provider. Example values are aws, azure, gcp. */
    var PROVIDER: String = js.native
    
    /** A specific geographical location where different entities can run. */
    var REGION: String = js.native
    
    /** Zones are a sub set of the region connected through low-latency links. */
    var ZONE: String = js.native
  }
  
  @js.native
  object CONTAINER_RESOURCE extends js.Object {
    
    /** The name of the image the container was built on. */
    var IMAGE_NAME: String = js.native
    
    /** The container image tag. */
    var IMAGE_TAG: String = js.native
    
    /** The container name. */
    var NAME: String = js.native
  }
  
  @js.native
  object HOST_RESOURCE extends js.Object {
    
    /**
      * Hostname of the host. It contains what the hostname command returns on the
      * host machine.
      */
    var HOSTNAME: String = js.native
    
    /**
      * Unique host id. For Cloud this must be the instance_id assigned by the
      * cloud provider
      */
    var ID: String = js.native
    
    /** VM image id. For Cloud, this value is from the provider. */
    var IMAGE_ID: String = js.native
    
    /** Name of the VM image or OS install the host was instantiated from. */
    var IMAGE_NAME: String = js.native
    
    /** The version string of the VM image */
    var IMAGE_VERSION: String = js.native
    
    /**
      * Name of the host. It may contain what hostname returns on Unix systems,
      * the fully qualified, or a name specified by the user.
      */
    var NAME: String = js.native
    
    /** Type of host. For Cloud this must be the machine type.*/
    var TYPE: String = js.native
  }
  
  @js.native
  object K8S_RESOURCE extends js.Object {
    
    /** The name of the cluster that the pod is running in. */
    var CLUSTER_NAME: String = js.native
    
    /** The name of the deployment. */
    var DEPLOYMENT_NAME: String = js.native
    
    /** The name of the namespace that the pod is running in. */
    var NAMESPACE_NAME: String = js.native
    
    /** The name of the pod. */
    var POD_NAME: String = js.native
  }
  
  @js.native
  object SERVICE_RESOURCE extends js.Object {
    
    /** The string ID of the service instance. */
    var INSTANCE_ID: String = js.native
    
    /** Logical name of the service.  */
    var NAME: String = js.native
    
    /** A namespace for `service.name`. */
    var NAMESPACE: String = js.native
    
    /** The version string of the service API or implementation. */
    var VERSION: String = js.native
  }
  
  @js.native
  object TELEMETRY_SDK_RESOURCE extends js.Object {
    
    /** The language of telemetry library and of the code instrumented with it. */
    var LANGUAGE: String = js.native
    
    /** The name of the telemetry library. */
    var NAME: String = js.native
    
    /** The version string of the telemetry library */
    var VERSION: String = js.native
  }
}
