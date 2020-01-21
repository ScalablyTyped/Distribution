package typings.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRef extends js.Object {
  @JSName("#ref")
  var Numbersignref: String
}

object AnonRef {
  @scala.inline
  def apply(Numbersignref: String): AnonRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("#ref")(Numbersignref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRef]
  }
}

