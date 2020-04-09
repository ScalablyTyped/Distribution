package typings.pell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pellCustomActionConfig extends pellAction {
  var icon: String
  var name: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  def result(): Unit
}

object pellCustomActionConfig {
  @scala.inline
  def apply(icon: String, result: () => Unit, name: String = null, title: String = null): pellCustomActionConfig = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], result = js.Any.fromFunction0(result))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[pellCustomActionConfig]
  }
}

