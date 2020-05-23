package typings.phaser.global.spine.webgl

import typings.phaser.spine.Restorable
import typings.std.HTMLCanvasElement
import typings.std.OffscreenCanvas
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.ManagedWebGLRenderingContext")
@js.native
class ManagedWebGLRenderingContext protected ()
  extends typings.phaser.spine.webgl.ManagedWebGLRenderingContext {
  def this(canvasOrContext: HTMLCanvasElement) = this()
  def this(canvasOrContext: WebGLRenderingContext) = this()
  def this(canvasOrContext: HTMLCanvasElement, contextConfig: js.Any) = this()
  def this(canvasOrContext: WebGLRenderingContext, contextConfig: js.Any) = this()
  /* CompleteClass */
  override var canvas: HTMLCanvasElement | OffscreenCanvas = js.native
  /* CompleteClass */
  override var gl: WebGLRenderingContext = js.native
  /* CompleteClass */
  override var restorables: js.Any = js.native
  /* CompleteClass */
  override def addRestorable(restorable: Restorable): Unit = js.native
  /* CompleteClass */
  override def removeRestorable(restorable: Restorable): Unit = js.native
}

