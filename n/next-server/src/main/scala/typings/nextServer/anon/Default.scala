package typings.nextServer.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default[P] extends js.Object {
  var default: ComponentType[P] = js.native
}

object Default {
  @scala.inline
  def apply[P](default: ComponentType[P]): Default[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[P]]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default[_], P] (val x: Self with Default[P]) extends AnyVal {
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
    def setDefault(value: ComponentType[P]): Self = this.set("default", value.asInstanceOf[js.Any])
  }
  
}

