package typings.phaser.Phaser

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.EachListCallback
import typings.phaser.EachMapCallback
import typings.phaser.EachSetCallback
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Structs.List
import typings.phaser.Phaser.Structs.Map
import typings.phaser.Phaser.Structs.ProcessQueue
import typings.phaser.Phaser.Structs.Set
import typings.phaser.Phaser.Structs.Size
import typings.phaser.integer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Structs")
@js.native
object Structs extends js.Object {
  /**
    * List is a generic implementation of an ordered list which contains utility methods for retrieving, manipulating, and iterating items.
    */
  @js.native
  class List[T] protected () extends js.Object {
    /**
      * 
      * @param parent The parent of this list.
      */
    def this(parent: js.Any) = this()
    /**
      * The property key to sort by.
      */
    var _sortKey: String = js.native
    /**
      * A callback that is invoked every time a child is added to this list.
      */
    var addCallback: js.Function = js.native
    /**
      * The first item in the List or `null` for an empty List.
      */
    val first: T = js.native
    /**
      * The last item in the List, or `null` for an empty List.
      */
    val last: T = js.native
    /**
      * The number of items inside the List.
      */
    val length: integer = js.native
    /**
      * The objects that belong to this collection.
      */
    var list: js.Array[T] = js.native
    /**
      * The next item in the List, or `null` if the entire List has been traversed.
      * 
      * This property can be read successively after reading {@link #first} or manually setting the {@link #position} to iterate the List.
      */
    val next: T = js.native
    /**
      * The parent of this list.
      */
    var parent: js.Any = js.native
    /**
      * The index of the current element.
      * 
      * This is used internally when iterating through the list with the {@link #first}, {@link #last}, {@link #get}, and {@link #previous} properties.
      */
    var position: integer = js.native
    /**
      * The previous item in the List, or `null` if the entire List has been traversed.
      * 
      * This property can be read successively after reading {@link #last} or manually setting the {@link #position} to iterate the List backwards.
      */
    val previous: T = js.native
    /**
      * A callback that is invoked every time a child is removed from this list.
      */
    var removeCallback: js.Function = js.native
    /**
      * Adds the given item to the end of the list. Each item must be unique.
      * @param child The item, or array of items, to add to the list.
      * @param skipCallback Skip calling the List.addCallback if this child is added successfully. Default false.
      */
    def add(child: T): T = js.native
    def add(child: T, skipCallback: Boolean): T = js.native
    /**
      * Adds an item to list, starting at a specified index. Each item must be unique within the list.
      * @param child The item, or array of items, to add to the list.
      * @param index The index in the list at which the element(s) will be inserted. Default 0.
      * @param skipCallback Skip calling the List.addCallback if this child is added successfully. Default false.
      */
    def addAt(child: T): T = js.native
    def addAt(child: T, index: integer): T = js.native
    def addAt(child: T, index: integer, skipCallback: Boolean): T = js.native
    /**
      * Brings the given child to the top of this List.
      * @param child The item to bring to the top of the List.
      */
    def bringToTop(child: T): T = js.native
    /**
      * Returns the total number of items in the List which have a property matching the given value.
      * @param property The property to test on each item.
      * @param value The value to test the property against.
      */
    def count(property: String, value: T): integer = js.native
    /**
      * Destroys this List.
      */
    def destroy(): Unit = js.native
    /**
      * Passes all children to the given callback.
      * @param callback The function to call.
      * @param context Value to use as `this` when executing callback.
      * @param args Additional arguments that will be passed to the callback, after the child.
      */
    def each(callback: EachListCallback[T]): Unit = js.native
    def each(callback: EachListCallback[T], context: js.Any, args: js.Any*): Unit = js.native
    /**
      * Checks if an item exists within the List.
      * @param child The item to check for the existence of.
      */
    def exists(child: T): Boolean = js.native
    /**
      * Returns all children in this List.
      * 
      * You can optionally specify a matching criteria using the `property` and `value` arguments.
      * 
      * For example: `getAll('parent')` would return only children that have a property called `parent`.
      * 
      * You can also specify a value to compare the property to:
      * 
      * `getAll('visible', true)` would return only children that have their visible property set to `true`.
      * 
      * Optionally you can specify a start and end index. For example if this List had 100 children,
      * and you set `startIndex` to 0 and `endIndex` to 50, it would return matches from only
      * the first 50 children in the List.
      * @param property An optional property to test against the value argument.
      * @param value If property is set then Child.property must strictly equal this value to be included in the results.
      * @param startIndex The first child index to start the search from.
      * @param endIndex The last child index to search up until.
      */
    def getAll(): js.Array[T] = js.native
    def getAll(property: String): js.Array[T] = js.native
    def getAll(property: String, value: T): js.Array[T] = js.native
    def getAll(property: String, value: T, startIndex: integer): js.Array[T] = js.native
    def getAll(property: String, value: T, startIndex: integer, endIndex: integer): js.Array[T] = js.native
    /**
      * Retrieves the item at a given position inside the List.
      * @param index The index of the item.
      */
    def getAt(index: integer): T = js.native
    /**
      * Searches for the first instance of a child with its `name`
      * property matching the given argument. Should more than one child have
      * the same name only the first is returned.
      * @param name The name to search for.
      */
    def getByName(name: String): T | Null = js.native
    /**
      * Returns the first element in a given part of the List which matches a specific criterion.
      * @param property The name of the property to test or a falsey value to have no criterion.
      * @param value The value to test the `property` against, or `undefined` to allow any value and only check for existence.
      * @param startIndex The position in the List to start the search at. Default 0.
      * @param endIndex The position in the List to optionally stop the search at. It won't be checked.
      */
    def getFirst(property: String, value: js.Any): T | Null = js.native
    def getFirst(property: String, value: js.Any, startIndex: Double): T | Null = js.native
    def getFirst(property: String, value: js.Any, startIndex: Double, endIndex: Double): T | Null = js.native
    /**
      * Locates an item within the List and returns its index.
      * @param child The item to locate.
      */
    def getIndex(child: T): integer = js.native
    /**
      * Returns a random child from the group.
      * @param startIndex Offset from the front of the group (lowest child). Default 0.
      * @param length Restriction on the number of values you want to randomly select from. Default (to top).
      */
    def getRandom(): T | Null = js.native
    def getRandom(startIndex: integer): T | Null = js.native
    def getRandom(startIndex: integer, length: integer): T | Null = js.native
    /**
      * Moves the given child down one place in this group unless it's already at the bottom.
      * @param child The item to move down.
      */
    def moveDown(child: T): T = js.native
    /**
      * Moves an item in the List to a new position.
      * @param child The item to move.
      * @param index Moves an item in the List to a new position.
      */
    def moveTo(child: T, index: integer): T = js.native
    /**
      * Moves the given child up one place in this group unless it's already at the top.
      * @param child The item to move up.
      */
    def moveUp(child: T): T = js.native
    /**
      * Removes one or many items from the List.
      * @param child The item, or array of items, to remove.
      * @param skipCallback Skip calling the List.removeCallback. Default false.
      */
    def remove(child: T): T = js.native
    def remove(child: T, skipCallback: Boolean): T = js.native
    /**
      * Removes all the items.
      * @param skipCallback Skip calling the List.removeCallback. Default false.
      */
    def removeAll(): List[T] = js.native
    def removeAll(skipCallback: Boolean): List[T] = js.native
    /**
      * Removes the item at the given position in the List.
      * @param index The position to remove the item from.
      * @param skipCallback Skip calling the List.removeCallback. Default false.
      */
    def removeAt(index: integer): T = js.native
    def removeAt(index: integer, skipCallback: Boolean): T = js.native
    /**
      * Removes the items within the given range in the List.
      * @param startIndex The index to start removing from. Default 0.
      * @param endIndex The position to stop removing at. The item at this position won't be removed.
      * @param skipCallback Skip calling the List.removeCallback. Default false.
      */
    def removeBetween(): js.Array[T] = js.native
    def removeBetween(startIndex: integer): js.Array[T] = js.native
    def removeBetween(startIndex: integer, endIndex: integer): js.Array[T] = js.native
    def removeBetween(startIndex: integer, endIndex: integer, skipCallback: Boolean): js.Array[T] = js.native
    /**
      * Replaces a child of this List with the given newChild. The newChild cannot be a member of this List.
      * @param oldChild The child in this List that will be replaced.
      * @param newChild The child to be inserted into this List.
      */
    def replace(oldChild: T, newChild: T): T = js.native
    /**
      * Reverses the order of all children in this List.
      */
    def reverse(): List[T] = js.native
    /**
      * Sends the given child to the bottom of this List.
      * @param child The item to send to the back of the list.
      */
    def sendToBack(child: T): T = js.native
    /**
      * Sets the property `key` to the given value on all members of this List.
      * @param property The name of the property to set.
      * @param value The value to set the property to.
      * @param startIndex The first child index to start the search from.
      * @param endIndex The last child index to search up until.
      */
    def setAll(property: String, value: T): Unit = js.native
    def setAll(property: String, value: T, startIndex: integer): Unit = js.native
    def setAll(property: String, value: T, startIndex: integer, endIndex: integer): Unit = js.native
    /**
      * Shuffles the items in the list.
      */
    def shuffle(): List[T] = js.native
    /**
      * Clears the List and recreates its internal array.
      */
    def shutdown(): Unit = js.native
    /**
      * Sort the contents of this List so the items are in order based on the given property.
      * For example, `sort('alpha')` would sort the List contents based on the value of their `alpha` property.
      * @param property The property to lexically sort by.
      * @param handler Provide your own custom handler function. Will receive 2 children which it should compare and return a boolean.
      */
    def sort(property: String): js.Array[T] = js.native
    def sort(property: String, handler: js.Function): js.Array[T] = js.native
    /**
      * Swaps the positions of two items in the list.
      * @param child1 The first item to swap.
      * @param child2 The second item to swap.
      */
    def swap(child1: T, child2: T): Unit = js.native
  }
  
  /**
    * The keys of a Map can be arbitrary values.
    * 
    * ```javascript
    * var map = new Map([
    *    [ 1, 'one' ],
    *    [ 2, 'two' ],
    *    [ 3, 'three' ]
    * ]);
    * ```
    */
  @js.native
  class Map[K, V] protected () extends js.Object {
    /**
      * 
      * @param elements An optional array of key-value pairs to populate this Map with.
      */
    def this(elements: js.Array[V]) = this()
    /**
      * The entries in this Map.
      */
    var entries: StringDictionary[V] = js.native
    /**
      * The number of key / value pairs in this Map.
      */
    var size: Double = js.native
    /**
      * Delete all entries from this Map.
      */
    def clear(): Map[K, V] = js.native
    /**
      * Returns `true` if the value exists within this Map. Otherwise, returns `false`.
      * @param value The value to search for.
      */
    def contains(value: V): Boolean = js.native
    /**
      * Delete the specified element from this Map.
      * @param key The key of the element to delete from this Map.
      */
    def delete(key: K): Map[K, V] = js.native
    /**
      * Dumps the contents of this Map to the console via `console.group`.
      */
    def dump(): Unit = js.native
    /**
      * Passes all entries in this Map to the given callback.
      * @param callback The callback which will receive the keys and entries held in this Map.
      */
    def each(callback: EachMapCallback[V]): Map[K, V] = js.native
    /**
      * Returns the value associated to the `key`, or `undefined` if there is none.
      * @param key The key of the element to return from the `Map` object.
      */
    def get(key: K): V = js.native
    /**
      * Returns an `Array` of all the values stored in this Map.
      */
    def getArray(): js.Array[V] = js.native
    /**
      * Returns a boolean indicating whether an element with the specified key exists or not.
      * @param key The key of the element to test for presence of in this Map.
      */
    def has(key: K): Boolean = js.native
    /**
      * Returns all entries keys in this Map.
      */
    def keys(): js.Array[K] = js.native
    /**
      * Merges all new keys from the given Map into this one.
      * If it encounters a key that already exists it will be skipped unless override is set to `true`.
      * @param map The Map to merge in to this Map.
      * @param override Set to `true` to replace values in this Map with those from the source map, or `false` to skip them. Default false.
      */
    def merge(map: Map[K, V]): Map[K, V] = js.native
    def merge(map: Map[K, V], `override`: Boolean): Map[K, V] = js.native
    /**
      * Adds an element with a specified `key` and `value` to this Map.
      * If the `key` already exists, the value will be replaced.
      * @param key The key of the element to be added to this Map.
      * @param value The value of the element to be added to this Map.
      */
    def set(key: K, value: V): Map[K, V] = js.native
    /**
      * Returns an `Array` of all entries.
      */
    def values(): js.Array[V] = js.native
  }
  
  /**
    * A Process Queue maintains three internal lists.
    * 
    * The `pending` list is a selection of items which are due to be made 'active' in the next update.
    * The `active` list is a selection of items which are considered active and should be updated.
    * The `destroy` list is a selection of items that were active and are awaiting being destroyed in the next update.
    * 
    * When new items are added to a Process Queue they are put in the pending list, rather than being added
    * immediately the active list. Equally, items that are removed are put into the destroy list, rather than
    * being destroyed immediately. This allows the Process Queue to carefully process each item at a specific, fixed
    * time, rather than at the time of the request from the API.
    */
  @js.native
  class ProcessQueue[T] () extends EventEmitter {
    /**
      * The number of entries in the active list.
      */
    val length: integer = js.native
    /**
      * Adds a new item to the Process Queue.
      * 
      * The item is added to the pending list and made active in the next update.
      * @param item The item to add to the queue.
      */
    def add(item: T): ProcessQueue[T] = js.native
    /**
      * Returns the current list of active items.
      * 
      * This method returns a reference to the active list array, not a copy of it.
      * Therefore, be careful to not modify this array outside of the ProcessQueue.
      */
    def getActive(): js.Array[T] = js.native
    /**
      * Removes an item from the Process Queue.
      * 
      * The item is added to the pending destroy and fully removed in the next update.
      * @param item The item to be removed from the queue.
      */
    def remove(item: T): ProcessQueue[T] = js.native
    /**
      * Removes all active items from this Process Queue.
      * 
      * All the items are marked as 'pending destroy' and fully removed in the next update.
      */
    def removeAll(): this.type = js.native
    /**
      * Update this queue. First it will process any items awaiting destruction, and remove them.
      * 
      * Then it will check to see if there are any items pending insertion, and move them to an
      * active state. Finally, it will return a list of active items for further processing.
      */
    def update(): js.Array[T] = js.native
  }
  
  /**
    * RBush is a high-performance JavaScript library for 2D spatial indexing of points and rectangles.
    * It's based on an optimized R-tree data structure with bulk insertion support.
    * 
    * Spatial index is a special data structure for points and rectangles that allows you to perform queries like
    * "all items within this bounding box" very efficiently (e.g. hundreds of times faster than looping over all items).
    * 
    * This version of RBush uses a fixed min/max accessor structure of `[ '.left', '.top', '.right', '.bottom' ]`.
    * This is to avoid the eval like function creation that the original library used, which caused CSP policy violations.
    * 
    * rbush is forked from https://github.com/mourner/rbush by Vladimir Agafonkin
    */
  @js.native
  class RTree () extends js.Object
  
  /**
    * A Set is a collection of unique elements.
    */
  @js.native
  /**
    * 
    * @param elements An optional array of elements to insert into this Set.
    */
  class Set[T] () extends js.Object {
    def this(elements: js.Array[T]) = this()
    /**
      * The entries of this Set. Stored internally as an array.
      */
    var entries: js.Array[T] = js.native
    /**
      * The size of this Set. This is the number of entries within it.
      * Changing the size will truncate the Set if the given value is smaller than the current size.
      * Increasing the size larger than the current size has no effect.
      */
    var size: integer = js.native
    /**
      * Clears this Set so that it no longer contains any values.
      */
    def clear(): Set[T] = js.native
    /**
      * Returns `true` if this Set contains the given value, otherwise returns `false`.
      * @param value The value to check for in this Set.
      */
    def contains(value: T): Boolean = js.native
    /**
      * Removes the given value from this Set if this Set contains that value.
      * @param value The value to remove from the Set.
      */
    def delete(value: T): Set[T] = js.native
    /**
      * Returns a new Set containing all the values in this Set which are *not* also in the given Set.
      * @param set The Set to perform the difference with.
      */
    def difference(set: Set[T]): Set[T] = js.native
    /**
      * Dumps the contents of this Set to the console via `console.group`.
      */
    def dump(): Unit = js.native
    /**
      * Passes each value in this Set to the given callback.
      * Use this function when you know this Set will be modified during the iteration, otherwise use `iterate`.
      * @param callback The callback to be invoked and passed each value this Set contains.
      * @param callbackScope The scope of the callback.
      */
    def each(callback: EachSetCallback[T]): Set[T] = js.native
    def each(callback: EachSetCallback[T], callbackScope: js.Any): Set[T] = js.native
    /**
      * Get an element of this Set which has a property of the specified name, if that property is equal to the specified value.
      * If no elements of this Set satisfy the condition then this method will return `null`.
      * @param property The property name to check on the elements of this Set.
      * @param value The value to check for.
      */
    def get(property: String, value: T): T = js.native
    /**
      * Returns an array containing all the values in this Set.
      */
    def getArray(): js.Array[T] = js.native
    /**
      * Returns a new Set that contains only the values which are in this Set and that are also in the given Set.
      * @param set The Set to intersect this set with.
      */
    def intersect(set: Set[T]): Set[T] = js.native
    /**
      * Passes each value in this Set to the given callback.
      * For when you absolutely know this Set won't be modified during the iteration.
      * @param callback The callback to be invoked and passed each value this Set contains.
      * @param callbackScope The scope of the callback.
      */
    def iterate(callback: EachSetCallback[T]): Set[T] = js.native
    def iterate(callback: EachSetCallback[T], callbackScope: js.Any): Set[T] = js.native
    /**
      * Goes through each entry in this Set and invokes the given function on them, passing in the arguments.
      * @param callbackKey The key of the function to be invoked on each Set entry.
      * @param args Additional arguments that will be passed to the callback, after the child.
      */
    def iterateLocal(callbackKey: String, args: js.Any*): Set[T] = js.native
    /**
      * Inserts the provided value into this Set. If the value is already contained in this Set this method will have no effect.
      * @param value The value to insert into this Set.
      */
    def set(value: T): Set[T] = js.native
    /**
      * Returns a new Set containing all values that are either in this Set or in the Set provided as an argument.
      * @param set The Set to perform the union with.
      */
    def union(set: Set[T]): Set[T] = js.native
  }
  
  /**
    * The Size component allows you to set `width` and `height` properties and define the relationship between them.
    * 
    * The component can automatically maintain the aspect ratios between the two values, and clamp them
    * to a defined min-max range. You can also control the dominant axis. When dimensions are given to the Size component
    * that would cause it to exceed its min-max range, the dimensions are adjusted based on the dominant axis.
    */
  @js.native
  /**
    * 
    * @param width The width of the Size component. Default 0.
    * @param height The height of the Size component. If not given, it will use the `width`. Default width.
    * @param aspectMode The aspect mode of the Size component. Defaults to 0, no mode. Default 0.
    * @param parent The parent of this Size component. Can be any object with public `width` and `height` properties. Dimensions are clamped to keep them within the parent bounds where possible. Default null.
    */
  class Size () extends js.Object {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, aspectMode: integer) = this()
    def this(width: Double, height: Double, aspectMode: integer, parent: js.Any) = this()
    /**
      * The aspect mode this Size component will use when calculating its dimensions.
      * This property is read-only. To change it use the `setAspectMode` method.
      */
    val aspectMode: integer = js.native
    /**
      * The proportional relationship between the width and height.
      * 
      * This property is read-only and is updated automatically when either the `width` or `height` properties are changed,
      * depending on the aspect mode.
      */
    val aspectRatio: Double = js.native
    /**
      * The height of this Size component.
      * 
      * This value is clamped to the range specified by `minHeight` and `maxHeight`, if enabled.
      * 
      * A height can never be less than zero.
      * 
      * Changing this value will automatically update the `width` if the aspect ratio lock is enabled.
      * You can also use the `setHeight` and `getHeight` methods.
      */
    var height: Double = js.native
    /**
      * The maximum allowed height.
      * This value is read-only. To change it see the `setMax` method.
      */
    val maxHeight: Double = js.native
    /**
      * The maximum allowed width.
      * This value is read-only. To change it see the `setMax` method.
      */
    val maxWidth: Double = js.native
    /**
      * The minimum allowed height.
      * Cannot be less than zero.
      * This value is read-only. To change it see the `setMin` method.
      */
    val minHeight: Double = js.native
    /**
      * The minimum allowed width.
      * Cannot be less than zero.
      * This value is read-only. To change it see the `setMin` method.
      */
    val minWidth: Double = js.native
    /**
      * A Vector2 containing the horizontal and vertical snap values, which the width and height are snapped to during resizing.
      * 
      * By default this is disabled.
      * 
      * This property is read-only. To change it see the `setSnap` method.
      */
    val snapTo: Vector2 = js.native
    /**
      * The width of this Size component.
      * 
      * This value is clamped to the range specified by `minWidth` and `maxWidth`, if enabled.
      * 
      * A width can never be less than zero.
      * 
      * Changing this value will automatically update the `height` if the aspect ratio lock is enabled.
      * You can also use the `setWidth` and `getWidth` methods.
      */
    var width: Double = js.native
    /**
      * The current `width` and `height` are adjusted to fit inside the given dimensions, while keeping the aspect ratio.
      * 
      * If `fit` is true there may be some space inside the target area which is not covered if its aspect ratio differs.
      * If `fit` is false the size may extend further out than the target area if the aspect ratios differ.
      * 
      * If this Size component has a parent set, then the width and height passed to this method will be clamped so
      * it cannot exceed that of the parent.
      * @param width The new width of the Size component. Default 0.
      * @param height The new height of the Size component. If not given, it will use the width value.
      * @param fit Perform a `fit` (true) constraint, or an `envelop` (false) constraint. Default true.
      */
    def constrain(): this.type = js.native
    def constrain(width: Double): this.type = js.native
    def constrain(width: Double, height: Double): this.type = js.native
    def constrain(width: Double, height: Double, fit: Boolean): this.type = js.native
    /**
      * Copies the aspect mode, aspect ratio, width and height from this Size component
      * to the given Size component. Note that the parent, if set, is not copied across.
      * @param destination The Size component to copy the values to.
      */
    def copy(destination: Size): Size = js.native
    /**
      * Destroys this Size component.
      * 
      * This clears the local properties and any parent object, if set.
      * 
      * A destroyed Size component cannot be re-used.
      */
    def destroy(): Unit = js.native
    /**
      * The current `width` and `height` are adjusted so that they fully envlop the given dimensions, while keeping the aspect ratio.
      * 
      * The size may extend further out than the target area if the aspect ratios differ.
      * 
      * If this Size component has a parent set, then the values are clamped so that it never exceeds the parent
      * on the longest axis.
      * @param width The new width of the Size component. Default 0.
      * @param height The new height of the Size component. If not given, it will use the width value.
      */
    def envelop(): this.type = js.native
    def envelop(width: Double): this.type = js.native
    def envelop(width: Double, height: Double): this.type = js.native
    /**
      * The current `width` and `height` are adjusted to fit inside the given dimensions, while keeping the aspect ratio.
      * 
      * There may be some space inside the target area which is not covered if its aspect ratio differs.
      * 
      * If this Size component has a parent set, then the width and height passed to this method will be clamped so
      * it cannot exceed that of the parent.
      * @param width The new width of the Size component. Default 0.
      * @param height The new height of the Size component. If not given, it will use the width value.
      */
    def fitTo(): this.type = js.native
    def fitTo(width: Double): this.type = js.native
    def fitTo(width: Double, height: Double): this.type = js.native
    /**
      * Takes a new height and passes it through the min/max clamp and then checks it doesn't exceed the parent height.
      * @param value The value to clamp and check.
      * @param checkParent Check the given value against the parent, if set. Default true.
      */
    def getNewHeight(value: Double): Double = js.native
    def getNewHeight(value: Double, checkParent: Boolean): Double = js.native
    /**
      * Takes a new width and passes it through the min/max clamp and then checks it doesn't exceed the parent width.
      * @param value The value to clamp and check.
      * @param checkParent Check the given value against the parent, if set. Default true.
      */
    def getNewWidth(value: Double): Double = js.native
    def getNewWidth(value: Double, checkParent: Boolean): Double = js.native
    /**
      * Sets a new width and height for this Size component and updates the aspect ratio based on them.
      * 
      * It _doesn't_ change the `aspectMode` and still factors in size limits such as the min max and parent bounds.
      * @param width The new width of the Size component.
      * @param height The new height of the Size component. If not given, it will use the `width`. Default width.
      */
    def resize(width: Double): this.type = js.native
    def resize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the aspect mode of this Size component.
      * 
      * The aspect mode controls what happens when you modify the `width` or `height` properties, or call `setSize`.
      * 
      * It can be a number from 0 to 4, or a Size constant:
      * 
      * 0. NONE = Do not make the size fit the aspect ratio. Change the ratio when the size changes.
      * 1. WIDTH_CONTROLS_HEIGHT = The height is automatically adjusted based on the width.
      * 2. HEIGHT_CONTROLS_WIDTH = The width is automatically adjusted based on the height.
      * 3. FIT = The width and height are automatically adjusted to fit inside the given target area, while keeping the aspect ratio. Depending on the aspect ratio there may be some space inside the area which is not covered.
      * 4. ENVELOP = The width and height are automatically adjusted to make the size cover the entire target area while keeping the aspect ratio. This may extend further out than the target size.
      * 
      * Calling this method automatically recalculates the `width` and the `height`, if required.
      * @param value The aspect mode value. Default 0.
      */
    def setAspectMode(): this.type = js.native
    def setAspectMode(value: integer): this.type = js.native
    /**
      * Sets a new aspect ratio, overriding what was there previously.
      * 
      * It then calls `setSize` immediately using the current dimensions.
      * @param ratio The new aspect ratio.
      */
    def setAspectRatio(ratio: Double): this.type = js.native
    /**
      * Sets the values of this Size component to the `element.style.width` and `height`
      * properties of the given DOM Element. The properties are set as `px` values.
      * @param element The DOM Element to set the CSS style on.
      */
    def setCSS(element: HTMLElement): Unit = js.native
    /**
      * Sets the height of this Size component.
      * 
      * Depending on the aspect mode, changing the height may also update the width and aspect ratio.
      * @param height The new height of the Size component.
      */
    def setHeight(height: Double): this.type = js.native
    /**
      * Set the maximum width and height values this Size component will allow.
      * 
      * Setting this will automatically adjust both the `width` and `height` properties to ensure they are within range.
      * 
      * Note that based on the aspect mode, and if this Size component has a parent set or not, the maximums set here
      * _can_ be exceed in some situations.
      * @param width The maximum allowed width of the Size component. Default Number.MAX_VALUE.
      * @param height The maximum allowed height of the Size component. If not given, it will use the `width`. Default width.
      */
    def setMax(): this.type = js.native
    def setMax(width: Double): this.type = js.native
    def setMax(width: Double, height: Double): this.type = js.native
    /**
      * Set the minimum width and height values this Size component will allow.
      * 
      * The minimum values can never be below zero, or greater than the maximum values.
      * 
      * Setting this will automatically adjust both the `width` and `height` properties to ensure they are within range.
      * 
      * Note that based on the aspect mode, and if this Size component has a parent set or not, the minimums set here
      * _can_ be exceed in some situations.
      * @param width The minimum allowed width of the Size component. Default 0.
      * @param height The minimum allowed height of the Size component. If not given, it will use the `width`. Default width.
      */
    def setMin(): this.type = js.native
    def setMin(width: Double): this.type = js.native
    def setMin(width: Double, height: Double): this.type = js.native
    /**
      * Sets, or clears, the parent of this Size component.
      * 
      * To clear the parent call this method with no arguments.
      * 
      * The parent influences the maximum extents to which this Size compoent can expand,
      * based on the aspect mode:
      * 
      * NONE - The parent clamps both the width and height.
      * WIDTH_CONTROLS_HEIGHT - The parent clamps just the width.
      * HEIGHT_CONTROLS_WIDTH - The parent clamps just the height.
      * FIT - The parent clamps whichever axis is required to ensure the size fits within it.
      * ENVELOP - The parent is used to ensure the size fully envelops the parent.
      * 
      * Calling this method automatically calls `setSize`.
      * @param parent Sets the parent of this Size component. Don't provide a value to clear an existing parent.
      */
    def setParent(): this.type = js.native
    def setParent(parent: js.Any): this.type = js.native
    /**
      * Sets the width and height of this Size component based on the aspect mode.
      * 
      * If the aspect mode is 'none' then calling this method will change the aspect ratio, otherwise the current
      * aspect ratio is honored across all other modes.
      * 
      * If snapTo values have been set then the given width and height are snapped first, prior to any further
      * adjustment via min/max values, or a parent.
      * 
      * If minimum and/or maximum dimensions have been specified, the values given to this method will be clamped into
      * that range prior to adjustment, but may still exceed them depending on the aspect mode.
      * 
      * If this Size component has a parent set, and the aspect mode is `fit` or `envelop`, then the given sizes will
      * be clamped to the range specified by the parent.
      * @param width The new width of the Size component. Default 0.
      * @param height The new height of the Size component. If not given, it will use the `width`. Default width.
      */
    def setSize(): this.type = js.native
    def setSize(width: Double): this.type = js.native
    def setSize(width: Double, height: Double): this.type = js.native
    /**
      * By setting a Snap To value when this Size component is modified its dimensions will automatically
      * by snapped to the nearest grid slice, using floor. For example, if you have snap value of 16,
      * and the width changes to 68, then it will snap down to 64 (the closest multiple of 16 when floored)
      * 
      * Note that snapping takes place before adjustments by the parent, or the min / max settings. If these
      * values are not multiples of the given snap values, then this can result in un-snapped dimensions.
      * 
      * Call this method with no arguments to reset the snap values.
      * 
      * Calling this method automatically recalculates the `width` and the `height`, if required.
      * @param snapWidth The amount to snap the width to. If you don't want to snap the width, pass a value of zero. Default 0.
      * @param snapHeight The amount to snap the height to. If not provided it will use the `snapWidth` value. If you don't want to snap the height, pass a value of zero. Default snapWidth.
      */
    def setSnap(): this.type = js.native
    def setSnap(snapWidth: Double): this.type = js.native
    def setSnap(snapWidth: Double, snapHeight: Double): this.type = js.native
    /**
      * Sets the width of this Size component.
      * 
      * Depending on the aspect mode, changing the width may also update the height and aspect ratio.
      * @param width The new width of the Size component.
      */
    def setWidth(width: Double): this.type = js.native
  }
  
  @js.native
  object Events extends js.Object {
    /**
      * The Process Queue Add Event.
      * 
      * This event is dispatched by a Process Queue when a new item is successfully moved to its active list.
      * 
      * You will most commonly see this used by a Scene's Update List when a new Game Object has been added.
      * 
      * In that instance, listen to this event from within a Scene using: `this.sys.updateList.on('add', listener)`.
      */
    val PROCESS_QUEUE_ADD: js.Any = js.native
    /**
      * The Process Queue Remove Event.
      * 
      * This event is dispatched by a Process Queue when a new item is successfully removed from its active list.
      * 
      * You will most commonly see this used by a Scene's Update List when a Game Object has been removed.
      * 
      * In that instance, listen to this event from within a Scene using: `this.sys.updateList.on('remove', listener)`.
      */
    val PROCESS_QUEUE_REMOVE: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Size extends js.Object {
    /**
      * The width and height are automatically adjusted to make the size cover the entire target area while keeping the aspect ratio. This may extend further out than the target size.
      */
    val ENVELOP: integer = js.native
    /**
      * The width and height are automatically adjusted to fit inside the given target area, while keeping the aspect ratio. Depending on the aspect ratio there may be some space inside the area which is not covered.
      */
    val FIT: integer = js.native
    /**
      * The width is automatically adjusted based on the height.
      */
    val HEIGHT_CONTROLS_WIDTH: integer = js.native
    /**
      * Do not make the size fit the aspect ratio. Change the ratio when the size changes.
      */
    val NONE: integer = js.native
    /**
      * The height is automatically adjusted based on the width.
      */
    val WIDTH_CONTROLS_HEIGHT: integer = js.native
  }
  
}

