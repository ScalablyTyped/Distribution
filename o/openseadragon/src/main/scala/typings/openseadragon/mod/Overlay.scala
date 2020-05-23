package typings.openseadragon.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "Overlay")
@js.native
class Overlay protected () extends js.Object {
  def this(options: OverlayOptions) = this()
  def adjust(position: Point, size: Point): Unit = js.native
  def destroy(): Unit = js.native
  def drawHTML(container: HTMLElement): Unit = js.native
  def getBounds(viewport: Viewport): Rect = js.native
  def update(location: Point, placement: Placement): Unit = js.native
  def update(location: Rect, placement: Placement): Unit = js.native
}

