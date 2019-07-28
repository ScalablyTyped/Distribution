package typings.overlayscrollbars.overlayscrollbarsMod

import typings.overlayscrollbars.Anon_Handle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elements extends js.Object {
  var content: HTMLElement
  var host: HTMLElement
  var padding: HTMLElement
  var scrollbarCorner: HTMLElement
  var scrollbarHorizontal: Anon_Handle
  var scrollbarVertical: Anon_Handle
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
    scrollbarHorizontal: Anon_Handle,
    scrollbarVertical: Anon_Handle,
    target: HTMLElement,
    viewport: HTMLElement
  ): Elements = {
    val __obj = js.Dynamic.literal(content = content, host = host, padding = padding, scrollbarCorner = scrollbarCorner, scrollbarHorizontal = scrollbarHorizontal, scrollbarVertical = scrollbarVertical, target = target, viewport = viewport)
  
    __obj.asInstanceOf[Elements]
  }
}

