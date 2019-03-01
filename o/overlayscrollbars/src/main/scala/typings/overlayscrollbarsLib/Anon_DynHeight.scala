package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DynHeight extends js.Object {
  var dynHeight: js.UndefOr[scala.Boolean] = js.undefined
  var dynWidth: js.UndefOr[scala.Boolean] = js.undefined
  var inheritedAttrs: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Null] = js.undefined
}

object Anon_DynHeight {
  @scala.inline
  def apply(
    dynHeight: js.UndefOr[scala.Boolean] = js.undefined,
    dynWidth: js.UndefOr[scala.Boolean] = js.undefined,
    inheritedAttrs: java.lang.String | js.Array[java.lang.String] = null
  ): Anon_DynHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynHeight)) __obj.updateDynamic("dynHeight")(dynHeight)
    if (!js.isUndefined(dynWidth)) __obj.updateDynamic("dynWidth")(dynWidth)
    if (inheritedAttrs != null) __obj.updateDynamic("inheritedAttrs")(inheritedAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DynHeight]
  }
}

