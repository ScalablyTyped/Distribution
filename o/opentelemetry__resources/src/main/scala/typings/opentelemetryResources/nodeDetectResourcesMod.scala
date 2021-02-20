package typings.opentelemetryResources

import typings.opentelemetryResources.configMod.ResourceDetectionConfig
import typings.opentelemetryResources.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeDetectResourcesMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node/detect-resources", "detectResources")
  @js.native
  def detectResources(): js.Promise[Resource] = js.native
  @JSImport("@opentelemetry/resources/build/src/platform/node/detect-resources", "detectResources")
  @js.native
  def detectResources(config: ResourceDetectionConfig): js.Promise[Resource] = js.native
}
