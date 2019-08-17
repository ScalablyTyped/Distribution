package typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(input: IStyle, itemsWrapper: IStyle, root: IStyle, screenReaderText: IStyle, text: IStyle): IBasePickerStyles = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], itemsWrapper = itemsWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], screenReaderText = screenReaderText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBasePickerStyles]
  }
}

