package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiValueLegacyExtendedProperty extends Entity {
  // A collection of property values.
  var value: js.UndefOr[js.Array[String]] = js.native
}

object MultiValueLegacyExtendedProperty {
  @scala.inline
  def apply(): MultiValueLegacyExtendedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiValueLegacyExtendedProperty]
  }
  @scala.inline
  implicit class MultiValueLegacyExtendedPropertyOps[Self <: MultiValueLegacyExtendedProperty] (val x: Self) extends AnyVal {
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
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

