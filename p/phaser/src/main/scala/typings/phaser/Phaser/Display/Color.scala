package typings.phaser.Phaser.Display

import typings.phaser.Phaser.Types.Display.InputColorObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Color class holds a single color value and allows for easy modification and reading of it.
  */
@js.native
trait Color extends js.Object {
  /**
    * The alpha color value, normalized to the range 0 to 255.
    */
  var alpha: Double = js.native
  /**
    * The alpha color value, normalized to the range 0 to 1.
    */
  var alphaGL: Double = js.native
  /**
    * The blue color value, normalized to the range 0 to 255.
    */
  var blue: Double = js.native
  /**
    * The blue color value, normalized to the range 0 to 1.
    */
  var blueGL: Double = js.native
  /**
    * The color of this Color component, not including the alpha channel.
    */
  val color: Double = js.native
  /**
    * The color of this Color component, including the alpha channel.
    */
  val color32: Double = js.native
  /**
    * An array containing the calculated color values for WebGL use.
    */
  var gl: js.Array[Double] = js.native
  /**
    * The green color value, normalized to the range 0 to 255.
    */
  var green: Double = js.native
  /**
    * The green color value, normalized to the range 0 to 1.
    */
  var greenGL: Double = js.native
  /**
    * The hue color value. A number between 0 and 1.
    * This is the base color.
    */
  var h: Double = js.native
  /**
    * The red color value, normalized to the range 0 to 255.
    */
  var red: Double = js.native
  /**
    * The red color value, normalized to the range 0 to 1.
    */
  var redGL: Double = js.native
  /**
    * The color of this Color component as a string which can be used in CSS color values.
    */
  val rgba: String = js.native
  /**
    * The saturation color value. A number between 0 and 1.
    * This controls how much of the hue will be in the final color, where 1 is fully saturated and 0 will give you white.
    */
  var s: Double = js.native
  /**
    * The lightness color value. A number between 0 and 1.
    * This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
    */
  var v: Double = js.native
  /**
    * Brighten this Color by the percentage amount given.
    * @param amount The percentage amount to change this color by. A value between 0 and 100.
    */
  def brighten(amount: integer): Color = js.native
  /**
    * Decrease the lightness of this Color by the percentage amount given.
    * @param amount The percentage amount to change this color by. A value between 0 and 100.
    */
  def darken(amount: integer): Color = js.native
  /**
    * Decrease the saturation of this Color by the percentage amount given.
    * The saturation is the amount of the base color in the hue.
    * @param amount The percentage amount to change this color by. A value between 0 and 100.
    */
  def desaturate(amount: integer): Color = js.native
  /**
    * Sets this Color object to be grayscaled based on the shade value given.
    * @param shade A value between 0 and 255.
    */
  def gray(shade: integer): Color = js.native
  /**
    * Increase the lightness of this Color by the percentage amount given.
    * @param amount The percentage amount to change this color by. A value between 0 and 100.
    */
  def lighten(amount: integer): Color = js.native
  /**
    * Sets this Color object to be a random color between the `min` and `max` values given.
    * @param min The minimum random color value. Between 0 and 255. Default 0.
    * @param max The maximum random color value. Between 0 and 255. Default 255.
    */
  def random(): Color = js.native
  def random(min: js.UndefOr[scala.Nothing], max: integer): Color = js.native
  def random(min: integer): Color = js.native
  def random(min: integer, max: integer): Color = js.native
  /**
    * Sets this Color object to be a random grayscale color between the `min` and `max` values given.
    * @param min The minimum random color value. Between 0 and 255. Default 0.
    * @param max The maximum random color value. Between 0 and 255. Default 255.
    */
  def randomGray(): Color = js.native
  def randomGray(min: js.UndefOr[scala.Nothing], max: integer): Color = js.native
  def randomGray(min: integer): Color = js.native
  def randomGray(min: integer, max: integer): Color = js.native
  /**
    * Increase the saturation of this Color by the percentage amount given.
    * The saturation is the amount of the base color in the hue.
    * @param amount The percentage amount to change this color by. A value between 0 and 100.
    */
  def saturate(amount: integer): Color = js.native
  /**
    * Sets the color based on the hue, saturation and lightness values given.
    * @param h The hue, in the range 0 - 1. This is the base color.
    * @param s The saturation, in the range 0 - 1. This controls how much of the hue will be in the final color, where 1 is fully saturated and 0 will give you white.
    * @param v The value, in the range 0 - 1. This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
    */
  def setFromHSV(h: Double, s: Double, v: Double): Color = js.native
  /**
    * Sets the color based on the color object given.
    * @param color An object containing `r`, `g`, `b` and optionally `a` values in the range 0 to 255.
    */
  def setFromRGB(color: InputColorObject): Color = js.native
  /**
    * Sets the red, green, blue and alpha GL values of this Color component.
    * @param red The red color value. A number between 0 and 1.
    * @param green The green color value. A number between 0 and 1.
    * @param blue The blue color value. A number between 0 and 1.
    * @param alpha The alpha value. A number between 0 and 1. Default 1.
    */
  def setGLTo(red: Double, green: Double, blue: Double): Color = js.native
  def setGLTo(red: Double, green: Double, blue: Double, alpha: Double): Color = js.native
  /**
    * Sets the color of this Color component.
    * @param red The red color value. A number between 0 and 255.
    * @param green The green color value. A number between 0 and 255.
    * @param blue The blue color value. A number between 0 and 255.
    * @param alpha The alpha value. A number between 0 and 255. Default 255.
    * @param updateHSV Update the HSV values after setting the RGB values? Default true.
    */
  def setTo(red: integer, green: integer, blue: integer): Color = js.native
  def setTo(red: integer, green: integer, blue: integer, alpha: js.UndefOr[scala.Nothing], updateHSV: Boolean): Color = js.native
  def setTo(red: integer, green: integer, blue: integer, alpha: integer): Color = js.native
  def setTo(red: integer, green: integer, blue: integer, alpha: integer, updateHSV: Boolean): Color = js.native
  /**
    * Sets this color to be transparent. Sets all values to zero.
    */
  def transparent(): Color = js.native
}

