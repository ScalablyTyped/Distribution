package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.StencilParameters
  * @class Holds stencil test settings
  * @description Create a new StencilParameters instance
  * @property {Number} func Sets stencil test function. See pc.GraphicsDevice#setStencilFunc
  * @property {Number} ref Sets stencil test reference value. See pc.GraphicsDevice#setStencilFunc
  * @property {Number} fail Sets operation to perform if stencil test is failed. See pc.GraphicsDevice#setStencilOperation
  * @property {Number} zfail Sets operation to perform if depth test is failed. See pc.GraphicsDevice#setStencilOperation
  * @property {Number} zpass Sets operation to perform if both stencil and depth test are passed. See pc.GraphicsDevice#setStencilOperation
  * @property {Number} readMask Sets stencil test reading mask. See pc.GraphicsDevice#setStencilFunc
  * @property {Number} writeMask Sets stencil test writing mask. See pc.GraphicsDevice#setStencilOperation
  */
@JSGlobal("pc.StencilParameters")
@js.native
class StencilParameters () extends js.Object {
  def this(options: playcanvasLib.Anon_Fail) = this()
  var fail: scala.Double = js.native
  var func: scala.Double = js.native
  var readMask: scala.Double = js.native
  var ref: scala.Double = js.native
  var writeMask: scala.Double = js.native
  var zfail: scala.Double = js.native
  var zpass: scala.Double = js.native
}

