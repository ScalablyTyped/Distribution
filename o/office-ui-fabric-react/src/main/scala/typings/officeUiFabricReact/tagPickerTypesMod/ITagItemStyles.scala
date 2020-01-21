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
  def apply(close: IStyle = null, root: IStyle = null, text: IStyle = null): ITagItemStyles = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagItemStyles]
  }
}

