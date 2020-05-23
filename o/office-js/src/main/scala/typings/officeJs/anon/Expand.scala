package typings.officeJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand extends js.Object {
  var expand: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[String] = js.undefined
}

object Expand {
  @scala.inline
  def apply(expand: String = null, select: String = null): Expand = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
}

