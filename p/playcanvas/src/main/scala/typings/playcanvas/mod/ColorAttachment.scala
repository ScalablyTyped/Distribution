package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Private class storing info about color buffer.
  *
  * @ignore
  */
trait ColorAttachment extends StObject {
  
  def destroy(): Unit
  
  /**
    * @type {GPUTextureFormat}
    * @private
    */
  /* private */ var format: Any
  
  /**
    * @type {GPUTexture}
    * @private
    */
  /* private */ var multisampledBuffer: Any
}
object ColorAttachment {
  
  inline def apply(destroy: () => Unit, format: Any, multisampledBuffer: Any): ColorAttachment = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), format = format.asInstanceOf[js.Any], multisampledBuffer = multisampledBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorAttachment] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setFormat(value: Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMultisampledBuffer(value: Any): Self = StObject.set(x, "multisampledBuffer", value.asInstanceOf[js.Any])
  }
}
