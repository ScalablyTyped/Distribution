package typings.pixiJs.PIXI

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A wrapper for data so that it can be used and uploaded by WebGL
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Buffer extends StObject {
  
  /**
    * The data in the buffer, as a typed array
    *
    * @member {ArrayBuffer| SharedArrayBuffer | ArrayBufferView} PIXI.Buffer#data
    */
  var data: ArrayBuffer | SharedArrayBuffer | ArrayBufferView = js.native
  
  /**
    * Destroys the buffer
    */
  def destroy(): Unit = js.native
  
  /**
    * disposes WebGL resources that are connected to this geometry
    */
  def dispose(): Unit = js.native
  
  /**
    * flags this buffer as requiring an upload to the GPU
    * @param {ArrayBuffer|SharedArrayBuffer|ArrayBufferView} [data] - the data to update in the buffer.
    */
  def update(): Unit = js.native
  def update(data: ArrayBuffer): Unit = js.native
  def update(data: ArrayBufferView): Unit = js.native
  def update(data: SharedArrayBuffer): Unit = js.native
}
