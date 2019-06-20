package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Text Word Wrap configuration object as used by the Text Style configuration.
  */
trait TextWordWrap extends js.Object {
  /**
    * Provide a custom callback when word wrapping is enabled.
    */
  var callback: js.UndefOr[phaserLib.TextStyleWordWrapCallback] = js.undefined
  /**
    * The context in which the word wrap callback is invoked.
    */
  var callbackScope: js.UndefOr[js.Any] = js.undefined
  /**
    * Use basic or advanced word wrapping?
    */
  var useAdvancedWrap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The width at which text should be considered for word-wrapping.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TextWordWrap {
  @scala.inline
  def apply(
    callback: phaserLib.TextStyleWordWrapCallback = null,
    callbackScope: js.Any = null,
    useAdvancedWrap: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): TextWordWrap = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (callbackScope != null) __obj.updateDynamic("callbackScope")(callbackScope)
    if (!js.isUndefined(useAdvancedWrap)) __obj.updateDynamic("useAdvancedWrap")(useAdvancedWrap)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextWordWrap]
  }
}

