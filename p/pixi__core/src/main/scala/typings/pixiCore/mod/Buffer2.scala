package typings.pixiCore.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiConstants.mod.BUFFER_TYPE
import typings.pixiRunner.mod.Runner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A wrapper for data so that it can be used and uploaded by WebGL
  * @memberof PIXI
  */
@js.native
trait Buffer2 extends StObject {
  
  /**
    * A map of renderer IDs to webgl buffer
    * @private
    * @type {Object<number, GLBuffer>}
    */
  var _glBuffers: NumberDictionary[GLBuffer] = js.native
  
  var _updateID: Double = js.native
  
  /**
    * The data in the buffer, as a typed array
    * @type {PIXI.IArrayBuffer}
    */
  var data: ITypedArray = js.native
  
  /** Destroys the buffer. */
  def destroy(): Unit = js.native
  
  /** Disposes WebGL resources that are connected to this geometry. */
  def dispose(): Unit = js.native
  
  var disposeRunner: Runner = js.native
  
  var id: Double = js.native
  
  def index: Boolean = js.native
  /**
    * Flags whether this is an index buffer.
    *
    * Index buffers are of type `ELEMENT_ARRAY_BUFFER`. Note that setting this property to false will make
    * the buffer of type `ARRAY_BUFFER`.
    *
    * For backwards compatibility.
    */
  def index_=(value: Boolean): Unit = js.native
  
  var static: Boolean = js.native
  
  /**
    * The type of buffer this is, one of:
    * + ELEMENT_ARRAY_BUFFER - used as an index buffer
    * + ARRAY_BUFFER - used as an attribute buffer
    * + UNIFORM_BUFFER - used as a uniform buffer (if available)
    */
  var `type`: BUFFER_TYPE = js.native
  
  /**
    * Flags this buffer as requiring an upload to the GPU.
    * @param {PIXI.IArrayBuffer|number[]} [data] - the data to update in the buffer.
    */
  def update(): Unit = js.native
  def update(data: js.Array[Double]): Unit = js.native
  def update(data: js.typedarray.ArrayBuffer): Unit = js.native
}
