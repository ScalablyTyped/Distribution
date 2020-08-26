package typings.next.mod.reactAugmentingMod

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// <style jsx> and <style jsx global> support for styled-jsx
@js.native
trait StyleHTMLAttributes[T] extends HTMLAttributes[T] {
  var global: js.UndefOr[Boolean] = js.native
  var jsx: js.UndefOr[Boolean] = js.native
}

object StyleHTMLAttributes {
  @scala.inline
  def apply[T](): StyleHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleHTMLAttributes[T]]
  }
  @scala.inline
  implicit class StyleHTMLAttributesOps[Self <: StyleHTMLAttributes[_], T] (val x: Self with StyleHTMLAttributes[T]) extends AnyVal {
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
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setJsx(value: Boolean): Self = this.set("jsx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsx: Self = this.set("jsx", js.undefined)
  }
  
}

