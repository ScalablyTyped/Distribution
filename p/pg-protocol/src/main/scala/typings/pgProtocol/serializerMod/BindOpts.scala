package typings.pgProtocol.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindOpts extends js.Object {
  var binary: js.UndefOr[Boolean] = js.undefined
  var portal: js.UndefOr[String] = js.undefined
  var statement: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object BindOpts {
  @scala.inline
  def apply(
    binary: js.UndefOr[Boolean] = js.undefined,
    portal: String = null,
    statement: String = null,
    values: js.Array[_] = null
  ): BindOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.get.asInstanceOf[js.Any])
    if (portal != null) __obj.updateDynamic("portal")(portal.asInstanceOf[js.Any])
    if (statement != null) __obj.updateDynamic("statement")(statement.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindOpts]
  }
}

