package typings.ol.rendererWebglMapMod

import typings.ol.sizeMod.Size
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLMapRenderer
  extends typings.ol.rendererMapMod.default {
  def bindTileTexture(
    tile: typings.ol.tileMod.default,
    tileSize: Size,
    tileGutter: Double,
    magFilter: Double,
    minFilter: Double
  ): Unit = js.native
  def getContext(): typings.ol.webglContextMod.default = js.native
  def getGL(): WebGLRenderingContext = js.native
  def getTileTextureQueue(): typings.ol.structsPriorityQueueMod.default[js.Array[_]] = js.native
  /* protected */ def handleWebGLContextLost(event: typings.ol.eventsEventMod.default): Unit = js.native
  /* protected */ def handleWebGLContextRestored(): Unit = js.native
  def isTileTextureLoaded(tile: typings.ol.tileMod.default): Boolean = js.native
}

