package typings.officeUiFabricReact.announcedTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnouncedStyles extends js.Object {
  /**
    * Style override for the root element.
    */
  var root: IStyle
  /**
    * Style override for the screen reader text.
    */
  var screenReaderText: IStyle
}

object IAnnouncedStyles {
  @scala.inline
  def apply(root: IStyle = null, screenReaderText: IStyle = null): IAnnouncedStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (screenReaderText != null) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedStyles]
  }
}

