package typings.parseDashLinkDashHeader.parseDashLinkDashHeaderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends /* queryParam */ StringDictionary[String] {
  var rel: String
  var url: String
}

object Link {
  @scala.inline
  def apply(rel: String, url: String, StringDictionary: /* queryParam */ StringDictionary[String] = null): Link = {
    val __obj = js.Dynamic.literal(rel = rel, url = url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Link]
  }
}

