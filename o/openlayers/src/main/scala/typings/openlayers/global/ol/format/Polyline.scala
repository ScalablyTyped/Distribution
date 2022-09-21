package typings.openlayers.global.ol.format

import typings.openlayers.mod.olx.format.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading and writing data in the Encoded
  * Polyline Algorithm Format.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api stable
  */
@JSGlobal("ol.format.Polyline")
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
open class Polyline ()
  extends typings.openlayers.mod.format.Polyline {
  def this(opt_options: PolylineOptions) = this()
}
object Polyline {
  
  @JSGlobal("ol.format.Polyline")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def decodeDeltas(encoded: String, stride: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeDeltas")(encoded.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def decodeDeltas(encoded: String, stride: Double, opt_factor: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeDeltas")(encoded.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_factor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Decode a list of floating point numbers from an encoded string
    *
    * @param encoded An encoded string.
    * @param opt_factor The factor by which the result will be divided.
    *     Default is `1e5`.
    * @return A list of floating point numbers.
    * @api
    */
  /* static member */
  inline def decodeFloats(encoded: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFloats")(encoded.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def decodeFloats(encoded: String, opt_factor: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFloats")(encoded.asInstanceOf[js.Any], opt_factor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
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
  /* static member */
  inline def encodeDeltas(numbers: js.Array[Double], stride: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDeltas")(numbers.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeDeltas(numbers: js.Array[Double], stride: Double, opt_factor: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDeltas")(numbers.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_factor.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  /* static member */
  inline def encodeFloats(numbers: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeFloats")(numbers.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeFloats(numbers: js.Array[Double], opt_factor: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFloats")(numbers.asInstanceOf[js.Any], opt_factor.asInstanceOf[js.Any])).asInstanceOf[String]
}
