package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
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
    scrollTop: js.UndefOr[Double] = js.undefined,
    scrollTopWithoutViewZones: js.UndefOr[Double] = js.undefined
  ): IViewState = {
    val __obj = js.Dynamic.literal(firstPosition = firstPosition.asInstanceOf[js.Any], firstPositionDeltaTop = firstPositionDeltaTop.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTopWithoutViewZones)) __obj.updateDynamic("scrollTopWithoutViewZones")(scrollTopWithoutViewZones.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewState]
  }
}

