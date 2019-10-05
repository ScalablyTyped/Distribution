package typings.officeDashUiDashFabricDashReact.libComponentsAnnouncedAnnouncedDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnouncedStyles extends js.Object {
  /**
    * Style override for the screen reader text.
    */
  var screenReaderText: IStyle
}

object IAnnouncedStyles {
  @scala.inline
  def apply(screenReaderText: IStyle = null): IAnnouncedStyles = {
    val __obj = js.Dynamic.literal()
    if (screenReaderText != null) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedStyles]
  }
}

