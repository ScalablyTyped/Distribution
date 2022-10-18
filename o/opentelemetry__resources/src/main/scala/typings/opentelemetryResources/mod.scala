package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcConfigMod.ResourceDetectionConfig
import typings.opentelemetryResources.buildSrcDetectorsBrowserDetectorMod.BrowserDetector_
import typings.opentelemetryResources.buildSrcDetectorsEnvDetectorMod.EnvDetector_
import typings.opentelemetryResources.buildSrcDetectorsProcessDetectorMod.ProcessDetector_
import typings.opentelemetryResources.buildSrcPlatformNodeHostDetectorMod.HostDetector_
import typings.opentelemetryResources.buildSrcPlatformNodeOsdetectorMod.OSDetector_
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
  }
  /* static members */
  object Resource {
    
    @JSImport("@opentelemetry/resources", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a Resource that indentifies the SDK in use.
      */
    inline def default(): typings.opentelemetryResources.buildSrcResourceMod.Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typings.opentelemetryResources.buildSrcResourceMod.Resource]
    
    @JSImport("@opentelemetry/resources", "Resource.EMPTY")
    @js.native
    val EMPTY: typings.opentelemetryResources.buildSrcResourceMod.Resource = js.native
    
    /**
      * Returns an empty Resource
      */
    inline def empty(): typings.opentelemetryResources.buildSrcResourceMod.Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.opentelemetryResources.buildSrcResourceMod.Resource]
  }
  
  @JSImport("@opentelemetry/resources", "browserDetector")
  @js.native
  val browserDetector: BrowserDetector_ = js.native
  
  inline def defaultServiceName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultServiceName")().asInstanceOf[String]
  
  inline def detectResources(): js.Promise[typings.opentelemetryResources.buildSrcResourceMod.Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")().asInstanceOf[js.Promise[typings.opentelemetryResources.buildSrcResourceMod.Resource]]
  inline def detectResources(config: ResourceDetectionConfig): js.Promise[typings.opentelemetryResources.buildSrcResourceMod.Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.opentelemetryResources.buildSrcResourceMod.Resource]]
  
  @JSImport("@opentelemetry/resources", "envDetector")
  @js.native
  val envDetector: EnvDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "hostDetector")
  @js.native
  val hostDetector: HostDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "osDetector")
  @js.native
  val osDetector: OSDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "processDetector")
  @js.native
  val processDetector: ProcessDetector_ = js.native
}
