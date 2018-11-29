package typings
package ngeohashLib.ngeohashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngeohash")
@js.native
object ngeohashNsMembers extends js.Object {
  def bboxes(minlat: scala.Double, minlon: scala.Double, maxlat: scala.Double, maxlon: scala.Double): js.Array[java.lang.String] = js.native
  def bboxes(
    minlat: scala.Double,
    minlon: scala.Double,
    maxlat: scala.Double,
    maxlon: scala.Double,
    precision: scala.Double
  ): js.Array[java.lang.String] = js.native
  def bboxes_int(minlat: scala.Double, minlon: scala.Double, maxlat: scala.Double, maxlon: scala.Double): scala.Double = js.native
  def bboxes_int(
    minlat: scala.Double,
    minlon: scala.Double,
    maxlat: scala.Double,
    maxlon: scala.Double,
    bitDepth: scala.Double
  ): scala.Double = js.native
  def decode(hashstring: java.lang.String): GeographicPoint = js.native
  def decode_bbox(hashstring: java.lang.String): GeographicBoundingBox = js.native
  def decode_bbox_int(hashinteger: scala.Double): GeographicBoundingBox = js.native
  def decode_bbox_int(hashinteger: scala.Double, bitDepth: scala.Double): GeographicBoundingBox = js.native
  def decode_int(hashinteger: scala.Double): GeographicPoint = js.native
  def decode_int(hashinteger: scala.Double, bitDepth: scala.Double): GeographicPoint = js.native
  def encode(latitude: java.lang.String, longitude: java.lang.String): java.lang.String = js.native
  def encode(latitude: java.lang.String, longitude: java.lang.String, precision: scala.Double): java.lang.String = js.native
  def encode(latitude: java.lang.String, longitude: scala.Double): java.lang.String = js.native
  def encode(latitude: java.lang.String, longitude: scala.Double, precision: scala.Double): java.lang.String = js.native
  def encode(latitude: scala.Double, longitude: java.lang.String): java.lang.String = js.native
  def encode(latitude: scala.Double, longitude: java.lang.String, precision: scala.Double): java.lang.String = js.native
  def encode(latitude: scala.Double, longitude: scala.Double): java.lang.String = js.native
  def encode(latitude: scala.Double, longitude: scala.Double, precision: scala.Double): java.lang.String = js.native
  def encode_int(latitude: scala.Double, longitude: scala.Double): scala.Double = js.native
  def encode_int(latitude: scala.Double, longitude: scala.Double, bitDepth: scala.Double): scala.Double = js.native
  def neighbor(hashstring: java.lang.String, direction: NSEW): java.lang.String = js.native
  def neighbor_int(hashinteger: scala.Double, direction: NSEW): scala.Double = js.native
  def neighbor_int(hashinteger: scala.Double, direction: NSEW, bitDepth: scala.Double): scala.Double = js.native
  def neighbors(hashstring: java.lang.String): js.Array[java.lang.String] = js.native
  def neighbors_int(hashinteger: scala.Double): scala.Double = js.native
  def neighbors_int(hashinteger: scala.Double, bitDepth: scala.Double): scala.Double = js.native
}

