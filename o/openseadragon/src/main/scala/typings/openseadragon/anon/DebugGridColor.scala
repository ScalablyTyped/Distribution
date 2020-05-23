package typings.openseadragon.anon

import typings.openseadragon.mod.Viewer
import typings.openseadragon.mod.Viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugGridColor extends js.Object {
  var debugGridColor: js.UndefOr[String] = js.undefined
  var element: typings.std.Element
  var viewer: Viewer
  var viewport: Viewport
}

object DebugGridColor {
  @scala.inline
  def apply(element: typings.std.Element, viewer: Viewer, viewport: Viewport, debugGridColor: String = null): DebugGridColor = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    if (debugGridColor != null) __obj.updateDynamic("debugGridColor")(debugGridColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugGridColor]
  }
}

