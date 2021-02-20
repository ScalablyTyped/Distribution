package typings.pngJs

import typings.node.Buffer
import typings.pngJs.pngJsNumbers.`0`
import typings.pngJs.pngJsNumbers.`1`
import typings.std.ArrayBuffer
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("png.js", JSImport.Namespace)
  @js.native
  class ^ protected () extends PNGReader {
    def this(bytes: String) = this()
    def this(bytes: Buffer) = this()
    def this(bytes: ArrayBuffer) = this()
    def this(bytes: Uint8Array) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pngJs.pngJsNumbers.`2`
    - typings.pngJs.pngJsNumbers.`4`
    - typings.pngJs.pngJsNumbers.`8`
    - typings.pngJs.pngJsNumbers.`16`
  */
  trait BitDepth extends StObject
  object BitDepth {
    
    @scala.inline
    def `16`: typings.pngJs.pngJsNumbers.`16` = 16.asInstanceOf[typings.pngJs.pngJsNumbers.`16`]
    
    @scala.inline
    def `2`: typings.pngJs.pngJsNumbers.`2` = 2.asInstanceOf[typings.pngJs.pngJsNumbers.`2`]
    
    @scala.inline
    def `4`: typings.pngJs.pngJsNumbers.`4` = 4.asInstanceOf[typings.pngJs.pngJsNumbers.`4`]
    
    @scala.inline
    def `8`: typings.pngJs.pngJsNumbers.`8` = 8.asInstanceOf[typings.pngJs.pngJsNumbers.`8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pngJs.pngJsNumbers.`0`
    - typings.pngJs.pngJsNumbers.`2`
    - typings.pngJs.pngJsNumbers.`3`
    - typings.pngJs.pngJsNumbers.`4`
    - typings.pngJs.pngJsNumbers.`6`
  */
  trait ColorType extends StObject
  object ColorType {
    
    @scala.inline
    def `0`: typings.pngJs.pngJsNumbers.`0` = 0.asInstanceOf[typings.pngJs.pngJsNumbers.`0`]
    
    @scala.inline
    def `2`: typings.pngJs.pngJsNumbers.`2` = 2.asInstanceOf[typings.pngJs.pngJsNumbers.`2`]
    
    @scala.inline
    def `3`: typings.pngJs.pngJsNumbers.`3` = 3.asInstanceOf[typings.pngJs.pngJsNumbers.`3`]
    
    @scala.inline
    def `4`: typings.pngJs.pngJsNumbers.`4` = 4.asInstanceOf[typings.pngJs.pngJsNumbers.`4`]
    
    @scala.inline
    def `6`: typings.pngJs.pngJsNumbers.`6` = 6.asInstanceOf[typings.pngJs.pngJsNumbers.`6`]
  }
  
  @js.native
  trait PNG extends StObject {
    
    var alpha: Boolean = js.native
    
    var bitDepth: BitDepth = js.native
    
    var colorType: ColorType = js.native
    
    var colors: Double = js.native
    
    var compressionMethod: `0` = js.native
    
    var filterMethod: `0` = js.native
    
    def getBitDepth(): BitDepth = js.native
    
    def getColorType(): ColorType = js.native
    
    def getCompressionMethod(): `0` = js.native
    
    def getFilterMethod(): `0` = js.native
    
    def getHeight(): Double = js.native
    
    def getInterlaceMethod(): `0` | `1` = js.native
    
    def getPalette(): js.Array[Double] = js.native
    
    def getPixel(x: Double, y: Double): js.Tuple4[Double, Double, Double, Double] = js.native
    
    def getWidth(): Double = js.native
    
    var height: Double = js.native
    
    var interlaceMethod: `0` | `1` = js.native
    
    var palette: js.Array[Double] | Null = js.native
    
    var pixelBits: Double = js.native
    
    var pixels: Buffer | Null = js.native
    
    def setBitDepth(bitDepth: BitDepth): Unit = js.native
    
    def setColorType(colorType: ColorType): Unit = js.native
    
    @JSName("setCompressionMethod")
    def setCompressionMethod_0(compressionMethod: `0`): Unit = js.native
    
    @JSName("setFilterMethod")
    def setFilterMethod_0(filterMethod: `0`): Unit = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    @JSName("setInterlaceMethod")
    def setInterlaceMethod_0(interlaceMethod: `0`): Unit = js.native
    @JSName("setInterlaceMethod")
    def setInterlaceMethod_1(interlaceMethod: `1`): Unit = js.native
    
    def setPalette(palette: js.Array[Double]): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
    
    var width: Double = js.native
  }
  
  @js.native
  trait PNGReader extends StObject {
    
    var bytes: Uint8Array | js.Array[Double] | Buffer = js.native
    
    var dataChunks: js.Array[js.Array[Double]] = js.native
    
    var i: Double = js.native
    
    def parse(callback: ParseCallback): Unit = js.native
    def parse(options: ParseOptions, callback: ParseCallback): Unit = js.native
    
    var png: PNG = js.native
  }
  
  type ParseCallback = js.Function2[/* err */ js.UndefOr[Error], /* png */ PNG, Unit]
  
  @js.native
  trait ParseOptions extends StObject {
    
    var data: js.UndefOr[Boolean] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
}
