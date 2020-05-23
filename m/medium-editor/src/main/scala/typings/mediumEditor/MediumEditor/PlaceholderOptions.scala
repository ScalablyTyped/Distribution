package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderOptions extends js.Object {
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object PlaceholderOptions {
  @scala.inline
  def apply(hideOnClick: js.UndefOr[Boolean] = js.undefined, text: String = null): PlaceholderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderOptions]
  }
}

