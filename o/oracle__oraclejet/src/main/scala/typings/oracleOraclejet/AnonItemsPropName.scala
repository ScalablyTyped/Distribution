package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsPropName
  extends /* propName */ StringDictionary[js.Any] {
  var items: js.Array[Element]
}

object AnonItemsPropName {
  @scala.inline
  def apply(items: js.Array[Element], StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonItemsPropName = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonItemsPropName]
  }
}

