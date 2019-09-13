package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base for a common object renderer that can be used as a system renderer plugin.
  */
@JSGlobal("PIXI.ObjectRenderer")
@js.native
abstract class ObjectRenderer protected () extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()
  /**
    * Stub method for rendering content and emptying the current batch.
    */
  def flush(): Unit = js.native
  def render(args: js.Any*): Unit = js.native
  /**
    * Starts the renderer and sets the shader
    */
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

