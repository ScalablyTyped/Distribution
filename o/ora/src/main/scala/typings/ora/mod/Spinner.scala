package typings.ora.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spinner extends js.Object {
  val frames: js.Array[String]
  val interval: js.UndefOr[Double] = js.undefined
}

object Spinner {
  @scala.inline
  def apply(frames: js.Array[String], interval: js.UndefOr[Double] = js.undefined): Spinner = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spinner]
  }
}

