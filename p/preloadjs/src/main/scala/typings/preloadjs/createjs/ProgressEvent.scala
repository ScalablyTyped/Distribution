package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvent extends js.Object {
  // properties
  var loaded: Double
  var progress: Double
  var total: Double
}

object ProgressEvent {
  @scala.inline
  def apply(loaded: Double, progress: Double, total: Double): ProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent]
  }
}

