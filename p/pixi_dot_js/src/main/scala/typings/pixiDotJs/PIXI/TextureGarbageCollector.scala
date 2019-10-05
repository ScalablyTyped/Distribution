package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextureGarbageCollector. This class manages the GPU and ensures that it does not get clogged
  * up with textures that are no longer being used.
  */
@JSGlobal("PIXI.TextureGarbageCollector")
@js.native
class TextureGarbageCollector protected () extends js.Object {
  def this(renderer: WebGLRenderer) = this()
  var checkCount: Double = js.native
  var checkCountMax: Double = js.native
  var count: Double = js.native
  var maxIdle: Double = js.native
  var mode: Double = js.native
  var renderer: WebGLRenderer = js.native
  def run(): Unit = js.native
  def unload(displayObject: DisplayObject): Unit = js.native
  def update(): Unit = js.native
}

