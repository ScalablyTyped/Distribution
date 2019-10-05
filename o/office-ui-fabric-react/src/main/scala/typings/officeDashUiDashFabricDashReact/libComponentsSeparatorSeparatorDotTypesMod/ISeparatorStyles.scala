package typings.officeDashUiDashFabricDashReact.libComponentsSeparatorSeparatorDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeparatorStyles extends js.Object {
  /**
    * Style for the content
    */
  var content: IStyle
  /**
    * Style for the root element
    */
  var root: IStyle
}

object ISeparatorStyles {
  @scala.inline
  def apply(content: IStyle = null, root: IStyle = null): ISeparatorStyles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeparatorStyles]
  }
}

