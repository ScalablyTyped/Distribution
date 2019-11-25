package typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotBaseMod

import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.grow
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.shrink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeGroupState extends js.Object {
  /**
    * Data to render in a hidden div for measurement
    */
  var dataToMeasure: js.UndefOr[js.Any] = js.undefined
  /**
    * Set to true when the content container might have new dimensions and should
    * be remeasured.
    */
  var measureContainer: js.UndefOr[Boolean] = js.undefined
  /**
    * Final data used to render proper sized component
    */
  var renderedData: js.UndefOr[js.Any] = js.undefined
  /**
    * Are we resizing to accommodate having more or less available space?
    * The 'grow' direction is when the container may have more room than the last render,
    * such as when a window resize occurs. This means we will try to fit more content in the window.
    * The 'shrink' direction is when the contents don't fit in the container and we need
    * to find a transformation of the data that makes everything fit.
    */
  var resizeDirection: js.UndefOr[grow | shrink] = js.undefined
}

object IResizeGroupState {
  @scala.inline
  def apply(
    dataToMeasure: js.Any = null,
    measureContainer: js.UndefOr[Boolean] = js.undefined,
    renderedData: js.Any = null,
    resizeDirection: grow | shrink = null
  ): IResizeGroupState = {
    val __obj = js.Dynamic.literal()
    if (dataToMeasure != null) __obj.updateDynamic("dataToMeasure")(dataToMeasure.asInstanceOf[js.Any])
    if (!js.isUndefined(measureContainer)) __obj.updateDynamic("measureContainer")(measureContainer.asInstanceOf[js.Any])
    if (renderedData != null) __obj.updateDynamic("renderedData")(renderedData.asInstanceOf[js.Any])
    if (resizeDirection != null) __obj.updateDynamic("resizeDirection")(resizeDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeGroupState]
  }
}

