package typings.officeUiFabricReact.positioningContainerPositioningContainerMod

import typings.officeUiFabricReact.positioningTypesMod.IPositionedData
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
  def apply(heightOffset: js.UndefOr[Double] = js.undefined, positions: IPositionedData = null): IPositioningContainerState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heightOffset)) __obj.updateDynamic("heightOffset")(heightOffset.get.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositioningContainerState]
  }
}

