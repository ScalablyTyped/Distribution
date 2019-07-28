package typings.phonegapDashPluginDashPush.PhonegapPluginPushNs

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
    val __obj = js.Dynamic.literal(callback = callback, destructive = destructive, foreground = foreground, title = title)
  
    __obj.asInstanceOf[CategoryActionData]
  }
}

