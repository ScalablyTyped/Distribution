package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.BatchManager
  * @classdesc Glues many mesh instances into a single one for better performance.
  * @param {pc.GraphicsDevice} device - The graphics device used by the batch manager.
  * @param {pc.Entity} root - The entity under which batched models are added.
  * @param {pc.Scene} scene - The scene that the batch manager affects.
  */
@JSGlobal("pc.BatchManager")
@js.native
class BatchManager protected () extends js.Object {
  def this(device: GraphicsDevice, root: Entity, scene: Scene) = this()
  /**
    * @function
    * @name pc.BatchManager#addGroup
    * @description Adds new global batch group.
    * @param {string} name - Custom name.
    * @param {boolean} dynamic - Is this batch group dynamic? Will these objects move/rotate/scale after being batched?
    * @param {number} maxAabbSize - Maximum size of any dimension of a bounding box around batched objects.
    * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
    * @param {number} [id] - Optional custom unique id for the group (will be generated automatically otherwise).
    * @param {number[]} [layers] - Optional layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will
    * belong to these layers. Layers of source models will be ignored.
    * @returns {pc.BatchGroup} Group object.
    */
  def addGroup(name: String, dynamic: Boolean, maxAabbSize: Double): BatchGroup = js.native
  def addGroup(name: String, dynamic: Boolean, maxAabbSize: Double, id: Double): BatchGroup = js.native
  def addGroup(name: String, dynamic: Boolean, maxAabbSize: Double, id: Double, layers: js.Array[Double]): BatchGroup = js.native
  /**
    * @function
    * @name pc.BatchManager#clone
    * @description Clones a batch. This method doesn't rebuild batch geometry, but only creates a new model and batch objects, linked to different source mesh instances.
    * @param {pc.Batch} batch - A batch object.
    * @param {pc.MeshInstance[]} clonedMeshInstances - New mesh instances.
    * @returns {pc.Batch} New batch object.
    */
  def clone(batch: Batch, clonedMeshInstances: js.Array[MeshInstance]): Batch = js.native
  /**
    * @function
    * @name pc.BatchManager#create
    * @description Takes a mesh instance list that has been prepared by {@link pc.BatchManager#prepare}, and returns a {@link pc.Batch} object. This method assumes that all mesh instances provided can be rendered in a single draw call.
    * @param {pc.MeshInstance[]} meshInstances - Input list of mesh instances.
    * @param {boolean} dynamic - Is it a static or dynamic batch? Will objects be transformed after batching?
    * @param {number} [batchGroupId] - Link this batch to a specific batch group. This is done automatically with default batches.
    * @returns {pc.Batch} The resulting batch object.
    */
  def create(meshInstances: js.Array[MeshInstance], dynamic: Boolean): Batch = js.native
  def create(meshInstances: js.Array[MeshInstance], dynamic: Boolean, batchGroupId: Double): Batch = js.native
  /**
    * @function
    * @name pc.BatchManager#generate
    * @description Destroys all batches and creates new based on scene models. Hides original models. Called by engine automatically on app start, and if batchGroupIds on models are changed.
    * @param {number[]} [groupIds] - Optional array of batch group IDs to update. Otherwise all groups are updated.
    */
  def generate(): Unit = js.native
  def generate(groupIds: js.Array[Double]): Unit = js.native
  /**
    * @function
    * @name pc.BatchManager#getGroupByName
    * @description Retrieves a {@link pc.BatchGroup} object with a corresponding name, if it exists, or null otherwise.
    * @param {string} name - Name.
    * @returns {pc.BatchGroup} Group object.
    */
  def getGroupByName(name: String): BatchGroup = js.native
  /**
    * @function
    * @name pc.BatchManager#markGroupDirty
    * @description Mark a specific batch group as dirty. Dirty groups are re-batched before the next frame is rendered.
    * Note, re-batching a group is a potentially expensive operation.
    * @param  {number} id - Batch Group ID to mark as dirty.
    */
  def markGroupDirty(id: Double): Unit = js.native
  /**
    * @function
    * @name pc.BatchManager#prepare
    * @description Takes a list of mesh instances to be batched and sorts them into lists one for each draw call.
    * The input list will be split, if:
    *
    * * Mesh instances use different materials.
    * * Mesh instances have different parameters (e.g. lightmaps or static lights).
    * * Mesh instances have different shader defines (shadow receiving, being aligned to screen space, etc).
    * * Too many vertices for a single batch (65535 is maximum).
    * * Too many instances for a single batch (hardware-dependent, expect 128 on low-end and 1024 on high-end).
    * * Bounding box of a batch is larger than maxAabbSize in any dimension.
    *
    * @param {pc.MeshInstance[]} meshInstances - Input list of mesh instances
    * @param {boolean} dynamic - Are we preparing for a dynamic batch? Instance count will matter then (otherwise not).
    * @param {number} maxAabbSize - Maximum size of any dimension of a bounding box around batched objects.
    * @param {boolean} translucent - Are we batching UI elements or sprites
    * This is useful to keep a balance between the number of draw calls and the number of drawn triangles, because smaller batches can be hidden when not visible in camera.
    * @returns {pc.MeshInstance[]} An array of arrays of mesh instances, each valid to pass to {@link pc.BatchManager#create}.
    */
  def prepare(meshInstances: js.Array[MeshInstance], dynamic: Boolean, maxAabbSize: Double, translucent: Boolean): js.Array[MeshInstance] = js.native
  /**
    * @function
    * @name pc.BatchManager#removeGroup
    * @description Remove global batch group by id.
    * Note, this traverses the entire scene graph and clears the batch group id from all components.
    * @param {number} id - Batch Group ID.
    */
  def removeGroup(id: Double): Unit = js.native
}

