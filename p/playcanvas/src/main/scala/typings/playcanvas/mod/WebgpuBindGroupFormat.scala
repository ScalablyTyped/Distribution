package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGPU implementation of the BindGroupFormat, which is a wrapper over GPUBindGroupLayout.
  *
  * @ignore
  */
trait WebgpuBindGroupFormat extends StObject {
  
  /**
    * @type {GPUBindGroupLayout}
    * @private
    */
  /* private */ var bindGroupLayout: Any
  
  /**
    * @param {any} bindGroupFormat - The format of the bind group.
    * @returns {any} Returns the bind group descriptor.
    */
  def createDescriptor(bindGroupFormat: Any): Any
  
  var descr: Any
  
  def destroy(): Unit
  
  /**
    * Returns texture binding slot.
    *
    * @param {import('../bind-group-format.js').BindGroupFormat} bindGroupFormat - Bind group format.
    * @param {number} index - The index of the texture.
    * @returns {number} - The slot index.
    */
  def getTextureSlot(bindGroupFormat: BindGroupFormat, index: Double): Double
  
  /**
    * Unique key, used for caching
    *
    * @type {string}
    */
  var key: String
  
  def loseContext(): Unit
}
object WebgpuBindGroupFormat {
  
  inline def apply(
    bindGroupLayout: Any,
    createDescriptor: Any => Any,
    descr: Any,
    destroy: () => Unit,
    getTextureSlot: (BindGroupFormat, Double) => Double,
    key: String,
    loseContext: () => Unit
  ): WebgpuBindGroupFormat = {
    val __obj = js.Dynamic.literal(bindGroupLayout = bindGroupLayout.asInstanceOf[js.Any], createDescriptor = js.Any.fromFunction1(createDescriptor), descr = descr.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getTextureSlot = js.Any.fromFunction2(getTextureSlot), key = key.asInstanceOf[js.Any], loseContext = js.Any.fromFunction0(loseContext))
    __obj.asInstanceOf[WebgpuBindGroupFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebgpuBindGroupFormat] (val x: Self) extends AnyVal {
    
    inline def setBindGroupLayout(value: Any): Self = StObject.set(x, "bindGroupLayout", value.asInstanceOf[js.Any])
    
    inline def setCreateDescriptor(value: Any => Any): Self = StObject.set(x, "createDescriptor", js.Any.fromFunction1(value))
    
    inline def setDescr(value: Any): Self = StObject.set(x, "descr", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetTextureSlot(value: (BindGroupFormat, Double) => Double): Self = StObject.set(x, "getTextureSlot", js.Any.fromFunction2(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLoseContext(value: () => Unit): Self = StObject.set(x, "loseContext", js.Any.fromFunction0(value))
  }
}
