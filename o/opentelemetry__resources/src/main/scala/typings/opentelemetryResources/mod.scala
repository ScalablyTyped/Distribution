package typings.opentelemetryResources

import typings.opentelemetryResources.configMod.ResourceDetectionConfig
import typings.opentelemetryResources.envDetectorMod.EnvDetector_
import typings.opentelemetryResources.typesMod.ResourceAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CLOUD_RESOURCE {
    
    @JSImport("@opentelemetry/resources", "CLOUD_RESOURCE")
    @js.native
    val ^ : js.Any = js.native
    
    /** The cloud account id used to identify different entities. */
    @JSImport("@opentelemetry/resources", "CLOUD_RESOURCE.ACCOUNT_ID")
    @js.native
    def ACCOUNT_ID: String = js.native
    @scala.inline
    def ACCOUNT_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCOUNT_ID")(x.asInstanceOf[js.Any])
    
    /** Name of the cloud provider. Example values are aws, azure, gcp. */
    @JSImport("@opentelemetry/resources", "CLOUD_RESOURCE.PROVIDER")
    @js.native
    def PROVIDER: String = js.native
    @scala.inline
    def PROVIDER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER")(x.asInstanceOf[js.Any])
    
    /** A specific geographical location where different entities can run. */
    @JSImport("@opentelemetry/resources", "CLOUD_RESOURCE.REGION")
    @js.native
    def REGION: String = js.native
    @scala.inline
    def REGION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGION")(x.asInstanceOf[js.Any])
    
    /** Zones are a sub set of the region connected through low-latency links. */
    @JSImport("@opentelemetry/resources", "CLOUD_RESOURCE.ZONE")
    @js.native
    def ZONE: String = js.native
    @scala.inline
    def ZONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZONE")(x.asInstanceOf[js.Any])
  }
  
  object CONTAINER_RESOURCE {
    
    @JSImport("@opentelemetry/resources", "CONTAINER_RESOURCE")
    @js.native
    val ^ : js.Any = js.native
    
    /** The name of the image the container was built on. */
    @JSImport("@opentelemetry/resources", "CONTAINER_RESOURCE.IMAGE_NAME")
    @js.native
    def IMAGE_NAME: String = js.native
    @scala.inline
    def IMAGE_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_NAME")(x.asInstanceOf[js.Any])
    
    /** The container image tag. */
    @JSImport("@opentelemetry/resources", "CONTAINER_RESOURCE.IMAGE_TAG")
    @js.native
    def IMAGE_TAG: String = js.native
    @scala.inline
    def IMAGE_TAG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_TAG")(x.asInstanceOf[js.Any])
    
    /** The container name. */
    @JSImport("@opentelemetry/resources", "CONTAINER_RESOURCE.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  object HOST_RESOURCE {
    
    @JSImport("@opentelemetry/resources", "HOST_RESOURCE")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Hostname of the host. It contains what the hostname command returns on the
      * host machine.
      */
    @JSImport("@opentelemetry/resources", "HOST_RESOURCE.HOSTNAME")
    @js.native
    def HOSTNAME: String = js.native
    @scala.inline
    def HOSTNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOSTNAME")(x.asInstanceOf[js.Any])
    
    /**
      * Unique host id. For Cloud this must be the instance_id assigned by the
      * cloud provider
      */
    @JSImport("@opentelemetry/resources", "HOST_RESOURCE.ID")
    @js.native
    def ID: String = js.native
    @scala.inline
    def ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ID")(x.asInstanceOf[js.Any])
    
    /** VM image id. For Cloud, this value is from the provider. */
    @JSImport("@opentelemetry/resources", "HOST_RESOURCE.IMAGE_ID")
    @js.native
    def IMAGE_ID: String = js.native
    @scala.inline
    def IMAGE_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_ID")(x.asInstanceOf[js.Any])
    
    /** Name of the VM image or OS install the host was instantiated from. */
    @JSImport("@opentelemetry/resources", "HOST_RESOURCE.IMAGE_NAME")
    @js.native
    def IMAGE_NAME: String = js.native
    @scala.inline
    def IMAGE_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_NAME")(x.asInstanceOf[js.Any])
    
    /** The version string of the VM image */
    @JSImport("@opentelemetry/resources", "HOST_RESOURCE.IMAGE_VERSION")
    @js.native
    def IMAGE_VERSION: String = js.native
    @scala.inline
    def IMAGE_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_VERSION")(x.asInstanceOf[js.Any])
    
    /**
      * Name of the host. It may contain what hostname returns on Unix systems,
      * the fully qualified, or a name specified by the user.
      */
    @JSImport("@opentelemetry/resources", "HOST_RESOURCE.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** Type of host. For Cloud this must be the machine type.*/
    @JSImport("@opentelemetry/resources", "HOST_RESOURCE.TYPE")
    @js.native
    def TYPE: String = js.native
    @scala.inline
    def TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
  }
  
  object K8S_RESOURCE {
    
    @JSImport("@opentelemetry/resources", "K8S_RESOURCE")
    @js.native
    val ^ : js.Any = js.native
    
    /** The name of the cluster that the pod is running in. */
    @JSImport("@opentelemetry/resources", "K8S_RESOURCE.CLUSTER_NAME")
    @js.native
    def CLUSTER_NAME: String = js.native
    @scala.inline
    def CLUSTER_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLUSTER_NAME")(x.asInstanceOf[js.Any])
    
    /** The name of the deployment. */
    @JSImport("@opentelemetry/resources", "K8S_RESOURCE.DEPLOYMENT_NAME")
    @js.native
    def DEPLOYMENT_NAME: String = js.native
    @scala.inline
    def DEPLOYMENT_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEPLOYMENT_NAME")(x.asInstanceOf[js.Any])
    
    /** The name of the namespace that the pod is running in. */
    @JSImport("@opentelemetry/resources", "K8S_RESOURCE.NAMESPACE_NAME")
    @js.native
    def NAMESPACE_NAME: String = js.native
    @scala.inline
    def NAMESPACE_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAMESPACE_NAME")(x.asInstanceOf[js.Any])
    
    /** The name of the pod. */
    @JSImport("@opentelemetry/resources", "K8S_RESOURCE.POD_NAME")
    @js.native
    def POD_NAME: String = js.native
    @scala.inline
    def POD_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POD_NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/resources", "Resource")
  @js.native
  class Resource protected ()
    extends typings.opentelemetryResources.resourceMod.Resource {
    def this(/**
      * A dictionary of attributes with string keys and values that provide
      * information about the entity as numbers, strings or booleans
      * TODO: Consider to add check/validation on attributes.
      */
    attributes: ResourceAttributes) = this()
  }
  /* static members */
  object Resource {
    
    @JSImport("@opentelemetry/resources", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/resources", "Resource.EMPTY")
    @js.native
    val EMPTY: typings.opentelemetryResources.resourceMod.Resource = js.native
    
    /**
      * Returns a Resource that indentifies the SDK in use.
      */
    @scala.inline
    def createTelemetrySDKResource(): typings.opentelemetryResources.resourceMod.Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("createTelemetrySDKResource")().asInstanceOf[typings.opentelemetryResources.resourceMod.Resource]
    
    /**
      * Returns an empty Resource
      */
    @scala.inline
    def empty(): typings.opentelemetryResources.resourceMod.Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.opentelemetryResources.resourceMod.Resource]
  }
  
  object SERVICE_RESOURCE {
    
    @JSImport("@opentelemetry/resources", "SERVICE_RESOURCE")
    @js.native
    val ^ : js.Any = js.native
    
    /** The string ID of the service instance. */
    @JSImport("@opentelemetry/resources", "SERVICE_RESOURCE.INSTANCE_ID")
    @js.native
    def INSTANCE_ID: String = js.native
    @scala.inline
    def INSTANCE_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCE_ID")(x.asInstanceOf[js.Any])
    
    /** Logical name of the service.  */
    @JSImport("@opentelemetry/resources", "SERVICE_RESOURCE.NAME")
    @js.native
    def NAME: String = js.native
    
    /** A namespace for `service.name`. */
    @JSImport("@opentelemetry/resources", "SERVICE_RESOURCE.NAMESPACE")
    @js.native
    def NAMESPACE: String = js.native
    @scala.inline
    def NAMESPACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAMESPACE")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** The version string of the service API or implementation. */
    @JSImport("@opentelemetry/resources", "SERVICE_RESOURCE.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  object TELEMETRY_SDK_RESOURCE {
    
    @JSImport("@opentelemetry/resources", "TELEMETRY_SDK_RESOURCE")
    @js.native
    val ^ : js.Any = js.native
    
    /** The language of telemetry library and of the code instrumented with it. */
    @JSImport("@opentelemetry/resources", "TELEMETRY_SDK_RESOURCE.LANGUAGE")
    @js.native
    def LANGUAGE: String = js.native
    @scala.inline
    def LANGUAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LANGUAGE")(x.asInstanceOf[js.Any])
    
    /** The name of the telemetry library. */
    @JSImport("@opentelemetry/resources", "TELEMETRY_SDK_RESOURCE.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** The version string of the telemetry library */
    @JSImport("@opentelemetry/resources", "TELEMETRY_SDK_RESOURCE.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def detectResources(): js.Promise[typings.opentelemetryResources.resourceMod.Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")().asInstanceOf[js.Promise[typings.opentelemetryResources.resourceMod.Resource]]
  @scala.inline
  def detectResources(config: ResourceDetectionConfig): js.Promise[typings.opentelemetryResources.resourceMod.Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.opentelemetryResources.resourceMod.Resource]]
  
  @JSImport("@opentelemetry/resources", "envDetector")
  @js.native
  val envDetector: EnvDetector_ = js.native
}
