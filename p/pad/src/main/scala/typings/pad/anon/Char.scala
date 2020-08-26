package typings.pad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Char extends js.Object {
  var char: js.UndefOr[String] = js.native
  var colors: js.UndefOr[Boolean] = js.native
  var strip: js.UndefOr[Boolean] = js.native
}

object Char {
  @scala.inline
  def apply(): Char = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Char]
  }
  @scala.inline
  implicit class CharOps[Self <: Char] (val x: Self) extends AnyVal {
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
    def setChar(value: String): Self = this.set("char", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChar: Self = this.set("char", js.undefined)
    @scala.inline
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setStrip(value: Boolean): Self = this.set("strip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrip: Self = this.set("strip", js.undefined)
  }
  
}

