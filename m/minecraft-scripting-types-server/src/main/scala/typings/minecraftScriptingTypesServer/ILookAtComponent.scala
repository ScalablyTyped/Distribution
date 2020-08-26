package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.MinecraftFilter
import typings.minecraftScriptingTypesShared.MinecraftTrigger
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Makes the entity look at another entity. Once applied, if an entity of the specified type is nearby and can be targeted the entity will turn towards it.
  */
@js.native
trait ILookAtComponent extends js.Object {
  /**
    * Defines the entities that can trigger this component
    * @default player
    */
  var filters: js.UndefOr[MinecraftFilter] = js.native
  /**
    * The range for the random amount of time during which the entity is 'cooling down' and won't get angered or look for a target
    * @default [0.0, 0.0]
    */
  var look_cooldown: Range = js.native
  /**
    * The event identifier to run when the entities specified in filters look at this entity
    */
  var look_event: MinecraftTrigger | String = js.native
  /**
    * If true, invulnerable entities (e.g. Players in creative mode) are considered valid targets
    * @default false
    */
  var mAllowInvulnerable: Boolean = js.native
  /**
    * Maximum distance this entity will look for another entity looking at it
    * @default 10.0
    */
  var searchRadius: Double = js.native
  /**
    * If true, this entity will set the attack target as the entity that looked at it
    * @default true
    */
  var setTarget: Boolean = js.native
}

object ILookAtComponent {
  @scala.inline
  def apply(
    look_cooldown: Range,
    look_event: MinecraftTrigger | String,
    mAllowInvulnerable: Boolean,
    searchRadius: Double,
    setTarget: Boolean
  ): ILookAtComponent = {
    val __obj = js.Dynamic.literal(look_cooldown = look_cooldown.asInstanceOf[js.Any], look_event = look_event.asInstanceOf[js.Any], mAllowInvulnerable = mAllowInvulnerable.asInstanceOf[js.Any], searchRadius = searchRadius.asInstanceOf[js.Any], setTarget = setTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookAtComponent]
  }
  @scala.inline
  implicit class ILookAtComponentOps[Self <: ILookAtComponent] (val x: Self) extends AnyVal {
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
    def setLook_cooldown(value: Range): Self = this.set("look_cooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def setLook_event(value: MinecraftTrigger | String): Self = this.set("look_event", value.asInstanceOf[js.Any])
    @scala.inline
    def setMAllowInvulnerable(value: Boolean): Self = this.set("mAllowInvulnerable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchRadius(value: Double): Self = this.set("searchRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetTarget(value: Boolean): Self = this.set("setTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: MinecraftFilter): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

