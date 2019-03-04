package typings
package overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elements extends js.Object {
  var content: stdLib.HTMLElement
  var host: stdLib.HTMLElement
  var padding: stdLib.HTMLElement
  var scrollbarCorner: stdLib.HTMLElement
  var scrollbarHorizontal: overlayscrollbarsLib.Anon_Handle
  var scrollbarVertical: overlayscrollbarsLib.Anon_Handle
  var target: stdLib.HTMLElement
  var viewport: stdLib.HTMLElement
}

object Elements {
  @scala.inline
  def apply(
    content: stdLib.HTMLElement,
    host: stdLib.HTMLElement,
    padding: stdLib.HTMLElement,
    scrollbarCorner: stdLib.HTMLElement,
    scrollbarHorizontal: overlayscrollbarsLib.Anon_Handle,
    scrollbarVertical: overlayscrollbarsLib.Anon_Handle,
    target: stdLib.HTMLElement,
    viewport: stdLib.HTMLElement
  ): Elements = {
    val __obj = js.Dynamic.literal(content = content, host = host, padding = padding, scrollbarCorner = scrollbarCorner, scrollbarHorizontal = scrollbarHorizontal, scrollbarVertical = scrollbarVertical, target = target, viewport = viewport)
  
    __obj.asInstanceOf[Elements]
  }
}

