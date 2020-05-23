package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.PolygonTreeNode")
@js.native
class PolygonTreeNode ()
  extends typings.openjscad.CSG.PolygonTreeNode {
  /* CompleteClass */
  override var children: js.Any = js.native
  /* CompleteClass */
  override var parent: js.Any = js.native
  /* CompleteClass */
  override var polygon: typings.openjscad.CSG.Polygon = js.native
  /* CompleteClass */
  override var removed: Boolean = js.native
  /* CompleteClass */
  override def _splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): Unit = js.native
  /* CompleteClass */
  override def addChild(polygon: typings.openjscad.CSG.Polygon): typings.openjscad.CSG.PolygonTreeNode = js.native
  /* CompleteClass */
  override def addPolygons(polygons: js.Any): Unit = js.native
  /* CompleteClass */
  override def getPolygon(): typings.openjscad.CSG.Polygon = js.native
  /* CompleteClass */
  override def getPolygons(result: js.Array[typings.openjscad.CSG.Polygon]): Unit = js.native
  /* CompleteClass */
  override def invert(): Unit = js.native
  /* CompleteClass */
  override def invertSub(): Unit = js.native
  /* CompleteClass */
  override def isRemoved(): Boolean = js.native
  /* CompleteClass */
  override def isRootNode(): Boolean = js.native
  /* CompleteClass */
  override def recursivelyInvalidatePolygon(): Unit = js.native
  /* CompleteClass */
  override def remove(): Unit = js.native
  /* CompleteClass */
  override def splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): Unit = js.native
}

