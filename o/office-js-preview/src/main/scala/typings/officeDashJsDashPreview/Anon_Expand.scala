package typings.officeDashJsDashPreview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expand extends js.Object {
  var expand: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[String] = js.undefined
}

object Anon_Expand {
  @scala.inline
  def apply(expand: String = null, select: String = null): Anon_Expand = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[Anon_Expand]
  }
}

