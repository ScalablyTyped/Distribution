package typings.pngAsync

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait EDeflateStrategy extends StObject
  @JSImport("png-async", "EDeflateStrategy")
  @js.native
  object EDeflateStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EDeflateStrategy with Double] = js.native
    
    @js.native
    sealed trait DEFAULT_STRATEGY extends EDeflateStrategy
    /* 0 */ val DEFAULT_STRATEGY: typings.pngAsync.mod.EDeflateStrategy.DEFAULT_STRATEGY with Double = js.native
    
    @js.native
    sealed trait FILTERED extends EDeflateStrategy
    /* 1 */ val FILTERED: typings.pngAsync.mod.EDeflateStrategy.FILTERED with Double = js.native
    
    @js.native
    sealed trait FIXED extends EDeflateStrategy
    /* 4 */ val FIXED: typings.pngAsync.mod.EDeflateStrategy.FIXED with Double = js.native
    
    @js.native
    sealed trait HUFFMAN_ONLY extends EDeflateStrategy
    /* 2 */ val HUFFMAN_ONLY: typings.pngAsync.mod.EDeflateStrategy.HUFFMAN_ONLY with Double = js.native
    
    @js.native
    sealed trait RLE extends EDeflateStrategy
    /* 3 */ val RLE: typings.pngAsync.mod.EDeflateStrategy.RLE with Double = js.native
  }
  
  @js.native
  sealed trait EFilterType extends StObject
  @JSImport("png-async", "EFilterType")
  @js.native
  object EFilterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EFilterType with Double] = js.native
    
    @js.native
    sealed trait Auto extends EFilterType
    /* -1 */ val Auto: typings.pngAsync.mod.EFilterType.Auto with Double = js.native
    
    @js.native
    sealed trait Average extends EFilterType
    /* 3 */ val Average: typings.pngAsync.mod.EFilterType.Average with Double = js.native
    
    @js.native
    sealed trait None extends EFilterType
    /* 0 */ val None: typings.pngAsync.mod.EFilterType.None with Double = js.native
    
    @js.native
    sealed trait Paeth extends EFilterType
    /* 4 */ val Paeth: typings.pngAsync.mod.EFilterType.Paeth with Double = js.native
    
    @js.native
    sealed trait Sub extends EFilterType
    /* 1 */ val Sub: typings.pngAsync.mod.EFilterType.Sub with Double = js.native
    
    @js.native
    sealed trait Up extends EFilterType
    /* 2 */ val Up: typings.pngAsync.mod.EFilterType.Up with Double = js.native
  }
  
  @JSImport("png-async", "Image")
  @js.native
  class Image () extends Duplex {
    def this(option: IImageOptions) = this()
    
    var _gamma: js.Any = js.native
    
    var _handleClose: js.Any = js.native
    
    var _metadata: js.Any = js.native
    
    var _packer: js.Any = js.native
    
    var _parser: js.Any = js.native
    
    def _read(): Unit = js.native
    
    def _write(data: js.Any, encoding: js.Any, callback: js.Any): Boolean = js.native
    
    def bitblt(dst: Image, sx: Double, sy: Double, w: Double, h: Double, dx: Double, dy: Double): this.type = js.native
    
    var data: Buffer = js.native
    
    var gamma: Double = js.native
    
    var height: Double = js.native
    
    def pack(): Image = js.native
    
    def parse(data: Buffer): Image = js.native
    def parse(data: Buffer, callback: js.Function2[/* err */ Error, /* image */ this.type, Unit]): Image = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("png-async", "createImage")
  @js.native
  def createImage(): Image = js.native
  @JSImport("png-async", "createImage")
  @js.native
  def createImage(option: IImageOptions): Image = js.native
  
  @js.native
  trait IImageOptions extends StObject {
    
    var checkCRC: js.UndefOr[Boolean] = js.native
    
    var deflateChunkSize: js.UndefOr[Double] = js.native
    
    var deflateLevel: js.UndefOr[Double] = js.native
    
    var deflateStrategy: js.UndefOr[EDeflateStrategy] = js.native
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var filterType: js.UndefOr[EFilterType] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object IImageOptions {
    
    @scala.inline
    def apply(): IImageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageOptions]
    }
    
    @scala.inline
    implicit class IImageOptionsMutableBuilder[Self <: IImageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckCRC(value: Boolean): Self = StObject.set(x, "checkCRC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckCRCUndefined: Self = StObject.set(x, "checkCRC", js.undefined)
      
      @scala.inline
      def setDeflateChunkSize(value: Double): Self = StObject.set(x, "deflateChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateChunkSizeUndefined: Self = StObject.set(x, "deflateChunkSize", js.undefined)
      
      @scala.inline
      def setDeflateLevel(value: Double): Self = StObject.set(x, "deflateLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateLevelUndefined: Self = StObject.set(x, "deflateLevel", js.undefined)
      
      @scala.inline
      def setDeflateStrategy(value: EDeflateStrategy): Self = StObject.set(x, "deflateStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateStrategyUndefined: Self = StObject.set(x, "deflateStrategy", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFilterType(value: EFilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
