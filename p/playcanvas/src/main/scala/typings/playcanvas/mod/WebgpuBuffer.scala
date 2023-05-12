package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGPU implementation of the Buffer.
  *
  * @ignore
  */
@js.native
trait WebgpuBuffer extends StObject {
  
  /**
    * @type {GPUBuffer}
    * @private
    */
  /* private */ var buffer: Any = js.native
  
  def destroy(device: Any): Unit = js.native
  
  def initialized: Boolean = js.native
  
  def loseContext(): Unit = js.native
  
  /**
    * @param {import('./webgpu-graphics-device.js').WebgpuGraphicsDevice} device - Graphics device.
    * @param {*} usage -
    * @param {*} target -
    * @param {*} storage -
    */
  def unlock(device: WebgpuGraphicsDevice, usage: Any, target: Any, storage: Any): Unit = js.native
}
