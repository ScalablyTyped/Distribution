package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPopoverItem extends js.Object {
  var text: java.lang.String
  var value: java.lang.String
}

object PhononPopoverItem {
  @scala.inline
  def apply(text: java.lang.String, value: java.lang.String): PhononPopoverItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PhononPopoverItem]
  }
}

