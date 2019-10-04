package typings.nodeDashOpenload.nodeDashOpenloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProgress extends js.Object {
  var percent: Double
  var total: Double
  var transferred: Double
}

object UploadProgress {
  @scala.inline
  def apply(percent: Double, total: Double, transferred: Double): UploadProgress = {
    val __obj = js.Dynamic.literal(percent = percent, total = total, transferred = transferred)
  
    __obj.asInstanceOf[UploadProgress]
  }
}

