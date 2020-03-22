package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(name: String = null, size: Int | Double = null): AnonName = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

