package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternetMessageHeader extends js.Object {
  // Represents the key in a key-value pair.
  var name: js.UndefOr[String] = js.native
  // The value in a key-value pair.
  var value: js.UndefOr[String] = js.native
}

object InternetMessageHeader {
  @scala.inline
  def apply(): InternetMessageHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternetMessageHeader]
  }
  @scala.inline
  implicit class InternetMessageHeaderOps[Self <: InternetMessageHeader] (val x: Self) extends AnyVal {
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
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

