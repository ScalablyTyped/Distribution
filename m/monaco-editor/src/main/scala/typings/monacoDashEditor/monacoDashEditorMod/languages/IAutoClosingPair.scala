package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutoClosingPair extends js.Object {
  var close: String
  var open: String
}

object IAutoClosingPair {
  @scala.inline
  def apply(close: String, open: String): IAutoClosingPair = {
    val __obj = js.Dynamic.literal(close = close, open = open)
  
    __obj.asInstanceOf[IAutoClosingPair]
  }
}

