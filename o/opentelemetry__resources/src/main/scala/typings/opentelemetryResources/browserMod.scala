package typings.opentelemetryResources

import typings.opentelemetryResources.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/resources/build/src/platform/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  
  def detectResources(): js.Promise[Resource] = js.native
}
