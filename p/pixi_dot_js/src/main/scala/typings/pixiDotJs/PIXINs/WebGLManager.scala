package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.WebGLManager")
@js.native
class WebGLManager protected () extends js.Object {
  def this(renderer: WebGLRenderer) = this()
  var renderer: WebGLRenderer = js.native
  def destroy(): Unit = js.native
  def onContextChange(): Unit = js.native
}

