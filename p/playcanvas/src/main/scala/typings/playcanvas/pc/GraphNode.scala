package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.FindNode
import typings.playcanvas.pc.callbacks.ForEach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.GraphNode
  * @augments pc.EventHandler
  * @classdesc A hierarchical scene node.
  * @param {string} [name] - The non-unique name of the graph node, default is "Untitled".
  * @property {string} name The non-unique name of a graph node.
  * @property {pc.Tags} tags Interface for tagging graph nodes. Tag based searches can be performed using the {@link pc.GraphNode#findByTag} function.
  */
@JSGlobal("pc.GraphNode")
@js.native
class GraphNode () extends EventHandler {
  def this(name: String) = this()
  /**
    * @readonly
    * @name pc.GraphNode#children
    * @type {pc.GraphNode[]}
    * @description A read-only property to get the children of this graph node.
    */
  val children: js.Array[GraphNode] = js.native
  /**
    * @name pc.GraphNode#enabled
    * @type {boolean}
    * @description Enable or disable a GraphNode. If one of the GraphNode's parents is disabled
    * there will be no other side effects. If all the parents are enabled then
    * the new value will activate / deactivate all the enabled children of the GraphNode.
    */
  var enabled: Boolean = js.native
  /**
    * @readonly
    * @name pc.GraphNode#forward
    * @type {pc.Vec3}
    * @description The normalized local space negative Z-axis vector of the graph node in world space.
    */
  val forward: Vec3 = js.native
  /**
    * @readonly
    * @name pc.GraphNode#graphDepth
    * @type {number}
    * @description A read-only property to get the depth of this child within the graph. Note that for performance reasons this is only recalculated when a node is added to a new parent, i.e. It is not recalculated when a node is simply removed from the graph.
    */
  val graphDepth: Double = js.native
  /**
    * The non-unique name of a graph node.
    */
  var name: String = js.native
  /**
    * @readonly
    * @name pc.GraphNode#parent
    * @type {pc.GraphNode}
    * @description A read-only property to get a parent graph node.
    */
  val parent: GraphNode = js.native
  /**
    * @readonly
    * @name pc.GraphNode#path
    * @type {string}
    * @description A read-only property to get the path of the graph node relative to
    * the root of the hierarchy.
    */
  val path: String = js.native
  /**
    * @readonly
    * @name pc.GraphNode#right
    * @type {pc.Vec3}
    * @description The normalized local space X-axis vector of the graph node in world space.
    */
  val right: Vec3 = js.native
  /**
    * @readonly
    * @name pc.GraphNode#root
    * @type {pc.GraphNode}
    * @description A read-only property to get highest graph node from current node.
    */
  val root: GraphNode = js.native
  /**
    * Interface for tagging graph nodes. Tag based searches can be performed using the {@link pc.GraphNode#findByTag} function.
    */
  var tags: Tags = js.native
  /**
    * @readonly
    * @name pc.GraphNode#up
    * @type {pc.Vec3}
    * @description The normalized local space Y-axis vector of the graph node in world space.
    */
  val up: Vec3 = js.native
  /**
    * @function
    * @name pc.GraphNode#addChild
    * @description Add a new child to the child list and update the parent value of the child node.
    * @param {pc.GraphNode} node - The new child to add.
    * @example
    * var e = new pc.Entity(app);
    * this.entity.addChild(e);
    */
  def addChild(node: GraphNode): Unit = js.native
  def find(attr: String): js.Array[GraphNode] = js.native
  def find(attr: String, value: js.Any): js.Array[GraphNode] = js.native
  /**
    * @function
    * @name pc.GraphNode#find
    * @description Search the graph node and all of its descendants for the nodes that satisfy some search criteria.
    * @param {pc.callbacks.FindNode|string} attr - This can either be a function or a string. If it's a function, it is executed
    * for each descendant node to test if node satisfies the search logic. Returning true from the function will
    * include the node into the results. If it's a string then it represents the name of a field or a method of the
    * node. If this is the name of a field then the value passed as the second argument will be checked for equality.
    * If this is the name of a function then the return value of the function will be checked for equality against
    * the valued passed as the second argument to this function.
    * @param {object} [value] - If the first argument (attr) is a property name then this value will be checked against
    * the value of the property.
    * @returns {pc.GraphNode[]} The array of graph nodes that match the search criteria.
    * @example
    * // Finds all nodes that have a model component and have `door` in their lower-cased name
    * var doors = house.find(function (node) {
    *     return node.model && node.name.toLowerCase().indexOf('door') !== -1;
    * });
    * @example
    * // Finds all nodes that have the name property set to 'Test'
    * var entities = parent.find('name', 'Test');
    */
  def find(attr: FindNode): js.Array[GraphNode] = js.native
  def find(attr: FindNode, value: js.Any): js.Array[GraphNode] = js.native
  /**
    * @function
    * @name pc.GraphNode#findByName
    * @description Get the first node found in the graph with the name. The search
    * is depth first.
    * @param {string} name - The name of the graph.
    * @returns {pc.GraphNode} The first node to be found matching the supplied name.
    */
  def findByName(name: String): GraphNode = js.native
  /**
    * @function
    * @name pc.GraphNode#findByPath
    * @description Get the first node found in the graph by its full path in the graph.
    * The full path has this form 'parent/child/sub-child'. The search is depth first.
    * @param {string} path - The full path of the pc.GraphNode.
    * @returns {pc.GraphNode} The first node to be found matching the supplied path.
    * @example
    * var path = this.entity.findByPath('child/another_child');
    */
  def findByPath(path: String): GraphNode = js.native
  /**
    * @function
    * @name pc.GraphNode#findByTag
    * @description Return all graph nodes that satisfy the search query.
    * Query can be simply a string, or comma separated strings,
    * to have inclusive results of assets that match at least one query.
    * A query that consists of an array of tags can be used to match graph nodes that have each tag of array.
    * @param {string} query - Name of a tag or array of tags.
    * @returns {pc.GraphNode[]} A list of all graph nodes that match the query.
    * @example
    * // Return all graph nodes that tagged by `animal`
    * var animals = node.findByTag("animal");
    * @example
    * // Return all graph nodes that tagged by `bird` OR `mammal`
    * var birdsAndMammals = node.findByTag("bird", "mammal");
    * @example
    * // Return all assets that tagged by `carnivore` AND `mammal`
    * var meatEatingMammals = node.findByTag(["carnivore", "mammal"]);
    * @example
    * // Return all assets that tagged by (`carnivore` AND `mammal`) OR (`carnivore` AND `reptile`)
    * var meatEatingMammalsAndReptiles = node.findByTag(["carnivore", "mammal"], ["carnivore", "reptile"]);
    */
  def findByTag(query: String): js.Array[GraphNode] = js.native
  def findOne(attr: String): GraphNode = js.native
  def findOne(attr: String, value: js.Any): GraphNode = js.native
  /**
    * @function
    * @name pc.GraphNode#findOne
    * @description Search the graph node and all of its descendants for the first node that satisfies some search criteria.
    * @param {pc.callbacks.FindNode|string} attr - This can either be a function or a string. If it's a function, it is executed
    * for each descendant node to test if node satisfies the search logic. Returning true from the function will
    * result in that node being returned from findOne. If it's a string then it represents the name of a field or a method of the
    * node. If this is the name of a field then the value passed as the second argument will be checked for equality.
    * If this is the name of a function then the return value of the function will be checked for equality against
    * the valued passed as the second argument to this function.
    * @param {object} [value] - If the first argument (attr) is a property name then this value will be checked against
    * the value of the property.
    * @returns {pc.GraphNode} A graph node that match the search criteria.
    * @example
    * // Find the first node that is called `head` and has a model component
    * var head = player.findOne(function (node) {
    *     return node.model && node.name === 'head';
    * });
    * @example
    * // Finds the first node that has the name property set to 'Test'
    * var node = parent.findOne('name', 'Test');
    */
  def findOne(attr: FindNode): GraphNode = js.native
  def findOne(attr: FindNode, value: js.Any): GraphNode = js.native
  /**
    * @function
    * @name pc.GraphNode#forEach
    * @description Executes a provided function once on this graph node and all of its descendants.
    * @param {pc.callbacks.ForEach} callback - The function to execute on the graph node and each descendant.
    * @param {object} [thisArg] - Optional value to use as this when executing callback function.
    * @example
    * // Log the path and name of each node in descendant tree starting with "parent"
    * parent.forEach(function (node) {
    *     console.log(node.path + "/" + node.name);
    * });
    */
  def forEach(callback: ForEach): Unit = js.native
  def forEach(callback: ForEach, thisArg: js.Any): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#getEulerAngles
    * @description Get the world space rotation for the specified GraphNode in Euler angle
    * form. The order of the returned Euler angles is XYZ. The value returned by this function
    * should be considered read-only. In order to set the world-space rotation of the graph
    * node, use {@link pc.GraphNode#setEulerAngles}.
    * @returns {pc.Vec3} The world space rotation of the graph node in Euler angle form.
    * @example
    * var angles = this.entity.getEulerAngles(); // [0,0,0]
    * angles[1] = 180; // rotate the entity around Y by 180 degrees
    * this.entity.setEulerAngles(angles);
    */
  def getEulerAngles(): Vec3 = js.native
  /**
    * @function
    * @name pc.GraphNode#getLocalEulerAngles
    * @description Get the rotation in local space for the specified GraphNode. The rotation
    * is returned as euler angles in a 3-dimensional vector where the order is XYZ. The
    * returned vector should be considered read-only. To update the local rotation, use
    * {@link pc.GraphNode#setLocalEulerAngles}.
    * @returns {pc.Vec3} The local space rotation of the graph node as euler angles in XYZ order.
    * @example
    * var angles = this.entity.getLocalEulerAngles();
    * angles[1] = 180;
    * this.entity.setLocalEulerAngles(angles);
    */
  def getLocalEulerAngles(): Vec3 = js.native
  /**
    * @function
    * @name pc.GraphNode#getLocalPosition
    * @description Get the position in local space for the specified GraphNode. The position
    * is returned as a 3-dimensional vector. The returned vector should be considered read-only.
    * To update the local position, use {@link pc.GraphNode#setLocalPosition}.
    * @returns {pc.Vec3} The local space position of the graph node.
    * @example
    * var position = this.entity.getLocalPosition();
    * position[0] += 1; // move the entity 1 unit along x.
    * this.entity.setLocalPosition(position);
    */
  def getLocalPosition(): Vec3 = js.native
  /**
    * @function
    * @name pc.GraphNode#getLocalRotation
    * @description Get the rotation in local space for the specified GraphNode. The rotation
    * is returned as a quaternion. The returned quaternion should be considered read-only.
    * To update the local rotation, use {@link pc.GraphNode#setLocalRotation}.
    * @returns {pc.Quat} The local space rotation of the graph node as a quaternion.
    * @example
    * var rotation = this.entity.getLocalRotation();
    */
  def getLocalRotation(): Quat = js.native
  /**
    * @function
    * @name pc.GraphNode#getLocalScale
    * @description Get the scale in local space for the specified GraphNode. The scale
    * is returned as a 3-dimensional vector. The returned vector should be considered read-only.
    * To update the local scale, use {@link pc.GraphNode#setLocalScale}.
    * @returns {pc.Vec3} The local space scale of the graph node.
    * @example
    * var scale = this.entity.getLocalScale();
    * scale.x = 100;
    * this.entity.setLocalScale(scale);
    */
  def getLocalScale(): Vec3 = js.native
  /**
    * @function
    * @name pc.GraphNode#getLocalTransform
    * @description Get the local transform matrix for this graph node. This matrix
    * is the transform relative to the node's parent's world transformation matrix.
    * @returns {pc.Mat4} The node's local transformation matrix.
    * @example
    * var transform = this.entity.getLocalTransform();
    */
  def getLocalTransform(): Mat4 = js.native
  /**
    * @function
    * @name pc.GraphNode#getPosition
    * @description Get the world space position for the specified GraphNode. The
    * value returned by this function should be considered read-only. In order to set
    * the world-space position of the graph node, use {@link pc.GraphNode#setPosition}.
    * @returns {pc.Vec3} The world space position of the graph node.
    * @example
    * var position = this.entity.getPosition();
    * position.x = 10;
    * this.entity.setPosition(position);
    */
  def getPosition(): Vec3 = js.native
  /**
    * @function
    * @name pc.GraphNode#getRotation
    * @description Get the world space rotation for the specified GraphNode in quaternion
    * form. The value returned by this function should be considered read-only. In order
    * to set the world-space rotation of the graph node, use {@link pc.GraphNode#setRotation}.
    * @returns {pc.Quat} The world space rotation of the graph node as a quaternion.
    * @example
    * var rotation = this.entity.getRotation();
    */
  def getRotation(): Quat = js.native
  /**
    * @function
    * @name pc.GraphNode#getWorldTransform
    * @description Get the world transformation matrix for this graph node.
    * @returns {pc.Mat4} The node's world transformation matrix.
    * @example
    * var transform = this.entity.getWorldTransform();
    */
  def getWorldTransform(): Mat4 = js.native
  /**
    * @function
    * @name pc.GraphNode#insertChild
    * @description Insert a new child to the child list at the specified index and update the parent value of the child node.
    * @param {pc.GraphNode} node - The new child to insert.
    * @param {number} index - The index in the child list of the parent where the new node will be inserted.
    * @example
    * var e = new pc.Entity(app);
    * this.entity.insertChild(e, 1);
    */
  def insertChild(node: GraphNode, index: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#isAncestorOf
    * @description Check if node is ancestor for another node.
    * @param {pc.GraphNode} node - Potential descendant of node.
    * @returns {boolean} If node is ancestor for another node.
    * @example
    * if (body.isAncestorOf(foot)) {
    *     // foot is within body's hierarchy
    * }
    */
  def isAncestorOf(node: GraphNode): Boolean = js.native
  /**
    * @function
    * @name pc.GraphNode#isDescendantOf
    * @description Check if node is descendant of another node.
    * @param {pc.GraphNode} node - Potential ancestor of node.
    * @returns {boolean} If node is descendant of another node.
    * @example
    * if (roof.isDescendantOf(house)) {
    *     // roof is descendant of house entity
    * }
    */
  def isDescendantOf(node: GraphNode): Boolean = js.native
  def lookAt(x: Double, y: Double, z: Double): Unit = js.native
  def lookAt(x: Double, y: Double, z: Double, ux: Double): Unit = js.native
  def lookAt(x: Double, y: Double, z: Double, ux: Double, uy: Double): Unit = js.native
  def lookAt(x: Double, y: Double, z: Double, ux: Double, uy: Double, uz: Double): Unit = js.native
  def lookAt(x: Double, y: Vec3, z: Double): Unit = js.native
  def lookAt(x: Double, y: Vec3, z: Double, ux: Double): Unit = js.native
  def lookAt(x: Double, y: Vec3, z: Double, ux: Double, uy: Double): Unit = js.native
  def lookAt(x: Double, y: Vec3, z: Double, ux: Double, uy: Double, uz: Double): Unit = js.native
  def lookAt(x: Vec3, y: Double, z: Double): Unit = js.native
  def lookAt(x: Vec3, y: Double, z: Double, ux: Double): Unit = js.native
  def lookAt(x: Vec3, y: Double, z: Double, ux: Double, uy: Double): Unit = js.native
  def lookAt(x: Vec3, y: Double, z: Double, ux: Double, uy: Double, uz: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#lookAt
    * @description Reorients the graph node so that the negative z-axis points towards the target.
    * This function has two valid signatures. Either pass 3D vectors for the look at coordinate and up
    * vector, or pass numbers to represent the vectors.
    * @param {pc.Vec3|number} x - If passing a 3D vector, this is the world-space coordinate to look at.
    * Otherwise, it is the x-component of the world-space coordinate to look at.
    * @param {pc.Vec3|number} y - If passing a 3D vector, this is the world-space up vector for look at
    * transform. Otherwise, it is the y-component of the world-space coordinate to look at.
    * @param {number} z - Z-component of the world-space coordinate to look at.
    * @param {number} [ux=0] - X-component of the up vector for the look at transform.
    * @param {number} [uy=1] - Y-component of the up vector for the look at transform.
    * @param {number} [uz=0] - Z-component of the up vector for the look at transform.
    * @example
    * // Look at another entity, using the (default) positive y-axis for up
    * var position = otherEntity.getPosition();
    * this.entity.lookAt(position);
    * @example
    * // Look at another entity, using the negative world y-axis for up
    * var position = otherEntity.getPosition();
    * this.entity.lookAt(position, pc.Vec3.DOWN);
    * @example
    * // Look at the world space origin, using the (default) positive y-axis for up
    * this.entity.lookAt(0, 0, 0);
    * @example
    * // Look at world-space coordinate [10, 10, 10], using the negative world y-axis for up
    * this.entity.lookAt(10, 10, 10, 0, -1, 0);
    */
  def lookAt(x: Vec3, y: Vec3, z: Double): Unit = js.native
  def lookAt(x: Vec3, y: Vec3, z: Double, ux: Double): Unit = js.native
  def lookAt(x: Vec3, y: Vec3, z: Double, ux: Double, uy: Double): Unit = js.native
  def lookAt(x: Vec3, y: Vec3, z: Double, ux: Double, uy: Double, uz: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#removeChild
    * @description Remove the node from the child list and update the parent value of the child.
    * @param {pc.GraphNode} child - The node to remove.
    * @example
    * var child = this.entity.children[0];
    * this.entity.removeChild(child);
    */
  def removeChild(child: GraphNode): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#reparent
    * @description Remove graph node from current parent and add as child to new parent.
    * @param {pc.GraphNode} parent - New parent to attach graph node to.
    * @param {number} [index] - The child index where the child node should be placed.
    */
  def reparent(parent: GraphNode): Unit = js.native
  def reparent(parent: GraphNode, index: Double): Unit = js.native
  def rotate(x: Double): Unit = js.native
  def rotate(x: Double, y: Double): Unit = js.native
  def rotate(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#rotate
    * @description Rotates the graph node in world-space by the specified Euler angles.
    * Eulers are specified in degrees in XYZ order. This function has two valid signatures:
    * you can either pass a 3D vector or 3 numbers to specify the world-space rotation.
    * @param {pc.Vec3|number} x - 3-dimensional vector holding world-space rotation or
    * rotation around world-space x-axis in degrees.
    * @param {number} [y] - Rotation around world-space y-axis in degrees.
    * @param {number} [z] - Rotation around world-space z-axis in degrees.
    * @example
    * // Rotate via 3 numbers
    * this.entity.rotate(0, 90, 0);
    * @example
    * // Rotate via vector
    * var r = new pc.Vec3(0, 90, 0);
    * this.entity.rotate(r);
    */
  def rotate(x: Vec3): Unit = js.native
  def rotate(x: Vec3, y: Double): Unit = js.native
  def rotate(x: Vec3, y: Double, z: Double): Unit = js.native
  def rotateLocal(x: Double): Unit = js.native
  def rotateLocal(x: Double, y: Double): Unit = js.native
  def rotateLocal(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#rotateLocal
    * @description Rotates the graph node in local-space by the specified Euler angles.
    * Eulers are specified in degrees in XYZ order. This function has two valid signatures:
    * you can either pass a 3D vector or 3 numbers to specify the local-space rotation.
    * @param {pc.Vec3|number} x - 3-dimensional vector holding local-space rotation or
    * rotation around local-space x-axis in degrees.
    * @param {number} [y] - Rotation around local-space y-axis in degrees.
    * @param {number} [z] - Rotation around local-space z-axis in degrees.
    * @example
    * // Rotate via 3 numbers
    * this.entity.rotateLocal(0, 90, 0);
    * @example
    * // Rotate via vector
    * var r = new pc.Vec3(0, 90, 0);
    * this.entity.rotateLocal(r);
    */
  def rotateLocal(x: Vec3): Unit = js.native
  def rotateLocal(x: Vec3, y: Double): Unit = js.native
  def rotateLocal(x: Vec3, y: Double, z: Double): Unit = js.native
  def setEulerAngles(x: Double): Unit = js.native
  def setEulerAngles(x: Double, y: Double): Unit = js.native
  def setEulerAngles(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#setEulerAngles
    * @description Sets the world-space rotation of the specified graph node using euler angles.
    * Eulers are interpreted in XYZ order. Eulers must be specified in degrees. This function
    * has two valid signatures: you can either pass a 3D vector or 3 numbers to specify the
    * world-space euler rotation.
    * @param {pc.Vec3|number} x - 3-dimensional vector holding eulers or rotation around world-space
    * x-axis in degrees.
    * @param {number} [y] - Rotation around world-space y-axis in degrees.
    * @param {number} [z] - Rotation around world-space z-axis in degrees.
    * @example
    * // Set rotation of 90 degrees around world-space y-axis via 3 numbers
    * this.entity.setEulerAngles(0, 90, 0);
    * @example
    * // Set rotation of 90 degrees around world-space y-axis via a vector
    * var angles = new pc.Vec3(0, 90, 0);
    * this.entity.setEulerAngles(angles);
    */
  def setEulerAngles(x: Vec3): Unit = js.native
  def setEulerAngles(x: Vec3, y: Double): Unit = js.native
  def setEulerAngles(x: Vec3, y: Double, z: Double): Unit = js.native
  def setLocalEulerAngles(x: Double): Unit = js.native
  def setLocalEulerAngles(x: Double, y: Double): Unit = js.native
  def setLocalEulerAngles(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#setLocalEulerAngles
    * @description Sets the local-space rotation of the specified graph node using euler angles.
    * Eulers are interpreted in XYZ order. Eulers must be specified in degrees. This function
    * has two valid signatures: you can either pass a 3D vector or 3 numbers to specify the
    * local-space euler rotation.
    * @param {pc.Vec3|number} x - 3-dimensional vector holding eulers or rotation around local-space
    * x-axis in degrees.
    * @param {number} [y] - Rotation around local-space y-axis in degrees.
    * @param {number} [z] - Rotation around local-space z-axis in degrees.
    * @example
    * // Set rotation of 90 degrees around y-axis via 3 numbers
    * this.entity.setLocalEulerAngles(0, 90, 0);
    * @example
    * // Set rotation of 90 degrees around y-axis via a vector
    * var angles = new pc.Vec3(0, 90, 0);
    * this.entity.setLocalEulerAngles(angles);
    */
  def setLocalEulerAngles(x: Vec3): Unit = js.native
  def setLocalEulerAngles(x: Vec3, y: Double): Unit = js.native
  def setLocalEulerAngles(x: Vec3, y: Double, z: Double): Unit = js.native
  def setLocalPosition(x: Double): Unit = js.native
  def setLocalPosition(x: Double, y: Double): Unit = js.native
  def setLocalPosition(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#setLocalPosition
    * @description Sets the local-space position of the specified graph node. This function
    * has two valid signatures: you can either pass a 3D vector or 3 numbers to specify the
    * local-space position.
    * @param {pc.Vec3|number} x - 3-dimensional vector holding local-space position or
    * x-coordinate of local-space position.
    * @param {number} [y] - Y-coordinate of local-space position.
    * @param {number} [z] - Z-coordinate of local-space position.
    * @example
    * // Set via 3 numbers
    * this.entity.setLocalPosition(0, 10, 0);
    * @example
    * // Set via vector
    * var pos = new pc.Vec3(0, 10, 0);
    * this.entity.setLocalPosition(pos);
    */
  def setLocalPosition(x: Vec3): Unit = js.native
  def setLocalPosition(x: Vec3, y: Double): Unit = js.native
  def setLocalPosition(x: Vec3, y: Double, z: Double): Unit = js.native
  def setLocalRotation(x: Double): Unit = js.native
  def setLocalRotation(x: Double, y: Double): Unit = js.native
  def setLocalRotation(x: Double, y: Double, z: Double): Unit = js.native
  def setLocalRotation(x: Double, y: Double, z: Double, w: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#setLocalRotation
    * @description Sets the local-space rotation of the specified graph node. This function
    * has two valid signatures: you can either pass a quaternion or 3 numbers to specify the
    * local-space rotation.
    * @param {pc.Quat|number} x - Quaternion holding local-space rotation or x-component of
    * local-space quaternion rotation.
    * @param {number} [y] - Y-component of local-space quaternion rotation.
    * @param {number} [z] - Z-component of local-space quaternion rotation.
    * @param {number} [w] - W-component of local-space quaternion rotation.
    * @example
    * // Set via 4 numbers
    * this.entity.setLocalRotation(0, 0, 0, 1);
    * @example
    * // Set via quaternion
    * var q = pc.Quat();
    * this.entity.setLocalRotation(q);
    */
  def setLocalRotation(x: Quat): Unit = js.native
  def setLocalRotation(x: Quat, y: Double): Unit = js.native
  def setLocalRotation(x: Quat, y: Double, z: Double): Unit = js.native
  def setLocalRotation(x: Quat, y: Double, z: Double, w: Double): Unit = js.native
  def setLocalScale(x: Double): Unit = js.native
  def setLocalScale(x: Double, y: Double): Unit = js.native
  def setLocalScale(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#setLocalScale
    * @description Sets the local-space scale factor of the specified graph node. This function
    * has two valid signatures: you can either pass a 3D vector or 3 numbers to specify the
    * local-space scale.
    * @param {pc.Vec3|number} x - 3-dimensional vector holding local-space scale or x-coordinate
    * of local-space scale.
    * @param {number} [y] - Y-coordinate of local-space scale.
    * @param {number} [z] - Z-coordinate of local-space scale.
    * @example
    * // Set via 3 numbers
    * this.entity.setLocalScale(10, 10, 10);
    * @example
    * // Set via vector
    * var scale = new pc.Vec3(10, 10, 10);
    * this.entity.setLocalScale(scale);
    */
  def setLocalScale(x: Vec3): Unit = js.native
  def setLocalScale(x: Vec3, y: Double): Unit = js.native
  def setLocalScale(x: Vec3, y: Double, z: Double): Unit = js.native
  def setPosition(x: Double): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#setPosition
    * @description Sets the world-space position of the specified graph node. This function
    * has two valid signatures: you can either pass a 3D vector or 3 numbers to specify the
    * world-space position.
    * @param {pc.Vec3|number} x - 3-dimensional vector holding world-space position or
    * x-coordinate of world-space position.
    * @param {number} [y] - Y-coordinate of world-space position.
    * @param {number} [z] - Z-coordinate of world-space position.
    * @example
    * // Set via 3 numbers
    * this.entity.setPosition(0, 10, 0);
    * @example
    * // Set via vector
    * var position = new pc.Vec3(0, 10, 0);
    * this.entity.setPosition(position);
    */
  def setPosition(x: Vec3): Unit = js.native
  def setPosition(x: Vec3, y: Double): Unit = js.native
  def setPosition(x: Vec3, y: Double, z: Double): Unit = js.native
  def setRotation(x: Double): Unit = js.native
  def setRotation(x: Double, y: Double): Unit = js.native
  def setRotation(x: Double, y: Double, z: Double): Unit = js.native
  def setRotation(x: Double, y: Double, z: Double, w: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#setRotation
    * @description Sets the world-space rotation of the specified graph node. This function
    * has two valid signatures: you can either pass a quaternion or 3 numbers to specify the
    * world-space rotation.
    * @param {pc.Quat|number} x - Quaternion holding world-space rotation or x-component of
    * world-space quaternion rotation.
    * @param {number} [y] - Y-component of world-space quaternion rotation.
    * @param {number} [z] - Z-component of world-space quaternion rotation.
    * @param {number} [w] - W-component of world-space quaternion rotation.
    * @example
    * // Set via 4 numbers
    * this.entity.setRotation(0, 0, 0, 1);
    * @example
    * // Set via quaternion
    * var q = pc.Quat();
    * this.entity.setRotation(q);
    */
  def setRotation(x: Quat): Unit = js.native
  def setRotation(x: Quat, y: Double): Unit = js.native
  def setRotation(x: Quat, y: Double, z: Double): Unit = js.native
  def setRotation(x: Quat, y: Double, z: Double, w: Double): Unit = js.native
  def translate(x: Double): Unit = js.native
  def translate(x: Double, y: Double): Unit = js.native
  def translate(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#translate
    * @description Translates the graph node in world-space by the specified translation vector.
    * This function has two valid signatures: you can either pass a 3D vector or 3 numbers to
    * specify the world-space translation.
    * @param {pc.Vec3|number} x - 3-dimensional vector holding world-space translation or
    * x-coordinate of world-space translation.
    * @param {number} [y] - Y-coordinate of world-space translation.
    * @param {number} [z] - Z-coordinate of world-space translation.
    * @example
    * // Translate via 3 numbers
    * this.entity.translate(10, 0, 0);
    * @example
    * // Translate via vector
    * var t = new pc.Vec3(10, 0, 0);
    * this.entity.translate(t);
    */
  def translate(x: Vec3): Unit = js.native
  def translate(x: Vec3, y: Double): Unit = js.native
  def translate(x: Vec3, y: Double, z: Double): Unit = js.native
  def translateLocal(x: Double): Unit = js.native
  def translateLocal(x: Double, y: Double): Unit = js.native
  def translateLocal(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphNode#translateLocal
    * @description Translates the graph node in local-space by the specified translation vector.
    * This function has two valid signatures: you can either pass a 3D vector or 3 numbers to
    * specify the local-space translation.
    * @param {pc.Vec3|number} x - 3-dimensional vector holding local-space translation or
    * x-coordinate of local-space translation.
    * @param {number} [y] - Y-coordinate of local-space translation.
    * @param {number} [z] - Z-coordinate of local-space translation.
    * @example
    * // Translate via 3 numbers
    * this.entity.translateLocal(10, 0, 0);
    * @example
    * // Translate via vector
    * var t = new pc.Vec3(10, 0, 0);
    * this.entity.translateLocal(t);
    */
  def translateLocal(x: Vec3): Unit = js.native
  def translateLocal(x: Vec3, y: Double): Unit = js.native
  def translateLocal(x: Vec3, y: Double, z: Double): Unit = js.native
}

