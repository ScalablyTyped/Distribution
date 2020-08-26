package typings.oracleOraclejet.ojconveyorbeltMod

import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojConveyorBeltSettableProperties extends baseComponentSettableProperties {
  var contentParent: String | Null = js.native
  var orientation: horizontal | vertical = js.native
}

object ojConveyorBeltSettableProperties {
  @scala.inline
  def apply(orientation: horizontal | vertical): ojConveyorBeltSettableProperties = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojConveyorBeltSettableProperties]
  }
  @scala.inline
  implicit class ojConveyorBeltSettablePropertiesOps[Self <: ojConveyorBeltSettableProperties] (val x: Self) extends AnyVal {
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
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentParent(value: String): Self = this.set("contentParent", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentParentNull: Self = this.set("contentParent", null)
  }
  
}

