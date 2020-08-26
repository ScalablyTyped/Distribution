package typings.officeUiFabricReact.positioningTypesMod

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRelativePositions extends js.Object {
  var beakPosition: typings.officeUiFabricReact.anon.Position = js.native
  var calloutPosition: IPosition = js.native
  var directionalClassName: String = js.native
  var submenuDirection: DirectionalHint = js.native
}

object IRelativePositions {
  @scala.inline
  def apply(
    beakPosition: typings.officeUiFabricReact.anon.Position,
    calloutPosition: IPosition,
    directionalClassName: String,
    submenuDirection: DirectionalHint
  ): IRelativePositions = {
    val __obj = js.Dynamic.literal(beakPosition = beakPosition.asInstanceOf[js.Any], calloutPosition = calloutPosition.asInstanceOf[js.Any], directionalClassName = directionalClassName.asInstanceOf[js.Any], submenuDirection = submenuDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRelativePositions]
  }
  @scala.inline
  implicit class IRelativePositionsOps[Self <: IRelativePositions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeakPosition(value: typings.officeUiFabricReact.anon.Position): Self = this.set("beakPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalloutPosition(value: IPosition): Self = this.set("calloutPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalClassName(value: String): Self = this.set("directionalClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmenuDirection(value: DirectionalHint): Self = this.set("submenuDirection", value.asInstanceOf[js.Any])
  }
  
}

