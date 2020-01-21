package typings.pendoIoBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdString extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object AnonIdString {
  @scala.inline
  def apply(id: String = null): AnonIdString = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdString]
  }
}

