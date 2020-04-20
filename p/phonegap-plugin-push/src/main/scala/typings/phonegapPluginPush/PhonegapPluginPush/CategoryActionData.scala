package typings.phonegapPluginPush.PhonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryActionData extends js.Object {
  var callback: String
  var destructive: Boolean
  var foreground: Boolean
  var title: String
}

object CategoryActionData {
  @scala.inline
  def apply(callback: String, destructive: Boolean, foreground: Boolean, title: String): CategoryActionData = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], destructive = destructive.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryActionData]
  }
}

