package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.BatchManager
  * @class Glues many mesh instances into a single one for better performance.
  */
@JSGlobal("pc.BatchManager")
@js.native
class BatchManager protected () extends js.Object {
  def this(device: js.Any, root: Entity, scene: Scene) = this()
  var device: js.Any = js.native
  var root: Entity = js.native
  var scene: Scene = js.native
  /**
    * @function
    * @name pc.BatchManager#addGroup
    * @description Adds new global batch group.
    * @param {String} name Custom name
    * @param {Boolean} dynamic Is this batch group dynamic? Will these objects move/rotate/scale after being batched?
    * @param {Number} maxAabbSize Maximum size of any dimension of a bounding box around batched objects.
    * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
    * @param {Number} [id] Optional custom unique id for the group (will be generated automatically otherwise).
    * @returns {pc.BatchGroup} Group object.
    */
  def addGroup(name: String, dynamic: Boolean, maxAabbSize: Double): BatchGroup = js.native
  def addGroup(name: String, dynamic: Boolean, maxAabbSize: Double, id: Double): BatchGroup = js.native
  /**
    * @function
    * @name pc.BatchManager#clone
    * @description Clones a batch. This method doesn't rebuild batch geometry, but only creates a new model and batch objects, linked to different source mesh instances.
    * @param {pc.Batch} batch A batch object
    * @param {Array} clonedMeshInstances New mesh instances
    * @returns {pc.Batch} New batch object
    */
  def clone(batch: Batch, clonedMeshInstances: js.Array[MeshInstance]): Batch = js.native
  /**
    * @function
    * @name pc.BatchManager#create
    * @description Takes a mesh instance list that has been prepared by {@link pc.BatchManager#prepare}, and returns a {@link pc.Batch} object. This method assumes that all mesh instances provided can be rendered in a single draw call.
    * @param {Array} meshInstances Input list of mesh instances
    * @param {Boolean} dynamic Is it a static or dynamic batch? Will objects be transformed after batching?
    * @param {Number} [batchGroupId] Link this batch to a specific batch group. This is done automatically with default batches.
    * @returns {pc.Batch} The resulting batch object.
    */
  def create(meshInstances: js.Array[MeshInstance], dynamic: Boolean): Batch = js.native
  def create(meshInstances: js.Array[MeshInstance], dynamic: Boolean, batchGroupId: Double): Batch = js.native
  /**
    * @function
    * @name pc.BatchManager#destroy
    * @description Decrements reference counter on a batch. If it's zero, the batch is removed from scene, and its geometry is deleted from memory.
    * @param {pc.Batch} batch A batch object
    */
  def destroy(batch: Batch): Unit = js.native
  /**
    * @function
    * @name pc.BatchManager#generate
    * @description Destroys all batches and creates new based on scene models. Hides original models. Called by engine automatically on app start, and if batchGroupIds on models are changed.
    * @param {Array} [groupIds] Optional array of batch group IDs to update. Otherwise all groups are updated.
    */
  def generate(): Unit = js.native
  def generate(groupIds: js.Array[Double]): Unit = js.native
  /**
    * @function
    * @name pc.BatchManager#getGroupByName
    * @description Retrieves a {@link pc.BatchGroup} object with a corresponding name, if it exists, or null otherwise.
    * @param {String} name Name
    * @returns {pc.BatchGroup} Group object.
    */
  def getGroupByName(name: String): BatchGroup = js.native
  /**
    * @function
    * @name pc.BatchManager#prepare
    * @description Takes a list of mesh instances to be batched and sorts them into lists one for each draw call.
    * The input list will be split, if:
    * <ul>
    *     <li>Mesh instances use different materials</li>
    *     <li>Mesh instances have different parameters (e.g. lightmaps or static lights)</li>
    *     <li>Mesh instances have different layers</li>
    *     <li>Mesh instances have different shader defines (shadow receiving, being aligned to screen space, etc)</li>
    *     <li>Too many vertices for a single batch (65535 is maximum)</li>
    *     <li>Too many instances for a single batch (hardware-dependent, expect 128 on low-end and 1024 on high-end)</li>
    *     <li>Bounding box of a batch is larger than maxAabbSize in any dimension</li>
    * </ul>
    * @param {Array} meshInstances Input list of mesh instances
    * @param {Boolean} dynamic Are we preparing for a dynamic batch? Instance count will matter then (otherwise not).
    * @param {Number} maxAabbSize Maximum size of any dimension of a bounding box around batched objects.
    * This is useful to keep a balance between the number of draw calls and the number of drawn triangles, because smaller batches can be hidden when not visible in camera.
    * @returns {Array} An array of arrays of mesh instances, each valid to pass to {@link pc.BatchManager#create}.
    */
  def prepare(meshInstances: js.Array[MeshInstance], dynamic: Boolean, maxAabbSize: Double): js.Array[js.Array[MeshInstance]] = js.native
  /**
    * @function
    * @name pc.BatchManager#register
    * @description Registers entities as used inside the batch, and sets batch's reference counter to entity count.
    * If these entities are destroyed, {@link pc.BatchManager#destroy} will be called on the batch.
    * @param {pc.Batch} batch A batch object
    * @param {Array} entities An array of pc.Entity
    */
  def register(batch: BatchGroup, entities: js.Array[Entity]): Unit = js.native
  /**
    * @function
    * @name pc.BatchManager#removeGroup
    * @description Remove global batch group by id.
    * @param {String} id Group id
    */
  def removeGroup(id: String): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.BatchManager#update
    * @description Updates bounding box for a batch. Called automatically.
    * @param {pc.Batch} batch A batch object
    */
  /* private */ def update(batch: Batch): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.BatchManager#updateAll
    * @description Updates bounding boxes for all dynamic batches. Called automatically.
    */
  /* private */ def updateAll(): Unit = js.native
}

