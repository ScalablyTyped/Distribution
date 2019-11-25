package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutoClosingPairConditional extends IAutoClosingPair {
  var notIn: js.UndefOr[js.Array[String]] = js.undefined
}

object IAutoClosingPairConditional {
  @scala.inline
  def apply(close: String, open: String, notIn: js.Array[String] = null): IAutoClosingPairConditional = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    if (notIn != null) __obj.updateDynamic("notIn")(notIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutoClosingPairConditional]
  }
}

