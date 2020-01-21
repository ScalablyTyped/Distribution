package typings.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDbRef extends js.Object {
  @JSName("#dbRef")
  var NumbersigndbRef: Double
}

object AnonDbRef {
  @scala.inline
  def apply(NumbersigndbRef: Double): AnonDbRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("#dbRef")(NumbersigndbRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDbRef]
  }
}

