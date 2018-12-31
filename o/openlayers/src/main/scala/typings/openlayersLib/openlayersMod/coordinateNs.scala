package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "coordinate")
@js.native
object coordinateNs extends js.Object {
  /**
    * Add `delta` to `coordinate`. `coordinate` is modified in place and returned
    * by the function.
    *
    * Example:
    *
    *     var coord = [7.85, 47.983333];
    *     ol.coordinate.add(coord, [-2, 4]);
    *     // coord is now [5.85, 51.983333]
    *
    * @param coordinate Coordinate.
    * @param delta Delta.
    * @return The input coordinate adjusted by the given delta.
    * @api stable
    */
  def add(coordinate: openlayersLib.openlayersMod.Coordinate, delta: openlayersLib.openlayersMod.Coordinate): openlayersLib.openlayersMod.Coordinate = js.native
  /**
    * Returns a {@link ol.CoordinateFormatType} function that can be used to format
    * a {ol.Coordinate} to a string.
    *
    * Example without specifying the fractional digits:
    *
    *     var coord = [7.85, 47.983333];
    *     var stringifyFunc = ol.coordinate.createStringXY();
    *     var out = stringifyFunc(coord);
    *     // out is now '8, 48'
    *
    * Example with explicitly specifying 2 fractional digits:
    *
    *     var coord = [7.85, 47.983333];
    *     var stringifyFunc = ol.coordinate.createStringXY(2);
    *     var out = stringifyFunc(coord);
    *     // out is now '7.85, 47.98'
    *
    * @param opt_fractionDigits The number of digits to include
    *    after the decimal point. Default is `0`.
    * @return Coordinate format.
    * @api stable
    */
  def createStringXY(): openlayersLib.openlayersMod.CoordinateFormatType = js.native
  def createStringXY(opt_fractionDigits: scala.Double): openlayersLib.openlayersMod.CoordinateFormatType = js.native
  /**
    * Transforms the given {@link ol.Coordinate} to a string using the given string
    * template. The strings `{x}` and `{y}` in the template will be replaced with
    * the first and second coordinate values respectively.
    *
    * Example without specifying the fractional digits:
    *
    *     var coord = [7.85, 47.983333];
    *     var template = 'Coordinate is ({x}|{y}).';
    *     var out = ol.coordinate.format(coord, template);
    *     // out is now 'Coordinate is (8|48).'
    *
    * Example explicitly specifying the fractional digits:
    *
    *     var coord = [7.85, 47.983333];
    *     var template = 'Coordinate is ({x}|{y}).';
    *     var out = ol.coordinate.format(coord, template, 2);
    *     // out is now 'Coordinate is (7.85|47.98).'
    *
    * @param coordinate Coordinate.
    * @param template A template string with `{x}` and `{y}` placeholders
    *     that will be replaced by first and second coordinate values.
    * @param opt_fractionDigits The number of digits to include
    *    after the decimal point. Default is `0`.
    * @return Formatted coordinate.
    * @api stable
    */
  def format(coordinate: openlayersLib.openlayersMod.Coordinate, template: java.lang.String): java.lang.String = js.native
  def format(
    coordinate: openlayersLib.openlayersMod.Coordinate,
    template: java.lang.String,
    opt_fractionDigits: scala.Double
  ): java.lang.String = js.native
  /**
    * Rotate `coordinate` by `angle`. `coordinate` is modified in place and
    * returned by the function.
    *
    * Example:
    *
    *     var coord = [7.85, 47.983333];
    *     var rotateRadians = Math.PI / 2; // 90 degrees
    *     ol.coordinate.rotate(coord, rotateRadians);
    *     // coord is now [-47.983333, 7.85]
    *
    * @param coordinate Coordinate.
    * @param angle Angle in radian.
    * @return Coordinate.
    * @api stable
    */
  def rotate(coordinate: openlayersLib.openlayersMod.Coordinate, angle: scala.Double): openlayersLib.openlayersMod.Coordinate = js.native
  /**
    * Format a geographic coordinate with the hemisphere, degrees, minutes, and
    * seconds.
    *
    * Example without specifying fractional digits:
    *
    *     var coord = [7.85, 47.983333];
    *     var out = ol.coordinate.toStringHDMS(coord);
    *     // out is now '47° 58′ 60″ N 7° 50′ 60″ E'
    *
    * Example explicitly specifying 1 fractional digit:
    *
    *     var coord = [7.85, 47.983333];
    *     var out = ol.coordinate.toStringHDMS(coord, 1);
    *     // out is now '47° 58′ 60.0″ N 7° 50′ 60.0″ E'
    *
    * @param coordinate Coordinate.
    * @param opt_fractionDigits The number of digits to include
    *    after the decimal point. Default is `0`.
    * @return Hemisphere, degrees, minutes and seconds.
    * @api stable
    */
  def toStringHDMS(): java.lang.String = js.native
  def toStringHDMS(coordinate: openlayersLib.openlayersMod.Coordinate): java.lang.String = js.native
  def toStringHDMS(coordinate: openlayersLib.openlayersMod.Coordinate, opt_fractionDigits: scala.Double): java.lang.String = js.native
  /**
    * Format a coordinate as a comma delimited string.
    *
    * Example without specifying fractional digits:
    *
    *     var coord = [7.85, 47.983333];
    *     var out = ol.coordinate.toStringXY(coord);
    *     // out is now '8, 48'
    *
    * Example explicitly specifying 1 fractional digit:
    *
    *     var coord = [7.85, 47.983333];
    *     var out = ol.coordinate.toStringXY(coord, 1);
    *     // out is now '7.8, 48.0'
    *
    * @param coordinate Coordinate.
    * @param opt_fractionDigits The number of digits to include
    *    after the decimal point. Default is `0`.
    * @return XY.
    * @api stable
    */
  def toStringXY(): java.lang.String = js.native
  def toStringXY(coordinate: openlayersLib.openlayersMod.Coordinate): java.lang.String = js.native
  def toStringXY(coordinate: openlayersLib.openlayersMod.Coordinate, opt_fractionDigits: scala.Double): java.lang.String = js.native
}

