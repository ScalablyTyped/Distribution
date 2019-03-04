package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var item: stdLib.Element
  var position: atOracleOraclejetLib.atOracleOraclejetLibStrings.before | atOracleOraclejetLib.atOracleOraclejetLibStrings.after
  var reference: stdLib.Element
}

object Anon_After {
  @scala.inline
  def apply(
    item: stdLib.Element,
    position: atOracleOraclejetLib.atOracleOraclejetLibStrings.before | atOracleOraclejetLib.atOracleOraclejetLibStrings.after,
    reference: stdLib.Element,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_After = {
    val __obj = js.Dynamic.literal(item = item, position = position.asInstanceOf[js.Any], reference = reference)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_After]
  }
}

