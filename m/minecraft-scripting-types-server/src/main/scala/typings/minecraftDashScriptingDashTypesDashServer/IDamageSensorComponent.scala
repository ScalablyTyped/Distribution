package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an array of damages and how the entity reacts to them - including whether the entity ignores that damage or not. Currently Minecraft triggers can't be properly serialized so any existing triggers will be completely replaced when applyComponentChanges().
  */
trait IDamageSensorComponent extends js.Object {
  /**
    * Type of damage that triggers this set of events
    */
  var cause: String
  /**
    * If true, the damage dealt to the entity will take away health from it, set to false to make the entity ignore that damage
    * @default true
    */
  var deals_damage: Boolean
  /**
    * List of triggers with the events to call when taking this specific kind of damage, allows specifying filters for entity definitions and events
    */
  var on_damage: js.Array[MinecraftTrigger]
}

object IDamageSensorComponent {
  @scala.inline
  def apply(cause: String, deals_damage: Boolean, on_damage: js.Array[MinecraftTrigger]): IDamageSensorComponent = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], deals_damage = deals_damage.asInstanceOf[js.Any], on_damage = on_damage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDamageSensorComponent]
  }
}

