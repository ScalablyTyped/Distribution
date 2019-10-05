package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.CompoundPath")
@js.native
class CompoundPath protected () extends PathItem {
  /**
    * Creates a new compound path item from an object description and places it at the top of the active layer.
    * @param object - an object literal containing properties to be set on the path
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a new compound path item from SVG path-data and places it at the top of the active layer.
    * @param pathData - the SVG path-data that describes the geometry of this path.
    */
  def this(pathData: String) = this()
  /**
    * The area of the path in square points. Self-intersecting paths can contain sub-areas that cancel each other out.
    * Read Only.
    */
  val area: Double = js.native
  /**
    * Specifies whether the path is closed. If it is closed, Paper.js connects the first and last segments.
    */
  var closed: Boolean = js.native
  /**
    * All the curves contained within the compound-path, from all its child Path items.
    * Read Only
    */
  val curves: js.Array[Curve] = js.native
  /**
    * The first Curve contained within the path.
    * Read Only
    */
  val firstCurve: Curve = js.native
  /**
    * The first Segment contained within the path.
    * Read Only
    */
  val firstSegment: Segment = js.native
  /**
    * The last Curve contained within the path.
    * Read only.
    */
  val lastCurve: Curve = js.native
  /**
    * The last Segment contained within the path.
    * Read Only
    */
  val lastSegment: Segment = js.native
  /**
    * The approximate length of the path in points.
    * Read only.
    */
  val length: Double = js.native
}

