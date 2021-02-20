package typings.opentelemetryResources

import typings.opentelemetryResources.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", "detectResources")
  @js.native
  def detectResources(): js.Promise[Resource] = js.native
}
