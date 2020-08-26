package typings.oracleOraclejet.ojoptgroupMod

import typings.oracleOraclejet.mod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojOptgroupSettableProperties extends JetSettableProperties {
  var disabled: Boolean = js.native
  var label: String = js.native
}

object ojOptgroupSettableProperties {
  @scala.inline
  def apply(disabled: Boolean, label: String): ojOptgroupSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojOptgroupSettableProperties]
  }
  @scala.inline
  implicit class ojOptgroupSettablePropertiesOps[Self <: ojOptgroupSettableProperties] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

