package typings.preactI18n.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definition extends js.Object {
  var definition: js.UndefOr[js.Object] = js.native
  var mark: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[js.Any] = js.native
}

object Definition {
  @scala.inline
  def apply(): Definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  implicit class DefinitionOps[Self <: Definition] (val x: Self) extends AnyVal {
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
    def setDefinition(value: js.Object): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setMark(value: Boolean): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

