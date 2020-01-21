package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransform extends js.Object {
  var transform: js.UndefOr[js.Function] = js.undefined
}

object AnonTransform {
  @scala.inline
  def apply(transform: js.Function = null): AnonTransform = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransform]
  }
}

