package typings.omggif

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("omggif", "GifReader")
  @js.native
  open class GifReader protected () extends StObject {
    /**
      * @param buf - Uint8Array is a common choice.
      * Can be any type that supports the bracket accessor: Array, Uint8Array, Node Buffer, etc.
      */
    def this(buf: GifBinary) = this()
    
    def decodeAndBlitFrameBGRA(frame_num: Double, pixels: js.Array[Double]): Unit = js.native
    def decodeAndBlitFrameBGRA(frame_num: Double, pixels: js.typedarray.Uint8Array): Unit = js.native
    def decodeAndBlitFrameBGRA(frame_num: Double, pixels: js.typedarray.Uint8ClampedArray): Unit = js.native
    
    def decodeAndBlitFrameRGBA(frame_num: Double, pixels: js.Array[Double]): Unit = js.native
    def decodeAndBlitFrameRGBA(frame_num: Double, pixels: js.typedarray.Uint8Array): Unit = js.native
    def decodeAndBlitFrameRGBA(frame_num: Double, pixels: js.typedarray.Uint8ClampedArray): Unit = js.native
    
    def frameInfo(frame_num: Double): Frame = js.native
    
    var height: Double = js.native
    
    def loopCount(): Double = js.native
    
    def numFrames(): Double = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("omggif", "GifWriter")
  @js.native
  open class GifWriter protected () extends StObject {
    /**
      * @param buf - Uint8Array is a common choice.
      * Can be any type that supports the bracket accessor: Array, Uint8Array, Node Buffer, etc.
      */
    def this(buf: GifBinary, width: Double, height: Double) = this()
    def this(buf: GifBinary, width: Double, height: Double, gopts: GifOptions) = this()
    
    def addFrame(x: Double, y: Double, w: Double, h: Double, indexed_pixels: js.Array[Double]): Double = js.native
    def addFrame(x: Double, y: Double, w: Double, h: Double, indexed_pixels: js.Array[Double], opts: FrameOptions): Double = js.native
    
    def end(): Double = js.native
    
    def getOutputBuffer(): GifBinary = js.native
    
    def getOutputBufferPosition(): Double = js.native
    
    var height: Double = js.native
    
    def setOutputBuffer(v: GifBinary): Unit = js.native
    
    def setOutputBufferPosition(v: Double): Unit = js.native
    
    var width: Double = js.native
  }
  
  trait Frame extends StObject {
    
    var data_length: Double
    
    var data_offset: Double
    
    var delay: Double
    
    var disposal: Double
    
    var has_local_palette: Boolean
    
    var height: Double
    
    var interlaced: Boolean
    
    var palette_offset: Double | Null
    
    var palette_size: Double | Null
    
    var transparent_index: Double | Null
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Frame {
    
    inline def apply(
      data_length: Double,
      data_offset: Double,
      delay: Double,
      disposal: Double,
      has_local_palette: Boolean,
      height: Double,
      interlaced: Boolean,
      width: Double,
      x: Double,
      y: Double
    ): Frame = {
      val __obj = js.Dynamic.literal(data_length = data_length.asInstanceOf[js.Any], data_offset = data_offset.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], disposal = disposal.asInstanceOf[js.Any], has_local_palette = has_local_palette.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlaced = interlaced.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], palette_offset = null, palette_size = null, transparent_index = null)
      __obj.asInstanceOf[Frame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
      
      inline def setData_length(value: Double): Self = StObject.set(x, "data_length", value.asInstanceOf[js.Any])
      
      inline def setData_offset(value: Double): Self = StObject.set(x, "data_offset", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDisposal(value: Double): Self = StObject.set(x, "disposal", value.asInstanceOf[js.Any])
      
      inline def setHas_local_palette(value: Boolean): Self = StObject.set(x, "has_local_palette", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInterlaced(value: Boolean): Self = StObject.set(x, "interlaced", value.asInstanceOf[js.Any])
      
      inline def setPalette_offset(value: Double): Self = StObject.set(x, "palette_offset", value.asInstanceOf[js.Any])
      
      inline def setPalette_offsetNull: Self = StObject.set(x, "palette_offset", null)
      
      inline def setPalette_size(value: Double): Self = StObject.set(x, "palette_size", value.asInstanceOf[js.Any])
      
      inline def setPalette_sizeNull: Self = StObject.set(x, "palette_size", null)
      
      inline def setTransparent_index(value: Double): Self = StObject.set(x, "transparent_index", value.asInstanceOf[js.Any])
      
      inline def setTransparent_indexNull: Self = StObject.set(x, "transparent_index", null)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrameOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var disposal: js.UndefOr[Double] = js.undefined
    
    var palette: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    var transparent: js.UndefOr[Double] = js.undefined
  }
  object FrameOptions {
    
    inline def apply(): FrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FrameOptions] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisposal(value: Double): Self = StObject.set(x, "disposal", value.asInstanceOf[js.Any])
      
      inline def setDisposalUndefined: Self = StObject.set(x, "disposal", js.undefined)
      
      inline def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteNull: Self = StObject.set(x, "palette", null)
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value*))
      
      inline def setTransparent(value: Double): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
  
  trait GifBinary
    extends StObject
       with /* index */ NumberDictionary[Double] {
    
    val length: Double
  }
  object GifBinary {
    
    inline def apply(length: Double): GifBinary = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[GifBinary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GifBinary] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait GifOptions extends StObject {
    
    var background: js.UndefOr[Double] = js.undefined
    
    var loop: js.UndefOr[Double] = js.undefined
    
    var palette: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object GifOptions {
    
    inline def apply(): GifOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GifOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GifOptions] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: Double): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value*))
    }
  }
}
