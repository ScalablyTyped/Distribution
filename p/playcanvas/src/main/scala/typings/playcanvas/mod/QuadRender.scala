package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that renders a quad using a {@link Shader}.
  *
  * Example:
  *
  * ```javascript
  * const shader = pc.createShaderFromCode(app.graphicsDevice, vertexShader, fragmentShader, `MyShader`);
  * const quad = new QuadRender(shader);
  * quad.render();
  * quad.destroy();
  * ```
  */
@JSImport("playcanvas", "QuadRender")
@js.native
open class QuadRender protected () extends StObject {
  /**
    * Create a new QuadRender instance.
    *
    * @param {import('../../platform/graphics/shader.js').Shader} shader - The shader to be used to render the quad.
    */
  def this(shader: Shader) = this()
  
  /**
    * @type {BindGroup}
    * @ignore
    */
  var bindGroup: BindGroup = js.native
  
  /**
    * Destroys the resources associated with this instance.
    */
  def destroy(): Unit = js.native
  
  /**
    * Renders the quad. If the viewport is provided, the original viewport and scissor is restored
    * after the rendering.
    *
    * @param {import('../../core/math/vec4.js').Vec4} [viewport] - The viewport rectangle of the
    * quad, in pixels. The viewport is not changed if not provided.
    * @param {import('../../core/math/vec4.js').Vec4} [scissor] - The scissor rectangle of the
    * quad, in pixels. Used only if the viewport is provided.
    */
  def render(): Unit = js.native
  def render(viewport: Unit, scissor: Vec4): Unit = js.native
  def render(viewport: Vec4): Unit = js.native
  def render(viewport: Vec4, scissor: Vec4): Unit = js.native
  
  var shader: Shader = js.native
  
  /**
    * @type {UniformBuffer}
    * @ignore
    */
  var uniformBuffer: UniformBuffer = js.native
}
