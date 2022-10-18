package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcConfigMod.ResourceDetectionConfig
import typings.opentelemetryResources.buildSrcPlatformNodeHostDetectorMod.HostDetector_
import typings.opentelemetryResources.buildSrcPlatformNodeOsdetectorMod.OSDetector_
import typings.opentelemetryResources.buildSrcResourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeMod {
  
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
