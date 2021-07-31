package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.MinecraftFilter
import typings.minecraftScriptingTypesShared.MinecraftTrigger
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Makes the entity look at another entity. Once applied, if an entity of the specified type is nearby and can be targeted the entity will turn towards it.
  */
trait ILookAtComponent extends StObject {
  
  /**
    * Defines the entities that can trigger this component
    * @default player
    */
  var filters: js.UndefOr[MinecraftFilter] = js.undefined
  
  /**
    * The range for the random amount of time during which the entity is 'cooling down' and won't get angered or look for a target
    * @default [0.0, 0.0]
    */
  var look_cooldown: Range
  
  /**
    * The event identifier to run when the entities specified in filters look at this entity
    */
  var look_event: MinecraftTrigger | String
  
  /**
    * If true, invulnerable entities (e.g. Players in creative mode) are considered valid targets
    * @default false
    */
  var mAllowInvulnerable: Boolean
  
  /**
    * Maximum distance this entity will look for another entity looking at it
    * @default 10.0
    */
  var searchRadius: Double
  
  /**
    * If true, this entity will set the attack target as the entity that looked at it
    * @default true
    */
  var setTarget: Boolean
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
  implicit class ILookAtComponentMutableBuilder[Self <: ILookAtComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: MinecraftFilter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setLook_cooldown(value: Range): Self = StObject.set(x, "look_cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLook_event(value: MinecraftTrigger | String): Self = StObject.set(x, "look_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAllowInvulnerable(value: Boolean): Self = StObject.set(x, "mAllowInvulnerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchRadius(value: Double): Self = StObject.set(x, "searchRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTarget(value: Boolean): Self = StObject.set(x, "setTarget", value.asInstanceOf[js.Any])
  }
}
