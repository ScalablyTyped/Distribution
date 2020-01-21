package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadQueueProgress extends js.Object {
  var bytesPerSec: Double
  var failed: Double
  var loaded: Double
  var percent: Double
  var queued: Double
  var size: Double
  var uploaded: Double
  def reset(): Unit
}

object pluploadQueueProgress {
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
  ): pluploadQueueProgress = {
    val __obj = js.Dynamic.literal(bytesPerSec = bytesPerSec.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), size = size.asInstanceOf[js.Any], uploaded = uploaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[pluploadQueueProgress]
  }
}

