package typings.officeUiFabricReact.positioningTypesMod

import typings.officeUiFabricReact.AnonBlock
import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRelativePositions extends js.Object {
  var beakPosition: AnonBlock
  var calloutPosition: IPosition
  var directionalClassName: String
  var submenuDirection: DirectionalHint
}

object IRelativePositions {
  @scala.inline
  def apply(
    beakPosition: AnonBlock,
    calloutPosition: IPosition,
    directionalClassName: String,
    submenuDirection: DirectionalHint
  ): IRelativePositions = {
    val __obj = js.Dynamic.literal(beakPosition = beakPosition.asInstanceOf[js.Any], calloutPosition = calloutPosition.asInstanceOf[js.Any], directionalClassName = directionalClassName.asInstanceOf[js.Any], submenuDirection = submenuDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRelativePositions]
  }
}

