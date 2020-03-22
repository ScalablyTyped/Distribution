package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional optional parameters that may be used in graphs.
  */
trait GraphParameters extends js.Object {
  @JSName("#dbRef")
  var NumbersigndbRef: js.UndefOr[MaybeCompositeId] = js.undefined
  @JSName("#id")
  var Numbersignid: js.UndefOr[String] = js.undefined
  @JSName("#ref")
  var Numbersignref: js.UndefOr[String] = js.undefined
}

object GraphParameters {
  @scala.inline
  def apply(
    NumbersigndbRef: MaybeCompositeId = null,
    Numbersignid: String = null,
    Numbersignref: String = null
  ): GraphParameters = {
    val __obj = js.Dynamic.literal()
    if (NumbersigndbRef != null) __obj.updateDynamic("#dbRef")(NumbersigndbRef.asInstanceOf[js.Any])
    if (Numbersignid != null) __obj.updateDynamic("#id")(Numbersignid.asInstanceOf[js.Any])
    if (Numbersignref != null) __obj.updateDynamic("#ref")(Numbersignref.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphParameters]
  }
}

