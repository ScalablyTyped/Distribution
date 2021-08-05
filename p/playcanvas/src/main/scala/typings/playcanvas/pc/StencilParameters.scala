package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait StencilParameters extends StObject {
  
  /**
    * Sets operation to perform if stencil test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var fail: Double
  
  /**
    * Sets stencil test function. See {@link pc.GraphicsDevice#setStencilFunc}.
    */
  var func: Double
  
  /**
    * Sets stencil test reading mask. See {@link pc.GraphicsDevice#setStencilFunc}.
    */
  var readMask: Double
  
  /**
    * Sets stencil test reference value. See {@link pc.GraphicsDevice#setStencilFunc}.
    */
  var ref: Double
  
  /**
    * Sets stencil test writing mask. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var writeMask: Double
  
  /**
    * Sets operation to perform if depth test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var zfail: Double
  
  /**
    * Sets operation to perform if both stencil and depth test are passed. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var zpass: Double
}
object StencilParameters {
  
  inline def apply(
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
  
  extension [Self <: StencilParameters](x: Self) {
    
    inline def setFail(value: Double): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: Double): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setReadMask(value: Double): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setRef(value: Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setWriteMask(value: Double): Self = StObject.set(x, "writeMask", value.asInstanceOf[js.Any])
    
    inline def setZfail(value: Double): Self = StObject.set(x, "zfail", value.asInstanceOf[js.Any])
    
    inline def setZpass(value: Double): Self = StObject.set(x, "zpass", value.asInstanceOf[js.Any])
  }
}
