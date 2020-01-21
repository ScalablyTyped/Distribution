package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentHeader
  extends /* propName */ StringDictionary[js.Any] {
  var content: Element
  var header: Element
}

object AnonContentHeader {
  @scala.inline
  def apply(
    content: Element,
    header: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonContentHeader = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonContentHeader]
  }
}

