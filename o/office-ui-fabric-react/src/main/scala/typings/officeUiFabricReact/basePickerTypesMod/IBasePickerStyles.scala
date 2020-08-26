package typings.officeUiFabricReact.basePickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasePickerStyles extends js.Object {
  /** Refers to the input were to type new selections (picks). */
  var input: IStyle = js.native
  /** Refers to the items already selected (picked). */
  var itemsWrapper: IStyle = js.native
  /** Root element of any picker extending from BasePicker (wraps all the elements). */
  var root: IStyle = js.native
  /** Refers to helper element used for accessibility tools (hidden from view on screen). */
  var screenReaderText: IStyle = js.native
  /**
    * Refers to the elements already selected (picked) wrapped by `itemsWrapper` along with the input to type
    * a new selection.
    */
  var text: IStyle = js.native
}

object IBasePickerStyles {
  @scala.inline
  def apply(): IBasePickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasePickerStyles]
  }
  @scala.inline
  implicit class IBasePickerStylesOps[Self <: IBasePickerStyles] (val x: Self) extends AnyVal {
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
    def setInput(value: IStyle): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInputNull: Self = this.set("input", null)
    @scala.inline
    def setItemsWrapper(value: IStyle): Self = this.set("itemsWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsWrapper: Self = this.set("itemsWrapper", js.undefined)
    @scala.inline
    def setItemsWrapperNull: Self = this.set("itemsWrapper", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setScreenReaderText(value: IStyle): Self = this.set("screenReaderText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenReaderText: Self = this.set("screenReaderText", js.undefined)
    @scala.inline
    def setScreenReaderTextNull: Self = this.set("screenReaderText", null)
    @scala.inline
    def setText(value: IStyle): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
  
}

