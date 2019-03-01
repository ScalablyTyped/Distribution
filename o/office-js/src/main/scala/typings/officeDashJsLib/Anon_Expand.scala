package typings
package officeDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expand extends js.Object {
  var expand: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Expand {
  @scala.inline
  def apply(expand: java.lang.String = null, select: java.lang.String = null): Anon_Expand = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[Anon_Expand]
  }
}

