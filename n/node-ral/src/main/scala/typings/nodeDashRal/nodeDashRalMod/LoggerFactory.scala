package typings.nodeDashRal.nodeDashRalMod

import typings.nodeDashRal.Anon_App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerFactory extends js.Object {
  var options: Anon_App = js.native
  def apply(prefix: String): RalLogger = js.native
}

