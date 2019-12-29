package typings.minecraftDashScriptingDashTypesDashClient

import typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientBooleans.`false`
import typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientBooleans.`true`
import typings.minecraftDashScriptingDashTypesDashShared.IBlock
import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import typings.minecraftDashScriptingDashTypesDashShared.ISystem
import typings.minecraftDashScriptingDashTypesDashShared.ITickingArea
import typings.minecraftDashScriptingDashTypesDashShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientSystem[TSystem]
  extends ISystem[TSystem]
     with IVanillaClientSystemBase {
  /**
    * Creates an entity and applies the specified template as defined in JSON. This allows you to quickly create an entity from the applied Behavior Packs as the base for an entity created in scripting. The entity will be spawned into the world with all the components, component groups, and event triggers that are defined in the JSON file of the identifier specified. Only works on scripts registered on the server.NOTE: Entities are created first on the server, with the client notified of new entities afterwards. Be aware that if you send the result object to the client right away, the created entity might not exist on the client yet.
    * @param type Specifies the type of the entity that is being created by the template. Valid inputs are `entity` and `item_entity`
    * @param templateIdentifier This can be any of the entity identifiers from the applied Behavior Packs. For example specifying minecraft:cow here will make the provided entity a cow as defined in JSON
    * @return object An object representing the newly created entity
    * @return null Something went wrong when creating the entity
    */
  def createEntity(`type`: String, templateIdentifier: String): IEntity | Null = js.native
  /**
    * Allows you to get a block from the world when provided a JavaScript object containing a position. The block must be within a ticking area.
    * @param tickingArea The ticking area the block is in
    * @param positionObject A JavaScript object with the x, y, and z position of the block you want
    * @return object An object containing the block
    * @return null Something went wrong when retrieving the block
    */
  def getBlock(tickingArea: ITickingArea, positionObject: VectorXYZ): IBlock | Null = js.native
  ////////////////////////////////////////////////
  // Blocks
  ////////////////////////////////////////////////
  /**
    * Allows you to get a block from the world when provided an x, y, and z position. The block must be within a ticking area.
    * @param tickingArea The ticking area the block is in
    * @param x The x position of the block you want
    * @param y The y position of the block you want
    * @param z The z position of the block you want
    * @return object An object containing the block
    * @return null Something went wrong when retrieving the block
    */
  def getBlock(tickingArea: ITickingArea, x: Double, y: Double, z: Double): IBlock | Null = js.native
  /**
    * Allows you to get an array of blocks from the world when provided a minimum and maximum position. The blocks must be within a ticking area.
    * @param tickingArea The ticking area the blocks are in
    * @param minimumPositionObject A JavaScript object with the minimum x, y, and z position of the blocks you want
    * @param maximumPositionObject A JavaScript object with the maximum x, y, and z position of the blocks you want
    * @return undefined A 3D array of block objects. Indexs are the blocks positions relative to the min position given
    * @return null Something went wrong when retrieving the blocks
    */
  def getBlocks(tickingArea: ITickingArea, minimumPositionObject: VectorXYZ, maximumPositionObject: VectorXYZ): js.Array[js.Array[IBlock]] | Null = js.native
  /**
    * Allows you to get an array of blocks from the world when provided a minimum and maximum x, y, and z position. The blocks must be within a ticking area.
    * @param tickingArea The ticking area the blocks are in
    * @param xMin The minimum x position of the blocks you want
    * @param yMin The minimum y position of the blocks you want
    * @param zMin The minimum z position of the blocks you want
    * @param xMax The maximum x position of the blocks you want
    * @param yMax The maximum y position of the blocks you want
    * @param zMax The maximum z position of the blocks you want
    * @return undefined A 3D array of block objects. Indexs are the blocks positions relative to the min position given
    * @return null Something went wrong when retrieving the blocks
    */
  def getBlocks(
    tickingArea: ITickingArea,
    xMin: Double,
    yMin: Double,
    zMin: Double,
    xMax: Double,
    yMax: Double,
    zMax: Double
  ): js.Array[js.Array[IBlock]] | Null = js.native
  /**
    * Checks if the given entity has the specified component.
    * @param entityObject The EntityObject that was retrieved from a call to createEntity() or retrieved from an event
    * @param componentIdentifier The identifier of the component to check on the entity. This is either the identifier of a built-in component (check the Script Components section) or a custom component created with a call to registerComponent()
    * @return true The EntityObject has the component
    * @return false The EntityObject doesn't have the component
    * @return null An unknown component was passed in or something else went wrong when checking if the EntityObject had the component
    */
  def hasComponent(entityObject: IEntity, componentIdentifier: String): `true` | `false` | Null = js.native
}

