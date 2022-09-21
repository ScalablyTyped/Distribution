package typings.pngAsync

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("png-async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait EDeflateStrategy extends StObject
  @JSImport("png-async", "EDeflateStrategy")
  @js.native
  object EDeflateStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EDeflateStrategy & Double] = js.native
    
    @js.native
    sealed trait DEFAULT_STRATEGY
      extends StObject
         with EDeflateStrategy
    /* 0 */ val DEFAULT_STRATEGY: typings.pngAsync.mod.EDeflateStrategy.DEFAULT_STRATEGY & Double = js.native
    
    @js.native
    sealed trait FILTERED
      extends StObject
         with EDeflateStrategy
    /* 1 */ val FILTERED: typings.pngAsync.mod.EDeflateStrategy.FILTERED & Double = js.native
    
    @js.native
    sealed trait FIXED
      extends StObject
         with EDeflateStrategy
    /* 4 */ val FIXED: typings.pngAsync.mod.EDeflateStrategy.FIXED & Double = js.native
    
    @js.native
    sealed trait HUFFMAN_ONLY
      extends StObject
         with EDeflateStrategy
    /* 2 */ val HUFFMAN_ONLY: typings.pngAsync.mod.EDeflateStrategy.HUFFMAN_ONLY & Double = js.native
    
    @js.native
    sealed trait RLE
      extends StObject
         with EDeflateStrategy
    /* 3 */ val RLE: typings.pngAsync.mod.EDeflateStrategy.RLE & Double = js.native
  }
  
  @js.native
  sealed trait EFilterType extends StObject
  @JSImport("png-async", "EFilterType")
  @js.native
  object EFilterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EFilterType & Double] = js.native
    
    @js.native
    sealed trait Auto
      extends StObject
         with EFilterType
    /* -1 */ val Auto: typings.pngAsync.mod.EFilterType.Auto & Double = js.native
    
    @js.native
    sealed trait Average
      extends StObject
         with EFilterType
    /* 3 */ val Average: typings.pngAsync.mod.EFilterType.Average & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with EFilterType
    /* 0 */ val None: typings.pngAsync.mod.EFilterType.None & Double = js.native
    
    @js.native
    sealed trait Paeth
      extends StObject
         with EFilterType
    /* 4 */ val Paeth: typings.pngAsync.mod.EFilterType.Paeth & Double = js.native
    
    @js.native
    sealed trait Sub
      extends StObject
         with EFilterType
    /* 1 */ val Sub: typings.pngAsync.mod.EFilterType.Sub & Double = js.native
    
    @js.native
    sealed trait Up
      extends StObject
         with EFilterType
    /* 2 */ val Up: typings.pngAsync.mod.EFilterType.Up & Double = js.native
  }
  
  @JSImport("png-async", "Image")
  @js.native
  open class Image () extends Duplex {
    def this(option: IImageOptions) = this()
    
    /* private */ var _gamma: Any = js.native
    
    /* private */ var _handleClose: Any = js.native
    
    /* private */ var _metadata: Any = js.native
    
    /* private */ var _packer: Any = js.native
    
    /* private */ var _parser: Any = js.native
    
    def _read(): Unit = js.native
    
    def _write(data: Any, encoding: Any, callback: Any): Boolean = js.native
    
    def bitblt(dst: Image, sx: Double, sy: Double, w: Double, h: Double, dx: Double, dy: Double): this.type = js.native
    
    var data: Buffer = js.native
    
    var gamma: Double = js.native
    
    var height: Double = js.native
    
    def pack(): Image = js.native
    
    def parse(data: Buffer): Image = js.native
    def parse(data: Buffer, callback: js.Function2[/* err */ js.Error, /* image */ this.type, Unit]): Image = js.native
    
    var width: Double = js.native
  }
  
  inline def createImage(): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("createImage")().asInstanceOf[Image]
  inline def createImage(option: IImageOptions): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("createImage")(option.asInstanceOf[js.Any]).asInstanceOf[Image]
  
  trait IImageOptions extends StObject {
    
    var checkCRC: js.UndefOr[Boolean] = js.undefined
    
    var deflateChunkSize: js.UndefOr[Double] = js.undefined
    
    var deflateLevel: js.UndefOr[Double] = js.undefined
    
    var deflateStrategy: js.UndefOr[EDeflateStrategy] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var filterType: js.UndefOr[EFilterType] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object IImageOptions {
    
    inline def apply(): IImageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageOptions]
    }
    
    extension [Self <: IImageOptions](x: Self) {
      
      inline def setCheckCRC(value: Boolean): Self = StObject.set(x, "checkCRC", value.asInstanceOf[js.Any])
      
      inline def setCheckCRCUndefined: Self = StObject.set(x, "checkCRC", js.undefined)
      
      inline def setDeflateChunkSize(value: Double): Self = StObject.set(x, "deflateChunkSize", value.asInstanceOf[js.Any])
      
      inline def setDeflateChunkSizeUndefined: Self = StObject.set(x, "deflateChunkSize", js.undefined)
      
      inline def setDeflateLevel(value: Double): Self = StObject.set(x, "deflateLevel", value.asInstanceOf[js.Any])
      
      inline def setDeflateLevelUndefined: Self = StObject.set(x, "deflateLevel", js.undefined)
      
      inline def setDeflateStrategy(value: EDeflateStrategy): Self = StObject.set(x, "deflateStrategy", value.asInstanceOf[js.Any])
      
      inline def setDeflateStrategyUndefined: Self = StObject.set(x, "deflateStrategy", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilterType(value: EFilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
