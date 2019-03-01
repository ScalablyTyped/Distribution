package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focus extends js.Object {
  var footerLayout: atOracleOraclejetLib.atOracleOraclejetLibStrings.Empty | atOracleOraclejetLib.atOracleOraclejetLibStrings.now
  var showOn: atOracleOraclejetLib.atOracleOraclejetLibStrings.focus | atOracleOraclejetLib.atOracleOraclejetLibStrings.image
  var timeIncrement: java.lang.String
}

object Anon_Focus {
  @scala.inline
  def apply(
    footerLayout: atOracleOraclejetLib.atOracleOraclejetLibStrings.Empty | atOracleOraclejetLib.atOracleOraclejetLibStrings.now,
    showOn: atOracleOraclejetLib.atOracleOraclejetLibStrings.focus | atOracleOraclejetLib.atOracleOraclejetLibStrings.image,
    timeIncrement: java.lang.String
  ): Anon_Focus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("footerLayout")(footerLayout.asInstanceOf[js.Any])
    __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    __obj.updateDynamic("timeIncrement")(timeIncrement)
    __obj.asInstanceOf[Anon_Focus]
  }
}

