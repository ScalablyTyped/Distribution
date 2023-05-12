package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link GraphNode#find} and {@link GraphNode#findOne} to search through a graph
  * node and all of its descendants.
  *
  * @callback FindNodeCallback
  * @param {GraphNode} node - The current graph node.
  * @returns {boolean} Returning `true` will result in that node being returned from
  * {@link GraphNode#find} or {@link GraphNode#findOne}.
  */
/**
  * Callback used by {@link GraphNode#forEach} to iterate through a graph node and all of its
  * descendants.
  *
  * @callback ForEachNodeCallback
  * @param {GraphNode} node - The current graph node.
  */
/**
  * A hierarchical scene node.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "GraphNode")
@js.native
/**
  * Create a new GraphNode instance.
  *
  * @param {string} [name] - The non-unique name of a graph node. Defaults to 'Untitled'.
  */
open class GraphNode () extends EventHandler {
  def this(name: String) = this()
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _aabbVer: Any = js.native
  
  /**
    * @type {GraphNode[]}
    * @private
    */
  /* private */ var _children: Any = js.native
  
  /**
    * @param {this} clone - The cloned graph node to copy into.
    * @private
    */
  /* private */ var _cloneInternal: Any = js.native
  
  /** @private */
  /* private */ var _dirtifyLocal: Any = js.native
  
  /** @private */
  /* private */ var _dirtifyWorld: Any = js.native
  
  /** @private */
  /* private */ var _dirtifyWorldInternal: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _dirtyLocal: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _dirtyNormal: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _dirtyWorld: Any = js.native
  
  /**
    * Represents enabled state of the entity. If the entity is disabled, the entity including all
    * children are excluded from updates.
    *
    * @type {boolean}
    * @private
    */
  /* private */ var _enabled: Any = js.native
  
  /**
    * Represents enabled state of the entity in the hierarchy. It's true only if this entity and
    * all parent entities all the way to the scene's root are enabled.
    *
    * @type {boolean}
    * @private
    */
  /* private */ var _enabledInHierarchy: Any = js.native
  
  /**
    * Fires an event on all children of the node. The event `name` is fired on the first (root)
    * node only. The event `nameHierarchy` is fired for all children.
    *
    * @param {string} name - The name of the event to fire on the root.
    * @param {string} nameHierarchy - The name of the event to fire for all descendants.
    * @param {GraphNode} parent - The parent of the node being added/removed from the hierarchy.
    * @private
    */
  /* private */ var _fireOnHierarchy: Any = js.native
  
  /**
    * @type {Vec3|null}
    * @private
    */
  /* private */ var _forward: Any = js.native
  
  /**
    * Marks the node to ignore hierarchy sync entirely (including children nodes). The engine code
    * automatically freezes and unfreezes objects whenever required. Segregating dynamic and
    * stationary nodes into subhierarchies allows to reduce sync time significantly.
    *
    * @type {boolean}
    * @private
    */
  /* private */ var _frozen: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _graphDepth: Any = js.native
  
  /** @private */
  /* private */ var _labels: Any = js.native
  
  /**
    * @type {Mat3}
    * @private
    */
  /* private */ var _normalMatrix: Any = js.native
  
  /**
    * @param {GraphNode} node - Graph node to update.
    * @param {boolean} enabled - True if enabled in the hierarchy, false if disabled.
    * @private
    */
  /* private */ var _notifyHierarchyStateChanged: Any = js.native
  
  /**
    * Called when the enabled flag of the entity or one of its parents changes.
    *
    * @param {boolean} enabled - True if enabled in the hierarchy, false if disabled.
    * @private
    */
  /* private */ var _onHierarchyStateChanged: Any = js.native
  
  /**
    * Called when a node is inserted into a node's child list.
    *
    * @param {GraphNode} node - The node that was inserted.
    * @private
    */
  /* private */ var _onInsertChild: Any = js.native
  
  /**
    * @type {GraphNode|null}
    * @private
    */
  /* private */ var _parent: Any = js.native
  
  /**
    * Prepares node for being inserted to a parent node, and removes it from the previous parent.
    *
    * @param {GraphNode} node - The node being inserted.
    * @private
    */
  /* private */ var _prepareInsertChild: Any = js.native
  
  /**
    * @type {Vec3|null}
    * @private
    */
  /* private */ var _right: Any = js.native
  
  /**
    * @type {Vec3|null}
    * @private
    */
  /* private */ var _scale: Any = js.native
  
  def _sync(): Unit = js.native
  
  /** @private */
  /* private */ var _unfreezeParentToRoot: Any = js.native
  
  /**
    * @type {Vec3|null}
    * @private
    */
  /* private */ var _up: Any = js.native
  
  /**
    * Recurse the hierarchy and update the graph depth at each node.
    *
    * @private
    */
  /* private */ var _updateGraphDepth: Any = js.native
  
  /**
    * Cached value representing the negatively scaled world transform. If the value is 0, this
    * marks this value as dirty and it needs to be recalculated. If the value is 1, the world
    * transform is not negatively scaled. If the value is -1, the world transform is negatively
    * scaled.
    *
    * @type {number}
    * @private
    */
  /* private */ var _worldScaleSign: Any = js.native
  
  /**
    * Add a new child to the child list and update the parent value of the child node.
    * If the node already had a parent, it is removed from its child list.
    *
    * @param {GraphNode} node - The new child to add.
    * @example
    * const e = new pc.Entity(app);
    * this.entity.addChild(e);
    */
  def addChild(node: GraphNode): Unit = js.native
  
  /**
    * Add a child to this node, maintaining the child's transform in world space.
    * If the node already had a parent, it is removed from its child list.
    *
    * @param {GraphNode} node - The child to add.
    * @example
    * const e = new pc.Entity(app);
    * this.entity.addChildAndSaveTransform(e);
    * @ignore
    */
  def addChildAndSaveTransform(node: GraphNode): Unit = js.native
  
  /**
    * A read-only property to get the children of this graph node.
    *
    * @type {GraphNode[]}
    */
  def children: js.Array[GraphNode] = js.native
  
  /**
    * Copy a graph node.
    *
    * @param {GraphNode} source - The graph node to copy.
    * @returns {GraphNode} The destination graph node.
    * @ignore
    */
  def copy(source: GraphNode): GraphNode = js.native
  
  def enabled: Boolean = js.native
  /**
    * Enable or disable a GraphNode. If one of the GraphNode's parents is disabled there will be
    * no other side effects. If all the parents are enabled then the new value will activate or
    * deactivate all the enabled children of the GraphNode.
    *
    * @type {boolean}
    */
  def enabled_=(arg: Boolean): Unit = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var eulerAngles: Any = js.native
  
  def find(attr: String): js.Array[GraphNode] = js.native
  def find(attr: String, value: js.Object): js.Array[GraphNode] = js.native
  /**
    * Search the graph node and all of its descendants for the nodes that satisfy some search
    * criteria.
    *
    * @param {FindNodeCallback|string} attr - This can either be a function or a string. If it's a
    * function, it is executed for each descendant node to test if node satisfies the search
    * logic. Returning true from the function will include the node into the results. If it's a
    * string then it represents the name of a field or a method of the node. If this is the name
    * of a field then the value passed as the second argument will be checked for equality. If
    * this is the name of a function then the return value of the function will be checked for
    * equality against the valued passed as the second argument to this function.
    * @param {object} [value] - If the first argument (attr) is a property name then this value
    * will be checked against the value of the property.
    * @returns {GraphNode[]} The array of graph nodes that match the search criteria.
    * @example
    * // Finds all nodes that have a model component and have 'door' in their lower-cased name
    * const doors = house.find(function (node) {
    *     return node.model && node.name.toLowerCase().indexOf('door') !== -1;
    * });
    * @example
    * // Finds all nodes that have the name property set to 'Test'
    * const entities = parent.find('name', 'Test');
    */
  def find(attr: FindNodeCallback): js.Array[GraphNode] = js.native
  def find(attr: FindNodeCallback, value: js.Object): js.Array[GraphNode] = js.native
  
  /**
    * Get the first node found in the graph with the name. The search is depth first.
    *
    * @param {string} name - The name of the graph.
    * @returns {GraphNode|null} The first node to be found matching the supplied name. Returns
    * null if no node is found.
    */
  def findByName(name: String): GraphNode | Null = js.native
  
  /**
    * Get the first node found in the graph by its full path in the graph. The full path has this
    * form 'parent/child/sub-child'. The search is depth first.
    *
    * @param {string|string[]} path - The full path of the {@link GraphNode} as either a string or
    * array of {@link GraphNode} names.
    * @returns {GraphNode|null} The first node to be found matching the supplied path. Returns
    * null if no node is found.
    * @example
    * // String form
    * const grandchild = this.entity.findByPath('child/grandchild');
    * @example
    * // Array form
    * const grandchild = this.entity.findByPath(['child', 'grandchild']);
    */
  def findByPath(path: String): GraphNode | Null = js.native
  def findByPath(path: js.Array[String]): GraphNode | Null = js.native
  
  /**
    * Return all graph nodes that satisfy the search query. Query can be simply a string, or comma
    * separated strings, to have inclusive results of assets that match at least one query. A
    * query that consists of an array of tags can be used to match graph nodes that have each tag
    * of array.
    *
    * @param {...*} query - Name of a tag or array of tags.
    * @returns {GraphNode[]} A list of all graph nodes that match the query.
    * @example
    * // Return all graph nodes that tagged by `animal`
    * const animals = node.findByTag("animal");
    * @example
    * // Return all graph nodes that tagged by `bird` OR `mammal`
    * const birdsAndMammals = node.findByTag("bird", "mammal");
    * @example
    * // Return all assets that tagged by `carnivore` AND `mammal`
    * const meatEatingMammals = node.findByTag(["carnivore", "mammal"]);
    * @example
    * // Return all assets that tagged by (`carnivore` AND `mammal`) OR (`carnivore` AND `reptile`)
    * const meatEatingMammalsAndReptiles = node.findByTag(["carnivore", "mammal"], ["carnivore", "reptile"]);
    */
  def findByTag(args: Any*): js.Array[GraphNode] = js.native
  
  def findOne(attr: String): GraphNode | Null = js.native
  def findOne(attr: String, value: js.Object): GraphNode | Null = js.native
  /**
    * Search the graph node and all of its descendants for the first node that satisfies some
    * search criteria.
    *
    * @param {FindNodeCallback|string} attr - This can either be a function or a string. If it's a
    * function, it is executed for each descendant node to test if node satisfies the search
    * logic. Returning true from the function will result in that node being returned from
    * findOne. If it's a string then it represents the name of a field or a method of the node. If
    * this is the name of a field then the value passed as the second argument will be checked for
    * equality. If this is the name of a function then the return value of the function will be
    * checked for equality against the valued passed as the second argument to this function.
    * @param {object} [value] - If the first argument (attr) is a property name then this value
    * will be checked against the value of the property.
    * @returns {GraphNode|null} A graph node that match the search criteria. Returns null if no
    * node is found.
    * @example
    * // Find the first node that is called 'head' and has a model component
    * const head = player.findOne(function (node) {
    *     return node.model && node.name === 'head';
    * });
    * @example
    * // Finds the first node that has the name property set to 'Test'
    * const node = parent.findOne('name', 'Test');
    */
  def findOne(attr: FindNodeCallback): GraphNode | Null = js.native
  def findOne(attr: FindNodeCallback, value: js.Object): GraphNode | Null = js.native
  
  /**
    * Executes a provided function once on this graph node and all of its descendants.
    *
    * @param {ForEachNodeCallback} callback - The function to execute on the graph node and each
    * descendant.
    * @param {object} [thisArg] - Optional value to use as this when executing callback function.
    * @example
    * // Log the path and name of each node in descendant tree starting with "parent"
    * parent.forEach(function (node) {
    *     console.log(node.path + "/" + node.name);
    * });
    */
  def forEach(callback: ForEachNodeCallback): Unit = js.native
  def forEach(callback: ForEachNodeCallback, thisArg: js.Object): Unit = js.native
  
  /**
    * The normalized local space negative Z-axis vector of the graph node in world space.
    *
    * @type {Vec3}
    */
  def forward: Vec3 = js.native
  
  /**
    * Get the world space rotation for the specified GraphNode in Euler angle form. The rotation
    * is returned as euler angles in a {@link Vec3}. The value returned by this function should be
    * considered read-only. In order to set the world-space rotation of the graph node, use
    * {@link GraphNode#setEulerAngles}.
    *
    * @returns {Vec3} The world space rotation of the graph node in Euler angle form.
    * @example
    * const angles = this.entity.getEulerAngles();
    * angles.y = 180; // rotate the entity around Y by 180 degrees
    * this.entity.setEulerAngles(angles);
    */
  def getEulerAngles(): Vec3 = js.native
  
  /**
    * Get the rotation in local space for the specified GraphNode. The rotation is returned as
    * euler angles in a {@link Vec3}. The returned vector should be considered read-only. To
    * update the local rotation, use {@link GraphNode#setLocalEulerAngles}.
    *
    * @returns {Vec3} The local space rotation of the graph node as euler angles in XYZ order.
    * @example
    * const angles = this.entity.getLocalEulerAngles();
    * angles.y = 180;
    * this.entity.setLocalEulerAngles(angles);
    */
  def getLocalEulerAngles(): Vec3 = js.native
  
  /**
    * Get the position in local space for the specified GraphNode. The position is returned as a
    * {@link Vec3}. The returned vector should be considered read-only. To update the local
    * position, use {@link GraphNode#setLocalPosition}.
    *
    * @returns {Vec3} The local space position of the graph node.
    * @example
    * const position = this.entity.getLocalPosition();
    * position.x += 1; // move the entity 1 unit along x.
    * this.entity.setLocalPosition(position);
    */
  def getLocalPosition(): Vec3 = js.native
  
  /**
    * Get the rotation in local space for the specified GraphNode. The rotation is returned as a
    * {@link Quat}. The returned quaternion should be considered read-only. To update the local
    * rotation, use {@link GraphNode#setLocalRotation}.
    *
    * @returns {Quat} The local space rotation of the graph node as a quaternion.
    * @example
    * const rotation = this.entity.getLocalRotation();
    */
  def getLocalRotation(): Quat = js.native
  
  /**
    * Get the scale in local space for the specified GraphNode. The scale is returned as a
    * {@link Vec3}. The returned vector should be considered read-only. To update the local scale,
    * use {@link GraphNode#setLocalScale}.
    *
    * @returns {Vec3} The local space scale of the graph node.
    * @example
    * const scale = this.entity.getLocalScale();
    * scale.x = 100;
    * this.entity.setLocalScale(scale);
    */
  def getLocalScale(): Vec3 = js.native
  
  /**
    * Get the local transform matrix for this graph node. This matrix is the transform relative to
    * the node's parent's world transformation matrix.
    *
    * @returns {Mat4} The node's local transformation matrix.
    * @example
    * const transform = this.entity.getLocalTransform();
    */
  def getLocalTransform(): Mat4 = js.native
  
  /**
    * Get the world space position for the specified GraphNode. The position is returned as a
    * {@link Vec3}. The value returned by this function should be considered read-only. In order
    * to set the world-space position of the graph node, use {@link GraphNode#setPosition}.
    *
    * @returns {Vec3} The world space position of the graph node.
    * @example
    * const position = this.entity.getPosition();
    * position.x = 10;
    * this.entity.setPosition(position);
    */
  def getPosition(): Vec3 = js.native
  
  /**
    * Get the world space rotation for the specified GraphNode. The rotation is returned as a
    * {@link Quat}. The value returned by this function should be considered read-only. In order
    * to set the world-space rotation of the graph node, use {@link GraphNode#setRotation}.
    *
    * @returns {Quat} The world space rotation of the graph node as a quaternion.
    * @example
    * const rotation = this.entity.getRotation();
    */
  def getRotation(): Quat = js.native
  
  /**
    * Get the world space scale for the specified GraphNode. The returned value will only be
    * correct for graph nodes that have a non-skewed world transform (a skew can be introduced by
    * the compounding of rotations and scales higher in the graph node hierarchy). The scale is
    * returned as a {@link Vec3}. The value returned by this function should be considered
    * read-only. Note that it is not possible to set the world space scale of a graph node
    * directly.
    *
    * @returns {Vec3} The world space scale of the graph node.
    * @example
    * const scale = this.entity.getScale();
    * @ignore
    */
  def getScale(): Vec3 = js.native
  
  /**
    * Get the world transformation matrix for this graph node.
    *
    * @returns {Mat4} The node's world transformation matrix.
    * @example
    * const transform = this.entity.getWorldTransform();
    */
  def getWorldTransform(): Mat4 = js.native
  
  /**
    * A read-only property to get the depth of this child within the graph. Note that for
    * performance reasons this is only recalculated when a node is added to a new parent, i.e. It
    * is not recalculated when a node is simply removed from the graph.
    *
    * @type {number}
    */
  def graphDepth: Double = js.native
  
  /**
    * Insert a new child to the child list at the specified index and update the parent value of
    * the child node. If the node already had a parent, it is removed from its child list.
    *
    * @param {GraphNode} node - The new child to insert.
    * @param {number} index - The index in the child list of the parent where the new node will be
    * inserted.
    * @example
    * const e = new pc.Entity(app);
    * this.entity.insertChild(e, 1);
    */
  def insertChild(node: GraphNode, index: Double): Unit = js.native
  
  /**
    * Check if node is ancestor for another node.
    *
    * @param {GraphNode} node - Potential descendant of node.
    * @returns {boolean} If node is ancestor for another node.
    * @example
    * if (body.isAncestorOf(foot)) {
    *     // foot is within body's hierarchy
    * }
    */
  def isAncestorOf(node: GraphNode): Boolean = js.native
  
  /**
    * Check if node is descendant of another node.
    *
    * @param {GraphNode} node - Potential ancestor of node.
    * @returns {boolean} If node is descendant of another node.
    * @example
    * if (roof.isDescendantOf(house)) {
    *     // roof is descendant of house entity
    * }
    */
  def isDescendantOf(node: GraphNode): Boolean = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var localEulerAngles: Any = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var localPosition: Any = js.native
  
  /**
    * @type {Quat}
    * @private
    */
  /* private */ var localRotation: Any = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var localScale: Any = js.native
  
  /**
    * @type {Mat4}
    * @private
    */
  /* private */ var localTransform: Any = js.native
  
  /**
    * Reorients the graph node so that the negative z-axis points towards the target. This
    * function has two valid signatures. Either pass 3D vectors for the look at coordinate and up
    * vector, or pass numbers to represent the vectors.
    *
    * @param {Vec3|number} x - If passing a 3D vector, this is the world-space coordinate to look at.
    * Otherwise, it is the x-component of the world-space coordinate to look at.
    * @param {Vec3|number} [y] - If passing a 3D vector, this is the world-space up vector for look at
    * transform. Otherwise, it is the y-component of the world-space coordinate to look at.
    * @param {number} [z] - Z-component of the world-space coordinate to look at.
    * @param {number} [ux=0] - X-component of the up vector for the look at transform.
    * @param {number} [uy=1] - Y-component of the up vector for the look at transform.
    * @param {number} [uz=0] - Z-component of the up vector for the look at transform.
    * @example
    * // Look at another entity, using the (default) positive y-axis for up
    * const position = otherEntity.getPosition();
    * this.entity.lookAt(position);
    * @example
    * // Look at another entity, using the negative world y-axis for up
    * const position = otherEntity.getPosition();
    * this.entity.lookAt(position, pc.Vec3.DOWN);
    * @example
    * // Look at the world space origin, using the (default) positive y-axis for up
    * this.entity.lookAt(0, 0, 0);
    * @example
    * // Look at world-space coordinate [10, 10, 10], using the negative world y-axis for up
    * this.entity.lookAt(10, 10, 10, 0, -1, 0);
    */
  def lookAt(
    x: Vec3 | Double,
    y: js.UndefOr[Vec3 | Double],
    z: js.UndefOr[Double],
    ux: js.UndefOr[Double],
    uy: js.UndefOr[Double],
    uz: js.UndefOr[Double]
  ): Unit = js.native
  
  /**
    * The non-unique name of a graph node. Defaults to 'Untitled'.
    *
    * @type {string}
    */
  var name: String = js.native
  
  /**
    * A matrix used to transform the normal.
    *
    * @type  {Mat3}
    * @ignore
    */
  def normalMatrix: Mat3 = js.native
  
  /**
    * A read-only property to get a parent graph node.
    *
    * @type {GraphNode|null}
    */
  def parent: GraphNode = js.native
  
  /**
    * A read-only property to get the path of the graph node relative to the root of the hierarchy.
    *
    * @type {string}
    */
  def path: String = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var position: Any = js.native
  
  /**
    * Remove the node from the child list and update the parent value of the child.
    *
    * @param {GraphNode} child - The node to remove.
    * @example
    * const child = this.entity.children[0];
    * this.entity.removeChild(child);
    */
  def removeChild(child: GraphNode): Unit = js.native
  
  /**
    * Remove graph node from current parent and add as child to new parent.
    *
    * @param {GraphNode} parent - New parent to attach graph node to.
    * @param {number} [index] - The child index where the child node should be placed.
    */
  def reparent(parent: GraphNode): Unit = js.native
  def reparent(parent: GraphNode, index: Double): Unit = js.native
  
  /**
    * The normalized local space X-axis vector of the graph node in world space.
    *
    * @type {Vec3}
    */
  def right: Vec3 = js.native
  
  /**
    * A read-only property to get highest graph node from current node.
    *
    * @type {GraphNode}
    */
  def root: GraphNode = js.native
  
  def rotate(x: Double): Unit = js.native
  def rotate(x: Double, y: Double): Unit = js.native
  def rotate(x: Double, y: Double, z: Double): Unit = js.native
  def rotate(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Rotates the graph node in world-space by the specified Euler angles. Eulers are specified in
    * degrees in XYZ order. This function has two valid signatures: you can either pass a 3D
    * vector or 3 numbers to specify the world-space rotation.
    *
    * @param {Vec3|number} x - 3-dimensional vector holding world-space rotation or
    * rotation around world-space x-axis in degrees.
    * @param {number} [y] - Rotation around world-space y-axis in degrees.
    * @param {number} [z] - Rotation around world-space z-axis in degrees.
    * @example
    * // Rotate via 3 numbers
    * this.entity.rotate(0, 90, 0);
    * @example
    * // Rotate via vector
    * const r = new pc.Vec3(0, 90, 0);
    * this.entity.rotate(r);
    */
  def rotate(x: Vec3): Unit = js.native
  def rotate(x: Vec3, y: Double): Unit = js.native
  def rotate(x: Vec3, y: Double, z: Double): Unit = js.native
  def rotate(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  def rotateLocal(x: Double): Unit = js.native
  def rotateLocal(x: Double, y: Double): Unit = js.native
  def rotateLocal(x: Double, y: Double, z: Double): Unit = js.native
  def rotateLocal(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Rotates the graph node in local-space by the specified Euler angles. Eulers are specified in
    * degrees in XYZ order. This function has two valid signatures: you can either pass a 3D
    * vector or 3 numbers to specify the local-space rotation.
    *
    * @param {Vec3|number} x - 3-dimensional vector holding local-space rotation or
    * rotation around local-space x-axis in degrees.
    * @param {number} [y] - Rotation around local-space y-axis in degrees.
    * @param {number} [z] - Rotation around local-space z-axis in degrees.
    * @example
    * // Rotate via 3 numbers
    * this.entity.rotateLocal(0, 90, 0);
    * @example
    * // Rotate via vector
    * const r = new pc.Vec3(0, 90, 0);
    * this.entity.rotateLocal(r);
    */
  def rotateLocal(x: Vec3): Unit = js.native
  def rotateLocal(x: Vec3, y: Double): Unit = js.native
  def rotateLocal(x: Vec3, y: Double, z: Double): Unit = js.native
  def rotateLocal(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  /**
    * @type {Quat}
    * @private
    */
  /* private */ var rotation: Any = js.native
  
  /**
    * @type {boolean}
    * @ignore
    */
  var scaleCompensation: Boolean = js.native
  
  def setEulerAngles(x: Double): Unit = js.native
  def setEulerAngles(x: Double, y: Double): Unit = js.native
  def setEulerAngles(x: Double, y: Double, z: Double): Unit = js.native
  def setEulerAngles(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Sets the world-space rotation of the specified graph node using euler angles. Eulers are
    * interpreted in XYZ order. Eulers must be specified in degrees. This function has two valid
    * signatures: you can either pass a 3D vector or 3 numbers to specify the world-space euler
    * rotation.
    *
    * @param {Vec3|number} x - 3-dimensional vector holding eulers or rotation around world-space
    * x-axis in degrees.
    * @param {number} [y] - Rotation around world-space y-axis in degrees.
    * @param {number} [z] - Rotation around world-space z-axis in degrees.
    * @example
    * // Set rotation of 90 degrees around world-space y-axis via 3 numbers
    * this.entity.setEulerAngles(0, 90, 0);
    * @example
    * // Set rotation of 90 degrees around world-space y-axis via a vector
    * const angles = new pc.Vec3(0, 90, 0);
    * this.entity.setEulerAngles(angles);
    */
  def setEulerAngles(x: Vec3): Unit = js.native
  def setEulerAngles(x: Vec3, y: Double): Unit = js.native
  def setEulerAngles(x: Vec3, y: Double, z: Double): Unit = js.native
  def setEulerAngles(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  def setLocalEulerAngles(x: Double): Unit = js.native
  def setLocalEulerAngles(x: Double, y: Double): Unit = js.native
  def setLocalEulerAngles(x: Double, y: Double, z: Double): Unit = js.native
  def setLocalEulerAngles(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Sets the local-space rotation of the specified graph node using euler angles. Eulers are
    * interpreted in XYZ order. Eulers must be specified in degrees. This function has two valid
    * signatures: you can either pass a 3D vector or 3 numbers to specify the local-space euler
    * rotation.
    *
    * @param {Vec3|number} x - 3-dimensional vector holding eulers or rotation around local-space
    * x-axis in degrees.
    * @param {number} [y] - Rotation around local-space y-axis in degrees.
    * @param {number} [z] - Rotation around local-space z-axis in degrees.
    * @example
    * // Set rotation of 90 degrees around y-axis via 3 numbers
    * this.entity.setLocalEulerAngles(0, 90, 0);
    * @example
    * // Set rotation of 90 degrees around y-axis via a vector
    * const angles = new pc.Vec3(0, 90, 0);
    * this.entity.setLocalEulerAngles(angles);
    */
  def setLocalEulerAngles(x: Vec3): Unit = js.native
  def setLocalEulerAngles(x: Vec3, y: Double): Unit = js.native
  def setLocalEulerAngles(x: Vec3, y: Double, z: Double): Unit = js.native
  def setLocalEulerAngles(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  def setLocalPosition(x: Double): Unit = js.native
  def setLocalPosition(x: Double, y: Double): Unit = js.native
  def setLocalPosition(x: Double, y: Double, z: Double): Unit = js.native
  def setLocalPosition(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Sets the local-space position of the specified graph node. This function has two valid
    * signatures: you can either pass a 3D vector or 3 numbers to specify the local-space
    * position.
    *
    * @param {Vec3|number} x - 3-dimensional vector holding local-space position or
    * x-coordinate of local-space position.
    * @param {number} [y] - Y-coordinate of local-space position.
    * @param {number} [z] - Z-coordinate of local-space position.
    * @example
    * // Set via 3 numbers
    * this.entity.setLocalPosition(0, 10, 0);
    * @example
    * // Set via vector
    * const pos = new pc.Vec3(0, 10, 0);
    * this.entity.setLocalPosition(pos);
    */
  def setLocalPosition(x: Vec3): Unit = js.native
  def setLocalPosition(x: Vec3, y: Double): Unit = js.native
  def setLocalPosition(x: Vec3, y: Double, z: Double): Unit = js.native
  def setLocalPosition(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  def setLocalRotation(x: Double): Unit = js.native
  def setLocalRotation(x: Double, y: Double): Unit = js.native
  def setLocalRotation(x: Double, y: Double, z: Double): Unit = js.native
  def setLocalRotation(x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def setLocalRotation(x: Double, y: Double, z: Unit, w: Double): Unit = js.native
  def setLocalRotation(x: Double, y: Unit, z: Double): Unit = js.native
  def setLocalRotation(x: Double, y: Unit, z: Double, w: Double): Unit = js.native
  def setLocalRotation(x: Double, y: Unit, z: Unit, w: Double): Unit = js.native
  /**
    * Sets the local-space rotation of the specified graph node. This function has two valid
    * signatures: you can either pass a quaternion or 3 numbers to specify the local-space
    * rotation.
    *
    * @param {Quat|number} x - Quaternion holding local-space rotation or x-component of
    * local-space quaternion rotation.
    * @param {number} [y] - Y-component of local-space quaternion rotation.
    * @param {number} [z] - Z-component of local-space quaternion rotation.
    * @param {number} [w] - W-component of local-space quaternion rotation.
    * @example
    * // Set via 4 numbers
    * this.entity.setLocalRotation(0, 0, 0, 1);
    * @example
    * // Set via quaternion
    * const q = pc.Quat();
    * this.entity.setLocalRotation(q);
    */
  def setLocalRotation(x: Quat): Unit = js.native
  def setLocalRotation(x: Quat, y: Double): Unit = js.native
  def setLocalRotation(x: Quat, y: Double, z: Double): Unit = js.native
  def setLocalRotation(x: Quat, y: Double, z: Double, w: Double): Unit = js.native
  def setLocalRotation(x: Quat, y: Double, z: Unit, w: Double): Unit = js.native
  def setLocalRotation(x: Quat, y: Unit, z: Double): Unit = js.native
  def setLocalRotation(x: Quat, y: Unit, z: Double, w: Double): Unit = js.native
  def setLocalRotation(x: Quat, y: Unit, z: Unit, w: Double): Unit = js.native
  
  def setLocalScale(x: Double): Unit = js.native
  def setLocalScale(x: Double, y: Double): Unit = js.native
  def setLocalScale(x: Double, y: Double, z: Double): Unit = js.native
  def setLocalScale(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Sets the local-space scale factor of the specified graph node. This function has two valid
    * signatures: you can either pass a 3D vector or 3 numbers to specify the local-space scale.
    *
    * @param {Vec3|number} x - 3-dimensional vector holding local-space scale or x-coordinate
    * of local-space scale.
    * @param {number} [y] - Y-coordinate of local-space scale.
    * @param {number} [z] - Z-coordinate of local-space scale.
    * @example
    * // Set via 3 numbers
    * this.entity.setLocalScale(10, 10, 10);
    * @example
    * // Set via vector
    * const scale = new pc.Vec3(10, 10, 10);
    * this.entity.setLocalScale(scale);
    */
  def setLocalScale(x: Vec3): Unit = js.native
  def setLocalScale(x: Vec3, y: Double): Unit = js.native
  def setLocalScale(x: Vec3, y: Double, z: Double): Unit = js.native
  def setLocalScale(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  def setPosition(x: Double): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
  def setPosition(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Sets the world-space position of the specified graph node. This function has two valid
    * signatures: you can either pass a 3D vector or 3 numbers to specify the world-space
    * position.
    *
    * @param {Vec3|number} x - 3-dimensional vector holding world-space position or
    * x-coordinate of world-space position.
    * @param {number} [y] - Y-coordinate of world-space position.
    * @param {number} [z] - Z-coordinate of world-space position.
    * @example
    * // Set via 3 numbers
    * this.entity.setPosition(0, 10, 0);
    * @example
    * // Set via vector
    * const position = new pc.Vec3(0, 10, 0);
    * this.entity.setPosition(position);
    */
  def setPosition(x: Vec3): Unit = js.native
  def setPosition(x: Vec3, y: Double): Unit = js.native
  def setPosition(x: Vec3, y: Double, z: Double): Unit = js.native
  def setPosition(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  def setRotation(x: Double): Unit = js.native
  def setRotation(x: Double, y: Double): Unit = js.native
  def setRotation(x: Double, y: Double, z: Double): Unit = js.native
  def setRotation(x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def setRotation(x: Double, y: Double, z: Unit, w: Double): Unit = js.native
  def setRotation(x: Double, y: Unit, z: Double): Unit = js.native
  def setRotation(x: Double, y: Unit, z: Double, w: Double): Unit = js.native
  def setRotation(x: Double, y: Unit, z: Unit, w: Double): Unit = js.native
  /**
    * Sets the world-space rotation of the specified graph node. This function has two valid
    * signatures: you can either pass a quaternion or 3 numbers to specify the world-space
    * rotation.
    *
    * @param {Quat|number} x - Quaternion holding world-space rotation or x-component of
    * world-space quaternion rotation.
    * @param {number} [y] - Y-component of world-space quaternion rotation.
    * @param {number} [z] - Z-component of world-space quaternion rotation.
    * @param {number} [w] - W-component of world-space quaternion rotation.
    * @example
    * // Set via 4 numbers
    * this.entity.setRotation(0, 0, 0, 1);
    * @example
    * // Set via quaternion
    * const q = pc.Quat();
    * this.entity.setRotation(q);
    */
  def setRotation(x: Quat): Unit = js.native
  def setRotation(x: Quat, y: Double): Unit = js.native
  def setRotation(x: Quat, y: Double, z: Double): Unit = js.native
  def setRotation(x: Quat, y: Double, z: Double, w: Double): Unit = js.native
  def setRotation(x: Quat, y: Double, z: Unit, w: Double): Unit = js.native
  def setRotation(x: Quat, y: Unit, z: Double): Unit = js.native
  def setRotation(x: Quat, y: Unit, z: Double, w: Double): Unit = js.native
  def setRotation(x: Quat, y: Unit, z: Unit, w: Double): Unit = js.native
  
  /**
    * Updates the world transformation matrices at this node and all of its descendants.
    *
    * @ignore
    */
  def syncHierarchy(): Unit = js.native
  
  /**
    * Interface for tagging graph nodes. Tag based searches can be performed using the
    * {@link GraphNode#findByTag} function.
    *
    * @type {Tags}
    */
  var tags: Tags = js.native
  
  def translate(x: Double): Unit = js.native
  def translate(x: Double, y: Double): Unit = js.native
  def translate(x: Double, y: Double, z: Double): Unit = js.native
  def translate(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Translates the graph node in world-space by the specified translation vector. This function
    * has two valid signatures: you can either pass a 3D vector or 3 numbers to specify the
    * world-space translation.
    *
    * @param {Vec3|number} x - 3-dimensional vector holding world-space translation or
    * x-coordinate of world-space translation.
    * @param {number} [y] - Y-coordinate of world-space translation.
    * @param {number} [z] - Z-coordinate of world-space translation.
    * @example
    * // Translate via 3 numbers
    * this.entity.translate(10, 0, 0);
    * @example
    * // Translate via vector
    * const t = new pc.Vec3(10, 0, 0);
    * this.entity.translate(t);
    */
  def translate(x: Vec3): Unit = js.native
  def translate(x: Vec3, y: Double): Unit = js.native
  def translate(x: Vec3, y: Double, z: Double): Unit = js.native
  def translate(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  def translateLocal(x: Double): Unit = js.native
  def translateLocal(x: Double, y: Double): Unit = js.native
  def translateLocal(x: Double, y: Double, z: Double): Unit = js.native
  def translateLocal(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Translates the graph node in local-space by the specified translation vector. This function
    * has two valid signatures: you can either pass a 3D vector or 3 numbers to specify the
    * local-space translation.
    *
    * @param {Vec3|number} x - 3-dimensional vector holding local-space translation or
    * x-coordinate of local-space translation.
    * @param {number} [y] - Y-coordinate of local-space translation.
    * @param {number} [z] - Z-coordinate of local-space translation.
    * @example
    * // Translate via 3 numbers
    * this.entity.translateLocal(10, 0, 0);
    * @example
    * // Translate via vector
    * const t = new pc.Vec3(10, 0, 0);
    * this.entity.translateLocal(t);
    */
  def translateLocal(x: Vec3): Unit = js.native
  def translateLocal(x: Vec3, y: Double): Unit = js.native
  def translateLocal(x: Vec3, y: Double, z: Double): Unit = js.native
  def translateLocal(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  /**
    * The normalized local space Y-axis vector of the graph node in world space.
    *
    * @type {Vec3}
    */
  def up: Vec3 = js.native
  
  /**
    * Returns cached value of negative scale of the world transform.
    *
    * @returns {number} -1 if world transform has negative scale, 1 otherwise.
    * @ignore
    */
  def worldScaleSign: Double = js.native
  
  /**
    * @type {Mat4}
    * @private
    */
  /* private */ var worldTransform: Any = js.native
}
