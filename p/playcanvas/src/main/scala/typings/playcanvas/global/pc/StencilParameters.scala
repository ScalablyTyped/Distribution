package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new StencilParameters instance.
  * @property func - Sets stencil test function. See {@link pc.GraphicsDevice#setStencilFunc}.
  * @property ref - Sets stencil test reference value. See {@link pc.GraphicsDevice#setStencilFunc}.
  * @property fail - Sets operation to perform if stencil test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
  * @property zfail - Sets operation to perform if depth test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
  * @property zpass - Sets operation to perform if both stencil and depth test are passed. See {@link pc.GraphicsDevice#setStencilOperation}.
  * @property readMask - Sets stencil test reading mask. See {@link pc.GraphicsDevice#setStencilFunc}.
  * @property writeMask - Sets stencil test writing mask. See {@link pc.GraphicsDevice#setStencilOperation}.
  * @param options - Options object to configure the stencil parameters.
  */
@JSGlobal("pc.StencilParameters")
@js.native
class StencilParameters protected ()
  extends typings.playcanvas.pc.StencilParameters {
  def this(options: js.Any) = this()
}
