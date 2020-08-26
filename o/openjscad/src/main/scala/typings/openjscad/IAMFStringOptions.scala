package typings.openjscad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAMFStringOptions extends js.Object {
  var unit: String = js.native
}

object IAMFStringOptions {
  @scala.inline
  def apply(unit: String): IAMFStringOptions = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAMFStringOptions]
  }
  @scala.inline
  implicit class IAMFStringOptionsOps[Self <: IAMFStringOptions] (val x: Self) extends AnyVal {
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
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
  
}

