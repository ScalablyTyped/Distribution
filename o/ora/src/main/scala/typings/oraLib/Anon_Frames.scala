package typings
package oraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Frames extends js.Object {
  var frames: js.Array[java.lang.String]
  var interval: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Frames {
  @scala.inline
  def apply(frames: js.Array[java.lang.String], interval: scala.Int | scala.Double = null): Anon_Frames = {
    val __obj = js.Dynamic.literal(frames = frames)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Frames]
  }
}

