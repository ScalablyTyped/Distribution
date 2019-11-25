package typings.officeDashUiDashFabricDashReact.libComponentsCoachmarkPositioningContainerPositioningContainerMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositioningContainerState extends js.Object {
  /**
    * Tracks the current height offset and updates during
    * the height animation when props.finalHeight is specified.
    */
  var heightOffset: js.UndefOr[Double] = js.undefined
  /**
    * Current set of calcualted positions for the outermost parent container.
    */
  var positions: js.UndefOr[IPositionedData] = js.undefined
}

object IPositioningContainerState {
  @scala.inline
  def apply(heightOffset: Int | Double = null, positions: IPositionedData = null): IPositioningContainerState = {
    val __obj = js.Dynamic.literal()
    if (heightOffset != null) __obj.updateDynamic("heightOffset")(heightOffset.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositioningContainerState]
  }
}

