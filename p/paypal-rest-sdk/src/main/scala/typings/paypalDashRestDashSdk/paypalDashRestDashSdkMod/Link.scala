package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var href: String
  var method: String
  var rel: String
}

object Link {
  @scala.inline
  def apply(href: String, method: String, rel: String): Link = {
    val __obj = js.Dynamic.literal(href = href, method = method, rel = rel)
  
    __obj.asInstanceOf[Link]
  }
}

