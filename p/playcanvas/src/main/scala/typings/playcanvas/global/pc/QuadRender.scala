package typings.playcanvas.global.pc

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
@JSGlobal("pc.QuadRender")
@js.native
open class QuadRender protected ()
  extends typings.playcanvas.mod.QuadRender {
  /**
    * Create a new QuadRender instance.
    *
    * @param {import('../../platform/graphics/shader.js').Shader} shader - The shader to be used to render the quad.
    */
  def this(shader: typings.playcanvas.mod.Shader) = this()
}
