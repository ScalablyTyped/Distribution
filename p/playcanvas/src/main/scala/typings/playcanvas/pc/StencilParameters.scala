package typings.playcanvas.pc

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
@js.native
trait StencilParameters extends StObject {
  
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
  implicit class StencilParametersMutableBuilder[Self <: StencilParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFail(value: Double): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunc(value: Double): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadMask(value: Double): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteMask(value: Double): Self = StObject.set(x, "writeMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZfail(value: Double): Self = StObject.set(x, "zfail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZpass(value: Double): Self = StObject.set(x, "zpass", value.asInstanceOf[js.Any])
  }
}
