package typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWithViewportProps extends js.Object {
  /**
    * Whether or not to use ResizeObserver (if available) to detect
    * and measure viewport on 'resize' events.
    *
    * Falls back to window 'resize' event.
    *
    * @defaultValue false
    */
  var skipViewportMeasures: js.UndefOr[Boolean] = js.undefined
}

object IWithViewportProps {
  @scala.inline
  def apply(skipViewportMeasures: js.UndefOr[Boolean] = js.undefined): IWithViewportProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipViewportMeasures)) __obj.updateDynamic("skipViewportMeasures")(skipViewportMeasures)
    __obj.asInstanceOf[IWithViewportProps]
  }
}

