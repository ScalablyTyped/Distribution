package typings.naverDashWhale.whaleNs.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemOptions extends js.Object {
  /** Additional details about this item. */
  var message: String
  /** Title of one item of a list notification. */
  var title: String
}

object ItemOptions {
  @scala.inline
  def apply(message: String, title: String): ItemOptions = {
    val __obj = js.Dynamic.literal(message = message, title = title)
  
    __obj.asInstanceOf[ItemOptions]
  }
}

