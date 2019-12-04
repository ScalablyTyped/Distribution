package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.atOracleOraclejetStrings.ascending
import typings.atOracleOraclejet.atOracleOraclejetStrings.descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascending
  extends /* propName */ StringDictionary[js.Any] {
  var direction: ascending | descending
  var header: js.Any
}

object Anon_Ascending {
  @scala.inline
  def apply(
    direction: ascending | descending,
    header: js.Any,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_Ascending = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Ascending]
  }
}

