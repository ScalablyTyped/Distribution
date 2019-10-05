package typings.naverDashWhale.whale.cookies

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
    val __obj = js.Dynamic.literal(name = name, url = url)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    __obj.asInstanceOf[Details]
  }
}

