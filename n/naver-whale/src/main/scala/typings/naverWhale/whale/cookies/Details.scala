package typings.naverWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  var name: String
  var storeId: js.UndefOr[String] = js.undefined
  var url: String
}

object Details {
  @scala.inline
  def apply(name: String, url: String, storeId: String = null): Details = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

