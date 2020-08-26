package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonaStyles extends js.Object {
  var details: IStyle = js.native
  var optionalText: IStyle = js.native
  var primaryText: IStyle = js.native
  var root: IStyle = js.native
  var secondaryText: IStyle = js.native
  var tertiaryText: IStyle = js.native
  var textContent: IStyle = js.native
}

object IPersonaStyles {
  @scala.inline
  def apply(): IPersonaStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaStyles]
  }
  @scala.inline
  implicit class IPersonaStylesOps[Self <: IPersonaStyles] (val x: Self) extends AnyVal {
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
    def setDetails(value: IStyle): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setDetailsNull: Self = this.set("details", null)
    @scala.inline
    def setOptionalText(value: IStyle): Self = this.set("optionalText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalText: Self = this.set("optionalText", js.undefined)
    @scala.inline
    def setOptionalTextNull: Self = this.set("optionalText", null)
    @scala.inline
    def setPrimaryText(value: IStyle): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryText: Self = this.set("primaryText", js.undefined)
    @scala.inline
    def setPrimaryTextNull: Self = this.set("primaryText", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setSecondaryText(value: IStyle): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    @scala.inline
    def setSecondaryTextNull: Self = this.set("secondaryText", null)
    @scala.inline
    def setTertiaryText(value: IStyle): Self = this.set("tertiaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTertiaryText: Self = this.set("tertiaryText", js.undefined)
    @scala.inline
    def setTertiaryTextNull: Self = this.set("tertiaryText", null)
    @scala.inline
    def setTextContent(value: IStyle): Self = this.set("textContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextContent: Self = this.set("textContent", js.undefined)
    @scala.inline
    def setTextContentNull: Self = this.set("textContent", null)
  }
  
}

