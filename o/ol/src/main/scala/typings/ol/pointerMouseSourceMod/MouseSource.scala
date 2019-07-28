package typings.ol.pointerMouseSourceMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseSource
  extends typings.ol.pointerEventSourceMod.default {
  def cancel(inEvent: Event): Unit = js.native
  def cleanupMouse(): Unit = js.native
}

