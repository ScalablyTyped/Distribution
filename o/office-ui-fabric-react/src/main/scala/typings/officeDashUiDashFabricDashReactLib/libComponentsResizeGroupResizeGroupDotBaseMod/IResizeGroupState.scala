package typings
package officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotBaseMod

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
  var measureContainer: js.UndefOr[scala.Boolean] = js.undefined
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
  var resizeDirection: js.UndefOr[
    officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.grow | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.shrink
  ] = js.undefined
}

