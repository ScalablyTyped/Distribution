package typings
package olLib.rendererWebglMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLMapRenderer
  extends olLib.rendererMapMod.default {
  def bindTileTexture(
    tile: olLib.tileMod.default,
    tileSize: olLib.sizeMod.Size,
    tileGutter: scala.Double,
    magFilter: scala.Double,
    minFilter: scala.Double
  ): scala.Unit = js.native
  def getContext(): olLib.webglContextMod.default = js.native
  def getGL(): stdLib.WebGLRenderingContext = js.native
  def getTileTextureQueue(): olLib.structsPriorityQueueMod.default[js.Array[_]] = js.native
  /* protected */ def handleWebGLContextLost(event: olLib.eventsEventMod.default): scala.Unit = js.native
  /* protected */ def handleWebGLContextRestored(): scala.Unit = js.native
  def isTileTextureLoaded(tile: olLib.tileMod.default): scala.Boolean = js.native
}

