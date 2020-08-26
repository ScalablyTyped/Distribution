package typings.nivoCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorProps[T] extends js.Object {
  var colorBy: js.UndefOr[String | GetColor[T]] = js.native
  var colors: js.UndefOr[Colors] = js.native
}

object ColorProps {
  @scala.inline
  def apply[T](): ColorProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProps[T]]
  }
  @scala.inline
  implicit class ColorPropsOps[Self <: ColorProps[_], T] (val x: Self with ColorProps[T]) extends AnyVal {
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
    def setColorByFunction1(value: T => String): Self = this.set("colorBy", js.Any.fromFunction1(value))
    @scala.inline
    def setColorBy(value: String | GetColor[T]): Self = this.set("colorBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBy: Self = this.set("colorBy", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
  }
  
}

