package typings.oracleOraclejet.ojfilepickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.click
import typings.oracleOraclejet.oracleOraclejetStrings.clickAndDrop
import typings.oracleOraclejet.oracleOraclejetStrings.drop
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojfilepicker.ojFilePickerSettableProperties> */
@js.native
trait ojFilePickerSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var accept: js.UndefOr[js.Array[String] | Null] = js.native
  var selectOn: js.UndefOr[auto | click | drop | clickAndDrop] = js.native
  var selectionMode: js.UndefOr[multiple | single] = js.native
}

object ojFilePickerSettablePropertiesLenient {
  @scala.inline
  def apply(): ojFilePickerSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojFilePickerSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojFilePickerSettablePropertiesLenientOps[Self <: ojFilePickerSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptVarargs(value: String*): Self = this.set("accept", js.Array(value :_*))
    @scala.inline
    def setAccept(value: js.Array[String]): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAcceptNull: Self = this.set("accept", null)
    @scala.inline
    def setSelectOn(value: auto | click | drop | clickAndDrop): Self = this.set("selectOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOn: Self = this.set("selectOn", js.undefined)
    @scala.inline
    def setSelectionMode(value: multiple | single): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

