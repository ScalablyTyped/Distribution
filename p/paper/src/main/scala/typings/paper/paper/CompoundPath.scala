package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A compound path is a complex path that is made up of one or more
  * simple sub-paths. It can have the `nonzero` fill rule, or the `evenodd` rule
  * applied. Both rules use mathematical equations to determine if any region is
  * outside or inside the final shape. The `evenodd` rule is more predictable:
  * Every other region within a such a compound path is a hole, regardless of
  * path direction.
  * 
  * All the paths in a compound path take on the style of the compound path and
  * can be accessed through its {@link Item#children} list.
  */
@JSGlobal("paper.CompoundPath")
@js.native
class CompoundPath protected () extends PathItem {
  /** 
    * Creates a new compound path item from an object description and places it
    * at the top of the active layer.
    * 
    * @param object - an object containing properties to be set on the
    *     path
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a new compound path item from SVG path-data and places it at the
    * top of the active layer.
    * 
    * @param pathData - the SVG path-data that describes the geometry
    * of this path
    */
  def this(pathData: String) = this()
  /** 
    * The area that the compound-path's geometry is covering, calculated by
    * getting the {@link Path#area} of each sub-path and it adding up.
    * Note that self-intersecting paths and sub-paths of different orientation
    * can result in areas that cancel each other out.
    */
  val area: Double = js.native
  /** 
    * Specifies whether the compound-path is fully closed, meaning all its
    * contained sub-paths are closed path.
    * 
    * @see Path#closed
    */
  var closed: Boolean = js.native
  /** 
    * All the curves contained within the compound-path, from all its child
    * {@link Path} items.
    */
  val curves: js.Array[Curve] = js.native
  /** 
    * The first Curve contained within the compound-path, a short-cut to
    * calling {@link Path#firstCurve} on {@link Item#firstChild}.
    */
  val firstCurve: Curve = js.native
  /** 
    * The first Segment contained within the compound-path, a short-cut to
    * calling {@link Path#firstSegment} on {@link Item#firstChild}.
    */
  val firstSegment: Segment = js.native
  /** 
    * The last Curve contained within the compound-path, a short-cut to
    * calling {@link Path#lastCurve} on {@link Item#lastChild}.
    */
  val lastCurve: Curve = js.native
  /** 
    * The last Segment contained within the compound-path, a short-cut to
    * calling {@link Path#lastSegment} on {@link Item#lastChild}.
    */
  val lastSegment: Segment = js.native
  /** 
    * The total length of all sub-paths in this compound-path, calculated by
    * getting the {@link Path#length} of each sub-path and it adding up.
    */
  val length: Double = js.native
}

