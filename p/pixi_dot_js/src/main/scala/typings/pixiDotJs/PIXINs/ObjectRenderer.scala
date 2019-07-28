package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.ObjectRenderer")
@js.native
abstract class ObjectRenderer protected () extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()
  def flush(): Unit = js.native
  def render(args: js.Any*): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

