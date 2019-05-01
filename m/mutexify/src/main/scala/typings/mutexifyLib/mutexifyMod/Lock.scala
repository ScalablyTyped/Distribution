package typings
package mutexifyLib.mutexifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lock extends js.Object {
  var locked: scala.Boolean = js.native
  def apply(fn: Release): scala.Double = js.native
}

