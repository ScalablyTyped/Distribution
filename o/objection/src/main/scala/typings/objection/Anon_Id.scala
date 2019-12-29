package typings.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  @JSName("#id")
  var Numbersignid: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(Numbersignid: String = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (Numbersignid != null) __obj.updateDynamic("#id")(Numbersignid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

