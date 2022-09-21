package typings.opentelemetryResources

import typings.opentelemetryResources.configMod.ResourceDetectionConfig
import typings.opentelemetryResources.nodeHostDetectorMod.HostDetector_
import typings.opentelemetryResources.nodeOsdetectorMod.OSDetector_
import typings.opentelemetryResources.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultServiceName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultServiceName")().asInstanceOf[String]
  
  inline def detectResources(): js.Promise[Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")().asInstanceOf[js.Promise[Resource]]
  inline def detectResources(config: ResourceDetectionConfig): js.Promise[Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Resource]]
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", "hostDetector")
  @js.native
  val hostDetector: HostDetector_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", "osDetector")
  @js.native
  val osDetector: OSDetector_ = js.native
}
