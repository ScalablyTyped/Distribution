package typings
package parquetjsLib.libSchemaDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleFieldInterface extends js.Object {
  var bitWidth: js.UndefOr[scala.Double] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
}

object SingleFieldInterface {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    bitWidth: scala.Int | scala.Double = null,
    encoding: java.lang.String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined
  ): SingleFieldInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (bitWidth != null) __obj.updateDynamic("bitWidth")(bitWidth.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[SingleFieldInterface]
  }
}

