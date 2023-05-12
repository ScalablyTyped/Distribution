package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGPU implementation of the BindGroup, which is a wrapper over GPUBindGroup.
  *
  * @ignore
  */
trait WebgpuBindGroup extends StObject {
  
  /**
    * @type {GPUBindGroup}
    * @private
    */
  /* private */ var bindGroup: Any
  
  /**
    * Creates a bind group descriptor in WebGPU format
    *
    * @param {import('./webgpu-graphics-device.js').WebgpuGraphicsDevice} device - Graphics device.
    * @param {import('../bind-group.js').BindGroup} bindGroup - Bind group to create the
    * descriptor for.
    * @returns {object} - Returns the generated descriptor of type
    * GPUBindGroupDescriptor, which can be used to create a GPUBindGroup
    */
  def createDescriptor(device: WebgpuGraphicsDevice, bindGroup: BindGroup): js.Object
  
  var debugFormat: String
  
  def destroy(): Unit
  
  def update(bindGroup: Any): Unit
}
object WebgpuBindGroup {
  
  inline def apply(
    bindGroup: Any,
    createDescriptor: (WebgpuGraphicsDevice, BindGroup) => js.Object,
    debugFormat: String,
    destroy: () => Unit,
    update: Any => Unit
  ): WebgpuBindGroup = {
    val __obj = js.Dynamic.literal(bindGroup = bindGroup.asInstanceOf[js.Any], createDescriptor = js.Any.fromFunction2(createDescriptor), debugFormat = debugFormat.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebgpuBindGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebgpuBindGroup] (val x: Self) extends AnyVal {
    
    inline def setBindGroup(value: Any): Self = StObject.set(x, "bindGroup", value.asInstanceOf[js.Any])
    
    inline def setCreateDescriptor(value: (WebgpuGraphicsDevice, BindGroup) => js.Object): Self = StObject.set(x, "createDescriptor", js.Any.fromFunction2(value))
    
    inline def setDebugFormat(value: String): Self = StObject.set(x, "debugFormat", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
