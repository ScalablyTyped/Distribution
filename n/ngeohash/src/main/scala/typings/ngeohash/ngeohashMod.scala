package typings.ngeohash

import typings.ngeohash.ngeohashNs.GeographicBoundingBox
import typings.ngeohash.ngeohashNs.GeographicPoint
import typings.ngeohash.ngeohashNs.NSEW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngeohash", JSImport.Namespace)
@js.native
object ngeohashMod extends js.Object {
  def bboxes(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double): js.Array[String] = js.native
  def bboxes(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double, precision: Double): js.Array[String] = js.native
  def bboxes_int(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double): Double = js.native
  def bboxes_int(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double, bitDepth: Double): Double = js.native
  def decode(hashstring: String): GeographicPoint = js.native
  def decode_bbox(hashstring: String): GeographicBoundingBox = js.native
  def decode_bbox_int(hashinteger: Double): GeographicBoundingBox = js.native
  def decode_bbox_int(hashinteger: Double, bitDepth: Double): GeographicBoundingBox = js.native
  def decode_int(hashinteger: Double): GeographicPoint = js.native
  def decode_int(hashinteger: Double, bitDepth: Double): GeographicPoint = js.native
  def encode(latitude: String, longitude: String): String = js.native
  def encode(latitude: String, longitude: String, precision: Double): String = js.native
  def encode(latitude: String, longitude: Double): String = js.native
  def encode(latitude: String, longitude: Double, precision: Double): String = js.native
  def encode(latitude: Double, longitude: String): String = js.native
  def encode(latitude: Double, longitude: String, precision: Double): String = js.native
  def encode(latitude: Double, longitude: Double): String = js.native
  def encode(latitude: Double, longitude: Double, precision: Double): String = js.native
  def encode_int(latitude: Double, longitude: Double): Double = js.native
  def encode_int(latitude: Double, longitude: Double, bitDepth: Double): Double = js.native
  def neighbor(hashstring: String, direction: NSEW): String = js.native
  def neighbor_int(hashinteger: Double, direction: NSEW): Double = js.native
  def neighbor_int(hashinteger: Double, direction: NSEW, bitDepth: Double): Double = js.native
  def neighbors(hashstring: String): js.Array[String] = js.native
  def neighbors_int(hashinteger: Double): Double = js.native
  def neighbors_int(hashinteger: Double, bitDepth: Double): Double = js.native
}

