package typings.nodeGcm.mod

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
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (body_loc_args != null) __obj.updateDynamic("body_loc_args")(body_loc_args.asInstanceOf[js.Any])
    if (body_loc_key != null) __obj.updateDynamic("body_loc_key")(body_loc_key.asInstanceOf[js.Any])
    if (click_action != null) __obj.updateDynamic("click_action")(click_action.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (title_loc_args != null) __obj.updateDynamic("title_loc_args")(title_loc_args.asInstanceOf[js.Any])
    if (title_loc_key != null) __obj.updateDynamic("title_loc_key")(title_loc_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotificationOptions]
  }
}

