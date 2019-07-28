package typings.ngmap.angularNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetMapOptions extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object IGetMapOptions {
  @scala.inline
  def apply(id: String = null, timeout: Int | Double = null): IGetMapOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetMapOptions]
  }
}

