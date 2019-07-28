package typings.phaser.PhaserNs.GameObjectsNs

import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Alpha
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.BlendMode
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.ComputedSize
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Depth
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Mask
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Transform
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.TransformMatrix
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Visible
import typings.phaser.PhaserNs.GeomNs.Point
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.Scene
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Container Game Object.
  * 
  * A Container, as the name implies, can 'contain' other types of Game Object.
  * When a Game Object is added to a Container, the Container becomes responsible for the rendering of it.
  * By default it will be removed from the Display List and instead added to the Containers own internal list.
  * 
  * The position of the Game Object automatically becomes relative to the position of the Container.
  * 
  * When the Container is rendered, all of its children are rendered as well, in the order in which they exist
  * within the Container. Container children can be repositioned using methods such as `MoveUp`, `MoveDown` and `SendToBack`.
  * 
  * If you modify a transform property of the Container, such as `Container.x` or `Container.rotation` then it will
  * automatically influence all children as well.
  * 
  * Containers can include other Containers for deeply nested transforms.
  * 
  * Containers can have masks set on them and can be used as a mask too. However, Container children cannot be masked.
  * The masks do not 'stack up'. Only a Container on the root of the display list will use its mask.
  * 
  * Containers can be enabled for input. Because they do not have a texture you need to provide a shape for them
  * to use as their hit area. Container children can also be enabled for input, independent of the Container.
  * 
  * Containers can be given a physics body for either Arcade Physics, Impact Physics or Matter Physics. However,
  * if Container _children_ are enabled for physics you may get unexpected results, such as offset bodies,
  * if the Container itself, or any of its ancestors, is positioned anywhere other than at 0 x 0. Container children
  * with physics do not factor in the Container due to the excessive extra calculations needed. Please structure
  * your game to work around this.
  * 
  * It's important to understand the impact of using Containers. They add additional processing overhead into
  * every one of their children. The deeper you nest them, the more the cost escalates. This is especially true
  * for input events. You also loose the ability to set the display depth of Container children in the same
  * flexible manner as those not within them. In short, don't use them for the sake of it. You pay a small cost
  * every time you create one, try to structure your game around avoiding that where possible.
  */
@JSGlobal("Phaser.GameObjects.Container")
@js.native
class Container protected ()
  extends GameObject
     with Alpha
     with BlendMode
     with ComputedSize
     with Depth
     with Mask
     with Transform
     with Visible {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param children An optional array of Game Objects to add to this Container.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, x: Double) = this()
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, children: js.Array[GameObject]) = this()
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  override var depth: Double = js.native
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayHeight: Double = js.native
  /**
    * Internal value to allow Containers to be used for input and physics.
    * Do not change this value. It has no effect other than to break things.
    */
  val displayOriginX: Double = js.native
  /**
    * Internal value to allow Containers to be used for input and physics.
    * Do not change this value. It has no effect other than to break things.
    */
  val displayOriginY: Double = js.native
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayWidth: Double = js.native
  /**
    * Does this Container exclusively manage its children?
    * 
    * The default is `true` which means a child added to this Container cannot
    * belong in another Container, which includes the Scene display list.
    * 
    * If you disable this then this Container will no longer exclusively manage its children.
    * This allows you to create all kinds of interesting graphical effects, such as replicating
    * Game Objects without reparenting them all over the Scene.
    * However, doing so will prevent children from receiving any kind of input event or have
    * their physics bodies work by default, as they're no longer a single entity on the
    * display list, but are being replicated where-ever this Container is.
    */
  var exclusive: Boolean = js.native
  /**
    * Returns the first Game Object within the Container, or `null` if it is empty.
    * 
    * You can move the cursor by calling `Container.next` and `Container.previous`.
    */
  val first: GameObject = js.native
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * Returns the last Game Object within the Container, or `null` if it is empty.
    * 
    * You can move the cursor by calling `Container.next` and `Container.previous`.
    */
  val last: GameObject = js.native
  /**
    * The number of Game Objects inside this Container.
    */
  val length: integer = js.native
  /**
    * An array holding the children of this Container.
    */
  var list: js.Array[GameObject] = js.native
  /**
    * Internal Transform Matrix used for local space conversion.
    */
  var localTransform: TransformMatrix = js.native
  /**
    * Containers can have an optional maximum size. If set to anything above 0 it
    * will constrict the addition of new Game Objects into the Container, capping off
    * the maximum limit the Container can grow in size to.
    */
  var maxSize: integer = js.native
  /**
    * Returns the next Game Object within the Container, or `null` if it is empty.
    * 
    * You can move the cursor by calling `Container.next` and `Container.previous`.
    */
  val next: GameObject = js.native
  /**
    * Internal value to allow Containers to be used for input and physics.
    * Do not change this value. It has no effect other than to break things.
    */
  val originX: Double = js.native
  /**
    * Internal value to allow Containers to be used for input and physics.
    * Do not change this value. It has no effect other than to break things.
    */
  val originY: Double = js.native
  /**
    * The cursor position.
    */
  var position: integer = js.native
  /**
    * Returns the previous Game Object within the Container, or `null` if it is empty.
    * 
    * You can move the cursor by calling `Container.next` and `Container.previous`.
    */
  val previous: GameObject = js.native
  /**
    * The horizontal scroll factor of this Container.
    * 
    * The scroll factor controls the influence of the movement of a Camera upon this Container.
    * 
    * When a camera scrolls it will change the location at which this Container is rendered on-screen.
    * It does not change the Containers actual position values.
    * 
    * For a Container, setting this value will only update the Container itself, not its children.
    * If you wish to change the scrollFactor of the children as well, use the `setScrollFactor` method.
    * 
    * A value of 1 means it will move exactly in sync with a camera.
    * A value of 0 means it will not move at all, even if the camera moves.
    * Other values control the degree to which the camera movement is mapped to this Container.
    * 
    * Please be aware that scroll factor values other than 1 are not taken in to consideration when
    * calculating physics collisions. Bodies always collide based on their world position, but changing
    * the scroll factor is a visual adjustment to where the textures are rendered, which can offset
    * them from physics bodies if not accounted for in your code.
    */
  var scrollFactorX: Double = js.native
  /**
    * The vertical scroll factor of this Container.
    * 
    * The scroll factor controls the influence of the movement of a Camera upon this Container.
    * 
    * When a camera scrolls it will change the location at which this Container is rendered on-screen.
    * It does not change the Containers actual position values.
    * 
    * For a Container, setting this value will only update the Container itself, not its children.
    * If you wish to change the scrollFactor of the children as well, use the `setScrollFactor` method.
    * 
    * A value of 1 means it will move exactly in sync with a camera.
    * A value of 0 means it will not move at all, even if the camera moves.
    * Other values control the degree to which the camera movement is mapped to this Container.
    * 
    * Please be aware that scroll factor values other than 1 are not taken in to consideration when
    * calculating physics collisions. Bodies always collide based on their world position, but changing
    * the scroll factor is a visual adjustment to where the textures are rendered, which can offset
    * them from physics bodies if not accounted for in your code.
    */
  var scrollFactorY: Double = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  /* CompleteClass */
  override var width: Double = js.native
  def add(child: js.Array[GameObject]): Container = js.native
  /**
    * Adds the given Game Object, or array of Game Objects, to this Container.
    * 
    * Each Game Object must be unique within the Container.
    * @param child The Game Object, or array of Game Objects, to add to the Container.
    */
  def add(child: GameObject): Container = js.native
  def addAt(child: js.Array[GameObject]): Container = js.native
  def addAt(child: js.Array[GameObject], index: integer): Container = js.native
  /**
    * Adds the given Game Object, or array of Game Objects, to this Container at the specified position.
    * 
    * Existing Game Objects in the Container are shifted up.
    * 
    * Each Game Object must be unique within the Container.
    * @param child The Game Object, or array of Game Objects, to add to the Container.
    * @param index The position to insert the Game Object/s at. Default 0.
    */
  def addAt(child: GameObject): Container = js.native
  def addAt(child: GameObject, index: integer): Container = js.native
  /**
    * Brings the given Game Object to the top of this Container.
    * This will cause it to render on-top of any other objects in the Container.
    * @param child The Game Object to bring to the top of the Container.
    */
  def bringToTop(child: GameObject): Container = js.native
  /**
    * Returns the total number of Game Objects in this Container that have a property
    * matching the given value.
    * 
    * For example: `count('visible', true)` would count all the elements that have their visible property set.
    * 
    * You can optionally limit the operation to the `startIndex` - `endIndex` range.
    * @param property The property to check.
    * @param value The value to check.
    * @param startIndex An optional start index to search from. Default 0.
    * @param endIndex An optional end index to search up to (but not included) Default Container.length.
    */
  def count(property: String, value: js.Any): integer = js.native
  def count(property: String, value: js.Any, startIndex: integer): integer = js.native
  def count(property: String, value: js.Any, startIndex: integer, endIndex: integer): integer = js.native
  /**
    * Passes all Game Objects in this Container to the given callback.
    * 
    * A copy of the Container is made before passing each entry to your callback.
    * This protects against the callback itself modifying the Container.
    * 
    * If you know for sure that the callback will not change the size of this Container
    * then you can use the more performant `Container.iterate` method instead.
    * @param callback The function to call.
    * @param context Value to use as `this` when executing callback.
    * @param args Additional arguments that will be passed to the callback, after the child.
    */
  def each(callback: js.Function): Container = js.native
  def each(callback: js.Function, context: js.Object, args: js.Any*): Container = js.native
  /**
    * Returns `true` if the given Game Object is a direct child of this Container.
    * 
    * This check does not scan nested Containers.
    * @param child The Game Object to check for within this Container.
    */
  def exists(child: GameObject): Boolean = js.native
  /**
    * Returns all Game Objects in this Container.
    * 
    * You can optionally specify a matching criteria using the `property` and `value` arguments.
    * 
    * For example: `getAll('body')` would return only Game Objects that have a body property.
    * 
    * You can also specify a value to compare the property to:
    * 
    * `getAll('visible', true)` would return only Game Objects that have their visible property set to `true`.
    * 
    * Optionally you can specify a start and end index. For example if this Container had 100 Game Objects,
    * and you set `startIndex` to 0 and `endIndex` to 50, it would return matches from only
    * the first 50 Game Objects.
    * @param property The property to test on each Game Object in the Container.
    * @param value If property is set then the `property` must strictly equal this value to be included in the results.
    * @param startIndex An optional start index to search from. Default 0.
    * @param endIndex An optional end index to search up to (but not included) Default Container.length.
    */
  def getAll(): js.Array[GameObject] = js.native
  def getAll(property: String): js.Array[GameObject] = js.native
  def getAll(property: String, value: js.Any): js.Array[GameObject] = js.native
  def getAll(property: String, value: js.Any, startIndex: integer): js.Array[GameObject] = js.native
  def getAll(property: String, value: js.Any, startIndex: integer, endIndex: integer): js.Array[GameObject] = js.native
  /**
    * Returns the Game Object at the given position in this Container.
    * @param index The position to get the Game Object from.
    */
  def getAt(index: integer): GameObject = js.native
  /**
    * Gets the bounds of this Container. It works by iterating all children of the Container,
    * getting their respective bounds, and then working out a min-max rectangle from that.
    * It does not factor in if the children render or not, all are included.
    * 
    * Some children are unable to return their bounds, such as Graphics objects, in which case
    * they are skipped.
    * 
    * Depending on the quantity of children in this Container it could be a really expensive call,
    * so cache it and only poll it as needed.
    * 
    * The values are stored and returned in a Rectangle object.
    * @param output A Geom.Rectangle object to store the values in. If not provided a new Rectangle will be created.
    */
  def getBounds(): typings.phaser.PhaserNs.GeomNs.Rectangle = js.native
  def getBounds(output: typings.phaser.PhaserNs.GeomNs.Rectangle): typings.phaser.PhaserNs.GeomNs.Rectangle = js.native
  /**
    * Returns the world transform matrix as used for Bounds checks.
    * 
    * The returned matrix is temporal and shouldn't be stored.
    */
  def getBoundsTransformMatrix(): TransformMatrix = js.native
  /**
    * Searches for the first instance of a child with its `name` property matching the given argument.
    * Should more than one child have the same name only the first is returned.
    * @param name The name to search for.
    */
  def getByName(name: String): GameObject = js.native
  /**
    * Gets the first Game Object in this Container.
    * 
    * You can also specify a property and value to search for, in which case it will return the first
    * Game Object in this Container with a matching property and / or value.
    * 
    * For example: `getFirst('visible', true)` would return the first Game Object that had its `visible` property set.
    * 
    * You can limit the search to the `startIndex` - `endIndex` range.
    * @param property The property to test on each Game Object in the Container.
    * @param value The value to test the property against. Must pass a strict (`===`) comparison check.
    * @param startIndex An optional start index to search from. Default 0.
    * @param endIndex An optional end index to search up to (but not included) Default Container.length.
    */
  def getFirst(property: String, value: js.Any): GameObject = js.native
  def getFirst(property: String, value: js.Any, startIndex: integer): GameObject = js.native
  def getFirst(property: String, value: js.Any, startIndex: integer, endIndex: integer): GameObject = js.native
  /**
    * Returns the index of the given Game Object in this Container.
    * @param child The Game Object to search for in this Container.
    */
  def getIndex(child: GameObject): integer = js.native
  /**
    * Returns a random Game Object from this Container.
    * @param startIndex An optional start index. Default 0.
    * @param length An optional length, the total number of elements (from the startIndex) to choose from.
    */
  def getRandom(): GameObject = js.native
  def getRandom(startIndex: integer): GameObject = js.native
  def getRandom(startIndex: integer, length: integer): GameObject = js.native
  /**
    * Passes all Game Objects in this Container to the given callback.
    * 
    * Only use this method when you absolutely know that the Container will not be modified during
    * the iteration, i.e. by removing or adding to its contents.
    * @param callback The function to call.
    * @param context Value to use as `this` when executing callback.
    * @param args Additional arguments that will be passed to the callback, after the child.
    */
  def iterate(callback: js.Function): Container = js.native
  def iterate(callback: js.Function, context: js.Object, args: js.Any*): Container = js.native
  /**
    * Moves the given Game Object down one place in this Container, unless it's already at the bottom.
    * @param child The Game Object to be moved in the Container.
    */
  def moveDown(child: GameObject): Container = js.native
  /**
    * Moves a Game Object to a new position within this Container.
    * 
    * The Game Object must already be a child of this Container.
    * 
    * The Game Object is removed from its old position and inserted into the new one.
    * Therefore the Container size does not change. Other children will change position accordingly.
    * @param child The Game Object to move.
    * @param index The new position of the Game Object in this Container.
    */
  def moveTo(child: GameObject, index: integer): Container = js.native
  /**
    * Moves the given Game Object up one place in this Container, unless it's already at the top.
    * @param child The Game Object to be moved in the Container.
    */
  def moveUp(child: GameObject): Container = js.native
  /**
    * Takes a Point-like object, such as a Vector2, Geom.Point or object with public x and y properties,
    * and transforms it into the space of this Container, then returns it in the output object.
    * @param source The Source Point to be transformed.
    * @param output A destination object to store the transformed point in. If none given a Vector2 will be created and returned.
    */
  def pointToContainer(source: js.Object): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: js.Object, output: js.Object): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: js.Object, output: Point): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: js.Object, output: Vector2): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: Point): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: Point, output: js.Object): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: Point, output: Point): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: Point, output: Vector2): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: Vector2): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: Vector2, output: js.Object): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: Vector2, output: Point): js.Object | Point | Vector2 = js.native
  def pointToContainer(source: Vector2, output: Vector2): js.Object | Point | Vector2 = js.native
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): Unit = js.native
  def remove(child: js.Array[GameObject]): Container = js.native
  def remove(child: js.Array[GameObject], destroyChild: Boolean): Container = js.native
  /**
    * Removes the given Game Object, or array of Game Objects, from this Container.
    * 
    * The Game Objects must already be children of this Container.
    * 
    * You can also optionally call `destroy` on each Game Object that is removed from the Container.
    * @param child The Game Object, or array of Game Objects, to be removed from the Container.
    * @param destroyChild Optionally call `destroy` on each child successfully removed from this Container. Default false.
    */
  def remove(child: GameObject): Container = js.native
  def remove(child: GameObject, destroyChild: Boolean): Container = js.native
  /**
    * Removes all Game Objects from this Container.
    * 
    * You can also optionally call `destroy` on each Game Object that is removed from the Container.
    * @param destroyChild Optionally call `destroy` on each Game Object successfully removed from this Container. Default false.
    */
  def removeAll(): Container = js.native
  def removeAll(destroyChild: Boolean): Container = js.native
  /**
    * Removes the Game Object at the given position in this Container.
    * 
    * You can also optionally call `destroy` on the Game Object, if one is found.
    * @param index The index of the Game Object to be removed.
    * @param destroyChild Optionally call `destroy` on the Game Object if successfully removed from this Container. Default false.
    */
  def removeAt(index: integer): Container = js.native
  def removeAt(index: integer, destroyChild: Boolean): Container = js.native
  /**
    * Removes the Game Objects between the given positions in this Container.
    * 
    * You can also optionally call `destroy` on each Game Object that is removed from the Container.
    * @param startIndex An optional start index to search from. Default 0.
    * @param endIndex An optional end index to search up to (but not included) Default Container.length.
    * @param destroyChild Optionally call `destroy` on each Game Object successfully removed from this Container. Default false.
    */
  def removeBetween(): Container = js.native
  def removeBetween(startIndex: integer): Container = js.native
  def removeBetween(startIndex: integer, endIndex: integer): Container = js.native
  def removeBetween(startIndex: integer, endIndex: integer, destroyChild: Boolean): Container = js.native
  /**
    * Replaces a Game Object in this Container with the new Game Object.
    * The new Game Object cannot already be a child of this Container.
    * @param oldChild The Game Object in this Container that will be replaced.
    * @param newChild The Game Object to be added to this Container.
    * @param destroyChild Optionally call `destroy` on the Game Object if successfully removed from this Container. Default false.
    */
  def replace(oldChild: GameObject, newChild: GameObject): Container = js.native
  def replace(oldChild: GameObject, newChild: GameObject, destroyChild: Boolean): Container = js.native
  /**
    * Reverses the order of all Game Objects in this Container.
    */
  def reverse(): Container = js.native
  /**
    * Sends the given Game Object to the bottom of this Container.
    * This will cause it to render below any other objects in the Container.
    * @param child The Game Object to send to the bottom of the Container.
    */
  def sendToBack(child: GameObject): Container = js.native
  /**
    * Sets the property to the given value on all Game Objects in this Container.
    * 
    * Optionally you can specify a start and end index. For example if this Container had 100 Game Objects,
    * and you set `startIndex` to 0 and `endIndex` to 50, it would return matches from only
    * the first 50 Game Objects.
    * @param property The property that must exist on the Game Object.
    * @param value The value to get the property to.
    * @param startIndex An optional start index to search from. Default 0.
    * @param endIndex An optional end index to search up to (but not included) Default Container.length.
    */
  def setAll(property: String, value: js.Any): Container = js.native
  def setAll(property: String, value: js.Any, startIndex: integer): Container = js.native
  def setAll(property: String, value: js.Any, startIndex: integer, endIndex: integer): Container = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: integer): this.type = js.native
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setDisplaySize(width: Double, height: Double): this.type = js.native
  /**
    * Does this Container exclusively manage its children?
    * 
    * The default is `true` which means a child added to this Container cannot
    * belong in another Container, which includes the Scene display list.
    * 
    * If you disable this then this Container will no longer exclusively manage its children.
    * This allows you to create all kinds of interesting graphical effects, such as replicating
    * Game Objects without reparenting them all over the Scene.
    * However, doing so will prevent children from receiving any kind of input event or have
    * their physics bodies work by default, as they're no longer a single entity on the
    * display list, but are being replicated where-ever this Container is.
    * @param value The exclusive state of this Container. Default true.
    */
  def setExclusive(): Container = js.native
  def setExclusive(value: Boolean): Container = js.native
  /**
    * Sets the scroll factor of this Container and optionally all of its children.
    * 
    * The scroll factor controls the influence of the movement of a Camera upon this Game Object.
    * 
    * When a camera scrolls it will change the location at which this Game Object is rendered on-screen.
    * It does not change the Game Objects actual position values.
    * 
    * A value of 1 means it will move exactly in sync with a camera.
    * A value of 0 means it will not move at all, even if the camera moves.
    * Other values control the degree to which the camera movement is mapped to this Game Object.
    * 
    * Please be aware that scroll factor values other than 1 are not taken in to consideration when
    * calculating physics collisions. Bodies always collide based on their world position, but changing
    * the scroll factor is a visual adjustment to where the textures are rendered, which can offset
    * them from physics bodies if not accounted for in your code.
    * @param x The horizontal scroll factor of this Game Object.
    * @param y The vertical scroll factor of this Game Object. If not set it will use the `x` value. Default x.
    * @param updateChildren Apply this scrollFactor to all Container children as well? Default false.
    */
  def setScrollFactor(x: Double): this.type = js.native
  def setScrollFactor(x: Double, y: Double): this.type = js.native
  def setScrollFactor(x: Double, y: Double, updateChildren: Boolean): this.type = js.native
  /**
    * Sets the internal size of this Game Object, as used for frame or physics body creation.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setSize(width: Double, height: Double): this.type = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  /**
    * Shuffles the all Game Objects in this Container using the Fisher-Yates implementation.
    */
  def shuffle(): Container = js.native
  /**
    * Sort the contents of this Container so the items are in order based on the given property.
    * For example: `sort('alpha')` would sort the elements based on the value of their `alpha` property.
    * @param property The property to lexically sort by.
    * @param handler Provide your own custom handler function. Will receive 2 children which it should compare and return a boolean.
    */
  def sort(property: String): Container = js.native
  def sort(property: String, handler: js.Function): Container = js.native
  /**
    * Swaps the position of two Game Objects in this Container.
    * Both Game Objects must belong to this Container.
    * @param child1 The first Game Object to swap.
    * @param child2 The second Game Object to swap.
    */
  def swap(child1: GameObject, child2: GameObject): Container = js.native
}

