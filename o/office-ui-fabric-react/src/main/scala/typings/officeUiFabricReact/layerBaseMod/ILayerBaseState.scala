package typings.officeUiFabricReact.layerBaseMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayerBaseState extends js.Object {
  var hostId: js.UndefOr[String] = js.native
  var layerElement: js.UndefOr[HTMLElement] = js.native
}

object ILayerBaseState {
  @scala.inline
  def apply(): ILayerBaseState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayerBaseState]
  }
  @scala.inline
  implicit class ILayerBaseStateOps[Self <: ILayerBaseState] (val x: Self) extends AnyVal {
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
    def setHostId(value: String): Self = this.set("hostId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostId: Self = this.set("hostId", js.undefined)
    @scala.inline
    def setLayerElement(value: HTMLElement): Self = this.set("layerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerElement: Self = this.set("layerElement", js.undefined)
  }
  
}

