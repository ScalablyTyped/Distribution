package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileAttachment extends js.Object {
  var name: String
  var url: String
}

object FileAttachment {
  @scala.inline
  def apply(name: String, url: String): FileAttachment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileAttachment]
  }
}

