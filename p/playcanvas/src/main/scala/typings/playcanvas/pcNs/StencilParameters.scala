package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.StencilParameters
  * @classdesc Holds stencil test settings
  * @description Create a new StencilParameters instance
  * @param {Object} options Options object to configure the stencil parameters.
  * @property {Number} func Sets stencil test function. See {@link pc.GraphicsDevice#setStencilFunc}
  * @property {Number} ref Sets stencil test reference value. See {@link pc.GraphicsDevice#setStencilFunc}
  * @property {Number} fail Sets operation to perform if stencil test is failed. See {@link pc.GraphicsDevice#setStencilOperation}
  * @property {Number} zfail Sets operation to perform if depth test is failed. See {@link pc.GraphicsDevice#setStencilOperation}
  * @property {Number} zpass Sets operation to perform if both stencil and depth test are passed. See {@link pc.GraphicsDevice#setStencilOperation}
  * @property {Number} readMask Sets stencil test reading mask. See {@link pc.GraphicsDevice#setStencilFunc}
  * @property {Number} writeMask Sets stencil test writing mask. See {@link pc.GraphicsDevice#setStencilOperation}
  */
@JSGlobal("pc.StencilParameters")
@js.native
class StencilParameters protected () extends js.Object {
  def this(options: js.Any) = this()
  /**
    * Sets operation to perform if stencil test is failed. See {@link pc.GraphicsDevice#setStencilOperation}
    */
  var fail: Double = js.native
  /**
    * Sets stencil test function. See {@link pc.GraphicsDevice#setStencilFunc}
    */
  var func: Double = js.native
  /**
    * Sets stencil test reading mask. See {@link pc.GraphicsDevice#setStencilFunc}
    */
  var readMask: Double = js.native
  /**
    * Sets stencil test reference value. See {@link pc.GraphicsDevice#setStencilFunc}
    */
  var ref: Double = js.native
  /**
    * Sets stencil test writing mask. See {@link pc.GraphicsDevice#setStencilOperation}
    */
  var writeMask: Double = js.native
  /**
    * Sets operation to perform if depth test is failed. See {@link pc.GraphicsDevice#setStencilOperation}
    */
  var zfail: Double = js.native
  /**
    * Sets operation to perform if both stencil and depth test are passed. See {@link pc.GraphicsDevice#setStencilOperation}
    */
  var zpass: Double = js.native
}

