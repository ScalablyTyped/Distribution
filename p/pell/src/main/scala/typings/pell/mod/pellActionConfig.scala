package typings.pell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pellActionConfig extends pellAction {
  var icon: js.UndefOr[String] = js.undefined
  var name: pellAction
  var title: js.UndefOr[String] = js.undefined
  def result(): Unit
}

object pellActionConfig {
  @scala.inline
  def apply(name: pellAction, result: () => Unit, icon: String = null, title: String = null): pellActionConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result = js.Any.fromFunction0(result))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[pellActionConfig]
  }
}

