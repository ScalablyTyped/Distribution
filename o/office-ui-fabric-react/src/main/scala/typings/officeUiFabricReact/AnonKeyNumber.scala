package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyNumber extends js.Object {
  var key: js.UndefOr[String | Double] = js.undefined
}

object AnonKeyNumber {
  @scala.inline
  def apply(key: String | Double = null): AnonKeyNumber = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyNumber]
  }
}

