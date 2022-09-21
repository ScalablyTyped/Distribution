package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./render-target.js').RenderTarget} RenderTarget */
/** @typedef {import('./shader.js').Shader} Shader */
/** @typedef {import('./texture.js').Texture} Texture */
/** @typedef {import('./index-buffer.js').IndexBuffer} IndexBuffer */
/** @typedef {import('./vertex-buffer.js').VertexBuffer} VertexBuffer */
/**
  * The graphics device manages the underlying graphics context. It is responsible for submitting
  * render state changes and graphics primitives to the hardware. A graphics device is tied to a
  * specific canvas HTML element. It is valid to have more than one canvas element per page and
  * create a new graphics device against each.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.GraphicsDevice")
@js.native
open class GraphicsDevice protected ()
  extends typings.playcanvas.mod.GraphicsDevice {
  def this(canvas: Any) = this()
}
