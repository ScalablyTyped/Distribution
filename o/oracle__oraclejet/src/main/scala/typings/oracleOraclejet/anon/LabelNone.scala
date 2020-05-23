package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelNone extends js.Object {
  var labelNone: js.UndefOr[String] = js.undefined
}

object LabelNone {
  @scala.inline
  def apply(labelNone: String = null): LabelNone = {
    val __obj = js.Dynamic.literal()
    if (labelNone != null) __obj.updateDynamic("labelNone")(labelNone.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelNone]
  }
}

