package typings.meteor.meteorMeteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait absoluteUrlOptions extends js.Object {
  var replaceLocalhost: js.UndefOr[Boolean] = js.undefined
  var rootUrl: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object absoluteUrlOptions {
  @scala.inline
  def apply(
    replaceLocalhost: js.UndefOr[Boolean] = js.undefined,
    rootUrl: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): absoluteUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(replaceLocalhost)) __obj.updateDynamic("replaceLocalhost")(replaceLocalhost)
    if (rootUrl != null) __obj.updateDynamic("rootUrl")(rootUrl)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[absoluteUrlOptions]
  }
}

