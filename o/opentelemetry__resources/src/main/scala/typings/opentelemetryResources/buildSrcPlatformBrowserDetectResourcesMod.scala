package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcConfigMod.ResourceDetectionConfig
import typings.opentelemetryResources.buildSrcResourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformBrowserDetectResourcesMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser/detect-resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectResources(): js.Promise[Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")().asInstanceOf[js.Promise[Resource]]
  inline def detectResources(config: ResourceDetectionConfig): js.Promise[Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Resource]]
}
