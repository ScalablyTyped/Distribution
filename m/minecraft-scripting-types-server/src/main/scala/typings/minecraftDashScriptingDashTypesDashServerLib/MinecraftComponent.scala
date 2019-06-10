package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MinecraftComponent extends js.Object

@JSGlobal("MinecraftComponent")
@js.native
object MinecraftComponent extends js.Object {
  /**
    * This component represents the armor contents of an entity. The component contains an array of ItemStack JS API Objects representing each slot in the armor container. NOTE: Currently items and containers are read-only. Slots are ordered from head to feet.
    */
  @js.native
  sealed trait ArmorContainer
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * This component controls the Attack Damage attribute from the entity. It allows you to change the current minimum and maximum values. Once the changes are applied, the current attack of the entity will be reset to the minimum specified. With the minimum and maximum changed to the values specified. Any buffs or debuffs will be left intact.
    */
  @js.native
  sealed trait Attack
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Controls the collision box of the entity. When changes to the component are applied the entity's collision box is immediately updated to reflect the new dimensions. WARNING: If the change of the collision box dimensions would cause the entity to be inside a block, the entity might become stuck there and start suffocating.
    */
  @js.native
  sealed trait CollisionBox
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Defines an array of damages and how the entity reacts to them - including whether the entity ignores that damage or not. Currently Minecraft triggers can't be properly serialized so any existing triggers will be completely replaced when applyComponentChanges().
    */
  @js.native
  sealed trait DamageSensor
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Defines the loot table the entity uses to defines its equipment. Once the changes are applied, the equipment is re-rolled and a new set of equipment is chosen for the entity.
    */
  @js.native
  sealed trait Equipment
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Defines how many and what items the entity can be equipped with.
    */
  @js.native
  sealed trait Equippable
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Controls the entity's explosion, timer until the explosion, and whether the timer is counting down or not.
    */
  @js.native
  sealed trait Explode
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * This component represents the contents of an entity's hands. The component contains an array of ItemStack JS API Objects representing each slot in the hand container. NOTE: Currently items and containers are read-only. Slot 0 is main-hand Slot 1 is off-hand.
    */
  @js.native
  sealed trait HandContainer
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Defines how the entity can be healed by the player. This doesn't control how much health the entity can have; you must use the Health component for that instead.
    */
  @js.native
  sealed trait Healable
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Defines the current and maximum possible health of the entity. Upon applying the component back to the entity the health will change. If it reaches 0 or below the entity will die.
    */
  @js.native
  sealed trait Health
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * This component represents the hotbar contents of a player. The component contains an array of ItemStack JS API Objects representing each slot in the hotbar. NOTE: Currently items and containers are read-only. Slots are ordered left to right.
    */
  @js.native
  sealed trait HotbarContainer
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Defines the ways the player can interact with the entity to which this component is applied.
    */
  @js.native
  sealed trait Interact
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Defines the entity's inventory (size, restrictions, etc.). Currently this does not allow changing the entity's inventory contents.
    */
  @js.native
  sealed trait Inventory
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * This component represents the inventory contents of an entity. The component contains an array of ItemStack JS API Objects representing each slot in the inventory. NOTE: Currently items and containers are read-only.Slot 0-8 is the hotbar, 9-16 is the top row of the player's inventory, 17-24 is the middle row, 25-32 is the bottom row
    */
  @js.native
  sealed trait InventoryContainer
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Makes the entity look at another entity. Once applied, if an entity of the specified type is nearby and can be targeted the entity will turn towards it.
    */
  @js.native
  sealed trait LookAt
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Nameable component describes an entity's ability to be named using a nametag and whether the name shows up or not once applied. Additionally, scripting allows setting the name of the entity directly with the property 'name'.
    */
  @js.native
  sealed trait Nameable
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * This component allows you to control an entity's current position in the world. Once applied the entity will be teleported to the new position specified.
    */
  @js.native
  sealed trait Position
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * This component allows you to control an entity's current rotation in the world as well as the entity's head rotation. Once applied, the entity will be rotated as specified.
    */
  @js.native
  sealed trait Rotation
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Defines the entity's ranged attacks. This doesn't allow the entity to use a ranged attack: it only defines what kind of projectile it shoots.
    */
  @js.native
  sealed trait Shooter
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * Controls the entity's ability to spawn an entity or an item. This is similar to the chicken's ability to lay eggs after a set amount of time.
    */
  @js.native
  sealed trait SpawnEntity
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * This controls the entity's ability to teleport itself (similar to the Enderman). If you wish to teleport the entity once use the Position component instead.
    */
  @js.native
  sealed trait Teleport
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /**
    * The tick world component is a read-only component that allows users to access the ticking areas on entities as well as the ticking area's data.
    */
  @js.native
  sealed trait TickWorld
    extends minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent
  
  /* "minecraft:armor_container" */ val ArmorContainer: ArmorContainer with java.lang.String = js.native
  /* "minecraft:attack" */ val Attack: Attack with java.lang.String = js.native
  /* "minecraft:collision_box" */ val CollisionBox: CollisionBox with java.lang.String = js.native
  /* "minecraft:damage_sensor" */ val DamageSensor: DamageSensor with java.lang.String = js.native
  /* "minecraft:equipment" */ val Equipment: Equipment with java.lang.String = js.native
  /* "minecraft:equippable" */ val Equippable: Equippable with java.lang.String = js.native
  /* "minecraft:explode" */ val Explode: Explode with java.lang.String = js.native
  /* "minecraft:hand_container" */ val HandContainer: HandContainer with java.lang.String = js.native
  /* "minecraft:healable" */ val Healable: Healable with java.lang.String = js.native
  /* "minecraft:health" */ val Health: Health with java.lang.String = js.native
  /* "minecraft:hotbar_container" */ val HotbarContainer: HotbarContainer with java.lang.String = js.native
  /* "minecraft:interact" */ val Interact: Interact with java.lang.String = js.native
  /* "minecraft:inventory" */ val Inventory: Inventory with java.lang.String = js.native
  /* "minecraft:inventory_container" */ val InventoryContainer: InventoryContainer with java.lang.String = js.native
  /* "minecraft:lookat" */ val LookAt: LookAt with java.lang.String = js.native
  /* "minecraft:nameable" */ val Nameable: Nameable with java.lang.String = js.native
  /* "minecraft:position" */ val Position: Position with java.lang.String = js.native
  /* "minecraft:rotation" */ val Rotation: Rotation with java.lang.String = js.native
  /* "minecraft:shooter" */ val Shooter: Shooter with java.lang.String = js.native
  /* "minecraft:spawn_entity" */ val SpawnEntity: SpawnEntity with java.lang.String = js.native
  /* "minecraft:teleport" */ val Teleport: Teleport with java.lang.String = js.native
  /* "minecraft:tick_world" */ val TickWorld: TickWorld with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    minecraftDashScriptingDashTypesDashServerLib.MinecraftComponent with java.lang.String
  ] = js.native
}

