package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an array of damages and how the entity reacts to them - including whether the entity ignores that damage or not. Currently Minecraft triggers can't be properly serialized so any existing triggers will be completely replaced when applyComponentChanges().
  */
@js.native
trait IDamageSensorComponent extends js.Object {
  /**
    * Type of damage that triggers this set of events
    */
  var cause: String = js.native
  /**
    * If true, the damage dealt to the entity will take away health from it, set to false to make the entity ignore that damage
    * @default true
    */
  var deals_damage: Boolean = js.native
  /**
    * List of triggers with the events to call when taking this specific kind of damage, allows specifying filters for entity definitions and events
    */
  var on_damage: js.Array[MinecraftTrigger] = js.native
}

object IDamageSensorComponent {
  @scala.inline
  def apply(cause: String, deals_damage: Boolean, on_damage: js.Array[MinecraftTrigger]): IDamageSensorComponent = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], deals_damage = deals_damage.asInstanceOf[js.Any], on_damage = on_damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDamageSensorComponent]
  }
  @scala.inline
  implicit class IDamageSensorComponentOps[Self <: IDamageSensorComponent] (val x: Self) extends AnyVal {
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
    def setCause(value: String): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeals_damage(value: Boolean): Self = this.set("deals_damage", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn_damageVarargs(value: MinecraftTrigger*): Self = this.set("on_damage", js.Array(value :_*))
    @scala.inline
    def setOn_damage(value: js.Array[MinecraftTrigger]): Self = this.set("on_damage", value.asInstanceOf[js.Any])
  }
  
}

