package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.MinecraftFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Controls the entity's ability to spawn an entity or an item. This is similar to the chicken's ability to lay eggs after a set amount of time.
  */
@js.native
trait ISpawnEntityComponent extends js.Object {
  /**
    * If present, the specified entity will only spawn if the filter evaluates to true
    */
  var filters: js.UndefOr[MinecraftFilter] = js.native
  /**
    * Maximum amount of time to randomly wait in seconds before another entity is spawned
    * @default 600
    */
  var max_wait_time: Double = js.native
  /**
    * Minimum amount of time to randomly wait in seconds before another entity is spawned
    * @default 300
    */
  var min_wait_time: Double = js.native
  /**
    * The number of entities of this type to spawn each time that this triggers
    * @default 1
    */
  var num_to_spawn: Double = js.native
  /**
    * If true, this the spawned entity will be leashed to the parent
    * @default false
    */
  var should_leash: Boolean = js.native
  /**
    * If true, this component will only ever spawn the specified entity once
    * @default false
    */
  var single_use: Boolean = js.native
  /**
    * Identifier of the entity to spawn, leave empty to spawn the item defined above instead
    */
  var spawn_entity: String = js.native
  /**
    * Event to call when the entity is spawned
    * @default minecraft:entity_born
    */
  var spawn_event: String = js.native
  /**
    * Item identifier of the item to spawn
    * @default egg
    */
  var spawn_item: String = js.native
  /**
    * Method to use to spawn the entity
    * @default born
    */
  var spawn_method: String = js.native
  /**
    * Identifier of the sound effect to play when the entity is spawned
    * @default plop
    */
  var spawn_sound: String = js.native
}

object ISpawnEntityComponent {
  @scala.inline
  def apply(
    max_wait_time: Double,
    min_wait_time: Double,
    num_to_spawn: Double,
    should_leash: Boolean,
    single_use: Boolean,
    spawn_entity: String,
    spawn_event: String,
    spawn_item: String,
    spawn_method: String,
    spawn_sound: String
  ): ISpawnEntityComponent = {
    val __obj = js.Dynamic.literal(max_wait_time = max_wait_time.asInstanceOf[js.Any], min_wait_time = min_wait_time.asInstanceOf[js.Any], num_to_spawn = num_to_spawn.asInstanceOf[js.Any], should_leash = should_leash.asInstanceOf[js.Any], single_use = single_use.asInstanceOf[js.Any], spawn_entity = spawn_entity.asInstanceOf[js.Any], spawn_event = spawn_event.asInstanceOf[js.Any], spawn_item = spawn_item.asInstanceOf[js.Any], spawn_method = spawn_method.asInstanceOf[js.Any], spawn_sound = spawn_sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpawnEntityComponent]
  }
  @scala.inline
  implicit class ISpawnEntityComponentOps[Self <: ISpawnEntityComponent] (val x: Self) extends AnyVal {
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
    def setMax_wait_time(value: Double): Self = this.set("max_wait_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin_wait_time(value: Double): Self = this.set("min_wait_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setNum_to_spawn(value: Double): Self = this.set("num_to_spawn", value.asInstanceOf[js.Any])
    @scala.inline
    def setShould_leash(value: Boolean): Self = this.set("should_leash", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingle_use(value: Boolean): Self = this.set("single_use", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpawn_entity(value: String): Self = this.set("spawn_entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpawn_event(value: String): Self = this.set("spawn_event", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpawn_item(value: String): Self = this.set("spawn_item", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpawn_method(value: String): Self = this.set("spawn_method", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpawn_sound(value: String): Self = this.set("spawn_sound", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: MinecraftFilter): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

