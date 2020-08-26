package typings.orientjs.mod

import typings.orientjs.anon.Fields
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyCreateConfig extends js.Object {
  var collate: js.UndefOr[String] = js.native
  var custom: js.UndefOr[Fields] = js.native
  var default: js.UndefOr[js.Any] = js.native
  var ifnotexist: js.UndefOr[Boolean] = js.native
  var linkedClass: js.UndefOr[String] = js.native
  var linkedType: js.UndefOr[String] = js.native
  var mandatory: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: String = js.native
  var notNull: js.UndefOr[Boolean] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var regexp: js.UndefOr[RegExp | String] = js.native
  var `type`: PropertyType = js.native
  var unsafe: js.UndefOr[Boolean] = js.native
}

object PropertyCreateConfig {
  @scala.inline
  def apply(name: String, `type`: PropertyType): PropertyCreateConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyCreateConfig]
  }
  @scala.inline
  implicit class PropertyCreateConfigOps[Self <: PropertyCreateConfig] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PropertyType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollate(value: String): Self = this.set("collate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollate: Self = this.set("collate", js.undefined)
    @scala.inline
    def setCustom(value: Fields): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setIfnotexist(value: Boolean): Self = this.set("ifnotexist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfnotexist: Self = this.set("ifnotexist", js.undefined)
    @scala.inline
    def setLinkedClass(value: String): Self = this.set("linkedClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedClass: Self = this.set("linkedClass", js.undefined)
    @scala.inline
    def setLinkedType(value: String): Self = this.set("linkedType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedType: Self = this.set("linkedType", js.undefined)
    @scala.inline
    def setMandatory(value: Boolean): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMandatory: Self = this.set("mandatory", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setNotNull(value: Boolean): Self = this.set("notNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotNull: Self = this.set("notNull", js.undefined)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setRegexp(value: RegExp | String): Self = this.set("regexp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    @scala.inline
    def setUnsafe(value: Boolean): Self = this.set("unsafe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe: Self = this.set("unsafe", js.undefined)
  }
  
}

