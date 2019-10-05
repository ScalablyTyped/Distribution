package typings.newrelic.newrelicMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newrelic", "addIgnoringRule")
@js.native
object addIgnoringRule extends js.Object {
  def apply(pattern: String): Unit = js.native
  def apply(pattern: RegExp): Unit = js.native
}

