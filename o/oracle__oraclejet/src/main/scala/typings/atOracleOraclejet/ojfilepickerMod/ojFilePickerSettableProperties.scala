package typings.atOracleOraclejet.ojfilepickerMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.click
import typings.atOracleOraclejet.atOracleOraclejetStrings.clickAndDrop
import typings.atOracleOraclejet.atOracleOraclejetStrings.drop
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFilePickerSettableProperties extends JetSettableProperties {
  var accept: js.Array[String] | Null
  var selectOn: auto | click | drop | clickAndDrop
  var selectionMode: multiple | single
}

object ojFilePickerSettableProperties {
  @scala.inline
  def apply(
    selectOn: auto | click | drop | clickAndDrop,
    selectionMode: multiple | single,
    accept: js.Array[String] = null
  ): ojFilePickerSettableProperties = {
    val __obj = js.Dynamic.literal(selectOn = selectOn.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept)
    __obj.asInstanceOf[ojFilePickerSettableProperties]
  }
}

