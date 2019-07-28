package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:armor_container`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:attack`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:collision_box`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:damage_sensor`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:equipment`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:equippable`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:explode`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:hand_container`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:healable`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:health`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:hotbar_container`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:interact`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:inventory_container`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:inventory`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:lookat`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:nameable`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:position`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:rotation`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:shooter`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:spawn_entity`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:teleport`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:tick_world`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:armor_container`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:attack`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:collision_box`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:damage_sensor`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:equipment`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:equippable`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:explode`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:hand_container`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:healable`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:health`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:hotbar_container`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:interact`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:inventory`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:inventory_container`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:lookat`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:nameable`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:position`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:rotation`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:shooter`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:spawn_entity`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:teleport`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:tick_world`
*/
trait MinecraftComponent extends js.Object

object MinecraftComponent {
  /**
    * This component represents the armor contents of an entity. The component contains an array of ItemStack JS API Objects representing each slot in the armor container. NOTE: Currently items and containers are read-only. Slots are ordered from head to feet.
    */
  @scala.inline
  def ArmorContainer: `minecraft:armor_container` = this.cast("minecraft:armor_container")
  /**
    * This component controls the Attack Damage attribute from the entity. It allows you to change the current minimum and maximum values. Once the changes are applied, the current attack of the entity will be reset to the minimum specified. With the minimum and maximum changed to the values specified. Any buffs or debuffs will be left intact.
    */
  @scala.inline
  def Attack: `minecraft:attack` = this.cast("minecraft:attack")
  /**
    * Controls the collision box of the entity. When changes to the component are applied the entity's collision box is immediately updated to reflect the new dimensions. WARNING: If the change of the collision box dimensions would cause the entity to be inside a block, the entity might become stuck there and start suffocating.
    */
  @scala.inline
  def CollisionBox: `minecraft:collision_box` = this.cast("minecraft:collision_box")
  /**
    * Defines an array of damages and how the entity reacts to them - including whether the entity ignores that damage or not. Currently Minecraft triggers can't be properly serialized so any existing triggers will be completely replaced when applyComponentChanges().
    */
  @scala.inline
  def DamageSensor: `minecraft:damage_sensor` = this.cast("minecraft:damage_sensor")
  /**
    * Defines the loot table the entity uses to defines its equipment. Once the changes are applied, the equipment is re-rolled and a new set of equipment is chosen for the entity.
    */
  @scala.inline
  def Equipment: `minecraft:equipment` = this.cast("minecraft:equipment")
  /**
    * Defines how many and what items the entity can be equipped with.
    */
  @scala.inline
  def Equippable: `minecraft:equippable` = this.cast("minecraft:equippable")
  /**
    * Controls the entity's explosion, timer until the explosion, and whether the timer is counting down or not.
    */
  @scala.inline
  def Explode: `minecraft:explode` = this.cast("minecraft:explode")
  /**
    * This component represents the contents of an entity's hands. The component contains an array of ItemStack JS API Objects representing each slot in the hand container. NOTE: Currently items and containers are read-only. Slot 0 is main-hand Slot 1 is off-hand.
    */
  @scala.inline
  def HandContainer: `minecraft:hand_container` = this.cast("minecraft:hand_container")
  /**
    * Defines how the entity can be healed by the player. This doesn't control how much health the entity can have; you must use the Health component for that instead.
    */
  @scala.inline
  def Healable: `minecraft:healable` = this.cast("minecraft:healable")
  /**
    * Defines the current and maximum possible health of the entity. Upon applying the component back to the entity the health will change. If it reaches 0 or below the entity will die.
    */
  @scala.inline
  def Health: `minecraft:health` = this.cast("minecraft:health")
  /**
    * This component represents the hotbar contents of a player. The component contains an array of ItemStack JS API Objects representing each slot in the hotbar. NOTE: Currently items and containers are read-only. Slots are ordered left to right.
    */
  @scala.inline
  def HotbarContainer: `minecraft:hotbar_container` = this.cast("minecraft:hotbar_container")
  /**
    * Defines the ways the player can interact with the entity to which this component is applied.
    */
  @scala.inline
  def Interact: `minecraft:interact` = this.cast("minecraft:interact")
  /**
    * Defines the entity's inventory (size, restrictions, etc.). Currently this does not allow changing the entity's inventory contents.
    */
  @scala.inline
  def Inventory: `minecraft:inventory` = this.cast("minecraft:inventory")
  /**
    * This component represents the inventory contents of an entity. The component contains an array of ItemStack JS API Objects representing each slot in the inventory. NOTE: Currently items and containers are read-only.Slot 0-8 is the hotbar, 9-16 is the top row of the player's inventory, 17-24 is the middle row, 25-32 is the bottom row
    */
  @scala.inline
  def InventoryContainer: `minecraft:inventory_container` = this.cast("minecraft:inventory_container")
  /**
    * Makes the entity look at another entity. Once applied, if an entity of the specified type is nearby and can be targeted the entity will turn towards it.
    */
  @scala.inline
  def LookAt: `minecraft:lookat` = this.cast("minecraft:lookat")
  /**
    * Nameable component describes an entity's ability to be named using a nametag and whether the name shows up or not once applied. Additionally, scripting allows setting the name of the entity directly with the property 'name'.
    */
  @scala.inline
  def Nameable: `minecraft:nameable` = this.cast("minecraft:nameable")
  /**
    * This component allows you to control an entity's current position in the world. Once applied the entity will be teleported to the new position specified.
    */
  @scala.inline
  def Position: `minecraft:position` = this.cast("minecraft:position")
  /**
    * This component allows you to control an entity's current rotation in the world as well as the entity's head rotation. Once applied, the entity will be rotated as specified.
    */
  @scala.inline
  def Rotation: `minecraft:rotation` = this.cast("minecraft:rotation")
  /**
    * Defines the entity's ranged attacks. This doesn't allow the entity to use a ranged attack: it only defines what kind of projectile it shoots.
    */
  @scala.inline
  def Shooter: `minecraft:shooter` = this.cast("minecraft:shooter")
  /**
    * Controls the entity's ability to spawn an entity or an item. This is similar to the chicken's ability to lay eggs after a set amount of time.
    */
  @scala.inline
  def SpawnEntity: `minecraft:spawn_entity` = this.cast("minecraft:spawn_entity")
  /**
    * This controls the entity's ability to teleport itself (similar to the Enderman). If you wish to teleport the entity once use the Position component instead.
    */
  @scala.inline
  def Teleport: `minecraft:teleport` = this.cast("minecraft:teleport")
  /**
    * The tick world component is a read-only component that allows users to access the ticking areas on entities as well as the ticking area's data.
    */
  @scala.inline
  def TickWorld: `minecraft:tick_world` = this.cast("minecraft:tick_world")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

