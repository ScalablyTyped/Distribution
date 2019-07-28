package typings.paper.paperNs

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHitTestOptions extends js.Object {
  /**
    * hit-test the corners and side-centers of the bounding rectangle of items (item.bounds).
    */
  var bounds: js.UndefOr[Boolean] = js.undefined
  /**
    * hit-test the rectangle.center of the bounding rectangle of items (item.bounds).
    */
  var center: js.UndefOr[Boolean] = js.undefined
  /**
    * only hit-test against a certain item class and its sub-classes: Group, Layer, Path, CompoundPath, Shape, Raster, PlacedSymbol, PointText, etc.
    */
  var `class`: js.UndefOr[Instantiable1[/* args (repeated) */ js.Any, Item]] = js.undefined
  /**
    * hit-test the curves of path items, without taking the stroke color or width into account.
    */
  var curves: js.UndefOr[Boolean] = js.undefined
  /**
    * only hit-test for the first or last segment points of open path items.
    */
  var ends: js.UndefOr[Boolean] = js.undefined
  /**
    * hit-test the fill of items.
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  /**
    * hit-test items that have Item#guide set to true.
    */
  var guides: js.UndefOr[Boolean] = js.undefined
  /**
    * hit-test for the handles.  (segment.handleIn / segment.handleOut) of path segments.
    */
  var handles: js.UndefOr[Boolean] = js.undefined
  /**
    * a match function to be called for each found hit result: Return true to return the result, false to keep searching
    */
  var `match`: js.UndefOr[js.Function1[/* hit */ HitResult, Boolean]] = js.undefined
  /**
    * hit-test the item.position of of items, which depends on the setting of item.pivot.
    */
  var position: js.UndefOr[Boolean] = js.undefined
  /**
    * hit-test for segment.point of Path items.
    */
  var segments: js.UndefOr[Boolean] = js.undefined
  /**
    * only hit selected items.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * hit-test the stroke of path items, taking into account the setting of stroke color and width.
    */
  var stroke: js.UndefOr[Boolean] = js.undefined
  /**
    * the tolerance of the hit-test in points. Can also be controlled through paperScope.settings.hitTolerance
    */
  var tolerance: js.UndefOr[Double] = js.undefined
}

object IHitTestOptions {
  @scala.inline
  def apply(
    bounds: js.UndefOr[Boolean] = js.undefined,
    center: js.UndefOr[Boolean] = js.undefined,
    `class`: Instantiable1[/* args (repeated) */ js.Any, Item] = null,
    curves: js.UndefOr[Boolean] = js.undefined,
    ends: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    guides: js.UndefOr[Boolean] = js.undefined,
    handles: js.UndefOr[Boolean] = js.undefined,
    `match`: /* hit */ HitResult => Boolean = null,
    position: js.UndefOr[Boolean] = js.undefined,
    segments: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    stroke: js.UndefOr[Boolean] = js.undefined,
    tolerance: Int | Double = null
  ): IHitTestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bounds)) __obj.updateDynamic("bounds")(bounds)
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (!js.isUndefined(curves)) __obj.updateDynamic("curves")(curves)
    if (!js.isUndefined(ends)) __obj.updateDynamic("ends")(ends)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(guides)) __obj.updateDynamic("guides")(guides)
    if (!js.isUndefined(handles)) __obj.updateDynamic("handles")(handles)
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(segments)) __obj.updateDynamic("segments")(segments)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHitTestOptions]
  }
}

