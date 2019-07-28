package typings.parquetjs.libSchemaDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleFieldInterface extends js.Object {
  var bitWidth: js.UndefOr[Double] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: String
}

object SingleFieldInterface {
  @scala.inline
  def apply(
    `type`: String,
    bitWidth: Int | Double = null,
    encoding: String = null,
    optional: js.UndefOr[Boolean] = js.undefined
  ): SingleFieldInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (bitWidth != null) __obj.updateDynamic("bitWidth")(bitWidth.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[SingleFieldInterface]
  }
}

