package typings.officeUiFabricReact.calloutContentBaseMod

import typings.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutState extends js.Object {
  var calloutElementRect: js.UndefOr[ClientRect] = js.native
  var heightOffset: js.UndefOr[Double] = js.native
  var positions: js.UndefOr[ICalloutPositionedInfo] = js.native
  var slideDirectionalClassName: js.UndefOr[String] = js.native
}

object ICalloutState {
  @scala.inline
  def apply(): ICalloutState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutState]
  }
  @scala.inline
  implicit class ICalloutStateOps[Self <: ICalloutState] (val x: Self) extends AnyVal {
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
    def setCalloutElementRect(value: ClientRect): Self = this.set("calloutElementRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutElementRect: Self = this.set("calloutElementRect", js.undefined)
    @scala.inline
    def setHeightOffset(value: Double): Self = this.set("heightOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightOffset: Self = this.set("heightOffset", js.undefined)
    @scala.inline
    def setPositions(value: ICalloutPositionedInfo): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
    @scala.inline
    def setSlideDirectionalClassName(value: String): Self = this.set("slideDirectionalClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideDirectionalClassName: Self = this.set("slideDirectionalClassName", js.undefined)
  }
  
}

