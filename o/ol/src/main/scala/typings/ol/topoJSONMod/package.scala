package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topoJSONMod {
  type TopoJSONGeometry = typings.topojsonSpecification.mod.GeometryObject[js.Object]
  type TopoJSONGeometryCollection = typings.topojsonSpecification.mod.GeometryCollection[js.Object]
  type TopoJSONLineString = typings.topojsonSpecification.mod.LineString[js.Object]
  type TopoJSONMultiLineString = typings.topojsonSpecification.mod.MultiLineString[js.Object]
  type TopoJSONMultiPoint = typings.topojsonSpecification.mod.MultiPoint[js.Object]
  type TopoJSONMultiPolygon = typings.topojsonSpecification.mod.MultiPolygon[js.Object]
  type TopoJSONPoint = typings.topojsonSpecification.mod.Point[js.Object]
  type TopoJSONPolygon = typings.topojsonSpecification.mod.Polygon[js.Object]
  type TopoJSONTopology = typings.topojsonSpecification.mod.Topology[
    typings.topojsonSpecification.mod.Objects[typings.topojsonSpecification.mod.Properties]
  ]
}
