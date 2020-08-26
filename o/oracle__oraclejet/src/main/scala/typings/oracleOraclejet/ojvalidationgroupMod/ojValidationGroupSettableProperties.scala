package typings.oracleOraclejet.ojvalidationgroupMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojValidationGroupSettableProperties extends JetSettableProperties {
  val valid: typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
}

object ojValidationGroupSettableProperties {
  @scala.inline
  def apply(valid: valid | pending | invalidHidden | invalidShown): ojValidationGroupSettableProperties = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojValidationGroupSettableProperties]
  }
  @scala.inline
  implicit class ojValidationGroupSettablePropertiesOps[Self <: ojValidationGroupSettableProperties] (val x: Self) extends AnyVal {
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
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
  
}

