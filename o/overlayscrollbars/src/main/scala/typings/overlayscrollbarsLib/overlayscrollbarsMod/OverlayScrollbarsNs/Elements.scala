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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("padding")(padding)
    __obj.updateDynamic("scrollbarCorner")(scrollbarCorner)
    __obj.updateDynamic("scrollbarHorizontal")(scrollbarHorizontal)
    __obj.updateDynamic("scrollbarVertical")(scrollbarVertical)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Elements]
  }
}

