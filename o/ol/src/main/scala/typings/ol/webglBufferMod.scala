package typings.ol

import typings.std.Float32ArrayConstructor
import typings.std.Uint32ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglBufferMod {
  
  @JSImport("ol/webgl/Buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @classdesc
    * Object used to store an array of data as well as usage information for that data.
    * Stores typed arrays internally, either Float32Array or Uint16/32Array depending on
    * the buffer type (ARRAY_BUFFER or ELEMENT_ARRAY_BUFFER) and available extensions.
    *
    * To populate the array, you can either use:
    * * A size using `#ofSize(buffer)`
    * * An `ArrayBuffer` object using `#fromArrayBuffer(buffer)`
    * * A plain array using `#fromArray(array)`
    *
    * Note:
    * See the documentation of [WebGLRenderingContext.bufferData](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData)
    * for more info on buffer usage.
    * @api
    */
  @JSImport("ol/webgl/Buffer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WebGLArrayBuffer {
    /**
      * @param {number} type Buffer type, either ARRAY_BUFFER or ELEMENT_ARRAY_BUFFER.
      * @param {number} [usage] Intended usage, either `STATIC_DRAW`, `STREAM_DRAW` or `DYNAMIC_DRAW`.
      * Default is `DYNAMIC_DRAW`.
      */
    def this(`type`: Double) = this()
    def this(`type`: Double, usage: Double) = this()
    
    /**
      * @private
      * @type {Float32Array|Uint32Array}
      */
    /* private */ /* CompleteClass */
    var array: Any = js.native
    
    /**
      * Populates the buffer with an array of the given size.
      * @param {Array<number>} array Numerical array
      */
    /* CompleteClass */
    override def fromArray(array: js.Array[Double]): Unit = js.native
    
    /**
      * Populates the buffer with a raw binary array buffer.
      * @param {ArrayBuffer} buffer Raw binary buffer to populate the array with. Note that this buffer must have been
      * initialized for the same typed array class.
      */
    /* CompleteClass */
    override def fromArrayBuffer(buffer: js.typedarray.ArrayBuffer): Unit = js.native
    
    /**
      * Will return null if the buffer was not initialized
      * @return {Float32Array|Uint32Array} Array.
      */
    /* CompleteClass */
    override def getArray(): js.typedarray.Float32Array | js.typedarray.Uint32Array = js.native
    
    /**
      * Will return 0 if the buffer is not initialized
      * @return {number} Array size
      */
    /* CompleteClass */
    override def getSize(): Double = js.native
    
    /**
      * @return {number} Buffer type.
      */
    /* CompleteClass */
    override def getType(): Double = js.native
    
    /**
      * @return {number} Usage.
      */
    /* CompleteClass */
    override def getUsage(): Double = js.native
    
    /**
      * Populates the buffer with an array of the given size (all values will be zeroes).
      * @param {number} size Array size
      */
    /* CompleteClass */
    override def ofSize(size: Double): Unit = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ /* CompleteClass */
    var `type`: Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ /* CompleteClass */
    var usage: Any = js.native
  }
  
  inline def getArrayClassForType(`type`: Double): Float32ArrayConstructor | Uint32ArrayConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrayClassForType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Float32ArrayConstructor | Uint32ArrayConstructor]
  
  type BufferUsage = Double
  
  /**
    * @classdesc
    * Object used to store an array of data as well as usage information for that data.
    * Stores typed arrays internally, either Float32Array or Uint16/32Array depending on
    * the buffer type (ARRAY_BUFFER or ELEMENT_ARRAY_BUFFER) and available extensions.
    *
    * To populate the array, you can either use:
    * * A size using `#ofSize(buffer)`
    * * An `ArrayBuffer` object using `#fromArrayBuffer(buffer)`
    * * A plain array using `#fromArray(array)`
    *
    * Note:
    * See the documentation of [WebGLRenderingContext.bufferData](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData)
    * for more info on buffer usage.
    * @api
    */
  trait WebGLArrayBuffer extends StObject {
    
    /**
      * @private
      * @type {Float32Array|Uint32Array}
      */
    /* private */ var array: Any
    
    /**
      * Populates the buffer with an array of the given size.
      * @param {Array<number>} array Numerical array
      */
    def fromArray(array: js.Array[Double]): Unit
    
    /**
      * Populates the buffer with a raw binary array buffer.
      * @param {ArrayBuffer} buffer Raw binary buffer to populate the array with. Note that this buffer must have been
      * initialized for the same typed array class.
      */
    def fromArrayBuffer(buffer: js.typedarray.ArrayBuffer): Unit
    
    /**
      * Will return null if the buffer was not initialized
      * @return {Float32Array|Uint32Array} Array.
      */
    def getArray(): js.typedarray.Float32Array | js.typedarray.Uint32Array
    
    /**
      * Will return 0 if the buffer is not initialized
      * @return {number} Array size
      */
    def getSize(): Double
    
    /**
      * @return {number} Buffer type.
      */
    def getType(): Double
    
    /**
      * @return {number} Usage.
      */
    def getUsage(): Double
    
    /**
      * Populates the buffer with an array of the given size (all values will be zeroes).
      * @param {number} size Array size
      */
    def ofSize(size: Double): Unit
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var `type`: Any
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var usage: Any
  }
  object WebGLArrayBuffer {
    
    inline def apply(
      array: Any,
      fromArray: js.Array[Double] => Unit,
      fromArrayBuffer: js.typedarray.ArrayBuffer => Unit,
      getArray: () => js.typedarray.Float32Array | js.typedarray.Uint32Array,
      getSize: () => Double,
      getType: () => Double,
      getUsage: () => Double,
      ofSize: Double => Unit,
      `type`: Any,
      usage: Any
    ): WebGLArrayBuffer = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], fromArray = js.Any.fromFunction1(fromArray), fromArrayBuffer = js.Any.fromFunction1(fromArrayBuffer), getArray = js.Any.fromFunction0(getArray), getSize = js.Any.fromFunction0(getSize), getType = js.Any.fromFunction0(getType), getUsage = js.Any.fromFunction0(getUsage), ofSize = js.Any.fromFunction1(ofSize), usage = usage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLArrayBuffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebGLArrayBuffer] (val x: Self) extends AnyVal {
      
      inline def setArray(value: Any): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setFromArray(value: js.Array[Double] => Unit): Self = StObject.set(x, "fromArray", js.Any.fromFunction1(value))
      
      inline def setFromArrayBuffer(value: js.typedarray.ArrayBuffer => Unit): Self = StObject.set(x, "fromArrayBuffer", js.Any.fromFunction1(value))
      
      inline def setGetArray(value: () => js.typedarray.Float32Array | js.typedarray.Uint32Array): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setGetUsage(value: () => Double): Self = StObject.set(x, "getUsage", js.Any.fromFunction0(value))
      
      inline def setOfSize(value: Double => Unit): Self = StObject.set(x, "ofSize", js.Any.fromFunction1(value))
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: Any): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
}
