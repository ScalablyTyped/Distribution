package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.StencilParameters
  * @classdesc Holds stencil test settings.
  * @description Create a new StencilParameters instance.
  * @param {object} options - Options object to configure the stencil parameters.
  * @property {number} func Sets stencil test function. See {@link pc.GraphicsDevice#setStencilFunc}.
  * @property {number} ref Sets stencil test reference value. See {@link pc.GraphicsDevice#setStencilFunc}.
  * @property {number} fail Sets operation to perform if stencil test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
  * @property {number} zfail Sets operation to perform if depth test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
  * @property {number} zpass Sets operation to perform if both stencil and depth test are passed. See {@link pc.GraphicsDevice#setStencilOperation}.
  * @property {number} readMask Sets stencil test reading mask. See {@link pc.GraphicsDevice#setStencilFunc}.
  * @property {number} writeMask Sets stencil test writing mask. See {@link pc.GraphicsDevice#setStencilOperation}.
  */
@JSImport("playcanvas", "StencilParameters")
@js.native
class StencilParameters protected ()
  extends typings.playcanvas.pc.StencilParameters {
  def this(options: js.Any) = this()
}

