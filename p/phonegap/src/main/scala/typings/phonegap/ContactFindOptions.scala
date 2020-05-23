package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactFindOptions extends js.Object {
  var filter: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
}

object ContactFindOptions {
  @scala.inline
  def apply(filter: String = null, multiple: js.UndefOr[Boolean] = js.undefined): ContactFindOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactFindOptions]
  }
}

