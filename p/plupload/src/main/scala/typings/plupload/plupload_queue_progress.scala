package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_queue_progress extends js.Object {
  var bytesPerSec: Double
  var failed: Double
  var loaded: Double
  var percent: Double
  var queued: Double
  var size: Double
  var uploaded: Double
  def reset(): Unit
}

object plupload_queue_progress {
  @scala.inline
  def apply(
    bytesPerSec: Double,
    failed: Double,
    loaded: Double,
    percent: Double,
    queued: Double,
    reset: () => Unit,
    size: Double,
    uploaded: Double
  ): plupload_queue_progress = {
    val __obj = js.Dynamic.literal(bytesPerSec = bytesPerSec, failed = failed, loaded = loaded, percent = percent, queued = queued, reset = js.Any.fromFunction0(reset), size = size, uploaded = uploaded)
  
    __obj.asInstanceOf[plupload_queue_progress]
  }
}

