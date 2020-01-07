package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formatTopoJSONMod {
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryCollection
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.LineString
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiLineString
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPoint
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPolygon
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Point
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Polygon
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
  import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology

  type TopoJSONGeometry = GeometryObject[js.Object]
  type TopoJSONGeometryCollection = GeometryCollection[js.Object]
  type TopoJSONLineString = LineString[js.Object]
  type TopoJSONMultiLineString = MultiLineString[js.Object]
  type TopoJSONMultiPoint = MultiPoint[js.Object]
  type TopoJSONMultiPolygon = MultiPolygon[js.Object]
  type TopoJSONPoint = Point[js.Object]
  type TopoJSONPolygon = Polygon[js.Object]
  type TopoJSONTopology = Topology[Objects[Properties]]
}
