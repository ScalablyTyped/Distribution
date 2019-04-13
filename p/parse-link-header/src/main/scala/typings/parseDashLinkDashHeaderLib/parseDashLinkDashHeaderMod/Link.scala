package typings
package parseDashLinkDashHeaderLib.parseDashLinkDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link
  extends /* queryParam */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var rel: java.lang.String
  var url: java.lang.String
}

object Link {
  @scala.inline
  def apply(
    rel: java.lang.String,
    url: java.lang.String,
    StringDictionary: /* queryParam */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Link = {
    val __obj = js.Dynamic.literal(rel = rel, url = url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Link]
  }
}

