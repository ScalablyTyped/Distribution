package typings.openjscad.global.CSG

import typings.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.fuzzyCSGFactory")
@js.native
class fuzzyCSGFactory ()
  extends typings.openjscad.CSG.fuzzyCSGFactory {
  /* CompleteClass */
  override var planefactory: typings.openjscad.CSG.fuzzyFactory = js.native
  /* CompleteClass */
  override var polygonsharedfactory: js.Any = js.native
  /* CompleteClass */
  override var vertexfactory: typings.openjscad.CSG.fuzzyFactory = js.native
  /* CompleteClass */
  override def getCSG(sourcecsg: typings.openjscad.CSG): typings.openjscad.CSG = js.native
  /* CompleteClass */
  override def getPlane(sourceplane: typings.openjscad.CSG.Plane): typings.openjscad.CSG.Plane = js.native
  /* CompleteClass */
  override def getPolygon(sourcepolygon: typings.openjscad.CSG.Polygon): typings.openjscad.CSG.Polygon = js.native
  /* CompleteClass */
  override def getPolygonShared(sourceshared: Shared): Shared = js.native
  /* CompleteClass */
  override def getVertex(sourcevertex: typings.openjscad.CSG.Vertex): typings.openjscad.CSG.Vertex = js.native
}

