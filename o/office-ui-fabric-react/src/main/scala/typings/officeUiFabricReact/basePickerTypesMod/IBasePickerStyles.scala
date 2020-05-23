package typings.officeUiFabricReact.basePickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasePickerStyles extends js.Object {
  /** Refers to the input were to type new selections (picks). */
  var input: IStyle
  /** Refers to the items already selected (picked). */
  var itemsWrapper: IStyle
  /** Root element of any picker extending from BasePicker (wraps all the elements). */
  var root: IStyle
  /** Refers to helper element used for accessibility tools (hidden from view on screen). */
  var screenReaderText: IStyle
  /**
    * Refers to the elements already selected (picked) wrapped by `itemsWrapper` along with the input to type
    * a new selection.
    */
  var text: IStyle
}

object IBasePickerStyles {
  @scala.inline
  def apply(
    input: js.UndefOr[Null | IStyle] = js.undefined,
    itemsWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    screenReaderText: js.UndefOr[Null | IStyle] = js.undefined,
    text: js.UndefOr[Null | IStyle] = js.undefined
  ): IBasePickerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsWrapper)) __obj.updateDynamic("itemsWrapper")(itemsWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(screenReaderText)) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasePickerStyles]
  }
}

