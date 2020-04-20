package typings.monacoEditor.mod.languages

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
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutoClosingPair]
  }
}

