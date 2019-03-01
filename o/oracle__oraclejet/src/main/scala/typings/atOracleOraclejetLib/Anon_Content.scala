package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.Object
  var height: java.lang.String
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
}

object Anon_Content {
  @scala.inline
  def apply(
    content: js.Object,
    height: java.lang.String,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): Anon_Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Content]
  }
}

