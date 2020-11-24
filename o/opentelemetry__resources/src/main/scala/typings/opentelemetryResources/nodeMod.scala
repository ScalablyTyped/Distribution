package typings.opentelemetryResources

import typings.opentelemetryResources.configMod.ResourceDetectionConfig
import typings.opentelemetryResources.envDetectorMod.EnvDetector_
import typings.opentelemetryResources.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/resources/build/src/platform/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  
  def detectResources(): js.Promise[Resource] = js.native
  def detectResources(config: ResourceDetectionConfig): js.Promise[Resource] = js.native
  
  val envDetector: EnvDetector_ = js.native
}
