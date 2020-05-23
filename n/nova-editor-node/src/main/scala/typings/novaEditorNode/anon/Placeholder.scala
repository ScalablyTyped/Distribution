package typings.novaEditorNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder extends js.Object {
  var placeholder: js.UndefOr[String] = js.undefined
}

object Placeholder {
  @scala.inline
  def apply(placeholder: String = null): Placeholder = {
    val __obj = js.Dynamic.literal()
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
}

