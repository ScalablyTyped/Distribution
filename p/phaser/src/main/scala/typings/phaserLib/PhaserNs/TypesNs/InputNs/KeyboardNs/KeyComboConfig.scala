package typings
package phaserLib.PhaserNs.TypesNs.InputNs.KeyboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyComboConfig extends js.Object {
  /**
    * If the combo matches, will it delete itself?
    */
  var deleteOnMatch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The max delay in ms between each key press. Above this the combo is reset. 0 means disabled.
    */
  var maxKeyDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * If previously matched and they press the first key of the combo again, will it reset?
    */
  var resetOnMatch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If they press the wrong key do we reset the combo?
    */
  var resetOnWrongKey: js.UndefOr[scala.Boolean] = js.undefined
}

object KeyComboConfig {
  @scala.inline
  def apply(
    deleteOnMatch: js.UndefOr[scala.Boolean] = js.undefined,
    maxKeyDelay: scala.Int | scala.Double = null,
    resetOnMatch: js.UndefOr[scala.Boolean] = js.undefined,
    resetOnWrongKey: js.UndefOr[scala.Boolean] = js.undefined
  ): KeyComboConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteOnMatch)) __obj.updateDynamic("deleteOnMatch")(deleteOnMatch)
    if (maxKeyDelay != null) __obj.updateDynamic("maxKeyDelay")(maxKeyDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnMatch)) __obj.updateDynamic("resetOnMatch")(resetOnMatch)
    if (!js.isUndefined(resetOnWrongKey)) __obj.updateDynamic("resetOnWrongKey")(resetOnWrongKey)
    __obj.asInstanceOf[KeyComboConfig]
  }
}

