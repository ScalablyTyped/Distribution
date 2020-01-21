package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.MinecraftFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEffects extends js.Object {
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var effects: js.Array[AnonAmplifier]
  /**
    * The filter group that defines the conditions for using this item to heal the entity
    */
  var filters: js.UndefOr[MinecraftFilter] = js.undefined
  /**
    * The amount of health this entity gains when fed this item
    * @default 1
    */
  var heal_amount: Double
  /**
    * Item identifier that can be used to heal this entity
    */
  var item: String
}

object AnonEffects {
  @scala.inline
  def apply(
    effects: js.Array[AnonAmplifier],
    heal_amount: Double,
    item: String,
    filters: MinecraftFilter = null
  ): AnonEffects = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], heal_amount = heal_amount.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEffects]
  }
}

