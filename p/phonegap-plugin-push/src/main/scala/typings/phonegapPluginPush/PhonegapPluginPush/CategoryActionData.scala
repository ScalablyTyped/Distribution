package typings.phonegapPluginPush.PhonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryActionData extends js.Object {
  var callback: String = js.native
  var destructive: Boolean = js.native
  var foreground: Boolean = js.native
  var title: String = js.native
}

object CategoryActionData {
  @scala.inline
  def apply(callback: String, destructive: Boolean, foreground: Boolean, title: String): CategoryActionData = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], destructive = destructive.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryActionData]
  }
  @scala.inline
  implicit class CategoryActionDataOps[Self <: CategoryActionData] (val x: Self) extends AnyVal {
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
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestructive(value: Boolean): Self = this.set("destructive", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeground(value: Boolean): Self = this.set("foreground", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

