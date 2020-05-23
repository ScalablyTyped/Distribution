package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchExternal extends js.Object {
  var launchExternal: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object LaunchExternal {
  @scala.inline
  def apply(launchExternal: js.UndefOr[Boolean] = js.undefined, `type`: String = null): LaunchExternal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(launchExternal)) __obj.updateDynamic("launchExternal")(launchExternal.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchExternal]
  }
}

