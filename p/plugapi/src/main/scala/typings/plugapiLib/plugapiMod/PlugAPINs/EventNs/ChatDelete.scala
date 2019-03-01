package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatDelete extends js.Object {
  var chatID: java.lang.String
  var mi: scala.Double
}

object ChatDelete {
  @scala.inline
  def apply(chatID: java.lang.String, mi: scala.Double): ChatDelete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chatID")(chatID)
    __obj.updateDynamic("mi")(mi)
    __obj.asInstanceOf[ChatDelete]
  }
}

