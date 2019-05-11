package typings
package phaserLib.PhaserNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Color class holds a single color value and allows for easy modification and reading of it.
  */
@JSGlobal("Phaser.Display.Color")
@js.native
/**
  * 
  * @param red The red color value. A number between 0 and 255. Default 0.
  * @param green The green color value. A number between 0 and 255. Default 0.
  * @param blue The blue color value. A number between 0 and 255. Default 0.
  * @param alpha The alpha value. A number between 0 and 255. Default 255.
  */
class Color () extends js.Object {
  def this(red: phaserLib.integer) = this()
  def this(red: phaserLib.integer, green: phaserLib.integer) = this()
  def this(red: phaserLib.integer, green: phaserLib.integer, blue: phaserLib.integer) = this()
  def this(red: phaserLib.integer, green: phaserLib.integer, blue: phaserLib.integer, alpha: phaserLib.integer) = this()
  /**
    * The alpha color value, normalized to the range 0 to 255.
    */
  var alpha: scala.Double = js.native
  /**
    * The alpha color value, normalized to the range 0 to 1.
    */
  var alphaGL: scala.Double = js.native
  /**
    * The blue color value, normalized to the range 0 to 255.
    */
  var blue: scala.Double = js.native
  /**
    * The blue color value, normalized to the range 0 to 1.
    */
  var blueGL: scala.Double = js.native
  /**
    * The color of this Color component, not including the alpha channel.
    */
  val color: scala.Double = js.native
  /**
    * The color of this Color component, including the alpha channel.
    */
  val color32: scala.Double = js.native
  /**
    * An array containing the calculated color values for WebGL use.
    */
  var gl: js.Array[scala.Double] = js.native
  /**
    * The green color value, normalized to the range 0 to 255.
    */
  var green: scala.Double = js.native
  /**
    * The green color value, normalized to the range 0 to 1.
    */
  var greenGL: scala.Double = js.native
  /**
    * The hue color value. A number between 0 and 1.
    * This is the base color.
    */
  var h: scala.Double = js.native
  /**
    * The red color value, normalized to the range 0 to 255.
    */
  var red: scala.Double = js.native
  /**
    * The red color value, normalized to the range 0 to 1.
    */
  var redGL: scala.Double = js.native
  /**
    * The color of this Color component as a string which can be used in CSS color values.
    */
  val rgba: java.lang.String = js.native
  /**
    * The saturation color value. A number between 0 and 1.
    * This controls how much of the hue will be in the final color, where 1 is fully saturated and 0 will give you white.
    */
  var s: scala.Double = js.native
  /**
    * The lightness color value. A number between 0 and 1.
    * This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
    */
  var v: scala.Double = js.native
  /**
    * Brighten this Color by the percentage amount given.
    * @param amount The percentage amount to change this color by. A value between 0 and 100.
    */
  def brighten(amount: phaserLib.integer): Color = js.native
  /**
    * Decrease the lightness of this Color by the percentage amount given.
    * @param amount The percentage amount to change this color by. A value between 0 and 100.
    */
  def darken(amount: phaserLib.integer): Color = js.native
  /**
    * Decrease the saturation of this Color by the percentage amount given.
    * The saturation is the amount of the base color in the hue.
    * @param amount The percentage amount to change this color by. A value between 0 and 100.
    */
  def desaturate(amount: phaserLib.integer): Color = js.native
  /**
    * Sets this Color object to be grayscaled based on the shade value given.
    * @param shade A value between 0 and 255.
    */
  def gray(shade: phaserLib.integer): Color = js.native
  /**
    * Increase the lightness of this Color by the percentage amount given.
    * @param amount The percentage amount to change this color by. A value between 0 and 100.
    */
  def lighten(amount: phaserLib.integer): Color = js.native
  /**
    * Sets this Color object to be a random color between the `min` and `max` values given.
    * @param min The minimum random color value. Between 0 and 255. Default 0.
    * @param max The maximum random color value. Between 0 and 255. Default 255.
    */
  def random(): Color = js.native
  def random(min: phaserLib.integer): Color = js.native
  def random(min: phaserLib.integer, max: phaserLib.integer): Color = js.native
  /**
    * Sets this Color object to be a random grayscale color between the `min` and `max` values given.
    * @param min The minimum random color value. Between 0 and 255. Default 0.
    * @param max The maximum random color value. Between 0 and 255. Default 255.
    */
  def randomGray(): Color = js.native
  def randomGray(min: phaserLib.integer): Color = js.native
  def randomGray(min: phaserLib.integer, max: phaserLib.integer): Color = js.native
  /**
    * Increase the saturation of this Color by the percentage amount given.
    * The saturation is the amount of the base color in the hue.
    * @param amount The percentage amount to change this color by. A value between 0 and 100.
    */
  def saturate(amount: phaserLib.integer): Color = js.native
  /**
    * Sets the color based on the hue, saturation and lightness values given.
    * @param h The hue, in the range 0 - 1. This is the base color.
    * @param s The saturation, in the range 0 - 1. This controls how much of the hue will be in the final color, where 1 is fully saturated and 0 will give you white.
    * @param v The value, in the range 0 - 1. This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
    */
  def setFromHSV(h: scala.Double, s: scala.Double, v: scala.Double): Color = js.native
  /**
    * Sets the color based on the color object given.
    * @param color An object containing `r`, `g`, `b` and optionally `a` values in the range 0 to 255.
    */
  def setFromRGB(color: phaserLib.PhaserNs.TypesNs.DisplayNs.InputColorObject): Color = js.native
  /**
    * Sets the red, green, blue and alpha GL values of this Color component.
    * @param red The red color value. A number between 0 and 1.
    * @param green The green color value. A number between 0 and 1.
    * @param blue The blue color value. A number between 0 and 1.
    * @param alpha The alpha value. A number between 0 and 1. Default 1.
    */
  def setGLTo(red: scala.Double, green: scala.Double, blue: scala.Double): Color = js.native
  def setGLTo(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double): Color = js.native
  /**
    * Sets the color of this Color component.
    * @param red The red color value. A number between 0 and 255.
    * @param green The green color value. A number between 0 and 255.
    * @param blue The blue color value. A number between 0 and 255.
    * @param alpha The alpha value. A number between 0 and 255. Default 255.
    * @param updateHSV Update the HSV values after setting the RGB values? Default true.
    */
  def setTo(red: phaserLib.integer, green: phaserLib.integer, blue: phaserLib.integer): Color = js.native
  def setTo(
    red: phaserLib.integer,
    green: phaserLib.integer,
    blue: phaserLib.integer,
    alpha: phaserLib.integer
  ): Color = js.native
  def setTo(
    red: phaserLib.integer,
    green: phaserLib.integer,
    blue: phaserLib.integer,
    alpha: phaserLib.integer,
    updateHSV: scala.Boolean
  ): Color = js.native
  /**
    * Sets this color to be transparent. Sets all values to zero.
    */
  def transparent(): Color = js.native
}

/* static members */
@JSGlobal("Phaser.Display.Color")
@js.native
object Color extends js.Object {
  /**
    * Converts the given color value into an Object containing r,g,b and a properties.
    * @param color A color value, optionally including the alpha value.
    */
  def ColorToRGBA(color: scala.Double): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
  /**
    * Returns a string containing a hex representation of the given color component.
    * @param color The color channel to get the hex value for, must be a value between 0 and 255.
    */
  def ComponentToHex(color: phaserLib.integer): java.lang.String = js.native
  /**
    * Given 3 separate color values this will return an integer representation of it.
    * @param red The red color value. A number between 0 and 255.
    * @param green The green color value. A number between 0 and 255.
    * @param blue The blue color value. A number between 0 and 255.
    */
  def GetColor(red: phaserLib.integer, green: phaserLib.integer, blue: phaserLib.integer): scala.Double = js.native
  /**
    * Given an alpha and 3 color values this will return an integer representation of it.
    * @param red The red color value. A number between 0 and 255.
    * @param green The green color value. A number between 0 and 255.
    * @param blue The blue color value. A number between 0 and 255.
    * @param alpha The alpha color value. A number between 0 and 255.
    */
  def GetColor32(
    red: phaserLib.integer,
    green: phaserLib.integer,
    blue: phaserLib.integer,
    alpha: phaserLib.integer
  ): scala.Double = js.native
  /**
    * Converts HSL (hue, saturation and lightness) values to a Phaser Color object.
    * @param h The hue value in the range 0 to 1.
    * @param s The saturation value in the range 0 to 1.
    * @param l The lightness value in the range 0 to 1.
    */
  def HSLToColor(h: scala.Double, s: scala.Double, l: scala.Double): phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * Get HSV color wheel values in an array which will be 360 elements in size.
    * @param s The saturation, in the range 0 - 1. Default 1.
    * @param v The value, in the range 0 - 1. Default 1.
    */
  def HSVColorWheel(): js.Array[phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject] = js.native
  def HSVColorWheel(s: scala.Double): js.Array[phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject] = js.native
  def HSVColorWheel(s: scala.Double, v: scala.Double): js.Array[phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject] = js.native
  /**
    * Converts an HSV (hue, saturation and value) color value to RGB.
    * Conversion formula from http://en.wikipedia.org/wiki/HSL_color_space.
    * Assumes HSV values are contained in the set [0, 1].
    * Based on code by Michael Jackson (https://github.com/mjijackson)
    * @param h The hue, in the range 0 - 1. This is the base color.
    * @param s The saturation, in the range 0 - 1. This controls how much of the hue will be in the final color, where 1 is fully saturated and 0 will give you white.
    * @param v The value, in the range 0 - 1. This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
    * @param out A Color object to store the results in. If not given a new ColorObject will be created.
    */
  def HSVToRGB(h: scala.Double, s: scala.Double, v: scala.Double): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject | phaserLib.PhaserNs.DisplayNs.Color = js.native
  def HSVToRGB(h: scala.Double, s: scala.Double, v: scala.Double, out: phaserLib.PhaserNs.DisplayNs.Color): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject | phaserLib.PhaserNs.DisplayNs.Color = js.native
  def HSVToRGB(
    h: scala.Double,
    s: scala.Double,
    v: scala.Double,
    out: phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject
  ): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject | phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * Converts a hex string into a Phaser Color object.
    * 
    * The hex string can supplied as `'#0033ff'` or the short-hand format of `'#03f'`; it can begin with an optional "#" or "0x", or be unprefixed.
    * 
    * An alpha channel is _not_ supported.
    * @param hex The hex color value to convert, such as `#0033ff` or the short-hand format: `#03f`.
    */
  def HexStringToColor(hex: java.lang.String): phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * Converts a hue to an RGB color.
    * Based on code by Michael Jackson (https://github.com/mjijackson)
    */
  def HueToComponent(p: scala.Double, q: scala.Double, t: scala.Double): scala.Double = js.native
  /**
    * Converts the given color value into an instance of a Color object.
    * @param input The color value to convert into a Color object.
    */
  def IntegerToColor(input: phaserLib.integer): phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * Return the component parts of a color as an Object with the properties alpha, red, green, blue.
    * 
    * Alpha will only be set if it exists in the given color (0xAARRGGBB)
    * @param input The color value to convert into a Color object.
    */
  def IntegerToRGB(input: phaserLib.integer): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
  /**
    * Converts an object containing `r`, `g`, `b` and `a` properties into a Color class instance.
    * @param input An object containing `r`, `g`, `b` and `a` properties in the range 0 to 255.
    */
  def ObjectToColor(input: phaserLib.PhaserNs.TypesNs.DisplayNs.InputColorObject): phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * Converts a CSS 'web' string into a Phaser Color object.
    * 
    * The web string can be in the format `'rgb(r,g,b)'` or `'rgba(r,g,b,a)'` where r/g/b are in the range [0..255] and a is in the range [0..1].
    * @param rgb The CSS format color string, using the `rgb` or `rgba` format.
    */
  def RGBStringToColor(rgb: java.lang.String): phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * Converts an RGB color value to HSV (hue, saturation and value).
    * Conversion forumla from http://en.wikipedia.org/wiki/HSL_color_space.
    * Assumes RGB values are contained in the set [0, 255] and returns h, s and v in the set [0, 1].
    * Based on code by Michael Jackson (https://github.com/mjijackson)
    * @param r The red color value. A number between 0 and 255.
    * @param g The green color value. A number between 0 and 255.
    * @param b The blue color value. A number between 0 and 255.
    * @param out An object to store the color values in. If not given an HSV Color Object will be created.
    */
  def RGBToHSV(r: phaserLib.integer, g: phaserLib.integer, b: phaserLib.integer): phaserLib.PhaserNs.TypesNs.DisplayNs.HSVColorObject | phaserLib.PhaserNs.DisplayNs.Color = js.native
  def RGBToHSV(
    r: phaserLib.integer,
    g: phaserLib.integer,
    b: phaserLib.integer,
    out: phaserLib.PhaserNs.DisplayNs.Color
  ): phaserLib.PhaserNs.TypesNs.DisplayNs.HSVColorObject | phaserLib.PhaserNs.DisplayNs.Color = js.native
  def RGBToHSV(
    r: phaserLib.integer,
    g: phaserLib.integer,
    b: phaserLib.integer,
    out: phaserLib.PhaserNs.TypesNs.DisplayNs.HSVColorObject
  ): phaserLib.PhaserNs.TypesNs.DisplayNs.HSVColorObject | phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * Converts the color values into an HTML compatible color string, prefixed with either `#` or `0x`.
    * @param r The red color value. A number between 0 and 255.
    * @param g The green color value. A number between 0 and 255.
    * @param b The blue color value. A number between 0 and 255.
    * @param a The alpha value. A number between 0 and 255. Default 255.
    * @param prefix The prefix of the string. Either `#` or `0x`. Default #.
    */
  def RGBToString(r: phaserLib.integer, g: phaserLib.integer, b: phaserLib.integer): java.lang.String = js.native
  def RGBToString(r: phaserLib.integer, g: phaserLib.integer, b: phaserLib.integer, a: phaserLib.integer): java.lang.String = js.native
  def RGBToString(
    r: phaserLib.integer,
    g: phaserLib.integer,
    b: phaserLib.integer,
    a: phaserLib.integer,
    prefix: java.lang.String
  ): java.lang.String = js.native
  /**
    * Creates a new Color object where the r, g, and b values have been set to random values
    * based on the given min max values.
    * @param min The minimum value to set the random range from (between 0 and 255) Default 0.
    * @param max The maximum value to set the random range from (between 0 and 255) Default 255.
    */
  def RandomRGB(): phaserLib.PhaserNs.DisplayNs.Color = js.native
  def RandomRGB(min: phaserLib.integer): phaserLib.PhaserNs.DisplayNs.Color = js.native
  def RandomRGB(min: phaserLib.integer, max: phaserLib.integer): phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * Converts the given source color value into an instance of a Color class.
    * The value can be either a string, prefixed with `rgb` or a hex string, a number or an Object.
    * @param input The source color value to convert.
    */
  def ValueToColor(input: java.lang.String): phaserLib.PhaserNs.DisplayNs.Color = js.native
  def ValueToColor(input: phaserLib.PhaserNs.TypesNs.DisplayNs.InputColorObject): phaserLib.PhaserNs.DisplayNs.Color = js.native
  def ValueToColor(input: scala.Double): phaserLib.PhaserNs.DisplayNs.Color = js.native
}

