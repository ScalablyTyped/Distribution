package typings.ol

import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Float32ArrayConstructor
import typings.std.Uint32Array
import typings.std.Uint32ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  @JSImport("ol/webgl/Buffer", JSImport.Default)
  @js.native
  class default protected () extends WebGLArrayBuffer {
    def this(`type`: Double) = this()
    def this(`type`: Double, opt_usage: Double) = this()
  }
  
  @js.native
  sealed trait BufferUsage extends StObject
  @JSImport("ol/webgl/Buffer", "BufferUsage")
  @js.native
  object BufferUsage extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BufferUsage with Double] = js.native
    
    @js.native
    sealed trait DYNAMIC_DRAW extends BufferUsage
    /* 35048 */ val DYNAMIC_DRAW: typings.ol.bufferMod.BufferUsage.DYNAMIC_DRAW with Double = js.native
    
    @js.native
    sealed trait STATIC_DRAW extends BufferUsage
    /* 35044 */ val STATIC_DRAW: typings.ol.bufferMod.BufferUsage.STATIC_DRAW with Double = js.native
    
    @js.native
    sealed trait STREAM_DRAW extends BufferUsage
    /* 35040 */ val STREAM_DRAW: typings.ol.bufferMod.BufferUsage.STREAM_DRAW with Double = js.native
  }
  
  @JSImport("ol/webgl/Buffer", "getArrayClassForType")
  @js.native
  def getArrayClassForType(`type`: Double): Float32ArrayConstructor | Uint32ArrayConstructor = js.native
  
  @js.native
  trait WebGLArrayBuffer extends StObject {
    
    /**
      * Populates the buffer with an array of the given size (all values will be zeroes).
      */
    def fromArray(array: js.Array[Double]): Unit = js.native
    
    /**
      * Populates the buffer with a raw binary array buffer.
      */
    def fromArrayBuffer(buffer: ArrayBuffer): Unit = js.native
    
    /**
      * Will return null if the buffer was not initialized
      */
    def getArray(): Float32Array | Uint32Array = js.native
    
    /**
      * Will return 0 if the buffer is not initialized
      */
    def getSize(): Double = js.native
    
    def getType(): Double = js.native
    
    def getUsage(): Double = js.native
    
    /**
      * Populates the buffer with an array of the given size (all values will be zeroes).
      */
    def ofSize(size: Double): Unit = js.native
  }
  object WebGLArrayBuffer {
    
    @scala.inline
    def apply(
      fromArray: js.Array[Double] => Unit,
      fromArrayBuffer: ArrayBuffer => Unit,
      getArray: () => Float32Array | Uint32Array,
      getSize: () => Double,
      getType: () => Double,
      getUsage: () => Double,
      ofSize: Double => Unit
    ): WebGLArrayBuffer = {
      val __obj = js.Dynamic.literal(fromArray = js.Any.fromFunction1(fromArray), fromArrayBuffer = js.Any.fromFunction1(fromArrayBuffer), getArray = js.Any.fromFunction0(getArray), getSize = js.Any.fromFunction0(getSize), getType = js.Any.fromFunction0(getType), getUsage = js.Any.fromFunction0(getUsage), ofSize = js.Any.fromFunction1(ofSize))
      __obj.asInstanceOf[WebGLArrayBuffer]
    }
    
    @scala.inline
    implicit class WebGLArrayBufferMutableBuilder[Self <: WebGLArrayBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromArray(value: js.Array[Double] => Unit): Self = StObject.set(x, "fromArray", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromArrayBuffer(value: ArrayBuffer => Unit): Self = StObject.set(x, "fromArrayBuffer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetArray(value: () => Float32Array | Uint32Array): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSize(value: () => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUsage(value: () => Double): Self = StObject.set(x, "getUsage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOfSize(value: Double => Unit): Self = StObject.set(x, "ofSize", js.Any.fromFunction1(value))
    }
  }
}
