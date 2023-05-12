package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcConfigMod.ResourceDetectionConfig
import typings.opentelemetryResources.buildSrcDetectorsBrowserDetectorMod.BrowserDetector_
import typings.opentelemetryResources.buildSrcDetectorsBrowserDetectorSyncMod.BrowserDetectorSync_
import typings.opentelemetryResources.buildSrcDetectorsEnvDetectorMod.EnvDetector_
import typings.opentelemetryResources.buildSrcDetectorsEnvDetectorSyncMod.EnvDetectorSync_
import typings.opentelemetryResources.buildSrcIresourceMod.IResource
import typings.opentelemetryResources.buildSrcPlatformNodeHostDetectorMod.HostDetector_
import typings.opentelemetryResources.buildSrcPlatformNodeHostDetectorSyncMod.HostDetectorSync_
import typings.opentelemetryResources.buildSrcPlatformNodeOsdetectorMod.OSDetector_
import typings.opentelemetryResources.buildSrcPlatformNodeOsdetectorsyncMod.OSDetectorSync_
import typings.opentelemetryResources.buildSrcPlatformNodeProcessDetectorMod.ProcessDetector_
import typings.opentelemetryResources.buildSrcPlatformNodeProcessDetectorSyncMod.ProcessDetectorSync_
import typings.opentelemetryResources.buildSrcTypesMod.ResourceAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/resources", "Resource")
  @js.native
  open class Resource protected ()
    extends typings.opentelemetryResources.buildSrcResourceMod.Resource {
    def this(/**
      * A dictionary of attributes with string keys and values that provide
      * information about the entity as numbers, strings or booleans
      * TODO: Consider to add check/validation on attributes.
      */
    attributes: ResourceAttributes) = this()
    def this(
      /**
      * A dictionary of attributes with string keys and values that provide
      * information about the entity as numbers, strings or booleans
      * TODO: Consider to add check/validation on attributes.
      */
    attributes: ResourceAttributes,
      asyncAttributesPromise: js.Promise[ResourceAttributes]
    ) = this()
  }
  /* static members */
  object Resource {
    
    @JSImport("@opentelemetry/resources", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a Resource that identifies the SDK in use.
      */
    inline def default(): IResource = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[IResource]
    
    @JSImport("@opentelemetry/resources", "Resource.EMPTY")
    @js.native
    val EMPTY: typings.opentelemetryResources.buildSrcResourceMod.Resource = js.native
    
    /**
      * Returns an empty Resource
      */
    inline def empty(): IResource = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[IResource]
  }
  
  @JSImport("@opentelemetry/resources", "browserDetector")
  @js.native
  val browserDetector: BrowserDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "browserDetectorSync")
  @js.native
  val browserDetectorSync: BrowserDetectorSync_ = js.native
  
  inline def defaultServiceName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultServiceName")().asInstanceOf[String]
  
  inline def detectResources(): js.Promise[IResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")().asInstanceOf[js.Promise[IResource]]
  inline def detectResources(config: ResourceDetectionConfig): js.Promise[IResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResource]]
  
  inline def detectResourcesSync(): IResource = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResourcesSync")().asInstanceOf[IResource]
  inline def detectResourcesSync(config: ResourceDetectionConfig): IResource = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResourcesSync")(config.asInstanceOf[js.Any]).asInstanceOf[IResource]
  
  @JSImport("@opentelemetry/resources", "envDetector")
  @js.native
  val envDetector: EnvDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "envDetectorSync")
  @js.native
  val envDetectorSync: EnvDetectorSync_ = js.native
  
  @JSImport("@opentelemetry/resources", "hostDetector")
  @js.native
  val hostDetector: HostDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "hostDetectorSync")
  @js.native
  val hostDetectorSync: HostDetectorSync_ = js.native
  
  @JSImport("@opentelemetry/resources", "osDetector")
  @js.native
  val osDetector: OSDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "osDetectorSync")
  @js.native
  val osDetectorSync: OSDetectorSync_ = js.native
  
  @JSImport("@opentelemetry/resources", "processDetector")
  @js.native
  val processDetector: ProcessDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "processDetectorSync")
  @js.native
  val processDetectorSync: ProcessDetectorSync_ = js.native
}
