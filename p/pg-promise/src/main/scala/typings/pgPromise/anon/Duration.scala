package typings.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: Double
  var processed: Double
}

object Duration {
  @scala.inline
  def apply(duration: Double, processed: Double): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], processed = processed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

