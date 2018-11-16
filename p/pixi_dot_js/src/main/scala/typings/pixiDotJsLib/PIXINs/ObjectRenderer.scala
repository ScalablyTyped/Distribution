package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.ObjectRenderer")
@js.native
abstract class ObjectRenderer protected () extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()
  def flush(): scala.Unit = js.native
  def render(args: js.Any*): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

