package typings.paper.paperMod

import typings.paper.paperNs.IGradientColor
import typings.paper.paperNs.IHSBColor
import typings.paper.paperNs.IHSLColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Color")
@js.native
class Color protected ()
  extends typings.paper.paperNs.Color {
  /**
    * Creates a RGB Color object from CSS string
    * @param css - the RGB color in hex, i.e. #000000, rbga, i.e. rgba(0,0,0,0) or named color.
    */
  def this(css: String) = this()
  /**
    * Creates a gray Color object.
    * @param gray - the amount of gray in the color as a value between 0 and 1
    * @param alpha [optional] - the alpha of the color as a value between 0 and 1
    */
  def this(gray: Double) = this()
  def this(`object`: IGradientColor) = this()
  /**
    * Creates a HSB, HSL or gradient Color object from the properties of the provided object:
    * @param object - an object describing the components and properties of the color.
    */
  def this(`object`: IHSBColor) = this()
  def this(`object`: IHSLColor) = this()
  def this(gray: Double, alpha: Double) = this()
  /**
    * Creates a gradient Color object.
    * @param gradient -
    * @param origin -
    * @param destination -
    * @param highlight [optional] -
    */
  def this(
    color: typings.paper.paperNs.Gradient,
    origin: typings.paper.paperNs.Point,
    destination: typings.paper.paperNs.Point
  ) = this()
  /**
    * Creates a RGB Color object.
    * @param red - the amount of red in the color as a value between 0 and 1
    * @param green - the amount of green in the color as a value between 0 and 1
    * @param blue - the amount of blue in the color as a value between 0 and 1
    * @param alpha [optional] - the alpha of the color as a value between 0 and 1
    */
  def this(red: Double, green: Double, blue: Double) = this()
  def this(
    color: typings.paper.paperNs.Gradient,
    origin: typings.paper.paperNs.Point,
    destination: typings.paper.paperNs.Point,
    highlight: typings.paper.paperNs.Point
  ) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
}

