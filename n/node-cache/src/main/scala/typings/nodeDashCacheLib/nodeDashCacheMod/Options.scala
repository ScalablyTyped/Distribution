package typings
package nodeDashCacheLib.nodeDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arrayValueSize: js.UndefOr[scala.Double] = js.undefined
  var checkperiod: js.UndefOr[scala.Double] = js.undefined
  var deleteOnExpire: js.UndefOr[scala.Boolean] = js.undefined
  var errorOnMissing: js.UndefOr[scala.Boolean] = js.undefined
  var forceString: js.UndefOr[scala.Boolean] = js.undefined
  var objectValueSize: js.UndefOr[scala.Double] = js.undefined
  var stdTTL: js.UndefOr[scala.Double] = js.undefined
  var useClones: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrayValueSize: scala.Int | scala.Double = null,
    checkperiod: scala.Int | scala.Double = null,
    deleteOnExpire: js.UndefOr[scala.Boolean] = js.undefined,
    errorOnMissing: js.UndefOr[scala.Boolean] = js.undefined,
    forceString: js.UndefOr[scala.Boolean] = js.undefined,
    objectValueSize: scala.Int | scala.Double = null,
    stdTTL: scala.Int | scala.Double = null,
    useClones: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrayValueSize != null) __obj.updateDynamic("arrayValueSize")(arrayValueSize.asInstanceOf[js.Any])
    if (checkperiod != null) __obj.updateDynamic("checkperiod")(checkperiod.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnExpire)) __obj.updateDynamic("deleteOnExpire")(deleteOnExpire)
    if (!js.isUndefined(errorOnMissing)) __obj.updateDynamic("errorOnMissing")(errorOnMissing)
    if (!js.isUndefined(forceString)) __obj.updateDynamic("forceString")(forceString)
    if (objectValueSize != null) __obj.updateDynamic("objectValueSize")(objectValueSize.asInstanceOf[js.Any])
    if (stdTTL != null) __obj.updateDynamic("stdTTL")(stdTTL.asInstanceOf[js.Any])
    if (!js.isUndefined(useClones)) __obj.updateDynamic("useClones")(useClones)
    __obj.asInstanceOf[Options]
  }
}

