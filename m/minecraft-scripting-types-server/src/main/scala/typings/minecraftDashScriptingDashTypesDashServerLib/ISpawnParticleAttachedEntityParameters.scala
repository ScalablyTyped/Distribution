package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to create a particle effect that will follow an entity around. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
  */
trait ISpawnParticleAttachedEntityParameters extends js.Object {
  /**
    * The identifier of the particle effect you want to attach to the entity. This is the same identifier you gave the effect in its JSON file
    */
  var effect: minecraftDashScriptingDashTypesDashSharedLib.ParticleEffect
  /**
    * The entity object you want to attach the effect to
    */
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  /**
    * The offset from the entity's "center" where you want to spawn the effect
    * @default [0, 0, 0]
    */
  var offset: minecraftDashScriptingDashTypesDashSharedLib.VectorArray
}

object ISpawnParticleAttachedEntityParameters {
  @scala.inline
  def apply(
    effect: minecraftDashScriptingDashTypesDashSharedLib.ParticleEffect,
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    offset: minecraftDashScriptingDashTypesDashSharedLib.VectorArray
  ): ISpawnParticleAttachedEntityParameters = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], entity = entity, offset = offset)
  
    __obj.asInstanceOf[ISpawnParticleAttachedEntityParameters]
  }
}

