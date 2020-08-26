package typings.phenomnomnominalTsquery.tsqueryTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQueryProperties extends js.Object {
  var kindName: String = js.native
  var name: js.UndefOr[String] = js.native
  var text: String = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object TSQueryProperties {
  @scala.inline
  def apply(kindName: String, text: String): TSQueryProperties = {
    val __obj = js.Dynamic.literal(kindName = kindName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSQueryProperties]
  }
  @scala.inline
  implicit class TSQueryPropertiesOps[Self <: TSQueryProperties] (val x: Self) extends AnyVal {
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
    def setKindName(value: String): Self = this.set("kindName", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

