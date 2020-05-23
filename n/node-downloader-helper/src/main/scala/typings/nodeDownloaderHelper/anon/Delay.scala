package typings.nodeDownloaderHelper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var delay: Double
  var maxRetries: Double
}

object Delay {
  @scala.inline
  def apply(delay: Double, maxRetries: Double): Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
}

