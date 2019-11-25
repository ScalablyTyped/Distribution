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
    maxSize: Int | Double = null,
    minSize: Int | Double = null
  ): ChooseContextConfig = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseContextConfig]
  }
}

