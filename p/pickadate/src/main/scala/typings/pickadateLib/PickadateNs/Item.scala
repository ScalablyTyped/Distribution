package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /**
    * The "pick" value used for comparisons.
    */
  var pick: scala.Double
}

object Item {
  @scala.inline
  def apply(pick: scala.Double): Item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pick")(pick)
    __obj.asInstanceOf[Item]
  }
}

