package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationDateNameOptions extends js.Object {
  var item: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object GlobalizationDateNameOptions {
  @scala.inline
  def apply(item: String = null, `type`: String = null): GlobalizationDateNameOptions = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GlobalizationDateNameOptions]
  }
}

