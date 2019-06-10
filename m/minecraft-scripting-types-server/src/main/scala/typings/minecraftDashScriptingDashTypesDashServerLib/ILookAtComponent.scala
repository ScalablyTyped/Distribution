package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Makes the entity look at another entity. Once applied, if an entity of the specified type is nearby and can be targeted the entity will turn towards it.
  */
trait ILookAtComponent extends js.Object {
  /**
    * Defines the entities that can trigger this component
    * @default player
    */
  var filters: js.UndefOr[minecraftDashScriptingDashTypesDashSharedLib.MinecraftFilter] = js.undefined
  /**
    * The range for the random amount of time during which the entity is 'cooling down' and won't get angered or look for a target
    * @default [0.0, 0.0]
    */
  var look_cooldown: stdLib.Range
  /**
    * The event identifier to run when the entities specified in filters look at this entity
    */
  var look_event: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String
  /**
    * If true, invulnerable entities (e.g. Players in creative mode) are considered valid targets
    * @default false
    */
  var mAllowInvulnerable: scala.Boolean
  /**
    * Maximum distance this entity will look for another entity looking at it
    * @default 10.0
    */
  var searchRadius: scala.Double
  /**
    * If true, this entity will set the attack target as the entity that looked at it
    * @default true
    */
  var setTarget: scala.Boolean
}

object ILookAtComponent {
  @scala.inline
  def apply(
    look_cooldown: stdLib.Range,
    look_event: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String,
    mAllowInvulnerable: scala.Boolean,
    searchRadius: scala.Double,
    setTarget: scala.Boolean,
    filters: minecraftDashScriptingDashTypesDashSharedLib.MinecraftFilter = null
  ): ILookAtComponent = {
    val __obj = js.Dynamic.literal(look_cooldown = look_cooldown, look_event = look_event.asInstanceOf[js.Any], mAllowInvulnerable = mAllowInvulnerable, searchRadius = searchRadius, setTarget = setTarget)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[ILookAtComponent]
  }
}

