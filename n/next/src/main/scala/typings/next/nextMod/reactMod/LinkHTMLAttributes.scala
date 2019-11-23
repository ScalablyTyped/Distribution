package typings.next.nextMod.reactMod

import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// <link nonce=""> support
trait LinkHTMLAttributes[T] extends HTMLAttributes[T] {
  var nonce: js.UndefOr[String] = js.undefined
}

object LinkHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, nonce: String = null): LinkHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[LinkHTMLAttributes[T]]
  }
}

