package typings.pngjs2

import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.pngjs2.pngjs2Strings.error
import typings.pngjs2.pngjs2Strings.metadata
import typings.pngjs2.pngjs2Strings.parsed
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("pngjs2", "PNG")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bitblt(
      src: PNG,
      dst: PNG,
      srcX: Double,
      srcY: Double,
      width: Double,
      height: Double,
      deltaX: Double,
      deltaY: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bitblt")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], srcX.asInstanceOf[js.Any], srcY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object sync {
      
      @JSImport("pngjs2", "PNG.sync")
      @js.native
      val ^ : js.Any = js.native
      
      inline def read(buffer: String): PNG = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any]).asInstanceOf[PNG]
      inline def read(buffer: String, options: PNGOptions): PNG = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PNG]
      inline def read(buffer: Buffer): PNG = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any]).asInstanceOf[PNG]
      inline def read(buffer: Buffer, options: PNGOptions): PNG = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PNG]
    }
  }
  
  trait PNGMetadata extends StObject {
    
    var alpha: Boolean
    
    var color: Boolean
    
    var height: Double
    
    var interlace: Boolean
    
    var palette: Boolean
    
    var width: Double
  }
  object PNGMetadata {
    
    inline def apply(
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
    
    extension [Self <: PNGMetadata](x: Self) {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInterlace(value: Boolean): Self = StObject.set(x, "interlace", value.asInstanceOf[js.Any])
      
      inline def setPalette(value: Boolean): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait PNGOptions extends StObject {
    
    var checkCRC: js.UndefOr[Boolean] = js.undefined
    
    var colorType: js.UndefOr[Double] = js.undefined
    
    var deflateChunkSize: js.UndefOr[Double] = js.undefined
    
    var deflateFactory: js.UndefOr[js.Any] = js.undefined
    
    var deflateLevel: js.UndefOr[Double] = js.undefined
    
    var deflateStrategy: js.UndefOr[Double] = js.undefined
    
    var filterType: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var inputHasAlpha: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PNGOptions {
    
    inline def apply(): PNGOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PNGOptions]
    }
    
    extension [Self <: PNGOptions](x: Self) {
      
      inline def setCheckCRC(value: Boolean): Self = StObject.set(x, "checkCRC", value.asInstanceOf[js.Any])
      
      inline def setCheckCRCUndefined: Self = StObject.set(x, "checkCRC", js.undefined)
      
      inline def setColorType(value: Double): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
      
      inline def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
      
      inline def setDeflateChunkSize(value: Double): Self = StObject.set(x, "deflateChunkSize", value.asInstanceOf[js.Any])
      
      inline def setDeflateChunkSizeUndefined: Self = StObject.set(x, "deflateChunkSize", js.undefined)
      
      inline def setDeflateFactory(value: js.Any): Self = StObject.set(x, "deflateFactory", value.asInstanceOf[js.Any])
      
      inline def setDeflateFactoryUndefined: Self = StObject.set(x, "deflateFactory", js.undefined)
      
      inline def setDeflateLevel(value: Double): Self = StObject.set(x, "deflateLevel", value.asInstanceOf[js.Any])
      
      inline def setDeflateLevelUndefined: Self = StObject.set(x, "deflateLevel", js.undefined)
      
      inline def setDeflateStrategy(value: Double): Self = StObject.set(x, "deflateStrategy", value.asInstanceOf[js.Any])
      
      inline def setDeflateStrategyUndefined: Self = StObject.set(x, "deflateStrategy", js.undefined)
      
      inline def setFilterType(value: Double | js.Array[Double]): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setFilterTypeVarargs(value: Double*): Self = StObject.set(x, "filterType", js.Array(value :_*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInputHasAlpha(value: Boolean): Self = StObject.set(x, "inputHasAlpha", value.asInstanceOf[js.Any])
      
      inline def setInputHasAlphaUndefined: Self = StObject.set(x, "inputHasAlpha", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
