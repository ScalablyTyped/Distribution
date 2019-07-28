package typings.nodeDashGcm.nodeDashGcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationOptions extends js.Object {
  var badge: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var body_loc_args: js.UndefOr[String] = js.undefined
  var body_loc_key: js.UndefOr[String] = js.undefined
  var click_action: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var icon: String
  var sound: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var title: String
  var title_loc_args: js.UndefOr[String] = js.undefined
  var title_loc_key: js.UndefOr[String] = js.undefined
}

object INotificationOptions {
  @scala.inline
  def apply(
    icon: String,
    title: String,
    badge: String = null,
    body: String = null,
    body_loc_args: String = null,
    body_loc_key: String = null,
    click_action: String = null,
    color: String = null,
    sound: String = null,
    tag: String = null,
    title_loc_args: String = null,
    title_loc_key: String = null
  ): INotificationOptions = {
    val __obj = js.Dynamic.literal(icon = icon, title = title)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (body != null) __obj.updateDynamic("body")(body)
    if (body_loc_args != null) __obj.updateDynamic("body_loc_args")(body_loc_args)
    if (body_loc_key != null) __obj.updateDynamic("body_loc_key")(body_loc_key)
    if (click_action != null) __obj.updateDynamic("click_action")(click_action)
    if (color != null) __obj.updateDynamic("color")(color)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (title_loc_args != null) __obj.updateDynamic("title_loc_args")(title_loc_args)
    if (title_loc_key != null) __obj.updateDynamic("title_loc_key")(title_loc_key)
    __obj.asInstanceOf[INotificationOptions]
  }
}

