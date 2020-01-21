package typings.oracleOraclejet.ojfilepickerMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.click
import typings.oracleOraclejet.oracleOraclejetStrings.clickAndDrop
import typings.oracleOraclejet.oracleOraclejetStrings.drop
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.single
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
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFilePickerSettableProperties]
  }
}

