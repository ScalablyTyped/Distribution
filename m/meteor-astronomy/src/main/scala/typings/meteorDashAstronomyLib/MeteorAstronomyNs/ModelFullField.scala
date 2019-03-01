package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelFullField[Field, Doc] extends js.Object {
  var default: js.UndefOr[js.Function0[Field]] = js.undefined
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* doc */ Doc, Field]] = js.undefined
  var transient: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: TypeOptions
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}

object ModelFullField {
  @scala.inline
  def apply[Field, Doc](
    `type`: TypeOptions,
    default: js.Function0[Field] = null,
    immutable: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String | scala.Double = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: js.Function1[/* doc */ Doc, Field] = null,
    transient: js.UndefOr[scala.Boolean] = js.undefined,
    validators: js.Array[Validator] = null
  ): ModelFullField[Field, Doc] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (!js.isUndefined(transient)) __obj.updateDynamic("transient")(transient)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[ModelFullField[Field, Doc]]
  }
}

