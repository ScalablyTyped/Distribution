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

