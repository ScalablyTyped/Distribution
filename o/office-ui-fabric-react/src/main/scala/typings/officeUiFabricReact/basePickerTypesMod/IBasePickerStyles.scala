package typings.officeUiFabricReact.basePickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasePickerStyles extends js.Object {
  /** Refers to the input were to type new selections(picks). */
  var input: IStyle
  /** Refers to the items already selected(picked). */
  var itemsWrapper: IStyle
  /** Root element of any picker extending from BasePicker (wraps all the elements). */
  var root: IStyle
  /** Refers to helper element used for accessibility tools (hidden from view on screen). */
  var screenReaderText: IStyle
  /** Refers to the elements already selected(picked) wrapped by `itemsWrapper` along with the input to type new selection. */
  var text: IStyle
}

object IBasePickerStyles {
  @scala.inline
  def apply(
    input: IStyle = null,
    itemsWrapper: IStyle = null,
    root: IStyle = null,
    screenReaderText: IStyle = null,
    text: IStyle = null
  ): IBasePickerStyles = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (itemsWrapper != null) __obj.updateDynamic("itemsWrapper")(itemsWrapper.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (screenReaderText != null) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasePickerStyles]
  }
}

