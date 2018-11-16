package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  def setAlpha(alpha: scala.Double): scala.Unit = js.native
  def setBlue(blue: scala.Double): scala.Unit = js.native
  def setGreen(green: scala.Double): scala.Unit = js.native
  def setRed(red: scala.Double): scala.Unit = js.native
  /**
       *   This function returns the color formatted as a
       *   string. This can be useful for debugging, or for
       *   using p5.js with other libraries.
       *   @param [format] How the color string will be
       *   formatted. Leaving this empty formats the string
       *   as rgba(r, g, b, a). '#rgb' '#rgba' '#rrggbb' and
       *   '#rrggbbaa' format as hexadecimal color codes.
       *   'rgb' 'hsb' and 'hsl' return the color formatted
       *   in the specified color mode. 'rgba' 'hsba' and
       *   'hsla' are the same as above but with alpha
       *   channels. 'rgb%' 'hsb%' 'hsl%' 'rgba%' 'hsba%' and
       *   'hsla%' format as percentages.
       *   @return the formatted string
       */
  def toString(format: java.lang.String): java.lang.String = js.native
}

