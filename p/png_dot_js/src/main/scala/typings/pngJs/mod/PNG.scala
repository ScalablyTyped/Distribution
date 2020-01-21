package typings.pngJs.mod

import typings.node.Buffer
import typings.pngJs.pngJsNumbers.`0`
import typings.pngJs.pngJsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNG extends js.Object {
  var alpha: Boolean = js.native
  var bitDepth: BitDepth = js.native
  var colorType: ColorType = js.native
  var colors: Double = js.native
  var compressionMethod: `0` = js.native
  var filterMethod: `0` = js.native
  var height: Double = js.native
  var interlaceMethod: `0` | `1` = js.native
  var palette: js.Array[Double] | Null = js.native
  var pixelBits: Double = js.native
  var pixels: Buffer | Null = js.native
  var width: Double = js.native
  def getBitDepth(): BitDepth = js.native
  def getColorType(): ColorType = js.native
  def getCompressionMethod(): `0` = js.native
  def getFilterMethod(): `0` = js.native
  def getHeight(): Double = js.native
  def getInterlaceMethod(): `0` | `1` = js.native
  def getPalette(): js.Array[Double] = js.native
  def getPixel(x: Double, y: Double): js.Tuple4[Double, Double, Double, Double] = js.native
  def getWidth(): Double = js.native
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
}

