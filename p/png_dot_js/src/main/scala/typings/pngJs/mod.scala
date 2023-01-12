package typings.pngJs

import typings.node.bufferMod.global.Buffer
import typings.pngJs.pngJsInts.`0`
import typings.pngJs.pngJsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("png.js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PNGReader {
    def this(bytes: String) = this()
    def this(bytes: js.typedarray.ArrayBuffer) = this()
    def this(bytes: js.typedarray.Uint8Array) = this()
    def this(bytes: Buffer) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pngJs.pngJsInts.`2`
    - typings.pngJs.pngJsInts.`4`
    - typings.pngJs.pngJsInts.`8`
    - typings.pngJs.pngJsInts.`16`
  */
  trait BitDepth extends StObject
  object BitDepth {
    
    inline def `16`: typings.pngJs.pngJsInts.`16` = 16.asInstanceOf[typings.pngJs.pngJsInts.`16`]
    
    inline def `2`: typings.pngJs.pngJsInts.`2` = 2.asInstanceOf[typings.pngJs.pngJsInts.`2`]
    
    inline def `4`: typings.pngJs.pngJsInts.`4` = 4.asInstanceOf[typings.pngJs.pngJsInts.`4`]
    
    inline def `8`: typings.pngJs.pngJsInts.`8` = 8.asInstanceOf[typings.pngJs.pngJsInts.`8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pngJs.pngJsInts.`0`
    - typings.pngJs.pngJsInts.`2`
    - typings.pngJs.pngJsInts.`3`
    - typings.pngJs.pngJsInts.`4`
    - typings.pngJs.pngJsInts.`6`
  */
  trait ColorType extends StObject
  object ColorType {
    
    inline def `0`: typings.pngJs.pngJsInts.`0` = 0.asInstanceOf[typings.pngJs.pngJsInts.`0`]
    
    inline def `2`: typings.pngJs.pngJsInts.`2` = 2.asInstanceOf[typings.pngJs.pngJsInts.`2`]
    
    inline def `3`: typings.pngJs.pngJsInts.`3` = 3.asInstanceOf[typings.pngJs.pngJsInts.`3`]
    
    inline def `4`: typings.pngJs.pngJsInts.`4` = 4.asInstanceOf[typings.pngJs.pngJsInts.`4`]
    
    inline def `6`: typings.pngJs.pngJsInts.`6` = 6.asInstanceOf[typings.pngJs.pngJsInts.`6`]
  }
  
  trait PNG extends StObject {
    
    var alpha: Boolean
    
    var bitDepth: BitDepth
    
    var colorType: ColorType
    
    var colors: Double
    
    var compressionMethod: `0`
    
    var filterMethod: `0`
    
    def getBitDepth(): BitDepth
    
    def getColorType(): ColorType
    
    def getCompressionMethod(): `0`
    
    def getFilterMethod(): `0`
    
    def getHeight(): Double
    
    def getInterlaceMethod(): `0` | `1`
    
    def getPalette(): js.Array[Double]
    
    def getPixel(x: Double, y: Double): js.Tuple4[Double, Double, Double, Double]
    
    def getWidth(): Double
    
    var height: Double
    
    var interlaceMethod: `0` | `1`
    
    var palette: js.Array[Double] | Null
    
    var pixelBits: Double
    
    var pixels: Buffer | Null
    
    def setBitDepth(bitDepth: BitDepth): Unit
    
    def setColorType(colorType: ColorType): Unit
    
    @JSName("setCompressionMethod")
    def setCompressionMethod_0(compressionMethod: `0`): Unit
    
    @JSName("setFilterMethod")
    def setFilterMethod_0(filterMethod: `0`): Unit
    
    def setHeight(height: Double): Unit
    
    def setInterlaceMethod(interlaceMethod: `0` | `1`): Unit
    
    def setPalette(palette: js.Array[Double]): Unit
    
    def setWidth(width: Double): Unit
    
    var width: Double
  }
  object PNG {
    
    inline def apply(
      alpha: Boolean,
      bitDepth: BitDepth,
      colorType: ColorType,
      colors: Double,
      getBitDepth: () => BitDepth,
      getColorType: () => ColorType,
      getCompressionMethod: () => `0`,
      getFilterMethod: () => `0`,
      getHeight: () => Double,
      getInterlaceMethod: () => `0` | `1`,
      getPalette: () => js.Array[Double],
      getPixel: (Double, Double) => js.Tuple4[Double, Double, Double, Double],
      getWidth: () => Double,
      height: Double,
      interlaceMethod: `0` | `1`,
      pixelBits: Double,
      setBitDepth: BitDepth => Unit,
      setColorType: ColorType => Unit,
      setCompressionMethod: `0` => Unit,
      setFilterMethod: `0` => Unit,
      setHeight: Double => Unit,
      setInterlaceMethod: `0` | `1` => Unit,
      setPalette: js.Array[Double] => Unit,
      setWidth: Double => Unit,
      width: Double
    ): PNG = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bitDepth = bitDepth.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], compressionMethod = 0, filterMethod = 0, getBitDepth = js.Any.fromFunction0(getBitDepth), getColorType = js.Any.fromFunction0(getColorType), getCompressionMethod = js.Any.fromFunction0(getCompressionMethod), getFilterMethod = js.Any.fromFunction0(getFilterMethod), getHeight = js.Any.fromFunction0(getHeight), getInterlaceMethod = js.Any.fromFunction0(getInterlaceMethod), getPalette = js.Any.fromFunction0(getPalette), getPixel = js.Any.fromFunction2(getPixel), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], interlaceMethod = interlaceMethod.asInstanceOf[js.Any], pixelBits = pixelBits.asInstanceOf[js.Any], setBitDepth = js.Any.fromFunction1(setBitDepth), setColorType = js.Any.fromFunction1(setColorType), setCompressionMethod = js.Any.fromFunction1(setCompressionMethod), setFilterMethod = js.Any.fromFunction1(setFilterMethod), setHeight = js.Any.fromFunction1(setHeight), setInterlaceMethod = js.Any.fromFunction1(setInterlaceMethod), setPalette = js.Any.fromFunction1(setPalette), setWidth = js.Any.fromFunction1(setWidth), width = width.asInstanceOf[js.Any], palette = null, pixels = null)
      __obj.asInstanceOf[PNG]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PNG] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBitDepth(value: BitDepth): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      inline def setColorType(value: ColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
      
      inline def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setCompressionMethod(value: `0`): Self = StObject.set(x, "compressionMethod", value.asInstanceOf[js.Any])
      
      inline def setFilterMethod(value: `0`): Self = StObject.set(x, "filterMethod", value.asInstanceOf[js.Any])
      
      inline def setGetBitDepth(value: () => BitDepth): Self = StObject.set(x, "getBitDepth", js.Any.fromFunction0(value))
      
      inline def setGetColorType(value: () => ColorType): Self = StObject.set(x, "getColorType", js.Any.fromFunction0(value))
      
      inline def setGetCompressionMethod(value: () => `0`): Self = StObject.set(x, "getCompressionMethod", js.Any.fromFunction0(value))
      
      inline def setGetFilterMethod(value: () => `0`): Self = StObject.set(x, "getFilterMethod", js.Any.fromFunction0(value))
      
      inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetInterlaceMethod(value: () => `0` | `1`): Self = StObject.set(x, "getInterlaceMethod", js.Any.fromFunction0(value))
      
      inline def setGetPalette(value: () => js.Array[Double]): Self = StObject.set(x, "getPalette", js.Any.fromFunction0(value))
      
      inline def setGetPixel(value: (Double, Double) => js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "getPixel", js.Any.fromFunction2(value))
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInterlaceMethod(value: `0` | `1`): Self = StObject.set(x, "interlaceMethod", value.asInstanceOf[js.Any])
      
      inline def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteNull: Self = StObject.set(x, "palette", null)
      
      inline def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value*))
      
      inline def setPixelBits(value: Double): Self = StObject.set(x, "pixelBits", value.asInstanceOf[js.Any])
      
      inline def setPixels(value: Buffer): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
      
      inline def setPixelsNull: Self = StObject.set(x, "pixels", null)
      
      inline def setSetBitDepth(value: BitDepth => Unit): Self = StObject.set(x, "setBitDepth", js.Any.fromFunction1(value))
      
      inline def setSetColorType(value: ColorType => Unit): Self = StObject.set(x, "setColorType", js.Any.fromFunction1(value))
      
      inline def setSetCompressionMethod(value: `0` => Unit): Self = StObject.set(x, "setCompressionMethod", js.Any.fromFunction1(value))
      
      inline def setSetFilterMethod(value: `0` => Unit): Self = StObject.set(x, "setFilterMethod", js.Any.fromFunction1(value))
      
      inline def setSetHeight(value: Double => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      inline def setSetInterlaceMethod(value: `0` | `1` => Unit): Self = StObject.set(x, "setInterlaceMethod", js.Any.fromFunction1(value))
      
      inline def setSetPalette(value: js.Array[Double] => Unit): Self = StObject.set(x, "setPalette", js.Any.fromFunction1(value))
      
      inline def setSetWidth(value: Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PNGReader extends StObject {
    
    var bytes: js.typedarray.Uint8Array | js.Array[Double] | Buffer = js.native
    
    var dataChunks: js.Array[js.Array[Double]] = js.native
    
    var i: Double = js.native
    
    def parse(callback: ParseCallback): Unit = js.native
    def parse(options: ParseOptions, callback: ParseCallback): Unit = js.native
    
    var png: PNG = js.native
  }
  
  type ParseCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* png */ PNG, Unit]
  
  trait ParseOptions extends StObject {
    
    var data: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
}
