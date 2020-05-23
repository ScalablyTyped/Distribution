package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Effects
import typings.minecraftScriptingTypesShared.MinecraftFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines how the entity can be healed by the player. This doesn't control how much health the entity can have; you must use the Health component for that instead.
  */
trait IHealableComponent extends js.Object {
  /**
    * The filter group that defines the conditions for this trigger
    */
  var filters: js.UndefOr[MinecraftFilter] = js.undefined
  /**
    * Determines if item can be used regardless of entity being at full health
    * @default false
    */
  var force_use: Boolean
  /**
    * The array of items that can be used to heal this entity
    */
  var items: js.Array[Effects]
}

object IHealableComponent {
  @scala.inline
  def apply(force_use: Boolean, items: js.Array[Effects], filters: MinecraftFilter = null): IHealableComponent = {
    val __obj = js.Dynamic.literal(force_use = force_use.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHealableComponent]
  }
}

