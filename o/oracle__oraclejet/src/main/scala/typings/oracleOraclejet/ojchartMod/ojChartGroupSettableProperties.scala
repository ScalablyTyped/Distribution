package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojChartGroupSettableProperties extends JetSettableProperties {
  var drilling: js.UndefOr[on | off | inherit] = js.native
  var labelStyle: js.UndefOr[js.Object] = js.native
  var name: js.UndefOr[String] = js.native
  var shortDesc: js.UndefOr[String] = js.native
}

object ojChartGroupSettableProperties {
  @scala.inline
  def apply(): ojChartGroupSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojChartGroupSettableProperties]
  }
  @scala.inline
  implicit class ojChartGroupSettablePropertiesOps[Self <: ojChartGroupSettableProperties] (val x: Self) extends AnyVal {
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
    def setDrilling(value: on | off | inherit): Self = this.set("drilling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrilling: Self = this.set("drilling", js.undefined)
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDesc: Self = this.set("shortDesc", js.undefined)
  }
  
}

