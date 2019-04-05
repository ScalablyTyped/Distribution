package typings
package oraLib.oraMod.oraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spinner extends js.Object {
  val frames: js.Array[java.lang.String]
  val interval: js.UndefOr[scala.Double] = js.undefined
}

object Spinner {
  @scala.inline
  def apply(frames: js.Array[java.lang.String], interval: scala.Int | scala.Double = null): Spinner = {
    val __obj = js.Dynamic.literal(frames = frames)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spinner]
  }
}

