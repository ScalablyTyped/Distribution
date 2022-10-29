package typings.pixiCore

import typings.pixiCore.libGeometryBufferMod.ITypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryViewableBufferMod {
  
  @JSImport("@pixi/core/lib/geometry/ViewableBuffer", "ViewableBuffer")
  @js.native
  open class ViewableBuffer protected () extends StObject {
    /**
      * @param arrayBuffer - The source array buffer.
      */
    def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
    /**
      * @param length - The size of the buffer in bytes.
      */
    def this(length: Double) = this()
    
    /* private */ var _int16View: Any = js.native
    
    /* private */ var _int32View: Any = js.native
    
    /* private */ var _int8View: Any = js.native
    
    /* private */ var _uint16View: Any = js.native
    
    /* private */ var _uint8View: Any = js.native
    
    /** Destroys all buffer references. Do not use after calling this. */
    def destroy(): Unit = js.native
    
    /** View on the raw binary data as a `Float32Array`. */
    var float32View: js.typedarray.Float32Array = js.native
    
    /**  View on the raw binary data as a `Int16Array`. */
    def int16View: js.typedarray.Int16Array = js.native
    
    /** View on the raw binary data as a `Int32Array`. */
    def int32View: js.typedarray.Int32Array = js.native
    
    /** View on the raw binary data as a `Int8Array`. */
    def int8View: js.typedarray.Int8Array = js.native
    
    /** Underlying `ArrayBuffer` that holds all the data and is of capacity `this.size`. */
    var rawBinaryData: js.typedarray.ArrayBuffer = js.native
    
    var size: Double = js.native
    
    /** View on the raw binary data as a `Uint16Array`. */
    def uint16View: js.typedarray.Uint16Array = js.native
    
    /** View on the raw binary data as a `Uint32Array`. */
    var uint32View: js.typedarray.Uint32Array = js.native
    
    /** View on the raw binary data as a `Uint8Array`. */
    def uint8View: js.typedarray.Uint8Array = js.native
    
    /**
      * Returns the view of the given type.
      * @param type - One of `int8`, `uint8`, `int16`,
      *    `uint16`, `int32`, `uint32`, and `float32`.
      * @returns - typed array of given type
      */
    def view(`type`: String): ITypedArray = js.native
  }
  /* static members */
  object ViewableBuffer {
    
    @JSImport("@pixi/core/lib/geometry/ViewableBuffer", "ViewableBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sizeOf(`type`: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
