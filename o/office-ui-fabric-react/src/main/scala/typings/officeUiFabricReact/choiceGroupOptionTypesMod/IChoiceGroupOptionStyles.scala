package typings.officeUiFabricReact.choiceGroupOptionTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupOptionStyles extends js.Object {
  var choiceFieldWrapper: js.UndefOr[IStyle] = js.native
  var field: js.UndefOr[IStyle] = js.native
  var iconWrapper: js.UndefOr[IStyle] = js.native
  var imageWrapper: js.UndefOr[IStyle] = js.native
  var innerField: js.UndefOr[IStyle] = js.native
  var input: js.UndefOr[IStyle] = js.native
  var labelWrapper: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
  var selectedImageWrapper: js.UndefOr[IStyle] = js.native
}

object IChoiceGroupOptionStyles {
  @scala.inline
  def apply(): IChoiceGroupOptionStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChoiceGroupOptionStyles]
  }
  @scala.inline
  implicit class IChoiceGroupOptionStylesOps[Self <: IChoiceGroupOptionStyles] (val x: Self) extends AnyVal {
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
    def setChoiceFieldWrapper(value: IStyle): Self = this.set("choiceFieldWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoiceFieldWrapper: Self = this.set("choiceFieldWrapper", js.undefined)
    @scala.inline
    def setChoiceFieldWrapperNull: Self = this.set("choiceFieldWrapper", null)
    @scala.inline
    def setField(value: IStyle): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFieldNull: Self = this.set("field", null)
    @scala.inline
    def setIconWrapper(value: IStyle): Self = this.set("iconWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconWrapper: Self = this.set("iconWrapper", js.undefined)
    @scala.inline
    def setIconWrapperNull: Self = this.set("iconWrapper", null)
    @scala.inline
    def setImageWrapper(value: IStyle): Self = this.set("imageWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageWrapper: Self = this.set("imageWrapper", js.undefined)
    @scala.inline
    def setImageWrapperNull: Self = this.set("imageWrapper", null)
    @scala.inline
    def setInnerField(value: IStyle): Self = this.set("innerField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerField: Self = this.set("innerField", js.undefined)
    @scala.inline
    def setInnerFieldNull: Self = this.set("innerField", null)
    @scala.inline
    def setInput(value: IStyle): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInputNull: Self = this.set("input", null)
    @scala.inline
    def setLabelWrapper(value: IStyle): Self = this.set("labelWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWrapper: Self = this.set("labelWrapper", js.undefined)
    @scala.inline
    def setLabelWrapperNull: Self = this.set("labelWrapper", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setSelectedImageWrapper(value: IStyle): Self = this.set("selectedImageWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedImageWrapper: Self = this.set("selectedImageWrapper", js.undefined)
    @scala.inline
    def setSelectedImageWrapperNull: Self = this.set("selectedImageWrapper", null)
  }
  
}

