package typings.parents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlatform extends js.Object {
  var platform: js.UndefOr[String] = js.undefined
}

object AnonPlatform {
  @scala.inline
  def apply(platform: String = null): AnonPlatform = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlatform]
  }
}

