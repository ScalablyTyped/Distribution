package typings.pg.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteConfig extends js.Object {
  var portal: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[String] = js.undefined
}

object ExecuteConfig {
  @scala.inline
  def apply(portal: String = null, rows: String = null): ExecuteConfig = {
    val __obj = js.Dynamic.literal()
    if (portal != null) __obj.updateDynamic("portal")(portal)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[ExecuteConfig]
  }
}

