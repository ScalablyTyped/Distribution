package typings.nivoColors.anon

import typings.nivoColors.mod.ColorModifier
import typings.nivoColors.mod._InheritedColorProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From
  extends _InheritedColorProp[js.Any] {
  var from: String = js.native
  var modifiers: js.UndefOr[js.Array[ColorModifier]] = js.native
}

object From {
  @scala.inline
  def apply(from: String): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiersVarargs(value: ColorModifier*): Self = this.set("modifiers", js.Array(value :_*))
    @scala.inline
    def setModifiers(value: js.Array[ColorModifier]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
  }
  
}

