package typings.parse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceSecure extends js.Object {
  var forceSecure: js.UndefOr[Boolean] = js.undefined
}

object ForceSecure {
  @scala.inline
  def apply(forceSecure: js.UndefOr[Boolean] = js.undefined): ForceSecure = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceSecure)) __obj.updateDynamic("forceSecure")(forceSecure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceSecure]
  }
}

