package typings
package mediumDashEditorLib.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderOptions extends js.Object {
  var hideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object PlaceholderOptions {
  @scala.inline
  def apply(hideOnClick: js.UndefOr[scala.Boolean] = js.undefined, text: java.lang.String = null): PlaceholderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PlaceholderOptions]
  }
}

