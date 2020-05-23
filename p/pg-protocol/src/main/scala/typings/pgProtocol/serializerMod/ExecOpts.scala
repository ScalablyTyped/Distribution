package typings.pgProtocol.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecOpts extends js.Object {
  var portal: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
}

object ExecOpts {
  @scala.inline
  def apply(portal: String = null, rows: js.UndefOr[Double] = js.undefined): ExecOpts = {
    val __obj = js.Dynamic.literal()
    if (portal != null) __obj.updateDynamic("portal")(portal.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOpts]
  }
}

