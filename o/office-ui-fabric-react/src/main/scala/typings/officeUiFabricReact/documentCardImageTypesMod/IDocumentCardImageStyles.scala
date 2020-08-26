package typings.officeUiFabricReact.documentCardImageTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardImageStyles extends js.Object {
  var centeredIcon: IStyle = js.native
  var centeredIconWrapper: IStyle = js.native
  var cornerIcon: IStyle = js.native
  var root: IStyle = js.native
}

object IDocumentCardImageStyles {
  @scala.inline
  def apply(): IDocumentCardImageStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentCardImageStyles]
  }
  @scala.inline
  implicit class IDocumentCardImageStylesOps[Self <: IDocumentCardImageStyles] (val x: Self) extends AnyVal {
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
    def setCenteredIcon(value: IStyle): Self = this.set("centeredIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenteredIcon: Self = this.set("centeredIcon", js.undefined)
    @scala.inline
    def setCenteredIconNull: Self = this.set("centeredIcon", null)
    @scala.inline
    def setCenteredIconWrapper(value: IStyle): Self = this.set("centeredIconWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenteredIconWrapper: Self = this.set("centeredIconWrapper", js.undefined)
    @scala.inline
    def setCenteredIconWrapperNull: Self = this.set("centeredIconWrapper", null)
    @scala.inline
    def setCornerIcon(value: IStyle): Self = this.set("cornerIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerIcon: Self = this.set("cornerIcon", js.undefined)
    @scala.inline
    def setCornerIconNull: Self = this.set("cornerIcon", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

