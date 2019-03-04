package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingDescending
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var direction: atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending
  var header: stdLib.Element
}

object Anon_AscendingDescending {
  @scala.inline
  def apply(
    direction: atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending,
    header: stdLib.Element,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_AscendingDescending = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_AscendingDescending]
  }
}

