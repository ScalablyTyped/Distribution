package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.Handle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elements extends js.Object {
  var content: HTMLElement
  var host: HTMLElement
  var padding: HTMLElement
  var scrollbarCorner: HTMLElement
  var scrollbarHorizontal: Handle
  var scrollbarVertical: Handle
  var target: HTMLElement
  var viewport: HTMLElement
}

object Elements {
  @scala.inline
  def apply(
    content: HTMLElement,
    host: HTMLElement,
    padding: HTMLElement,
    scrollbarCorner: HTMLElement,
    scrollbarHorizontal: Handle,
    scrollbarVertical: Handle,
    target: HTMLElement,
    viewport: HTMLElement
  ): Elements = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scrollbarCorner = scrollbarCorner.asInstanceOf[js.Any], scrollbarHorizontal = scrollbarHorizontal.asInstanceOf[js.Any], scrollbarVertical = scrollbarVertical.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
}

