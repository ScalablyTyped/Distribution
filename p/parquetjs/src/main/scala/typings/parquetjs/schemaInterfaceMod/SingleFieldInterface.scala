package typings.parquetjs.schemaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleFieldInterface extends SchemaInterfaceField {
  var bitWidth: js.UndefOr[Double] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var repeated: js.UndefOr[Boolean] = js.undefined
  var `type`: String
}

object SingleFieldInterface {
  @scala.inline
  def apply(
    `type`: String,
    bitWidth: js.UndefOr[Double] = js.undefined,
    encoding: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    repeated: js.UndefOr[Boolean] = js.undefined
  ): SingleFieldInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(bitWidth)) __obj.updateDynamic("bitWidth")(bitWidth.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeated)) __obj.updateDynamic("repeated")(repeated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleFieldInterface]
  }
}

