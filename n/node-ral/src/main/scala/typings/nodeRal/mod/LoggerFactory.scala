package typings.nodeRal.mod

import typings.nodeRal.anon.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerFactory extends js.Object {
  
  def apply(prefix: String): RalLogger = js.native
  
  var options: App = js.native
}
