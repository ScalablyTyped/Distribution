package typings.pngjs2

import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.pngjs2.pngjs2Strings.error
import typings.pngjs2.pngjs2Strings.metadata
import typings.pngjs2.pngjs2Strings.parsed
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pngjs2", "PNG")
  @js.native
  class PNG () extends Writable {
    def this(options: PNGOptions) = this()
    
    def bitblt(
      dst: PNG,
      srcX: Double,
      srcY: Double,
      width: Double,
      height: Double,
      deltaX: Double,
      deltaY: Double
    ): PNG = js.native
    
    var data: Buffer = js.native
    
    var gamma: Double = js.native
    
    var height: Double = js.native
    
    def on(event: String, callback: js.Function): this.type = js.native
    @JSName("on")
    def on_error(event: error, callback: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_metadata(event: metadata, callback: js.Function1[/* metadata */ PNGMetadata, Unit]): this.type = js.native
    @JSName("on")
    def on_parsed(event: parsed, callback: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    
    def pack(): PNG = js.native
    
    def parse(data: String): PNG = js.native
    def parse(data: String, callback: js.Function2[/* err */ Error, /* data */ Buffer, Unit]): PNG = js.native
    def parse(data: Buffer): PNG = js.native
    def parse(data: Buffer, callback: js.Function2[/* err */ Error, /* data */ Buffer, Unit]): PNG = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object PNG {
    
    @JSImport("pngjs2", "PNG.bitblt")
    @js.native
    def bitblt(
      src: PNG,
      dst: PNG,
      srcX: Double,
      srcY: Double,
      width: Double,
      height: Double,
      deltaX: Double,
      deltaY: Double
    ): Unit = js.native
    
    object sync {
      
      @JSImport("pngjs2", "PNG.sync.read")
      @js.native
      def read(buffer: String): PNG = js.native
      @JSImport("pngjs2", "PNG.sync.read")
      @js.native
      def read(buffer: String, options: PNGOptions): PNG = js.native
      @JSImport("pngjs2", "PNG.sync.read")
      @js.native
      def read(buffer: Buffer): PNG = js.native
      @JSImport("pngjs2", "PNG.sync.read")
      @js.native
      def read(buffer: Buffer, options: PNGOptions): PNG = js.native
    }
  }
  
  @js.native
  trait PNGMetadata extends StObject {
    
    var alpha: Boolean = js.native
    
    var color: Boolean = js.native
    
    var height: Double = js.native
    
    var interlace: Boolean = js.native
    
    var palette: Boolean = js.native
    
    var width: Double = js.native
  }
  object PNGMetadata {
    
    @scala.inline
    def apply(
      alpha: Boolean,
      color: Boolean,
      height: Double,
      interlace: Boolean,
      palette: Boolean,
      width: Double
    ): PNGMetadata = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlace = interlace.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PNGMetadata]
    }
    
    @scala.inline
    implicit class PNGMetadataMutableBuilder[Self <: PNGMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait PNGOptions extends StObject {
    
    var checkCRC: js.UndefOr[Boolean] = js.native
    
    var colorType: js.UndefOr[Double] = js.native
    
    var deflateChunkSize: js.UndefOr[Double] = js.native
    
    var deflateFactory: js.UndefOr[js.Any] = js.native
    
    var deflateLevel: js.UndefOr[Double] = js.native
    
    var deflateStrategy: js.UndefOr[Double] = js.native
    
    var filterType: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var inputHasAlpha: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object PNGOptions {
    
    @scala.inline
    def apply(): PNGOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PNGOptions]
    }
    
    @scala.inline
    implicit class PNGOptionsMutableBuilder[Self <: PNGOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckCRC(value: Boolean): Self = StObject.set(x, "checkCRC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckCRCUndefined: Self = StObject.set(x, "checkCRC", js.undefined)
      
      @scala.inline
      def setColorType(value: Double): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
      
      @scala.inline
      def setDeflateChunkSize(value: Double): Self = StObject.set(x, "deflateChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateChunkSizeUndefined: Self = StObject.set(x, "deflateChunkSize", js.undefined)
      
      @scala.inline
      def setDeflateFactory(value: js.Any): Self = StObject.set(x, "deflateFactory", value.asInstanceOf[js.Any])
      
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
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInputHasAlpha(value: Boolean): Self = StObject.set(x, "inputHasAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputHasAlphaUndefined: Self = StObject.set(x, "inputHasAlpha", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
