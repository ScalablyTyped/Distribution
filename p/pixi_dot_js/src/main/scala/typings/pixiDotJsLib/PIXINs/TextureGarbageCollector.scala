package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.TextureGarbageCollector")
@js.native
class TextureGarbageCollector protected () extends js.Object {
  def this(renderer: WebGLRenderer) = this()
  var checkCount: scala.Double = js.native
  var checkCountMax: scala.Double = js.native
  var count: scala.Double = js.native
  var maxIdle: scala.Double = js.native
  var mode: scala.Double = js.native
  var renderer: WebGLRenderer = js.native
  def run(): scala.Unit = js.native
  def unload(displayObject: DisplayObject): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

