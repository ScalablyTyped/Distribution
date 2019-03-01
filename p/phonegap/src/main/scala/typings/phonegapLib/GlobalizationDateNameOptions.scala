package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationDateNameOptions extends js.Object {
  var item: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object GlobalizationDateNameOptions {
  @scala.inline
  def apply(item: java.lang.String = null, `type`: java.lang.String = null): GlobalizationDateNameOptions = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GlobalizationDateNameOptions]
  }
}

