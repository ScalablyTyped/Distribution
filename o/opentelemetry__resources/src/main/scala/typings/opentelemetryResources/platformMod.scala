package typings.opentelemetryResources

import typings.opentelemetryResources.configMod.ResourceDetectionConfig
import typings.opentelemetryResources.envDetectorMod.EnvDetector_
import typings.opentelemetryResources.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def detectResources(): js.Promise[Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")().asInstanceOf[js.Promise[Resource]]
  @scala.inline
  def detectResources(config: ResourceDetectionConfig): js.Promise[Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Resource]]
  
  @JSImport("@opentelemetry/resources/build/src/platform", "envDetector")
  @js.native
  val envDetector: EnvDetector_ = js.native
}
