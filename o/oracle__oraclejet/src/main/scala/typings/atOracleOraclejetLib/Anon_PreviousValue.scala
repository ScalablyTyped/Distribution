package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreviousValue
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var previousValue: js.Any
  var value: js.Any
}

object Anon_PreviousValue {
  @scala.inline
  def apply(
    previousValue: js.Any,
    value: js.Any,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_PreviousValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("previousValue")(previousValue)
    __obj.updateDynamic("value")(value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_PreviousValue]
  }
}

