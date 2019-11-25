package typings.openjscad

import typings.openjscad.CSG.Polygon.Shared
import typings.std.Float64Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Class extends js.Object {
  var `class`: String
  var numPolygons: Double
  var numVerticesPerPolygon: Uint32Array
  var planeData: Float64Array
  var polygonPlaneIndexes: Uint32Array
  var polygonSharedIndexes: Uint32Array
  var polygonVertices: Uint32Array
  var shared: js.Array[Shared]
  var vertexData: Float64Array
}

object Anon_Class {
  @scala.inline
  def apply(
    `class`: String,
    numPolygons: Double,
    numVerticesPerPolygon: Uint32Array,
    planeData: Float64Array,
    polygonPlaneIndexes: Uint32Array,
    polygonSharedIndexes: Uint32Array,
    polygonVertices: Uint32Array,
    shared: js.Array[Shared],
    vertexData: Float64Array
  ): Anon_Class = {
    val __obj = js.Dynamic.literal(numPolygons = numPolygons.asInstanceOf[js.Any], numVerticesPerPolygon = numVerticesPerPolygon.asInstanceOf[js.Any], planeData = planeData.asInstanceOf[js.Any], polygonPlaneIndexes = polygonPlaneIndexes.asInstanceOf[js.Any], polygonSharedIndexes = polygonSharedIndexes.asInstanceOf[js.Any], polygonVertices = polygonVertices.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Class]
  }
}

