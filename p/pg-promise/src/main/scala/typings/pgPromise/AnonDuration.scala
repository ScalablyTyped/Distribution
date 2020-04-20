package typings.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var processed: Double
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, processed: Double): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], processed = processed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
}

