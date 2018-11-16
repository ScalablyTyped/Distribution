package typings
package photonuiLib.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -----------------------------------
@JSGlobal("photonui.Color")
@js.native
class Color () extends Base {
  def this(color: java.lang.String) = this()
  def this(params: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  var alpha: scala.Double = js.native
  var blue: scala.Double = js.native
  var brightness: scala.Double = js.native
  var green: scala.Double = js.native
  var hexString: java.lang.String = js.native
  var hue: scala.Double = js.native
   // readonly
  var red: scala.Double = js.native
  var rgbString: java.lang.String = js.native
   // readonly
  var rgbaString: java.lang.String = js.native
  var saturation: scala.Double = js.native
  def getRGB(): js.Array[scala.Double] = js.native
  def getRGBA(): js.Array[scala.Double] = js.native
  def setHSB(hue: scala.Double, saturation: scala.Double, brightness: scala.Double): scala.Unit = js.native
  def setRGB(red: scala.Double, green: scala.Double, blue: scala.Double): scala.Unit = js.native
  def setRGBA(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double): scala.Unit = js.native
}

