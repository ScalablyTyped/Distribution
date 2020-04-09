package typings.pell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pellClasses extends js.Object {
  var actionbar: js.UndefOr[String] = js.undefined
  var button: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
}

object pellClasses {
  @scala.inline
  def apply(actionbar: String = null, button: String = null, content: String = null, selected: String = null): pellClasses = {
    val __obj = js.Dynamic.literal()
    if (actionbar != null) __obj.updateDynamic("actionbar")(actionbar.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[pellClasses]
  }
}

