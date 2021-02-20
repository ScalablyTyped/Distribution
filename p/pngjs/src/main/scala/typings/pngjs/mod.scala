package typings.pngjs

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.pngjs.anon.Blue
import typings.pngjs.anon.FnCall
import typings.pngjs.anon.Read
import typings.pngjs.pngjsNumbers.`16`
import typings.pngjs.pngjsNumbers.`1`
import typings.pngjs.pngjsNumbers.`2`
import typings.pngjs.pngjsNumbers.`3`
import typings.pngjs.pngjsNumbers.`4`
import typings.pngjs.pngjsNumbers.`8`
import typings.pngjs.pngjsStrings.close
import typings.pngjs.pngjsStrings.error
import typings.pngjs.pngjsStrings.metadata
import typings.pngjs.pngjsStrings.parsed
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pngjs", "PNG")
  @js.native
  class PNG () extends Duplex {
    def this(options: PNGOptions) = this()
    
    def adjustGamma(): Unit = js.native
    
    def bitblt(
      dst: PNG,
      srcX: js.UndefOr[Double],
      srcY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      deltaX: js.UndefOr[Double],
      deltaY: js.UndefOr[Double]
    ): PNG = js.native
    
    var data: Buffer = js.native
    
    var gamma: Double = js.native
    
    var height: Double = js.native
    
    def on(event: String, callback: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, callback: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, callback: js.ThisFunction1[/* this */ this.type, /* error */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_metadata(event: metadata, callback: js.ThisFunction1[/* this */ this.type, /* metadata */ Metadata, Unit]): this.type = js.native
    @JSName("on")
    def on_parsed(event: parsed, callback: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
    
    def pack(): PNG = js.native
    
    def parse(data: String): PNG = js.native
    def parse(data: String, callback: js.Function2[/* error */ Error, /* data */ this.type, Unit]): PNG = js.native
    def parse(data: Buffer): PNG = js.native
    def parse(data: Buffer, callback: js.Function2[/* error */ Error, /* data */ this.type, Unit]): PNG = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object PNG {
    
    @JSImport("pngjs", "PNG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pngjs", "PNG.adjustGamma")
    @js.native
    def adjustGamma(src: PNG): Unit = js.native
    
    @JSImport("pngjs", "PNG.bitblt")
    @js.native
    def bitblt(
      src: PNG,
      dst: PNG,
      srcX: js.UndefOr[Double],
      srcY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      deltaX: js.UndefOr[Double],
      deltaY: js.UndefOr[Double]
    ): Unit = js.native
    
    @JSImport("pngjs", "PNG.sync")
    @js.native
    def sync: Read = js.native
    @scala.inline
    def sync_=(x: Read): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BaseOptions extends StObject {
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.pngjs.pngjsNumbers.`8`
    - typings.pngjs.pngjsNumbers.`16`
  */
  trait BitDepth extends StObject
  object BitDepth {
    
    @scala.inline
    def `16`: typings.pngjs.pngjsNumbers.`16` = 16.asInstanceOf[typings.pngjs.pngjsNumbers.`16`]
    
    @scala.inline
    def `8`: typings.pngjs.pngjsNumbers.`8` = 8.asInstanceOf[typings.pngjs.pngjsNumbers.`8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pngjs.pngjsNumbers.`0`
    - typings.pngjs.pngjsNumbers.`2`
    - typings.pngjs.pngjsNumbers.`4`
    - typings.pngjs.pngjsNumbers.`6`
  */
  trait ColorType extends StObject
  object ColorType {
    
    @scala.inline
    def `0`: typings.pngjs.pngjsNumbers.`0` = 0.asInstanceOf[typings.pngjs.pngjsNumbers.`0`]
    
    @scala.inline
    def `2`: typings.pngjs.pngjsNumbers.`2` = 2.asInstanceOf[typings.pngjs.pngjsNumbers.`2`]
    
    @scala.inline
    def `4`: typings.pngjs.pngjsNumbers.`4` = 4.asInstanceOf[typings.pngjs.pngjsNumbers.`4`]
    
    @scala.inline
    def `6`: typings.pngjs.pngjsNumbers.`6` = 6.asInstanceOf[typings.pngjs.pngjsNumbers.`6`]
  }
  
  @js.native
  trait Metadata extends StObject {
    
    var alpha: Boolean = js.native
    
    var bpp: `1` | `2` | `3` | `4` = js.native
    
    var color: Boolean = js.native
    
    var colorType: ColorType = js.native
    
    var depth: `1` | `2` | `4` | `8` | `16` = js.native
    
    var height: Double = js.native
    
    var interlace: Boolean = js.native
    
    var palette: Boolean = js.native
    
    var width: Double = js.native
  }
  object Metadata {
    
    @scala.inline
    def apply(
      alpha: Boolean,
      bpp: `1` | `2` | `3` | `4`,
      color: Boolean,
      colorType: ColorType,
      depth: `1` | `2` | `4` | `8` | `16`,
      height: Double,
      interlace: Boolean,
      palette: Boolean,
      width: Double
    ): Metadata = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bpp = bpp.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlace = interlace.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBpp(value: `1` | `2` | `3` | `4`): Self = StObject.set(x, "bpp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorType(value: ColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth(value: `1` | `2` | `4` | `8` | `16`): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterlace(value: Boolean): Self = StObject.set(x, "interlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalette(value: Boolean): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type PNGOptions = BaseOptions with ParserOptions with PackerOptions
  
  type PNGWithMetadata = PNG with Metadata
  
  @js.native
  trait PackerOptions extends StObject {
    
    var bgColor: js.UndefOr[Blue] = js.native
    
    var bitDepth: js.UndefOr[BitDepth] = js.native
    
    var colorType: js.UndefOr[ColorType] = js.native
    
    var deflateChunkSize: js.UndefOr[Double] = js.native
    
    var deflateFactory: js.UndefOr[FnCall] = js.native
    
    var deflateLevel: js.UndefOr[Double] = js.native
    
    var deflateStrategy: js.UndefOr[Double] = js.native
    
    var filterType: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var inputColorType: js.UndefOr[ColorType] = js.native
    
    var inputHasAlpha: js.UndefOr[Boolean] = js.native
  }
  object PackerOptions {
    
    @scala.inline
    def apply(): PackerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackerOptions]
    }
    
    @scala.inline
    implicit class PackerOptionsMutableBuilder[Self <: PackerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgColor(value: Blue): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setBitDepth(value: BitDepth): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitDepthUndefined: Self = StObject.set(x, "bitDepth", js.undefined)
      
      @scala.inline
      def setColorType(value: ColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
      
      @scala.inline
      def setDeflateChunkSize(value: Double): Self = StObject.set(x, "deflateChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateChunkSizeUndefined: Self = StObject.set(x, "deflateChunkSize", js.undefined)
      
      @scala.inline
      def setDeflateFactory(value: FnCall): Self = StObject.set(x, "deflateFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateFactoryUndefined: Self = StObject.set(x, "deflateFactory", js.undefined)
      
      @scala.inline
      def setDeflateLevel(value: Double): Self = StObject.set(x, "deflateLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateLevelUndefined: Self = StObject.set(x, "deflateLevel", js.undefined)
      
      @scala.inline
      def setDeflateStrategy(value: Double): Self = StObject.set(x, "deflateStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateStrategyUndefined: Self = StObject.set(x, "deflateStrategy", js.undefined)
      
      @scala.inline
      def setFilterType(value: Double | js.Array[Double]): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setFilterTypeVarargs(value: Double*): Self = StObject.set(x, "filterType", js.Array(value :_*))
      
      @scala.inline
      def setInputColorType(value: ColorType): Self = StObject.set(x, "inputColorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputColorTypeUndefined: Self = StObject.set(x, "inputColorType", js.undefined)
      
      @scala.inline
      def setInputHasAlpha(value: Boolean): Self = StObject.set(x, "inputHasAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputHasAlphaUndefined: Self = StObject.set(x, "inputHasAlpha", js.undefined)
    }
  }
  
  @js.native
  trait ParserOptions extends StObject {
    
    var checkCRC: js.UndefOr[Boolean] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckCRC(value: Boolean): Self = StObject.set(x, "checkCRC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckCRCUndefined: Self = StObject.set(x, "checkCRC", js.undefined)
    }
  }
}
