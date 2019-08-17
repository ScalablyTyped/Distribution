package typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(close: IStyle, root: IStyle, text: IStyle): ITagItemStyles = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITagItemStyles]
  }
}

