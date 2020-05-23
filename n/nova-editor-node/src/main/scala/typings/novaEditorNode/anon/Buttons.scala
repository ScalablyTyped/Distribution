package typings.novaEditorNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buttons extends js.Object {
  var buttons: js.UndefOr[js.Array[String]] = js.undefined
}

object Buttons {
  @scala.inline
  def apply(buttons: js.Array[String] = null): Buttons = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
}

