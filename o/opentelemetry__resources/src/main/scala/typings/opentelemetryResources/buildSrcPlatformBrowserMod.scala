package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcConfigMod.ResourceDetectionConfig
import typings.opentelemetryResources.buildSrcDetectorsNoopDetectorMod.NoopDetector_
import typings.opentelemetryResources.buildSrcResourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformBrowserMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultServiceName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultServiceName")().asInstanceOf[String]
  
  inline def detectResources(): js.Promise[Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")().asInstanceOf[js.Promise[Resource]]
  inline def detectResources(config: ResourceDetectionConfig): js.Promise[Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Resource]]
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", "hostDetector")
  @js.native
  val hostDetector: NoopDetector_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", "osDetector")
  @js.native
  val osDetector: NoopDetector_ = js.native
}
