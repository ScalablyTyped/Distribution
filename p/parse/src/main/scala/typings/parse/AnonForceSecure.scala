package typings.parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceSecure extends js.Object {
  var forceSecure: js.UndefOr[Boolean] = js.undefined
}

object AnonForceSecure {
  @scala.inline
  def apply(forceSecure: js.UndefOr[Boolean] = js.undefined): AnonForceSecure = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceSecure)) __obj.updateDynamic("forceSecure")(forceSecure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceSecure]
  }
}

