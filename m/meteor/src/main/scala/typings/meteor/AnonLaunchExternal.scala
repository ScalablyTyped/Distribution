package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLaunchExternal extends js.Object {
  var launchExternal: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonLaunchExternal {
  @scala.inline
  def apply(launchExternal: js.UndefOr[Boolean] = js.undefined, `type`: String = null): AnonLaunchExternal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(launchExternal)) __obj.updateDynamic("launchExternal")(launchExternal.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLaunchExternal]
  }
}

