package typings.playcanvas.pc

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
@js.native
trait StencilParameters extends js.Object {
  
  /**
    * Sets operation to perform if stencil test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var fail: Double = js.native
  
  /**
    * Sets stencil test function. See {@link pc.GraphicsDevice#setStencilFunc}.
    */
  var func: Double = js.native
  
  /**
    * Sets stencil test reading mask. See {@link pc.GraphicsDevice#setStencilFunc}.
    */
  var readMask: Double = js.native
  
  /**
    * Sets stencil test reference value. See {@link pc.GraphicsDevice#setStencilFunc}.
    */
  var ref: Double = js.native
  
  /**
    * Sets stencil test writing mask. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var writeMask: Double = js.native
  
  /**
    * Sets operation to perform if depth test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var zfail: Double = js.native
  
  /**
    * Sets operation to perform if both stencil and depth test are passed. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var zpass: Double = js.native
}
object StencilParameters {
  
  @scala.inline
  def apply(
    fail: Double,
    func: Double,
    readMask: Double,
    ref: Double,
    writeMask: Double,
    zfail: Double,
    zpass: Double
  ): StencilParameters = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], readMask = readMask.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], writeMask = writeMask.asInstanceOf[js.Any], zfail = zfail.asInstanceOf[js.Any], zpass = zpass.asInstanceOf[js.Any])
    __obj.asInstanceOf[StencilParameters]
  }
  
  @scala.inline
  implicit class StencilParametersOps[Self <: StencilParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFail(value: Double): Self = this.set("fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunc(value: Double): Self = this.set("func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadMask(value: Double): Self = this.set("readMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: Double): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteMask(value: Double): Self = this.set("writeMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZfail(value: Double): Self = this.set("zfail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZpass(value: Double): Self = this.set("zpass", value.asInstanceOf[js.Any])
  }
}
