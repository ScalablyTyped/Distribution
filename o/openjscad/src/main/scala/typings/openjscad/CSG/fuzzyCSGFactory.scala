package typings.openjscad.CSG

import typings.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fuzzyCSGFactory extends js.Object {
  var planefactory: fuzzyFactory
  var polygonsharedfactory: js.Any
  var vertexfactory: fuzzyFactory
  def getCSG(sourcecsg: typings.openjscad.CSG): typings.openjscad.CSG
  def getPlane(sourceplane: Plane): Plane
  def getPolygon(sourcepolygon: Polygon): Polygon
  def getPolygonShared(sourceshared: Shared): Shared
  def getVertex(sourcevertex: Vertex): Vertex
}

object fuzzyCSGFactory {
  @scala.inline
  def apply(
    getCSG: typings.openjscad.CSG => typings.openjscad.CSG,
    getPlane: Plane => Plane,
    getPolygon: Polygon => Polygon,
    getPolygonShared: Shared => Shared,
    getVertex: Vertex => Vertex,
    planefactory: fuzzyFactory,
    polygonsharedfactory: js.Any,
    vertexfactory: fuzzyFactory
  ): fuzzyCSGFactory = {
    val __obj = js.Dynamic.literal(getCSG = js.Any.fromFunction1(getCSG), getPlane = js.Any.fromFunction1(getPlane), getPolygon = js.Any.fromFunction1(getPolygon), getPolygonShared = js.Any.fromFunction1(getPolygonShared), getVertex = js.Any.fromFunction1(getVertex), planefactory = planefactory.asInstanceOf[js.Any], polygonsharedfactory = polygonsharedfactory.asInstanceOf[js.Any], vertexfactory = vertexfactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[fuzzyCSGFactory]
  }
}

