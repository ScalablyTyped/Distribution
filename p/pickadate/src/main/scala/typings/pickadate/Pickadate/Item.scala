package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /**
    * The "pick" value used for comparisons.
    */
  var pick: Double
}

object Item {
  @scala.inline
  def apply(pick: Double): Item = {
    val __obj = js.Dynamic.literal(pick = pick)
  
    __obj.asInstanceOf[Item]
  }
}

