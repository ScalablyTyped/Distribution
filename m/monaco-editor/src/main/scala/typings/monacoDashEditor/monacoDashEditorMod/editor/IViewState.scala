package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewState extends js.Object {
  var firstPosition: IPosition
  var firstPositionDeltaTop: Double
  var scrollLeft: Double
  /** written by previous versions */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /** written by previous versions */
  var scrollTopWithoutViewZones: js.UndefOr[Double] = js.undefined
}

object IViewState {
  @scala.inline
  def apply(
    firstPosition: IPosition,
    firstPositionDeltaTop: Double,
    scrollLeft: Double,
    scrollTop: Int | Double = null,
    scrollTopWithoutViewZones: Int | Double = null
  ): IViewState = {
    val __obj = js.Dynamic.literal(firstPosition = firstPosition.asInstanceOf[js.Any], firstPositionDeltaTop = firstPositionDeltaTop.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollTopWithoutViewZones != null) __obj.updateDynamic("scrollTopWithoutViewZones")(scrollTopWithoutViewZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewState]
  }
}

