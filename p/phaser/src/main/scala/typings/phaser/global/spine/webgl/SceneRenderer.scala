package typings.phaser.global.spine.webgl

import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.SceneRenderer")
@js.native
class SceneRenderer protected ()
  extends typings.phaser.spine.webgl.SceneRenderer {
  def this(canvas: HTMLCanvasElement, context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
  def this(canvas: HTMLCanvasElement, context: WebGLRenderingContext) = this()
  def this(
    canvas: HTMLCanvasElement,
    context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
    twoColorTint: Boolean
  ) = this()
  def this(canvas: HTMLCanvasElement, context: WebGLRenderingContext, twoColorTint: Boolean) = this()
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

