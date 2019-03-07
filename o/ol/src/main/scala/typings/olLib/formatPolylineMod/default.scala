package typings
package olLib.formatPolylineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Feature format for reading and writing data in the Encoded
  * Polyline Algorithm Format.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api stable
  */
@JSImport("ol/format/Polyline", JSImport.Default)
@js.native
/**
  * @classdesc
  * Feature format for reading and writing data in the Encoded
  * Polyline Algorithm Format.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.formatNs.Polyline {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.PolylineOptions) = this()
}

/* static members */
@JSImport("ol/format/Polyline", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Decode a list of n-dimensional points from an encoded string
    *
    * @param encoded An encoded string.
    * @param stride The number of dimension of the points in the
    *     encoded string.
    * @param opt_factor The factor by which the resulting numbers will
    *     be divided. Default is `1e5`.
    * @return A list of n-dimensional points.
    * @api
    */
  def decodeDeltas(encoded: java.lang.String, stride: scala.Double): js.Array[scala.Double] = js.native
  def decodeDeltas(encoded: java.lang.String, stride: scala.Double, opt_factor: scala.Double): js.Array[scala.Double] = js.native
  /**
    * Decode a list of floating point numbers from an encoded string
    *
    * @param encoded An encoded string.
    * @param opt_factor The factor by which the result will be divided.
    *     Default is `1e5`.
    * @return A list of floating point numbers.
    * @api
    */
  def decodeFloats(encoded: java.lang.String): js.Array[scala.Double] = js.native
  def decodeFloats(encoded: java.lang.String, opt_factor: scala.Double): js.Array[scala.Double] = js.native
  /**
    * Encode a list of n-dimensional points and return an encoded string
    *
    * Attention: This function will modify the passed array!
    *
    * @param numbers A list of n-dimensional points.
    * @param stride The number of dimension of the points in the list.
    * @param opt_factor The factor by which the numbers will be
    *     multiplied. The remaining decimal places will get rounded away.
    *     Default is `1e5`.
    * @return The encoded string.
    * @api
    */
  def encodeDeltas(numbers: js.Array[scala.Double], stride: scala.Double): java.lang.String = js.native
  def encodeDeltas(numbers: js.Array[scala.Double], stride: scala.Double, opt_factor: scala.Double): java.lang.String = js.native
  /**
    * Encode a list of floating point numbers and return an encoded string
    *
    * Attention: This function will modify the passed array!
    *
    * @param numbers A list of floating point numbers.
    * @param opt_factor The factor by which the numbers will be
    *     multiplied. The remaining decimal places will get rounded away.
    *     Default is `1e5`.
    * @return The encoded string.
    * @api
    */
  def encodeFloats(numbers: js.Array[scala.Double]): java.lang.String = js.native
  def encodeFloats(numbers: js.Array[scala.Double], opt_factor: scala.Double): java.lang.String = js.native
}

