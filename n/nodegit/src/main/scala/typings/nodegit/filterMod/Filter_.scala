package typings.nodegit.filterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/filter", "Filter")
@js.native
class Filter_ () extends js.Object {
  var attributes: String = js.native
  var stream: js.Function = js.native
  var version: Double = js.native
  def lookup(name: String): Filter = js.native
  def register(name: String, priority: Double): Double = js.native
}

