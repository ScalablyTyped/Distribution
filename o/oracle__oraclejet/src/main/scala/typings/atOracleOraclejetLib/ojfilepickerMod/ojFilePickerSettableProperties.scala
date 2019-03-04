package typings
package atOracleOraclejetLib.ojfilepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFilePickerSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var accept: js.Array[java.lang.String] | scala.Null
  var selectOn: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.click | atOracleOraclejetLib.atOracleOraclejetLibStrings.drop | atOracleOraclejetLib.atOracleOraclejetLibStrings.clickAndDrop
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.single
}

object ojFilePickerSettableProperties {
  @scala.inline
  def apply(
    selectOn: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.click | atOracleOraclejetLib.atOracleOraclejetLibStrings.drop | atOracleOraclejetLib.atOracleOraclejetLibStrings.clickAndDrop,
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.single,
    accept: js.Array[java.lang.String] = null
  ): ojFilePickerSettableProperties = {
    val __obj = js.Dynamic.literal(selectOn = selectOn.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept)
    __obj.asInstanceOf[ojFilePickerSettableProperties]
  }
}

