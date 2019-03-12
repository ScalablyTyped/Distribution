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
    reset: () => scala.Unit,
    size: scala.Double,
    uploaded: scala.Double
  ): plupload_queue_progress = {
    val __obj = js.Dynamic.literal(bytesPerSec = bytesPerSec, failed = failed, loaded = loaded, percent = percent, queued = queued, reset = js.Any.fromFunction0(reset), size = size, uploaded = uploaded)
  
    __obj.asInstanceOf[plupload_queue_progress]
  }
}

