package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.ascending
import typings.oracleOraclejet.oracleOraclejetStrings.descending
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionHeader
  extends /* propName */ StringDictionary[js.Any] {
  var direction: ascending | descending
  var header: Element
}

object AnonDirectionHeader {
  @scala.inline
  def apply(
    direction: ascending | descending,
    header: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonDirectionHeader = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDirectionHeader]
  }
}

