package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Color")
@js.native
class Color protected ()
  extends paperLib.paperNs.Color {
  /**
           * Creates a RGB Color object from CSS string
           * @param css - the RGB color in hex, i.e. #000000, rbga, i.e. rgba(0,0,0,0) or named color.
           */
  def this(css: java.lang.String) = this()
  /**
           * Creates a gray Color object.
           * @param gray - the amount of gray in the color as a value between 0 and 1
           * @param alpha [optional] - the alpha of the color as a value between 0 and 1
           */
  def this(gray: scala.Double) = this()
  /**
           * Creates a HSB, HSL or gradient Color object from the properties of the provided object:
           * @param object - an object describing the components and properties of the color.
           */
  def this(`object`: paperLib.paperNs.IGradientColor) = this()
  /**
           * Creates a HSB, HSL or gradient Color object from the properties of the provided object:
           * @param object - an object describing the components and properties of the color.
           */
  def this(`object`: paperLib.paperNs.IHSBColor) = this()
  /**
           * Creates a HSB, HSL or gradient Color object from the properties of the provided object:
           * @param object - an object describing the components and properties of the color.
           */
  def this(`object`: paperLib.paperNs.IHSLColor) = this()
  /**
           * Creates a gray Color object.
           * @param gray - the amount of gray in the color as a value between 0 and 1
           * @param alpha [optional] - the alpha of the color as a value between 0 and 1
           */
  def this(gray: scala.Double, alpha: scala.Double) = this()
  /**
           * Creates a gradient Color object.
           * @param gradient -
           * @param origin -
           * @param destination -
           * @param highlight [optional] -
           */
  def this(color: paperLib.paperNs.Gradient, origin: paperLib.paperNs.Point, destination: paperLib.paperNs.Point) = this()
  /**
           * Creates a RGB Color object.
           * @param red - the amount of red in the color as a value between 0 and 1
           * @param green - the amount of green in the color as a value between 0 and 1
           * @param blue - the amount of blue in the color as a value between 0 and 1
           * @param alpha [optional] - the alpha of the color as a value between 0 and 1
           */
  def this(red: scala.Double, green: scala.Double, blue: scala.Double) = this()
  /**
           * Creates a gradient Color object.
           * @param gradient -
           * @param origin -
           * @param destination -
           * @param highlight [optional] -
           */
  def this(color: paperLib.paperNs.Gradient, origin: paperLib.paperNs.Point, destination: paperLib.paperNs.Point, highlight: paperLib.paperNs.Point) = this()
  /**
           * Creates a RGB Color object.
           * @param red - the amount of red in the color as a value between 0 and 1
           * @param green - the amount of green in the color as a value between 0 and 1
           * @param blue - the amount of blue in the color as a value between 0 and 1
           * @param alpha [optional] - the alpha of the color as a value between 0 and 1
           */
  def this(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double) = this()
}

