package typings.photonui.photonuiNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -----------------------------------
@JSGlobal("photonui.Color")
@js.native
class Color () extends Base {
  def this(color: String) = this()
  def this(params: StringDictionary[js.Any]) = this()
  var alpha: Double = js.native
  var blue: Double = js.native
  var brightness: Double = js.native
  var green: Double = js.native
  var hexString: String = js.native
  var hue: Double = js.native
   // readonly
  var red: Double = js.native
  var rgbString: String = js.native
   // readonly
  var rgbaString: String = js.native
  var saturation: Double = js.native
  def getRGB(): js.Array[Double] = js.native
  def getRGBA(): js.Array[Double] = js.native
  def setHSB(hue: Double, saturation: Double, brightness: Double): Unit = js.native
  def setRGB(red: Double, green: Double, blue: Double): Unit = js.native
  def setRGBA(red: Double, green: Double, blue: Double, alpha: Double): Unit = js.native
}

