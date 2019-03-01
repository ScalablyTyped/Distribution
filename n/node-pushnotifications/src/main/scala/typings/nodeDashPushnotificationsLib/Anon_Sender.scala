package typings
package nodeDashPushnotificationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sender extends js.Object {
  var sender: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Sender {
  @scala.inline
  def apply(sender: java.lang.String = null): Anon_Sender = {
    val __obj = js.Dynamic.literal()
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[Anon_Sender]
  }
}

