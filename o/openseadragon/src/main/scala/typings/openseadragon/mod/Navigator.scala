package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "Navigator")
@js.native
class Navigator () extends Viewer {
  def setFlip(state: Boolean): Unit = js.native
  def update(viewport: Viewport): Unit = js.native
  def updateSize(): Unit = js.native
}

