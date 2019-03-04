package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Class extends js.Object {
  var `class`: java.lang.String
  var numPolygons: scala.Double
  var numVerticesPerPolygon: stdLib.Uint32Array
  var planeData: stdLib.Float64Array
  var polygonPlaneIndexes: stdLib.Uint32Array
  var polygonSharedIndexes: stdLib.Uint32Array
  var polygonVertices: stdLib.Uint32Array
  var shared: js.Array[openjscadLib.CSGNs.PolygonNs.Shared]
  var vertexData: stdLib.Float64Array
}

object Anon_Class {
  @scala.inline
  def apply(
    `class`: java.lang.String,
    numPolygons: scala.Double,
    numVerticesPerPolygon: stdLib.Uint32Array,
    planeData: stdLib.Float64Array,
    polygonPlaneIndexes: stdLib.Uint32Array,
    polygonSharedIndexes: stdLib.Uint32Array,
    polygonVertices: stdLib.Uint32Array,
    shared: js.Array[openjscadLib.CSGNs.PolygonNs.Shared],
    vertexData: stdLib.Float64Array
  ): Anon_Class = {
    val __obj = js.Dynamic.literal(numPolygons = numPolygons, numVerticesPerPolygon = numVerticesPerPolygon, planeData = planeData, polygonPlaneIndexes = polygonPlaneIndexes, polygonSharedIndexes = polygonSharedIndexes, polygonVertices = polygonVertices, shared = shared, vertexData = vertexData)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[Anon_Class]
  }
}

