package typings.next.nextMod.reactMod

import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// <html amp=""> support
trait HtmlHTMLAttributes[T] extends HTMLAttributes[T] {
  var amp: js.UndefOr[String] = js.undefined
}

object HtmlHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, amp: String = null): HtmlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (amp != null) __obj.updateDynamic("amp")(amp)
    __obj.asInstanceOf[HtmlHTMLAttributes[T]]
  }
}

