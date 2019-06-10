package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Controls the entity's ability to spawn an entity or an item. This is similar to the chicken's ability to lay eggs after a set amount of time.
  */
trait ISpawnEntityComponent extends js.Object {
  /**
    * If present, the specified entity will only spawn if the filter evaluates to true
    */
  var filters: js.UndefOr[minecraftDashScriptingDashTypesDashSharedLib.MinecraftFilter] = js.undefined
  /**
    * Maximum amount of time to randomly wait in seconds before another entity is spawned
    * @default 600
    */
  var max_wait_time: scala.Double
  /**
    * Minimum amount of time to randomly wait in seconds before another entity is spawned
    * @default 300
    */
  var min_wait_time: scala.Double
  /**
    * The number of entities of this type to spawn each time that this triggers
    * @default 1
    */
  var num_to_spawn: scala.Double
  /**
    * If true, this the spawned entity will be leashed to the parent
    * @default false
    */
  var should_leash: scala.Boolean
  /**
    * If true, this component will only ever spawn the specified entity once
    * @default false
    */
  var single_use: scala.Boolean
  /**
    * Identifier of the entity to spawn, leave empty to spawn the item defined above instead
    */
  var spawn_entity: java.lang.String
  /**
    * Event to call when the entity is spawned
    * @default minecraft:entity_born
    */
  var spawn_event: java.lang.String
  /**
    * Item identifier of the item to spawn
    * @default egg
    */
  var spawn_item: java.lang.String
  /**
    * Method to use to spawn the entity
    * @default born
    */
  var spawn_method: java.lang.String
  /**
    * Identifier of the sound effect to play when the entity is spawned
    * @default plop
    */
  var spawn_sound: java.lang.String
}

object ISpawnEntityComponent {
  @scala.inline
  def apply(
    max_wait_time: scala.Double,
    min_wait_time: scala.Double,
    num_to_spawn: scala.Double,
    should_leash: scala.Boolean,
    single_use: scala.Boolean,
    spawn_entity: java.lang.String,
    spawn_event: java.lang.String,
    spawn_item: java.lang.String,
    spawn_method: java.lang.String,
    spawn_sound: java.lang.String,
    filters: minecraftDashScriptingDashTypesDashSharedLib.MinecraftFilter = null
  ): ISpawnEntityComponent = {
    val __obj = js.Dynamic.literal(max_wait_time = max_wait_time, min_wait_time = min_wait_time, num_to_spawn = num_to_spawn, should_leash = should_leash, single_use = single_use, spawn_entity = spawn_entity, spawn_event = spawn_event, spawn_item = spawn_item, spawn_method = spawn_method, spawn_sound = spawn_sound)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[ISpawnEntityComponent]
  }
}

