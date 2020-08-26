package typings.officeUiFabricReact.fabricTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFabricStyles extends js.Object {
  var bodyThemed: IStyle = js.native
  var root: IStyle = js.native
}

object IFabricStyles {
  @scala.inline
  def apply(): IFabricStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFabricStyles]
  }
  @scala.inline
  implicit class IFabricStylesOps[Self <: IFabricStyles] (val x: Self) extends AnyVal {
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
    def setBodyThemed(value: IStyle): Self = this.set("bodyThemed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyThemed: Self = this.set("bodyThemed", js.undefined)
    @scala.inline
    def setBodyThemedNull: Self = this.set("bodyThemed", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

