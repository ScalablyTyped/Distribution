package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSrc extends js.Object {
  var src: js.UndefOr[String] = js.undefined
}

object AnonSrc {
  @scala.inline
  def apply(src: String = null): AnonSrc = {
    val __obj = js.Dynamic.literal()
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSrc]
  }
}

