package typings.playcanvas.mod

import typings.playcanvas.anon.BatchNumIndices
import typings.playcanvas.anon.CreateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Glues many mesh instances into a single one for better performance.
  */
@JSImport("playcanvas", "BatchManager")
@js.native
open class BatchManager protected () extends StObject {
  /**
    * Create a new BatchManager instance.
    *
    * @param {import('../../platform/graphics/graphics-device.js').GraphicsDevice} device - The
    * graphics device used by the batch manager.
    * @param {import('../../framework/entity.js').Entity} root - The entity under which batched
    * models are added.
    * @param {import('../scene.js').Scene} scene - The scene that the batch manager affects.
    */
  def this(device: GraphicsDevice, root: Entity, scene: Scene_) = this()
  
  var _batchGroupCounter: Double = js.native
  
  var _batchList: js.Array[Any] = js.native
  
  def _collectAndRemoveMeshInstances(groupMeshInstances: Any, groupIds: Any): Unit = js.native
  
  var _dirtyGroups: js.Array[Any] = js.native
  
  def _extractElement(node: Any, arr: Any, group: Any): Unit = js.native
  
  def _extractModel(node: Any, arr: Any, group: Any, groupMeshInstances: Any): Any = js.native
  
  def _extractRender(node: Any, arr: Any, group: Any, groupMeshInstances: Any): Any = js.native
  
  var _init: Boolean = js.native
  
  def _removeModelsFromBatchGroup(node: Any, id: Any): Unit = js.native
  
  var _stats: CreateTime = js.native
  
  /**
    * Adds new global batch group.
    *
    * @param {string} name - Custom name.
    * @param {boolean} dynamic - Is this batch group dynamic? Will these objects move/rotate/scale
    * after being batched?
    * @param {number} maxAabbSize - Maximum size of any dimension of a bounding box around batched
    * objects.
    * {@link BatchManager#prepare} will split objects into local groups based on this size.
    * @param {number} [id] - Optional custom unique id for the group (will be generated
    * automatically otherwise).
    * @param {number[]} [layers] - Optional layer ID array. Default is [{@link LAYERID_WORLD}].
    * The whole batch group will belong to these layers. Layers of source models will be ignored.
    * @returns {BatchGroup} Group object.
    */
  def addGroup(name: String, dynamic: Boolean, maxAabbSize: Double): BatchGroup = js.native
  def addGroup(name: String, dynamic: Boolean, maxAabbSize: Double, id: Double): BatchGroup = js.native
  def addGroup(name: String, dynamic: Boolean, maxAabbSize: Double, id: Double, layers: js.Array[Double]): BatchGroup = js.native
  def addGroup(name: String, dynamic: Boolean, maxAabbSize: Double, id: Unit, layers: js.Array[Double]): BatchGroup = js.native
  
  /**
    * Clones a batch. This method doesn't rebuild batch geometry, but only creates a new model and
    * batch objects, linked to different source mesh instances.
    *
    * @param {Batch} batch - A batch object.
    * @param {MeshInstance[]} clonedMeshInstances - New mesh instances.
    * @returns {Batch} New batch object.
    */
  def clone(batch: Batch, clonedMeshInstances: js.Array[MeshInstance]): Batch = js.native
  
  def collectBatchedMeshData(meshInstances: Any, dynamic: Any): BatchNumIndices = js.native
  
  /**
    * Takes a mesh instance list that has been prepared by {@link BatchManager#prepare}, and
    * returns a {@link Batch} object. This method assumes that all mesh instances provided can be
    * rendered in a single draw call.
    *
    * @param {MeshInstance[]} meshInstances - Input list of mesh instances.
    * @param {boolean} dynamic - Is it a static or dynamic batch? Will objects be transformed
    * after batching?
    * @param {number} [batchGroupId] - Link this batch to a specific batch group. This is done
    * automatically with default batches.
    * @returns {Batch} The resulting batch object.
    */
  def create(meshInstances: js.Array[MeshInstance], dynamic: Boolean): Batch = js.native
  def create(meshInstances: js.Array[MeshInstance], dynamic: Boolean, batchGroupId: Double): Batch = js.native
  
  def destroy(): Unit = js.native
  
  /**
    * Removes the batch model from all layers and destroys it.
    *
    * @param {Batch} batch - A batch object.
    * @private
    */
  /* private */ var destroyBatch: Any = js.native
  
  var device: GraphicsDevice = js.native
  
  /**
    * Destroys all batches and creates new based on scene models. Hides original models. Called by
    * engine automatically on app start, and if batchGroupIds on models are changed.
    *
    * @param {number[]} [groupIds] - Optional array of batch group IDs to update. Otherwise all
    * groups are updated.
    */
  def generate(): Unit = js.native
  def generate(groupIds: js.Array[Double]): Unit = js.native
  
  /**
    * Return a list of all {@link Batch} objects that belong to the Batch Group supplied.
    *
    * @param {number} batchGroupId - The id of the batch group.
    * @returns {Batch[]} A list of batches that are used to render the batch group.
    * @private
    */
  /* private */ var getBatches: Any = js.native
  
  /**
    * Retrieves a {@link BatchGroup} object with a corresponding name, if it exists, or null
    * otherwise.
    *
    * @param {string} name - Name.
    * @returns {BatchGroup|null} The batch group matching the name or null if not found.
    */
  def getGroupByName(name: String): BatchGroup | Null = js.native
  
  def insert(`type`: Any, groupId: Any, node: Any): Unit = js.native
  
  /**
    * Mark a specific batch group as dirty. Dirty groups are re-batched before the next frame is
    * rendered. Note, re-batching a group is a potentially expensive operation.
    *
    * @param {number} id - Batch Group ID to mark as dirty.
    */
  def markGroupDirty(id: Double): Unit = js.native
  
  /**
    * Takes a list of mesh instances to be batched and sorts them into lists one for each draw
    * call. The input list will be split, if:
    *
    * - Mesh instances use different materials.
    * - Mesh instances have different parameters (e.g. lightmaps or static lights).
    * - Mesh instances have different shader defines (shadow receiving, being aligned to screen
    * space, etc).
    * - Too many vertices for a single batch (65535 is maximum).
    * - Too many instances for a single batch (hardware-dependent, expect 128 on low-end and 1024
    * on high-end).
    * - Bounding box of a batch is larger than maxAabbSize in any dimension.
    *
    * @param {MeshInstance[]} meshInstances - Input list of mesh instances
    * @param {boolean} dynamic - Are we preparing for a dynamic batch? Instance count will matter
    * then (otherwise not).
    * @param {number} maxAabbSize - Maximum size of any dimension of a bounding box around batched
    * objects.
    * @param {boolean} translucent - Are we batching UI elements or sprites
    * This is useful to keep a balance between the number of draw calls and the number of drawn
    * triangles, because smaller batches can be hidden when not visible in camera.
    * @returns {MeshInstance[][]} An array of arrays of mesh instances, each valid to pass to
    * {@link BatchManager#create}.
    */
  def prepare(meshInstances: js.Array[MeshInstance], dynamic: Boolean, maxAabbSize: Double, translucent: Boolean): js.Array[js.Array[MeshInstance]] = js.native
  
  def remove(`type`: Any, groupId: Any, node: Any): Unit = js.native
  
  /**
    * Remove global batch group by id. Note, this traverses the entire scene graph and clears the
    * batch group id from all components.
    *
    * @param {number} id - Batch Group ID.
    */
  def removeGroup(id: Double): Unit = js.native
  
  var rootNode: Entity = js.native
  
  var scene: Scene_ = js.native
  
  var skinConstVS: Any = js.native
  
  var skinTexVS: Any = js.native
  
  var transformVS: String = js.native
  
  /**
    * Updates bounding boxes for all dynamic batches. Called automatically.
    *
    * @ignore
    */
  def updateAll(): Unit = js.native
}
