package typings.playcanvas.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new graphics device.
  * @property canvas - The canvas DOM element that provides the underlying WebGL context used by the graphics device.
  * @property textureFloatRenderable - Determines if 32-bit floating-point textures can be used as frame buffer. [read only].
  * @property textureHalfFloatRenderable - Determines if 16-bit floating-point textures can be used as frame buffer. [read only].
  * @property scope - The scope namespace for shader attributes and variables. [read only].
  * @param canvas - The canvas to which the graphics device will render.
  * @param [options] - Options passed when creating the WebGL context. More info {@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext here}.
  */
@JSImport("playcanvas", "GraphicsDevice")
@js.native
class GraphicsDevice protected ()
  extends typings.playcanvas.pc.GraphicsDevice {
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, options: js.Any) = this()
}
