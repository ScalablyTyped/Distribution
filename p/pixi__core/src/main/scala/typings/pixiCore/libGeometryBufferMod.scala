package typings.pixiCore

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiConstants.mod.BUFFER_TYPE
import typings.pixiCore.libGeometryGlbufferMod.GLBuffer
import typings.pixiRunner.mod.Runner
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryBufferMod {
  
  @JSImport("@pixi/core/lib/geometry/Buffer", "Buffer")
  @js.native
  /**
    * @param {PIXI.IArrayBuffer} data - the data to store in the buffer.
    * @param _static - `true` for static buffer
    * @param index - `true` for index buffer
    */
  open class Buffer () extends StObject {
    def this(data: js.typedarray.ArrayBuffer) = this()
    def this(data: js.typedarray.ArrayBuffer, _static: Boolean) = this()
    def this(data: Unit, _static: Boolean) = this()
    def this(data: js.typedarray.ArrayBuffer, _static: Boolean, index: Boolean) = this()
    def this(data: js.typedarray.ArrayBuffer, _static: Unit, index: Boolean) = this()
    def this(data: Unit, _static: Boolean, index: Boolean) = this()
    def this(data: Unit, _static: Unit, index: Boolean) = this()
    
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
  /* static members */
  object Buffer {
    
    @JSImport("@pixi/core/lib/geometry/Buffer", "Buffer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(data: js.Array[Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    /**
      * Helper function that creates a buffer based on an array or TypedArray
      * @param {ArrayBufferView | number[]} data - the TypedArray that the buffer will store. If this is a regular Array it will be converted to a Float32Array.
      * @returns - A new Buffer based on the data provided.
      */
    inline def from(data: js.typedarray.ArrayBuffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  type IArrayBuffer = js.typedarray.ArrayBuffer
  
  @js.native
  trait ITypedArray
    extends StObject
       with ArrayBuffer
       with /* index */ NumberDictionary[Double] {
    
    val BYTES_PER_ELEMENT: Double = js.native
    
    val length: Double = js.native
  }
}
