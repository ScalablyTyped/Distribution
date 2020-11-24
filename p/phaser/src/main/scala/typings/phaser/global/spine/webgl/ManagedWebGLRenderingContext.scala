package typings.phaser.global.spine.webgl

import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.webgl.ManagedWebGLRenderingContext")
@js.native
class ManagedWebGLRenderingContext protected ()
  extends typings.phaser.spine.webgl.ManagedWebGLRenderingContext {
  def this(canvasOrContext: HTMLCanvasElement) = this()
  def this(canvasOrContext: WebGLRenderingContext) = this()
  def this(canvasOrContext: HTMLCanvasElement, contextConfig: js.Any) = this()
  def this(canvasOrContext: WebGLRenderingContext, contextConfig: js.Any) = this()
}
