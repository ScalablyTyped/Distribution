package typings
package parseLib.ParseNs.PushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushData extends js.Object {
  var alert: js.UndefOr[java.lang.String] = js.undefined
  var badge: js.UndefOr[java.lang.String] = js.undefined
  var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var content_available: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var expiration_interval: js.UndefOr[scala.Double] = js.undefined
  var expiration_time: js.UndefOr[stdLib.Date] = js.undefined
  var notification: js.UndefOr[js.Any] = js.undefined
  var push_time: js.UndefOr[stdLib.Date] = js.undefined
  var sound: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var where: js.UndefOr[parseLib.ParseNs.Query[parseLib.ParseNs.Installation]] = js.undefined
}

object PushData {
  @scala.inline
  def apply(
    alert: java.lang.String = null,
    badge: java.lang.String = null,
    channels: js.Array[java.lang.String] = null,
    content_available: js.Any = null,
    data: js.Any = null,
    expiration_interval: scala.Int | scala.Double = null,
    expiration_time: stdLib.Date = null,
    notification: js.Any = null,
    push_time: stdLib.Date = null,
    sound: java.lang.String = null,
    title: java.lang.String = null,
    where: parseLib.ParseNs.Query[parseLib.ParseNs.Installation] = null
  ): PushData = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (content_available != null) __obj.updateDynamic("content_available")(content_available)
    if (data != null) __obj.updateDynamic("data")(data)
    if (expiration_interval != null) __obj.updateDynamic("expiration_interval")(expiration_interval.asInstanceOf[js.Any])
    if (expiration_time != null) __obj.updateDynamic("expiration_time")(expiration_time)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (push_time != null) __obj.updateDynamic("push_time")(push_time)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (title != null) __obj.updateDynamic("title")(title)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[PushData]
  }
}

