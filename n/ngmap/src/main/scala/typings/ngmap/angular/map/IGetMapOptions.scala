package typings.ngmap.angular.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetMapOptions extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object IGetMapOptions {
  @scala.inline
  def apply(id: String = null, timeout: js.UndefOr[Double] = js.undefined): IGetMapOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetMapOptions]
  }
}

