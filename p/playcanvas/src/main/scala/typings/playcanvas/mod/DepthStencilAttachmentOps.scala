package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthStencilAttachmentOps extends StObject {
  
  /**
    * True if the depth attachment should be cleared before rendering, false to preserve
    * the existing content.
    */
  var clearDepth: Boolean
  
  /**
    * A depth value used to clear the depth attachment when the clear is enabled.
    */
  var clearDepthValue: Double
  
  /**
    * True if the stencil attachment should be cleared before rendering, false to preserve
    * the existing content.
    */
  var clearStencil: Boolean
  
  /**
    * A stencil value used to clear the stencil attachment when the clear is enabled.
    */
  var clearStencilValue: Double
  
  /**
    * True if the depth attachment needs to be stored after the render pass. False
    * if it can be discarded.
    *
    * @type {boolean}
    */
  var storeDepth: Boolean
  
  /**
    * True if the stencil attachment needs to be stored after the render pass. False
    * if it can be discarded.
    *
    * @type {boolean}
    */
  var storeStencil: Boolean
}
object DepthStencilAttachmentOps {
  
  inline def apply(
    clearDepth: Boolean,
    clearDepthValue: Double,
    clearStencil: Boolean,
    clearStencilValue: Double,
    storeDepth: Boolean,
    storeStencil: Boolean
  ): DepthStencilAttachmentOps = {
    val __obj = js.Dynamic.literal(clearDepth = clearDepth.asInstanceOf[js.Any], clearDepthValue = clearDepthValue.asInstanceOf[js.Any], clearStencil = clearStencil.asInstanceOf[js.Any], clearStencilValue = clearStencilValue.asInstanceOf[js.Any], storeDepth = storeDepth.asInstanceOf[js.Any], storeStencil = storeStencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthStencilAttachmentOps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DepthStencilAttachmentOps] (val x: Self) extends AnyVal {
    
    inline def setClearDepth(value: Boolean): Self = StObject.set(x, "clearDepth", value.asInstanceOf[js.Any])
    
    inline def setClearDepthValue(value: Double): Self = StObject.set(x, "clearDepthValue", value.asInstanceOf[js.Any])
    
    inline def setClearStencil(value: Boolean): Self = StObject.set(x, "clearStencil", value.asInstanceOf[js.Any])
    
    inline def setClearStencilValue(value: Double): Self = StObject.set(x, "clearStencilValue", value.asInstanceOf[js.Any])
    
    inline def setStoreDepth(value: Boolean): Self = StObject.set(x, "storeDepth", value.asInstanceOf[js.Any])
    
    inline def setStoreStencil(value: Boolean): Self = StObject.set(x, "storeStencil", value.asInstanceOf[js.Any])
  }
}
