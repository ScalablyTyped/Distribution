package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formatTopoJSONMod {
  type TopoJSON = olLib.formatJSONFeatureMod.default
  type TopoJSONGeometry = topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[js.Object]
  type TopoJSONGeometryCollection = topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryCollection[js.Object]
  type TopoJSONLineString = topojsonDashSpecificationLib.topojsonDashSpecificationMod.LineString[js.Object]
  type TopoJSONMultiLineString = topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiLineString[js.Object]
  type TopoJSONMultiPoint = topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiPoint[js.Object]
  type TopoJSONMultiPolygon = topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiPolygon[js.Object]
  type TopoJSONPoint = topojsonDashSpecificationLib.topojsonDashSpecificationMod.Point[js.Object]
  type TopoJSONPolygon = topojsonDashSpecificationLib.topojsonDashSpecificationMod.Polygon[js.Object]
  type TopoJSONTopology = topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
    topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
  ]
}
