package typings.opentelemetryResources

import typings.opentelemetryResources.browserDetectorMod.BrowserDetector_
import typings.opentelemetryResources.configMod.ResourceDetectionConfig
import typings.opentelemetryResources.envDetectorMod.EnvDetector_
import typings.opentelemetryResources.nodeHostDetectorMod.HostDetector_
import typings.opentelemetryResources.nodeOsdetectorMod.OSDetector_
import typings.opentelemetryResources.processDetectorMod.ProcessDetector_
import typings.opentelemetryResources.typesMod.ResourceAttributes
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
    
    /**
      * Returns a Resource that indentifies the SDK in use.
      */
    inline def default(): typings.opentelemetryResources.resourceMod.Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typings.opentelemetryResources.resourceMod.Resource]
    
    @JSImport("@opentelemetry/resources", "Resource.EMPTY")
    @js.native
    val EMPTY: typings.opentelemetryResources.resourceMod.Resource = js.native
    
    /**
      * Returns an empty Resource
      */
    inline def empty(): typings.opentelemetryResources.resourceMod.Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.opentelemetryResources.resourceMod.Resource]
  }
  
  @JSImport("@opentelemetry/resources", "browserDetector")
  @js.native
  val browserDetector: BrowserDetector_ = js.native
  
  inline def defaultServiceName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultServiceName")().asInstanceOf[String]
  
  inline def detectResources(): js.Promise[typings.opentelemetryResources.resourceMod.Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")().asInstanceOf[js.Promise[typings.opentelemetryResources.resourceMod.Resource]]
  inline def detectResources(config: ResourceDetectionConfig): js.Promise[typings.opentelemetryResources.resourceMod.Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.opentelemetryResources.resourceMod.Resource]]
  
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
