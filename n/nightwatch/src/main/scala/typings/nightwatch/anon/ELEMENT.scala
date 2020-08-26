package typings.nightwatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ELEMENT extends js.Object {
  var ELEMENT: String = js.native
}

object ELEMENT {
  @scala.inline
  def apply(ELEMENT: String): ELEMENT = {
    val __obj = js.Dynamic.literal(ELEMENT = ELEMENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ELEMENT]
  }
  @scala.inline
  implicit class ELEMENTOps[Self <: ELEMENT] (val x: Self) extends AnyVal {
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
    def setELEMENT(value: String): Self = this.set("ELEMENT", value.asInstanceOf[js.Any])
  }
  
}

