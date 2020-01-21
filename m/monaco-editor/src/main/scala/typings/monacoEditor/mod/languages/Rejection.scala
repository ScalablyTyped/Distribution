package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rejection extends js.Object {
  var rejectReason: js.UndefOr[String] = js.undefined
}

object Rejection {
  @scala.inline
  def apply(rejectReason: String = null): Rejection = {
    val __obj = js.Dynamic.literal()
    if (rejectReason != null) __obj.updateDynamic("rejectReason")(rejectReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rejection]
  }
}

