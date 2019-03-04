package typings
package nodeDashGcmLib.nodeDashGcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationOptions extends js.Object {
  var badge: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var body_loc_args: js.UndefOr[java.lang.String] = js.undefined
  var body_loc_key: js.UndefOr[java.lang.String] = js.undefined
  var click_action: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var icon: java.lang.String
  var sound: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
  var title_loc_args: js.UndefOr[java.lang.String] = js.undefined
  var title_loc_key: js.UndefOr[java.lang.String] = js.undefined
}

object INotificationOptions {
  @scala.inline
  def apply(
    icon: java.lang.String,
    title: java.lang.String,
    badge: java.lang.String = null,
    body: java.lang.String = null,
    body_loc_args: java.lang.String = null,
    body_loc_key: java.lang.String = null,
    click_action: java.lang.String = null,
    color: java.lang.String = null,
    sound: java.lang.String = null,
    tag: java.lang.String = null,
    title_loc_args: java.lang.String = null,
    title_loc_key: java.lang.String = null
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

