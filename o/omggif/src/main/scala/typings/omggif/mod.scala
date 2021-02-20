package typings.omggif

import typings.node.Buffer
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("omggif", "GifReader")
  @js.native
  class GifReader protected () extends StObject {
    def this(buf: Buffer) = this()
    
    def decodeAndBlitFrameBGRA(frame_num: Double, pixels: js.Array[Double]): Unit = js.native
    def decodeAndBlitFrameBGRA(frame_num: Double, pixels: Uint8Array): Unit = js.native
    def decodeAndBlitFrameBGRA(frame_num: Double, pixels: Uint8ClampedArray): Unit = js.native
    
    def decodeAndBlitFrameRGBA(frame_num: Double, pixels: js.Array[Double]): Unit = js.native
    def decodeAndBlitFrameRGBA(frame_num: Double, pixels: Uint8Array): Unit = js.native
    def decodeAndBlitFrameRGBA(frame_num: Double, pixels: Uint8ClampedArray): Unit = js.native
    
    def frameInfo(frame_num: Double): Frame = js.native
    
    var height: Double = js.native
    
    def loopCount(): Double = js.native
    
    def numFrames(): Double = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("omggif", "GifWriter")
  @js.native
  class GifWriter protected () extends StObject {
    def this(buf: Buffer, width: Double, height: Double) = this()
    def this(buf: Buffer, width: Double, height: Double, gopts: GifOptions) = this()
    
    def addFrame(x: Double, y: Double, w: Double, h: Double, indexed_pixels: js.Array[Double]): Double = js.native
    def addFrame(x: Double, y: Double, w: Double, h: Double, indexed_pixels: js.Array[Double], opts: FrameOptions): Double = js.native
    
    def end(): Double = js.native
    
    def getOutputBuffer(): Buffer = js.native
    
    def getOutputBufferPosition(): Double = js.native
    
    var height: Double = js.native
    
    def setOutputBuffer(v: Buffer): Unit = js.native
    
    def setOutputBufferPosition(v: Double): Unit = js.native
    
    var width: Double = js.native
  }
  
  @js.native
  trait Frame extends StObject {
    
    var data_length: Double = js.native
    
    var data_offset: Double = js.native
    
    var delay: Double = js.native
    
    var disposal: Double = js.native
    
    var has_local_palette: Boolean = js.native
    
    var height: Double = js.native
    
    var interlaced: Boolean = js.native
    
    var palette_offset: Double | Null = js.native
    
    var palette_size: Double | Null = js.native
    
    var transparent_index: Double | Null = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Frame {
    
    @scala.inline
    def apply(
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
      val __obj = js.Dynamic.literal(data_length = data_length.asInstanceOf[js.Any], data_offset = data_offset.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], disposal = disposal.asInstanceOf[js.Any], has_local_palette = has_local_palette.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlaced = interlaced.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    @scala.inline
    implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData_length(value: Double): Self = StObject.set(x, "data_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_offset(value: Double): Self = StObject.set(x, "data_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisposal(value: Double): Self = StObject.set(x, "disposal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_local_palette(value: Boolean): Self = StObject.set(x, "has_local_palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterlaced(value: Boolean): Self = StObject.set(x, "interlaced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalette_offset(value: Double): Self = StObject.set(x, "palette_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalette_offsetNull: Self = StObject.set(x, "palette_offset", null)
      
      @scala.inline
      def setPalette_size(value: Double): Self = StObject.set(x, "palette_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalette_sizeNull: Self = StObject.set(x, "palette_size", null)
      
      @scala.inline
      def setTransparent_index(value: Double): Self = StObject.set(x, "transparent_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparent_indexNull: Self = StObject.set(x, "transparent_index", null)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FrameOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
    
    var disposal: js.UndefOr[Double] = js.native
    
    var palette: js.UndefOr[js.Array[Double] | Null] = js.native
    
    var transparent: js.UndefOr[Double] = js.native
  }
  object FrameOptions {
    
    @scala.inline
    def apply(): FrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameOptions]
    }
    
    @scala.inline
    implicit class FrameOptionsMutableBuilder[Self <: FrameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDisposal(value: Double): Self = StObject.set(x, "disposal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisposalUndefined: Self = StObject.set(x, "disposal", js.undefined)
      
      @scala.inline
      def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteNull: Self = StObject.set(x, "palette", null)
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value :_*))
      
      @scala.inline
      def setTransparent(value: Double): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
  
  @js.native
  trait GifOptions extends StObject {
    
    var background: js.UndefOr[Double] = js.native
    
    var loop: js.UndefOr[Double] = js.native
    
    var palette: js.UndefOr[js.Array[Double]] = js.native
  }
  object GifOptions {
    
    @scala.inline
    def apply(): GifOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GifOptions]
    }
    
    @scala.inline
    implicit class GifOptionsMutableBuilder[Self <: GifOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: Double): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value :_*))
    }
  }
}
