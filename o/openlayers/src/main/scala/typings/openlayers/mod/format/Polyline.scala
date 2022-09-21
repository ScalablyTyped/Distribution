package typings.openlayers.mod.format

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.geom.Geometry
import typings.openlayers.mod.olx.format.PolylineOptions
import typings.openlayers.mod.olx.format.ReadOptions
import typings.openlayers.mod.olx.format.WriteOptions
import typings.openlayers.mod.proj.Projection
import typings.std.Document
import typings.std.Node
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
@JSImport("openlayers", "format.Polyline")
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
open class Polyline () extends TextFeature {
  def this(opt_options: PolylineOptions) = this()
  
  def readFeature(source: String): typings.openlayers.mod.Feature = js.native
  def readFeature(source: String, opt_options: ReadOptions): typings.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject): typings.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject, opt_options: ReadOptions): typings.openlayers.mod.Feature = js.native
  /**
    * Read the feature from the Polyline source. The coordinates are assumed to be
    * in two dimensions and in latitude, longitude order.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Feature.
    * @api stable
    */
  def readFeature(source: Document): typings.openlayers.mod.Feature = js.native
  def readFeature(source: Document, opt_options: ReadOptions): typings.openlayers.mod.Feature = js.native
  def readFeature(source: Node): typings.openlayers.mod.Feature = js.native
  def readFeature(source: Node, opt_options: ReadOptions): typings.openlayers.mod.Feature = js.native
  
  def readFeatures(source: String): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  /**
    * Read the feature from the source. As Polyline sources contain a single
    * feature, this will return the feature in an array.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  
  def readGeometry(source: String): Geometry = js.native
  def readGeometry(source: String, opt_options: ReadOptions): Geometry = js.native
  def readGeometry(source: GlobalObject): Geometry = js.native
  def readGeometry(source: GlobalObject, opt_options: ReadOptions): Geometry = js.native
  /**
    * Read the geometry from the source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Geometry.
    * @api stable
    */
  def readGeometry(source: Document): Geometry = js.native
  def readGeometry(source: Document, opt_options: ReadOptions): Geometry = js.native
  def readGeometry(source: Node): Geometry = js.native
  def readGeometry(source: Node, opt_options: ReadOptions): Geometry = js.native
  
  def readProjection(source: String): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  /**
    * Read the projection from a Polyline source.
    *
    * @param source Source.
    * @return Projection.
    * @api stable
    */
  def readProjection(source: Document): Projection = js.native
  def readProjection(source: Node): Projection = js.native
  
  /**
    * Write a single geometry in Polyline format.
    *
    * @param geometry Geometry.
    * @param opt_options Write options.
    * @return Geometry.
    * @api stable
    */
  def writeGeometry(geometry: Geometry): String = js.native
  def writeGeometry(geometry: Geometry, opt_options: WriteOptions): String = js.native
}
object Polyline {
  
  @JSImport("openlayers", "format.Polyline")
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
