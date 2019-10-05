package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXI.RendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The SystemRenderer is the base for a PixiJS Renderer. It is extended by the {@link PIXI.CanvasRenderer}
  * and {@link PIXI.WebGLRenderer} which can be used for rendering a PixiJS scene.
  */
@JSImport("pixi.js", "SystemRenderer")
@js.native
class SystemRenderer protected ()
  extends typings.pixiDotJs.PIXI.SystemRenderer {
  def this(system: String) = this()
  def this(system: String, options: RendererOptions) = this()
  def this(system: String, screenWidth: Double) = this()
  def this(system: String, screenWidth: Double, screenHeight: Double) = this()
  def this(system: String, screenWidth: Double, screenHeight: Double, options: RendererOptions) = this()
}

