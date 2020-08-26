package typings.nodeHtmlParser.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyAttributes extends js.Object {
  var `class`: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
}

object KeyAttributes {
  @scala.inline
  def apply(): KeyAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyAttributes]
  }
  @scala.inline
  implicit class KeyAttributesOps[Self <: KeyAttributes] (val x: Self) extends AnyVal {
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

