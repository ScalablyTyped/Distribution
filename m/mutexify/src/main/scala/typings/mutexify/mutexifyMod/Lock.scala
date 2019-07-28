package typings.mutexify.mutexifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lock extends js.Object {
  var locked: Boolean = js.native
  def apply(fn: Release): Double = js.native
}

