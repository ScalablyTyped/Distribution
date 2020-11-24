package typings.ngeohash

import typings.ngeohash.ngeohash.GeographicBoundingBox
import typings.ngeohash.ngeohash.GeographicPoint
import typings.ngeohash.ngeohash.NSEW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ngeohash", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def bboxes(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double): js.Array[String] = js.native
  def bboxes(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double, precision: Double): js.Array[String] = js.native
  
  @JSName("bboxes_int")
  def bboxesInt(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double): Double = js.native
  @JSName("bboxes_int")
  def bboxesInt(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double, bitDepth: Double): Double = js.native
  
  def decode(hashstring: String): GeographicPoint = js.native
  
  @JSName("decode_bbox")
  def decodeBbox(hashstring: String): GeographicBoundingBox = js.native
  
  @JSName("decode_bbox_int")
  def decodeBboxInt(hashinteger: Double): GeographicBoundingBox = js.native
  @JSName("decode_bbox_int")
  def decodeBboxInt(hashinteger: Double, bitDepth: Double): GeographicBoundingBox = js.native
  
  @JSName("decode_int")
  def decodeInt(hashinteger: Double): GeographicPoint = js.native
  @JSName("decode_int")
  def decodeInt(hashinteger: Double, bitDepth: Double): GeographicPoint = js.native
  
  def encode(latitude: String, longitude: String): String = js.native
  def encode(latitude: String, longitude: String, precision: Double): String = js.native
  def encode(latitude: String, longitude: Double): String = js.native
  def encode(latitude: String, longitude: Double, precision: Double): String = js.native
  def encode(latitude: Double, longitude: String): String = js.native
  def encode(latitude: Double, longitude: String, precision: Double): String = js.native
  def encode(latitude: Double, longitude: Double): String = js.native
  def encode(latitude: Double, longitude: Double, precision: Double): String = js.native
  
  @JSName("encode_int")
  def encodeInt(latitude: Double, longitude: Double): Double = js.native
  @JSName("encode_int")
  def encodeInt(latitude: Double, longitude: Double, bitDepth: Double): Double = js.native
  
  def neighbor(hashstring: String, direction: NSEW): String = js.native
  
  @JSName("neighbor_int")
  def neighborInt(hashinteger: Double, direction: NSEW): Double = js.native
  @JSName("neighbor_int")
  def neighborInt(hashinteger: Double, direction: NSEW, bitDepth: Double): Double = js.native
  
  def neighbors(hashstring: String): js.Array[String] = js.native
  
  @JSName("neighbors_int")
  def neighborsInt(hashinteger: Double): Double = js.native
  @JSName("neighbors_int")
  def neighborsInt(hashinteger: Double, bitDepth: Double): Double = js.native
}
