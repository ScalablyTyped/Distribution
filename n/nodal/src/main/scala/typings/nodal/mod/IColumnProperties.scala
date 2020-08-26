package typings.nodal.mod

import typings.nodal.nodalNumbers.`0`
import typings.nodal.nodalNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnProperties extends js.Object {
  var array: js.UndefOr[Boolean] = js.native
  var auto_increment: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var length: js.UndefOr[Double | Null] = js.native
  var nullable: js.UndefOr[Boolean] = js.native
  var primary_key: js.UndefOr[`0` | `1` | Boolean] = js.native
  var unique: js.UndefOr[`0` | `1` | Boolean] = js.native
}

object IColumnProperties {
  @scala.inline
  def apply(): IColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnProperties]
  }
  @scala.inline
  implicit class IColumnPropertiesOps[Self <: IColumnProperties] (val x: Self) extends AnyVal {
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
    def setArray(value: Boolean): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    @scala.inline
    def setAuto_increment(value: Boolean): Self = this.set("auto_increment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto_increment: Self = this.set("auto_increment", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLengthNull: Self = this.set("length", null)
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    @scala.inline
    def setPrimary_key(value: `0` | `1` | Boolean): Self = this.set("primary_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary_key: Self = this.set("primary_key", js.undefined)
    @scala.inline
    def setUnique(value: `0` | `1` | Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
  
}

