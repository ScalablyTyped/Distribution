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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojFilePickerSettableProperties extends JetSettableProperties {
  
  var accept: js.Array[String] | Null = js.native
  
  var selectOn: auto | click | drop | clickAndDrop = js.native
  
  var selectionMode: multiple | single = js.native
}
object ojFilePickerSettableProperties {
  
  @scala.inline
  def apply(selectOn: auto | click | drop | clickAndDrop, selectionMode: multiple | single): ojFilePickerSettableProperties = {
    val __obj = js.Dynamic.literal(selectOn = selectOn.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFilePickerSettableProperties]
  }
  
  @scala.inline
  implicit class ojFilePickerSettablePropertiesOps[Self <: ojFilePickerSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setSelectOn(value: auto | click | drop | clickAndDrop): Self = this.set("selectOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: multiple | single): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptVarargs(value: String*): Self = this.set("accept", js.Array(value :_*))
    
    @scala.inline
    def setAccept(value: js.Array[String]): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptNull: Self = this.set("accept", null)
  }
}
