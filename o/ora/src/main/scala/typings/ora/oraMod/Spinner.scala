package typings.ora.oraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spinner extends js.Object {
  val frames: js.Array[String]
  val interval: js.UndefOr[Double] = js.undefined
}

object Spinner {
  @scala.inline
  def apply(frames: js.Array[String], interval: Int | Double = null): Spinner = {
    val __obj = js.Dynamic.literal(frames = frames)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spinner]
  }
}

