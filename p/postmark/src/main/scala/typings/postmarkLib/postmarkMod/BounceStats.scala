package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceStats extends js.Object {
  var Count: scala.Double
  var Name: java.lang.String
  var Type: js.UndefOr[java.lang.String]
}

object BounceStats {
  @scala.inline
  def apply(Count: scala.Double, Name: java.lang.String, Type: java.lang.String = null): BounceStats = {
    val __obj = js.Dynamic.literal(Count = Count, Name = Name)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[BounceStats]
  }
}

