package typings
package phonegapDashPluginDashPushLib.PhonegapPluginPushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryActionData extends js.Object {
  var callback: java.lang.String
  var destructive: scala.Boolean
  var foreground: scala.Boolean
  var title: java.lang.String
}

object CategoryActionData {
  @scala.inline
  def apply(
    callback: java.lang.String,
    destructive: scala.Boolean,
    foreground: scala.Boolean,
    title: java.lang.String
  ): CategoryActionData = {
    val __obj = js.Dynamic.literal(callback = callback, destructive = destructive, foreground = foreground, title = title)
  
    __obj.asInstanceOf[CategoryActionData]
  }
}

