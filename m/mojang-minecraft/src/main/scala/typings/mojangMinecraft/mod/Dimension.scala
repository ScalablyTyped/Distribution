package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Dimension")
@js.native
/* protected */ open class Dimension () extends StObject {
  
  /**
    * @remarks
    * Creates an explosion at the specified location.
    * @param location
    * The location of the explosion.
    * @param radius
    * Radius, in blocks, of the explosion to create.
    * @param explosionOptions
    * Additional configurable options for the explosion.
    * @throws This function can throw errors.
    * @example createExplosion.ts
    * ```typescript
    *          overworld.createExplosion(targetLocation, 10, new mc.ExplosionOptions());
    * ```
    * @example createFireAndWaterExplosions.ts
    * ```typescript
    *          const explosionLoc = new mc.Location(targetLocation.x + 0.5, targetLocation.y + 0.5, targetLocation.z + 0.5);
    *
    *          const fireExplosionOptions = new mc.ExplosionOptions();
    *
    *          // Explode with fire
    *          fireExplosionOptions.causesFire = true;
    *
    *          overworld.createExplosion(explosionLoc, 15, fireExplosionOptions);
    *          const waterExplosionOptions = new mc.ExplosionOptions();
    *
    *          // Explode in water
    *          waterExplosionOptions.allowUnderwater = true;
    *
    *          const belowWaterLoc = new mc.Location(targetLocation.x + 3, targetLocation.y + 1, targetLocation.z + 3);
    *
    *          overworld.createExplosion(belowWaterLoc, 10, waterExplosionOptions);
    * ```
    * @example createNoBlockExplosion.ts
    * ```typescript
    *          const explosionOptions = new mc.ExplosionOptions();
    *
    *          // Start by exploding without breaking blocks
    *          explosionOptions.breaksBlocks = false;
    *
    *          const explodeNoBlocksLoc = new mc.Location(
    *            Math.floor(targetLocation.x + 1),
    *            Math.floor(targetLocation.y + 2),
    *            Math.floor(targetLocation.z + 1)
    *          );
    *
    *          overworld.createExplosion(explodeNoBlocksLoc, 15, explosionOptions);
    * ```
    */
  def createExplosion(location: Location, radius: Double, explosionOptions: ExplosionOptions): Unit = js.native
  
  /**
    * @remarks
    * Returns a block instance at the given location. This method
    * was introduced as of version 1.17.10.21.
    * @param location
    * The location at which to return a block.
    * @returns
    * Block at the specified location.
    * @throws This function can throw errors.
    */
  def getBlock(location: BlockLocation): Block = js.native
  
  /**
    * @remarks
    * Gets the first block that intersects with a vector emanating
    * from a location.
    * @param location
    * @param direction
    * @param options
    * Additional options for processing this raycast query.
    * @throws This function can throw errors.
    */
  def getBlockFromRay(location: Location, direction: Vector): Block = js.native
  def getBlockFromRay(location: Location, direction: Vector, options: BlockRaycastOptions): Block = js.native
  
  /**
    * @remarks
    * Returns a set of entities based on a set of conditions
    * defined via the EntityQueryOptions set of filter criteria.
    * @param getEntities
    * @returns
    * An entity iterator that can be used to loop over the
    * returned entities.
    * @throws This function can throw errors.
    * @example testThatEntityIsFeatherItem.ts
    * ```typescript
    *        const query = {
    *          type: "item",
    *          location: targetLocation,
    *        };
    *        const items = overworld.getEntities(query);
    *
    *        for (const item of items) {
    *          const itemComp = item.getComponent("item") as any;
    *
    *          if (itemComp) {
    *            if (itemComp.itemStack.id.endsWith("feather")) {
    *              console.log("Success! Found a feather", 1);
    *            }
    *          }
    *        }
    *
    * ```
    */
  def getEntities(): EntityIterator = js.native
  def getEntities(getEntities: EntityQueryOptions): EntityIterator = js.native
  
  /**
    * @remarks
    * Returns a set of entities at a particular location.
    * @param location
    * The location at which to return entities.
    * @returns
    * Zero or more entities at the specified location.
    */
  def getEntitiesAtBlockLocation(location: BlockLocation): js.Array[Entity] = js.native
  
  /**
    * @remarks
    * Gets entities that intersect with a specified vector
    * emanating from a location.
    * @param location
    * @param direction
    * @param options
    * Additional options for processing this raycast query.
    * @throws This function can throw errors.
    */
  def getEntitiesFromRay(location: Location, direction: Vector): js.Array[Entity] = js.native
  def getEntitiesFromRay(location: Location, direction: Vector, options: EntityRaycastOptions): js.Array[Entity] = js.native
  
  /**
    * @remarks
    * Returns a set of players based on a set of conditions
    * defined via the EntityQueryOptions set of filter criteria.
    * @param getPlayers
    * @returns
    * An entity iterator that can be used to loop over the
    * returned players.
    * @throws This function can throw errors.
    */
  def getPlayers(): PlayerIterator = js.native
  def getPlayers(getPlayers: EntityQueryOptions): PlayerIterator = js.native
  
  /**
    * Identifier of the dimension.
    * @throws This property can throw when used.
    */
  val id: String = js.native
  
  /**
    * @remarks
    * Runs a particular command from the context of the broader
    * dimension.
    * @param commandString
    * Command to run. Note that command strings should not start
    * with slash.
    * @returns
    * For commands that return data, returns a JSON structure with
    * command response values.
    * @throws This function can throw errors.
    * @example commands.js
    * ```typescript
    *        world.getDimension("overworld").runCommand("say You got a new high score!");
    *        world.getDimension("overworld").runCommand("scoreboard players set @p score 10");
    *
    * ```
    */
  def runCommand(commandString: String): Any = js.native
  
  /**
    * @remarks
    * Runs a particular command asynchronously from the context of
    * the broader dimension. Where possible - and especially for
    * long-running operations - you should use runCommandAsync
    * over runCommand.
    * @param commandString
    * Command to run. Note that command strings should not start
    * with slash.
    * @returns
    * For commands that return data, returns a CommandResult with
    * an indicator of command results.
    * @throws This function can throw errors.
    */
  def runCommandAsync(commandString: String): js.Promise[CommandResult] = js.native
  
  /**
    * @remarks
    * Creates a new entity (e.g., a mob) at the specified
    * location.
    * @param identifier
    * Identifier of the type of entity to spawn. If no namespace
    * is specified, 'minecraft:' is assumed.
    * @param location
    * The location at which to create the entity.
    * @returns
    * Newly created entity at the specified location.
    * @throws This function can throw errors.
    * @example createOldHorse.ts
    * ```typescript
    *          // create a horse and trigger the 'ageable_grow_up' event, ensuring the horse is created as an adult
    *          overworld.spawnEntity("minecraft:horse<minecraft:ageable_grow_up>", targetLocation);
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
    * @example trapTick.ts
    * ```typescript
    *          let ticks = 0;
    *
    *          mc.world.events.tick.subscribe((event: mc.TickEvent) => {
    *            ticks++;
    *
    *            // Minecraft runs at 20 ticks per second
    *            if (ticks % 1200 === 0) {
    *              overworld.runCommand("say Another minute passes...");
    *            }
    *          });
    * ```
    */
  def spawnEntity(identifier: String, location: BlockLocation): Entity = js.native
  def spawnEntity(identifier: String, location: Location): Entity = js.native
  
  /**
    * @remarks
    * Creates a new item stack as an entity at the specified
    * location.
    * @param item
    * @param location
    * The location at which to create the item stack.
    * @returns
    * Newly created item stack entity at the specified location.
    * @throws This function can throw errors.
    * @example itemStacks.ts
    * ```typescript
    *          const oneItemLoc = new mc.BlockLocation(3, 2, 1);
    *          const fiveItemsLoc = new mc.BlockLocation(1, 2, 1);
    *          const diamondPickaxeLoc = new mc.BlockLocation(2, 2, 4);
    *
    *          const oneEmerald = new mc.ItemStack(mc.MinecraftItemTypes.emerald, 1, 0);
    *          const onePickaxe = new mc.ItemStack(mc.MinecraftItemTypes.diamondPickaxe, 1, 0);
    *          const fiveEmeralds = new mc.ItemStack(mc.MinecraftItemTypes.emerald, 5, 0);
    *
    *          overworld.spawnItem(oneEmerald, oneItemLoc);
    *          overworld.spawnItem(fiveEmeralds, fiveItemsLoc);
    *          overworld.spawnItem(onePickaxe, diamondPickaxeLoc);
    * ```
    * @example spawnItem.ts
    * ```typescript
    *          const featherItem = new mc.ItemStack(mc.MinecraftItemTypes.feather, 1, 0);
    *
    *          overworld.spawnItem(featherItem, targetLocation);
    *          log("New feather created!");
    * ```
    */
  def spawnItem(item: ItemStack, location: BlockLocation): Entity = js.native
  def spawnItem(item: ItemStack, location: Location): Entity = js.native
  
  /**
    * @remarks
    * Creates a new particle emitter at a specified location in
    * the world.
    * @param effectName
    * Identifier of the particle to create.
    * @param location
    * The location at which to create the particle emitter.
    * @param molangVariables
    * A set of additional, customizable variables that can be
    * adjusted for this particle emitter.
    * @returns
    * Newly created entity at the specified location.
    */
  def spawnParticle(effectName: String, location: Location, molangVariables: MolangVariableMap): Unit = js.native
}
