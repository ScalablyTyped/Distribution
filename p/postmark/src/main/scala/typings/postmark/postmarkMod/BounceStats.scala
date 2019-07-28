package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceStats extends js.Object {
  var Count: Double
  var Name: String
  var Type: js.UndefOr[String] = js.undefined
}

object BounceStats {
  @scala.inline
  def apply(Count: Double, Name: String, Type: String = null): BounceStats = {
    val __obj = js.Dynamic.literal(Count = Count, Name = Name)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[BounceStats]
  }
}

