package typings
package olLib.pointerMouseSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseSource
  extends olLib.pointerEventSourceMod.default {
  def cancel(inEvent: stdLib.Event): scala.Unit = js.native
  def cleanupMouse(): scala.Unit = js.native
}

