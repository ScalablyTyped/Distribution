package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcConfigMod.ResourceDetectionConfig
import typings.opentelemetryResources.buildSrcIresourceMod.IResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDetectResourcesMod {
  
  @JSImport("@opentelemetry/resources/build/src/detect-resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectResources(): js.Promise[IResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")().asInstanceOf[js.Promise[IResource]]
  inline def detectResources(config: ResourceDetectionConfig): js.Promise[IResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResource]]
  
  inline def detectResourcesSync(): IResource = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResourcesSync")().asInstanceOf[IResource]
  inline def detectResourcesSync(config: ResourceDetectionConfig): IResource = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResourcesSync")(config.asInstanceOf[js.Any]).asInstanceOf[IResource]
}
