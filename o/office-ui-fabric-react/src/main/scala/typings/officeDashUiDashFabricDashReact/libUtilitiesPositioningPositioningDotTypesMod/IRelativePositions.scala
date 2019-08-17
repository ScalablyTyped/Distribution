package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod

import typings.officeDashUiDashFabricDashReact.Anon_Block
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRelativePositions extends js.Object {
  var beakPosition: Anon_Block
  var calloutPosition: IPosition
  var directionalClassName: String
  var submenuDirection: DirectionalHint
}

object IRelativePositions {
  @scala.inline
  def apply(
    beakPosition: Anon_Block,
    calloutPosition: IPosition,
    directionalClassName: String,
    submenuDirection: DirectionalHint
  ): IRelativePositions = {
    val __obj = js.Dynamic.literal(beakPosition = beakPosition, calloutPosition = calloutPosition, directionalClassName = directionalClassName, submenuDirection = submenuDirection)
  
    __obj.asInstanceOf[IRelativePositions]
  }
}

