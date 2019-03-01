package typings
package ngDashNotifyLib.ngNotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the options used to configure notification.
  */
trait IUserOptions extends js.Object {
  var button: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IUserOptions {
  @scala.inline
  def apply(
    button: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null,
    sticky: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null,
    `type`: java.lang.String = null
  ): IUserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IUserOptions]
  }
}

