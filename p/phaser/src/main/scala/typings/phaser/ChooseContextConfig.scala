package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration object that may be applied to a Context Choose operation.
  */
trait ChooseContextConfig extends js.Object {
  /**
    * The set of filters to apply to the context suggestions: 'NEW_CONTEXT_ONLY', 'INCLUDE_EXISTING_CHALLENGES' or 'NEW_PLAYERS_ONLY'.
    */
  var filters: js.UndefOr[js.Array[ContextFilter]] = js.undefined
  /**
    * The maximum number of participants that a suggested context should ideally have.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number of participants that a suggested context should ideally have.
    */
  var minSize: js.UndefOr[Double] = js.undefined
}

object ChooseContextConfig {
  @scala.inline
  def apply(
    filters: js.Array[ContextFilter] = null,
    maxSize: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined
  ): ChooseContextConfig = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseContextConfig]
  }
}

