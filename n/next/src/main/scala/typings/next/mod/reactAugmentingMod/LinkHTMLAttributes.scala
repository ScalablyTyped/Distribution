package typings.next.mod.reactAugmentingMod

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// <link nonce=""> support
@js.native
trait LinkHTMLAttributes[T] extends HTMLAttributes[T] {
  var nonce: js.UndefOr[String] = js.native
}

object LinkHTMLAttributes {
  @scala.inline
  def apply[T](): LinkHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkHTMLAttributes[T]]
  }
  @scala.inline
  implicit class LinkHTMLAttributesOps[Self <: LinkHTMLAttributes[_], T] (val x: Self with LinkHTMLAttributes[T]) extends AnyVal {
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
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
  }
  
}

