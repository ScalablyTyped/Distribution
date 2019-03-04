package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var href: java.lang.String
  var method: java.lang.String
  var rel: java.lang.String
}

object Link {
  @scala.inline
  def apply(href: java.lang.String, method: java.lang.String, rel: java.lang.String): Link = {
    val __obj = js.Dynamic.literal(href = href, method = method, rel = rel)
  
    __obj.asInstanceOf[Link]
  }
}

