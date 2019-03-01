package typings
package pluploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_queue_progress extends js.Object {
  var bytesPerSec: scala.Double
  var failed: scala.Double
  var loaded: scala.Double
  var percent: scala.Double
  var queued: scala.Double
  var size: scala.Double
  var uploaded: scala.Double
  def reset(): scala.Unit
}

object plupload_queue_progress {
  @scala.inline
  def apply(
    bytesPerSec: scala.Double,
    failed: scala.Double,
    loaded: scala.Double,
    percent: scala.Double,
    queued: scala.Double,
    reset: js.Function0[scala.Unit],
    size: scala.Double,
    uploaded: scala.Double
  ): plupload_queue_progress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesPerSec")(bytesPerSec)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("percent")(percent)
    __obj.updateDynamic("queued")(queued)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uploaded")(uploaded)
    __obj.asInstanceOf[plupload_queue_progress]
  }
}

