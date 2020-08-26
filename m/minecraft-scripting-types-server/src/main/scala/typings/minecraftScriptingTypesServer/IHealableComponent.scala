package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Effects
import typings.minecraftScriptingTypesShared.MinecraftFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines how the entity can be healed by the player. This doesn't control how much health the entity can have; you must use the Health component for that instead.
  */
@js.native
trait IHealableComponent extends js.Object {
  /**
    * The filter group that defines the conditions for this trigger
    */
  var filters: js.UndefOr[MinecraftFilter] = js.native
  /**
    * Determines if item can be used regardless of entity being at full health
    * @default false
    */
  var force_use: Boolean = js.native
  /**
    * The array of items that can be used to heal this entity
    */
  var items: js.Array[Effects] = js.native
}

object IHealableComponent {
  @scala.inline
  def apply(force_use: Boolean, items: js.Array[Effects]): IHealableComponent = {
    val __obj = js.Dynamic.literal(force_use = force_use.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHealableComponent]
  }
  @scala.inline
  implicit class IHealableComponentOps[Self <: IHealableComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForce_use(value: Boolean): Self = this.set("force_use", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: Effects*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Effects]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: MinecraftFilter): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

