package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  var title: java.lang.String
  var titleHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  var titleStyle: js.Object
}

object Anon_Center {
  @scala.inline
  def apply(
    title: java.lang.String,
    titleHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start,
    titleStyle: js.Object
  ): Anon_Center = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titleHalign")(titleHalign.asInstanceOf[js.Any])
    __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.asInstanceOf[Anon_Center]
  }
}

