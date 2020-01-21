package typings.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  @JSName("#id")
  var Numbersignid: js.UndefOr[String] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(Numbersignid: String = null): AnonId = {
    val __obj = js.Dynamic.literal()
    if (Numbersignid != null) __obj.updateDynamic("#id")(Numbersignid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

