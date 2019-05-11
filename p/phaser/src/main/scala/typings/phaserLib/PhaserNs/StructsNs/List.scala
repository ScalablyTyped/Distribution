package typings
package phaserLib.PhaserNs.StructsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List is a generic implementation of an ordered list which contains utility methods for retrieving, manipulating, and iterating items.
  */
@JSGlobal("Phaser.Structs.List")
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
  var _sortKey: java.lang.String = js.native
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
  val length: phaserLib.integer = js.native
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
  var position: phaserLib.integer = js.native
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
  def add(child: T, skipCallback: scala.Boolean): T = js.native
  /**
    * Adds an item to list, starting at a specified index. Each item must be unique within the list.
    * @param child The item, or array of items, to add to the list.
    * @param index The index in the list at which the element(s) will be inserted. Default 0.
    * @param skipCallback Skip calling the List.addCallback if this child is added successfully. Default false.
    */
  def addAt(child: T): T = js.native
  def addAt(child: T, index: phaserLib.integer): T = js.native
  def addAt(child: T, index: phaserLib.integer, skipCallback: scala.Boolean): T = js.native
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
  def count(property: java.lang.String, value: T): phaserLib.integer = js.native
  /**
    * Destroys this List.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Passes all children to the given callback.
    * @param callback The function to call.
    * @param context Value to use as `this` when executing callback.
    * @param args Additional arguments that will be passed to the callback, after the child.
    */
  def each(callback: phaserLib.EachListCallback[T]): scala.Unit = js.native
  def each(callback: phaserLib.EachListCallback[T], context: js.Any, args: js.Any*): scala.Unit = js.native
  /**
    * Checks if an item exists within the List.
    * @param child The item to check for the existence of.
    */
  def exists(child: T): scala.Boolean = js.native
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
  def getAll(property: java.lang.String): js.Array[T] = js.native
  def getAll(property: java.lang.String, value: T): js.Array[T] = js.native
  def getAll(property: java.lang.String, value: T, startIndex: phaserLib.integer): js.Array[T] = js.native
  def getAll(property: java.lang.String, value: T, startIndex: phaserLib.integer, endIndex: phaserLib.integer): js.Array[T] = js.native
  /**
    * Retrieves the item at a given position inside the List.
    * @param index The index of the item.
    */
  def getAt(index: phaserLib.integer): T = js.native
  /**
    * Searches for the first instance of a child with its `name`
    * property matching the given argument. Should more than one child have
    * the same name only the first is returned.
    * @param name The name to search for.
    */
  def getByName(name: java.lang.String): T | scala.Null = js.native
  /**
    * Returns the first element in a given part of the List which matches a specific criterion.
    * @param property The name of the property to test or a falsey value to have no criterion.
    * @param value The value to test the `property` against, or `undefined` to allow any value and only check for existence.
    * @param startIndex The position in the List to start the search at. Default 0.
    * @param endIndex The position in the List to optionally stop the search at. It won't be checked.
    */
  def getFirst(property: java.lang.String, value: js.Any): T | scala.Null = js.native
  def getFirst(property: java.lang.String, value: js.Any, startIndex: scala.Double): T | scala.Null = js.native
  def getFirst(property: java.lang.String, value: js.Any, startIndex: scala.Double, endIndex: scala.Double): T | scala.Null = js.native
  /**
    * Locates an item within the List and returns its index.
    * @param child The item to locate.
    */
  def getIndex(child: T): phaserLib.integer = js.native
  /**
    * Returns a random child from the group.
    * @param startIndex Offset from the front of the group (lowest child). Default 0.
    * @param length Restriction on the number of values you want to randomly select from. Default (to top).
    */
  def getRandom(): T | scala.Null = js.native
  def getRandom(startIndex: phaserLib.integer): T | scala.Null = js.native
  def getRandom(startIndex: phaserLib.integer, length: phaserLib.integer): T | scala.Null = js.native
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
  def moveTo(child: T, index: phaserLib.integer): T = js.native
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
  def remove(child: T, skipCallback: scala.Boolean): T = js.native
  /**
    * Removes all the items.
    * @param skipCallback Skip calling the List.removeCallback. Default false.
    */
  def removeAll(): List[T] = js.native
  def removeAll(skipCallback: scala.Boolean): List[T] = js.native
  /**
    * Removes the item at the given position in the List.
    * @param index The position to remove the item from.
    * @param skipCallback Skip calling the List.removeCallback. Default false.
    */
  def removeAt(index: phaserLib.integer): T = js.native
  def removeAt(index: phaserLib.integer, skipCallback: scala.Boolean): T = js.native
  /**
    * Removes the items within the given range in the List.
    * @param startIndex The index to start removing from. Default 0.
    * @param endIndex The position to stop removing at. The item at this position won't be removed.
    * @param skipCallback Skip calling the List.removeCallback. Default false.
    */
  def removeBetween(): js.Array[T] = js.native
  def removeBetween(startIndex: phaserLib.integer): js.Array[T] = js.native
  def removeBetween(startIndex: phaserLib.integer, endIndex: phaserLib.integer): js.Array[T] = js.native
  def removeBetween(startIndex: phaserLib.integer, endIndex: phaserLib.integer, skipCallback: scala.Boolean): js.Array[T] = js.native
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
  def setAll(property: java.lang.String, value: T): scala.Unit = js.native
  def setAll(property: java.lang.String, value: T, startIndex: phaserLib.integer): scala.Unit = js.native
  def setAll(property: java.lang.String, value: T, startIndex: phaserLib.integer, endIndex: phaserLib.integer): scala.Unit = js.native
  /**
    * Shuffles the items in the list.
    */
  def shuffle(): List[T] = js.native
  /**
    * Clears the List and recreates its internal array.
    */
  def shutdown(): scala.Unit = js.native
  /**
    * Sort the contents of this List so the items are in order based on the given property.
    * For example, `sort('alpha')` would sort the List contents based on the value of their `alpha` property.
    * @param property The property to lexically sort by.
    * @param handler Provide your own custom handler function. Will receive 2 children which it should compare and return a boolean.
    */
  def sort(property: java.lang.String): js.Array[T] = js.native
  def sort(property: java.lang.String, handler: js.Function): js.Array[T] = js.native
  /**
    * Swaps the positions of two items in the list.
    * @param child1 The first item to swap.
    * @param child2 The second item to swap.
    */
  def swap(child1: T, child2: T): scala.Unit = js.native
}

