package typings.opentelemetryResources

import typings.opentelemetryResources.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/resources/build/src/platform/browser/detect-resources", JSImport.Namespace)
@js.native
object detectResourcesMod extends js.Object {
  
  def detectResources(): js.Promise[Resource] = js.native
}
