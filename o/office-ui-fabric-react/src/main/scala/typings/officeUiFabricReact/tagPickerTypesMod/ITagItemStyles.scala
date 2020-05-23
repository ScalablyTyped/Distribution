package typings.officeUiFabricReact.tagPickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagItemStyles extends js.Object {
  /** Refers to the cancel action button on a picked TagItem. */
  var close: IStyle
  /** Root element of picked TagItem */
  var root: IStyle
  /** Refers to the text element of the TagItem already picked. */
  var text: IStyle
}

object ITagItemStyles {
  @scala.inline
  def apply(
    close: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    text: js.UndefOr[Null | IStyle] = js.undefined
  ): ITagItemStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagItemStyles]
  }
}

