package typings.pg.pgMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindConfig extends js.Object {
  var binary: js.UndefOr[String] = js.undefined
  var portal: js.UndefOr[String] = js.undefined
  var statement: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[js.UndefOr[Buffer | Null | String]]] = js.undefined
}

object BindConfig {
  @scala.inline
  def apply(
    binary: String = null,
    portal: String = null,
    statement: String = null,
    values: js.Array[js.UndefOr[Buffer | Null | String]] = null
  ): BindConfig = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (portal != null) __obj.updateDynamic("portal")(portal.asInstanceOf[js.Any])
    if (statement != null) __obj.updateDynamic("statement")(statement.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindConfig]
  }
}

