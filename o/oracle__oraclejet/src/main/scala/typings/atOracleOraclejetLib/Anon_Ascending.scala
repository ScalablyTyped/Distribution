package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascending
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var direction: atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending
  var header: js.Any
}

object Anon_Ascending {
  @scala.inline
  def apply(
    direction: atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending,
    header: js.Any,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Ascending = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Ascending]
  }
}

