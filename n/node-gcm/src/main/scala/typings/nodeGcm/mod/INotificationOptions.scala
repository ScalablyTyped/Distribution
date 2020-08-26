package typings.nodeGcm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotificationOptions extends js.Object {
  var badge: js.UndefOr[String] = js.native
  var body: js.UndefOr[String] = js.native
  var body_loc_args: js.UndefOr[String] = js.native
  var body_loc_key: js.UndefOr[String] = js.native
  var click_action: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var icon: String = js.native
  var sound: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String] = js.native
  var title: String = js.native
  var title_loc_args: js.UndefOr[String] = js.native
  var title_loc_key: js.UndefOr[String] = js.native
}

object INotificationOptions {
  @scala.inline
  def apply(icon: String, title: String): INotificationOptions = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotificationOptions]
  }
  @scala.inline
  implicit class INotificationOptionsOps[Self <: INotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadge(value: String): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBody_loc_args(value: String): Self = this.set("body_loc_args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody_loc_args: Self = this.set("body_loc_args", js.undefined)
    @scala.inline
    def setBody_loc_key(value: String): Self = this.set("body_loc_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody_loc_key: Self = this.set("body_loc_key", js.undefined)
    @scala.inline
    def setClick_action(value: String): Self = this.set("click_action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClick_action: Self = this.set("click_action", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTitle_loc_args(value: String): Self = this.set("title_loc_args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle_loc_args: Self = this.set("title_loc_args", js.undefined)
    @scala.inline
    def setTitle_loc_key(value: String): Self = this.set("title_loc_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle_loc_key: Self = this.set("title_loc_key", js.undefined)
  }
  
}

