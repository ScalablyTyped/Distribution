package typings
package naverDashWhaleLib.whaleNs.gcmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingMessage extends js.Object {
  /**
    * Optional.
    * The collapse key of a message. See Collapsible Messages section of Cloud Messaging documentation for details.
    */
  var collapseKey: js.UndefOr[java.lang.String] = js.undefined
  /** The message data. */
  var data: js.Object
  /**
    * Optional.
    * The sender who issued the message.
    * @since Since Chrome 41.
    */
  var from: js.UndefOr[java.lang.String] = js.undefined
}

object IncomingMessage {
  @scala.inline
  def apply(data: js.Object, collapseKey: java.lang.String = null, from: java.lang.String = null): IncomingMessage = {
    val __obj = js.Dynamic.literal(data = data)
    if (collapseKey != null) __obj.updateDynamic("collapseKey")(collapseKey)
    if (from != null) __obj.updateDynamic("from")(from)
    __obj.asInstanceOf[IncomingMessage]
  }
}

