package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header
  extends /* key */ StringDictionary[js.Any] {
  var content: typings.std.Element
  var header: typings.std.Element
}

object Header {
  @scala.inline
  def apply(
    content: typings.std.Element,
    header: typings.std.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Header = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Header]
  }
}

