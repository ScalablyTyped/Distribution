package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Entity")
@js.native
/* protected */ open class Entity () extends StObject {
  
  /**
    * @remarks
    * Adds an effect, like poison, to the entity.
    * @param effectType
    * Type of effect to add to the entity.
    * @param duration
    * Amount of time, in ticks, for the effect to apply.
    * @param amplifier
    * Optional amplification of the effect to apply.
    * @param showParticles
    * @throws This function can throw errors.
    * @example addEffect.js
    * ```typescript
    *        const villagerId = "minecraft:villager_v2<minecraft:ageable_grow_up>";
    *        const villagerLoc = new BlockLocation(1, 2, 1);
    *        const villager = test.spawn(villagerId, villagerLoc);
    *        const duration = 20;
    *
    *        villager.addEffect(MinecraftEffectTypes.poison, duration, 1);
    *
    * ```
    * @example quickFoxLazyDog.ts
    * ```typescript
    *          const fox = overworld.spawnEntity(
    *            "minecraft:fox",
    *            new mc.BlockLocation(targetLocation.x + 1, targetLocation.y + 2, targetLocation.z + 3)
    *          );
    *          fox.addEffect(mc.MinecraftEffectTypes.speed, 10, 20);
    *          log("Created a fox.");
    *
    *          const wolf = overworld.spawnEntity(
    *            "minecraft:wolf",
    *            new mc.BlockLocation(targetLocation.x + 4, targetLocation.y + 2, targetLocation.z + 3)
    *          );
    *          wolf.addEffect(mc.MinecraftEffectTypes.slowness, 10, 20);
    *          wolf.isSneaking = true;
    *          log("Created a sneaking wolf.", 1);
    * ```
    */
  def addEffect(effectType: EffectType, duration: Double): Unit = js.native
  def addEffect(effectType: EffectType, duration: Double, amplifier: Double): Unit = js.native
  def addEffect(effectType: EffectType, duration: Double, amplifier: Double, showParticles: Boolean): Unit = js.native
  def addEffect(effectType: EffectType, duration: Double, amplifier: Unit, showParticles: Boolean): Unit = js.native
  
  /**
    * @remarks
    * Adds a specified tag to an entity.
    * @param tag
    * Content of the tag to add.
    * @throws This function can throw errors.
    */
  def addTag(tag: String): Boolean = js.native
  
  /**
    * Dimension that the entity is currently within.
    * @throws This property can throw when used.
    */
  val dimension: Dimension = js.native
  
  /**
    * @remarks
    * Gets the first block that intersects with the vector of the
    * view of this entity.
    * @param options
    * Additional options for processing this raycast query.
    * @throws This function can throw errors.
    */
  def getBlockFromViewVector(): Block = js.native
  def getBlockFromViewVector(options: BlockRaycastOptions): Block = js.native
  
  /**
    * @remarks
    * Gets a component (that represents additional capabilities)
    * for an entity.
    * @param componentId
    * The identifier of the component (e.g., 'minecraft:rideable')
    * to retrieve. If no namespace prefix is specified,
    * 'minecraft:' is assumed. If the component is not present on
    * the entity, undefined is returned.
    */
  def getComponent(componentId: String): IEntityComponent = js.native
  
  /**
    * @remarks
    * Returns all components that are both present on this entity
    * and supported by the API.
    */
  def getComponents(): js.Array[IEntityComponent] = js.native
  
  /**
    * @remarks
    * Returns a property value.
    * @param identifier
    * @returns
    * Returns the value for the property, or undefined if the
    * property has not been set.
    * @throws This function can throw errors.
    */
  def getDynamicProperty(identifier: String): Boolean | Double | String = js.native
  
  /**
    * @remarks
    * Returns the effect for the specified EffectType on the
    * entity, or undefined if the effect is not present.
    * @param effectType
    * @returns
    * Effect object for the specified effect, or undefined if the
    * effect is not present.
    * @throws This function can throw errors.
    */
  def getEffect(effectType: EffectType): Effect = js.native
  
  /**
    * @remarks
    * Gets the first entity that intersects with the vector of the
    * view of this entity.
    * @param options
    * Additional options for processing this raycast query.
    * @throws This function can throw errors.
    */
  def getEntitiesFromViewVector(): js.Array[Entity] = js.native
  def getEntitiesFromViewVector(options: EntityRaycastOptions): js.Array[Entity] = js.native
  
  /**
    * @remarks
    * Returns all tags associated with an entity.
    * @throws This function can throw errors.
    */
  def getTags(): js.Array[String] = js.native
  
  /**
    * @remarks
    * Returns true if the specified component is present on this
    * entity.
    * @param componentId
    * The identifier of the component (e.g., 'minecraft:rideable')
    * to retrieve. If no namespace prefix is specified,
    * 'minecraft:' is assumed.
    */
  def hasComponent(componentId: String): Boolean = js.native
  
  /**
    * @remarks
    * Tests whether an entity has a particular tag.
    * @param tag
    * Identifier of the tag to test for.
    * @throws This function can throw errors.
    */
  def hasTag(tag: String): Boolean = js.native
  
  /**
    * Location of the center of the head component of the entity.
    * @throws This property can throw when used.
    */
  val headLocation: Location = js.native
  
  /**
    * Unique identifier of the entity.
    * @throws This property can throw when used.
    */
  val id: String = js.native
  
  /**
    * Whether the entity is sneaking - that is, moving more slowly
    * and more quietly.
    */
  var isSneaking: Boolean = js.native
  
  /**
    * @remarks
    * Kills this entity. The entity will drop loot as normal.
    * @throws This function can throw errors.
    */
  def kill(): Unit = js.native
  
  /**
    * Current location of the entity.
    * @throws This property can throw when used.
    */
  val location: Location = js.native
  
  /**
    * Given name of the entity.
    */
  var nameTag: String = js.native
  
  /**
    * @remarks
    * Removes a specified property.
    * @param identifier
    * @throws This function can throw errors.
    */
  def removeDynamicProperty(identifier: String): Boolean = js.native
  
  /**
    * @remarks
    * Removes a specified tag from an entity.
    * @param tag
    * Content of the tag to remove.
    * @throws This function can throw errors.
    */
  def removeTag(tag: String): Boolean = js.native
  
  /**
    * Main rotation of the entity.
    * @throws This property can throw when used.
    */
  val rotation: XYRotation = js.native
  
  /**
    * @remarks
    * Runs a particular command from the context of this entity.
    * @param commandString
    * Command to run. Note that command strings should not start
    * with slash.
    * @returns
    * For commands that return data, returns a JSON structure with
    * command response values.
    * @throws This function can throw errors.
    * @example commands.js
    * ```typescript
    *        entity.runCommand("say You got a new high score!");
    *        entity.runCommand("scoreboard players set @p score 10");
    *
    * ```
    */
  def runCommand(commandString: String): Any = js.native
  
  /**
    * @remarks
    * Runs a particular command asynchronously from the context of
    * this entity. Where possible, running a command
    * asynchronously is recommended, especially for long running
    * operations.
    * @param commandString
    * Command to run. Note that command strings should not start
    * with slash.
    * @returns
    * For commands that return data, returns a JSON structure with
    * command response values.
    * @throws This function can throw errors.
    */
  def runCommandAsync(commandString: String): js.Promise[CommandResult] = js.native
  
  /**
    * Returns a scoreboard identity that represents this entity.
    * @throws This property can throw when used.
    */
  val scoreboard: ScoreboardIdentity = js.native
  
  def setDynamicProperty(identifier: String, value: String): Unit = js.native
  /**
    * @remarks
    * Sets a specified property to a value.
    * @param identifier
    * @param value
    * Data value of the property to set.
    * @throws This function can throw errors.
    */
  def setDynamicProperty(identifier: String, value: Boolean): Unit = js.native
  def setDynamicProperty(identifier: String, value: Double): Unit = js.native
  
  /**
    * @remarks
    * Sets the main rotation of the entity.
    * @param degreesX
    * @param degreesY
    * @throws This function can throw errors.
    */
  def setRotation(degreesX: Double, degreesY: Double): Unit = js.native
  
  /**
    * @remarks
    * Sets a velocity for the entity to move with.
    * @param velocity
    * X/Y/Z components of the velocity.
    * @throws This function can throw errors.
    */
  def setVelocity(velocity: Vector3): Unit = js.native
  
  /**
    * Retrieves or sets an entity that is used as the target of
    * AI-related behaviors, like attacking.
    */
  var target: Entity = js.native
  
  /**
    * @remarks
    * Teleports the selected entity to a new location
    * @param location
    * New location for the entity.
    * @param dimension
    * Dimension to move the selected entity to.
    * @param xRotation
    * X rotation of the entity after teleportation.
    * @param yRotation
    * Y rotation of the entity after teleportation.
    * @param keepVelocity
    * @throws This function can throw errors.
    */
  def teleport(location: Vector3, dimension: Dimension, xRotation: Double, yRotation: Double): Unit = js.native
  def teleport(
    location: Vector3,
    dimension: Dimension,
    xRotation: Double,
    yRotation: Double,
    keepVelocity: Boolean
  ): Unit = js.native
  
  /**
    * @remarks
    * Teleports the selected entity to a new location, and will
    * have the entity facing a specified location.
    * @param location
    * New location for the entity.
    * @param dimension
    * Dimension to move the selected entity to.
    * @param facingLocation
    * Location that this entity will be facing.
    * @param keepVelocity
    * @throws This function can throw errors.
    */
  def teleportFacing(location: Vector3, dimension: Dimension, facingLocation: Vector3): Unit = js.native
  def teleportFacing(location: Vector3, dimension: Dimension, facingLocation: Vector3, keepVelocity: Boolean): Unit = js.native
  
  /**
    * @remarks
    * Triggers an entity type event. For every entity, a number of
    * events are defined in an entities' definition for key entity
    * behaviors; for example, creepers have a
    * minecraft:start_exploding type event.
    * @param eventName
    * Name of the entity type event to trigger. If a namespace is
    * not specified, minecraft: is assumed.
    * @throws This function can throw errors.
    */
  def triggerEvent(eventName: String): Unit = js.native
  
  /**
    * Velocity of the entity.
    * @throws This property can throw when used.
    */
  val velocity: Vector = js.native
  
  /**
    * Vector of the current view of the entity.
    * @throws This property can throw when used.
    */
  val viewVector: Vector = js.native
}
