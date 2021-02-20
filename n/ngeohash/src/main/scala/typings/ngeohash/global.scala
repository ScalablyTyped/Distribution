package typings.ngeohash

import typings.ngeohash.ngeohash.GeographicBoundingBox
import typings.ngeohash.ngeohash.GeographicPoint
import typings.ngeohash.ngeohash.NSEW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ngeohash {
    
    @JSGlobal("ngeohash.bboxes")
    @js.native
    def bboxes(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double): js.Array[String] = js.native
    @JSGlobal("ngeohash.bboxes")
    @js.native
    def bboxes(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double, precision: Double): js.Array[String] = js.native
    
    @JSGlobal("ngeohash.bboxes_int")
    @js.native
    def bboxesInt(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double): Double = js.native
    @JSGlobal("ngeohash.bboxes_int")
    @js.native
    def bboxesInt(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double, bitDepth: Double): Double = js.native
    
    @JSGlobal("ngeohash.decode")
    @js.native
    def decode(hashstring: String): GeographicPoint = js.native
    
    @JSGlobal("ngeohash.decode_bbox")
    @js.native
    def decodeBbox(hashstring: String): GeographicBoundingBox = js.native
    
    @JSGlobal("ngeohash.decode_bbox_int")
    @js.native
    def decodeBboxInt(hashinteger: Double): GeographicBoundingBox = js.native
    @JSGlobal("ngeohash.decode_bbox_int")
    @js.native
    def decodeBboxInt(hashinteger: Double, bitDepth: Double): GeographicBoundingBox = js.native
    
    @JSGlobal("ngeohash.decode_int")
    @js.native
    def decodeInt(hashinteger: Double): GeographicPoint = js.native
    @JSGlobal("ngeohash.decode_int")
    @js.native
    def decodeInt(hashinteger: Double, bitDepth: Double): GeographicPoint = js.native
    
    @JSGlobal("ngeohash.encode")
    @js.native
    def encode(latitude: String, longitude: String): String = js.native
    @JSGlobal("ngeohash.encode")
    @js.native
    def encode(latitude: String, longitude: String, precision: Double): String = js.native
    @JSGlobal("ngeohash.encode")
    @js.native
    def encode(latitude: String, longitude: Double): String = js.native
    @JSGlobal("ngeohash.encode")
    @js.native
    def encode(latitude: String, longitude: Double, precision: Double): String = js.native
    @JSGlobal("ngeohash.encode")
    @js.native
    def encode(latitude: Double, longitude: String): String = js.native
    @JSGlobal("ngeohash.encode")
    @js.native
    def encode(latitude: Double, longitude: String, precision: Double): String = js.native
    @JSGlobal("ngeohash.encode")
    @js.native
    def encode(latitude: Double, longitude: Double): String = js.native
    @JSGlobal("ngeohash.encode")
    @js.native
    def encode(latitude: Double, longitude: Double, precision: Double): String = js.native
    
    @JSGlobal("ngeohash.encode_int")
    @js.native
    def encodeInt(latitude: Double, longitude: Double): Double = js.native
    @JSGlobal("ngeohash.encode_int")
    @js.native
    def encodeInt(latitude: Double, longitude: Double, bitDepth: Double): Double = js.native
    
    @JSGlobal("ngeohash.neighbor")
    @js.native
    def neighbor(hashstring: String, direction: NSEW): String = js.native
    
    @JSGlobal("ngeohash.neighbor_int")
    @js.native
    def neighborInt(hashinteger: Double, direction: NSEW): Double = js.native
    @JSGlobal("ngeohash.neighbor_int")
    @js.native
    def neighborInt(hashinteger: Double, direction: NSEW, bitDepth: Double): Double = js.native
    
    @JSGlobal("ngeohash.neighbors")
    @js.native
    def neighbors(hashstring: String): js.Array[String] = js.native
    
    @JSGlobal("ngeohash.neighbors_int")
    @js.native
    def neighborsInt(hashinteger: Double): Double = js.native
    @JSGlobal("ngeohash.neighbors_int")
    @js.native
    def neighborsInt(hashinteger: Double, bitDepth: Double): Double = js.native
  }
}
