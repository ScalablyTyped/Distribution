package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHitTestOptions extends js.Object {
  /**
    * hit-test the corners and side-centers of the bounding rectangle of items (item.bounds).
    */
  var bounds: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * hit-test the rectangle.center of the bounding rectangle of items (item.bounds).
    */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * only hit-test again a certain item class and its sub-classes: Group, Layer, Path, CompoundPath, Shape, Raster, PlacedSymbol, PointText, etc.
    */
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * hit-test the curves of path items, without taking the stroke color or width into account.
    */
  var curves: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * only hit-test for the first or last segment points of open path items.
    */
  var ends: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * hit-test the fill of items.
    */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * hit-test items that have Item#guide set to true.
    */
  var guides: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * hit-test for the handles.  (segment.handleIn / segment.handleOut) of path segments.
    */
  var handles: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * a match function to be called for each found hit result: Return true to return the result, false to keep searching
    */
  var `match`: js.UndefOr[js.Function1[/* hit */ HitResult, scala.Boolean]] = js.undefined
  /**
    * hit-test the item.position of of items, which depends on the setting of item.pivot.
    */
  var position: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * hit-test for segment.point of Path items.
    */
  var segments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * only hit selected items.
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * hit-test the stroke of path items, taking into account the setting of stroke color and width.
    */
  var stroke: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * the tolerance of the hit-test in points. Can also be controlled through paperScope.settings.hitTolerance
    */
  var tolerance: js.UndefOr[scala.Double] = js.undefined
}

