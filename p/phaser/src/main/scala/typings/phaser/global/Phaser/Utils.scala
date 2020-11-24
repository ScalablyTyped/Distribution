package typings.phaser.global.Phaser

import typings.phaser.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Utils")
@js.native
object Utils extends js.Object {
  
  /**
    * A NOOP (No Operation) callback function.
    * 
    * Used internally by Phaser when it's more expensive to determine if a callback exists
    * than it is to just invoke an empty function.
    */
  def NOOP(): Unit = js.native
  
  @js.native
  object Array extends js.Object {
    
    /**
      * Adds the given item, or array of items, to the array.
      * 
      * Each item must be unique within the array.
      * 
      * The array is modified in-place and returned.
      * 
      * You can optionally specify a limit to the maximum size of the array. If the quantity of items being
      * added will take the array length over this limit, it will stop adding once the limit is reached.
      * 
      * You can optionally specify a callback to be invoked for each item successfully added to the array.
      * @param array The array to be added to.
      * @param item The item, or array of items, to add to the array. Each item must be unique within the array.
      * @param limit Optional limit which caps the size of the array.
      * @param callback A callback to be invoked for each item successfully added to the array.
      * @param context The context in which the callback is invoked.
      */
    def Add(array: js.Array[_], item: js.Any): js.Array[_] = js.native
    def Add(
      array: js.Array[_],
      item: js.Any,
      limit: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def Add(array: js.Array[_], item: js.Any, limit: js.UndefOr[scala.Nothing], callback: js.Function): js.Array[_] = js.native
    def Add(
      array: js.Array[_],
      item: js.Any,
      limit: js.UndefOr[scala.Nothing],
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    def Add(array: js.Array[_], item: js.Any, limit: integer): js.Array[_] = js.native
    def Add(
      array: js.Array[_],
      item: js.Any,
      limit: integer,
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def Add(array: js.Array[_], item: js.Any, limit: integer, callback: js.Function): js.Array[_] = js.native
    def Add(array: js.Array[_], item: js.Any, limit: integer, callback: js.Function, context: js.Object): js.Array[_] = js.native
    def Add(array: js.Array[_], item: js.Array[_]): js.Array[_] = js.native
    def Add(
      array: js.Array[_],
      item: js.Array[_],
      limit: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def Add(array: js.Array[_], item: js.Array[_], limit: js.UndefOr[scala.Nothing], callback: js.Function): js.Array[_] = js.native
    def Add(
      array: js.Array[_],
      item: js.Array[_],
      limit: js.UndefOr[scala.Nothing],
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    def Add(array: js.Array[_], item: js.Array[_], limit: integer): js.Array[_] = js.native
    def Add(
      array: js.Array[_],
      item: js.Array[_],
      limit: integer,
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def Add(array: js.Array[_], item: js.Array[_], limit: integer, callback: js.Function): js.Array[_] = js.native
    def Add(array: js.Array[_], item: js.Array[_], limit: integer, callback: js.Function, context: js.Object): js.Array[_] = js.native
    
    /**
      * Adds the given item, or array of items, to the array starting at the index specified.
      * 
      * Each item must be unique within the array.
      * 
      * Existing elements in the array are shifted up.
      * 
      * The array is modified in-place and returned.
      * 
      * You can optionally specify a limit to the maximum size of the array. If the quantity of items being
      * added will take the array length over this limit, it will stop adding once the limit is reached.
      * 
      * You can optionally specify a callback to be invoked for each item successfully added to the array.
      * @param array The array to be added to.
      * @param item The item, or array of items, to add to the array.
      * @param index The index in the array where the item will be inserted. Default 0.
      * @param limit Optional limit which caps the size of the array.
      * @param callback A callback to be invoked for each item successfully added to the array.
      * @param context The context in which the callback is invoked.
      */
    def AddAt(array: js.Array[_], item: js.Any): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: js.UndefOr[scala.Nothing],
      limit: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: js.UndefOr[scala.Nothing],
      limit: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: js.UndefOr[scala.Nothing],
      limit: js.UndefOr[scala.Nothing],
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(array: js.Array[_], item: js.Any, index: js.UndefOr[scala.Nothing], limit: integer): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: js.UndefOr[scala.Nothing],
      limit: integer,
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: js.UndefOr[scala.Nothing],
      limit: integer,
      callback: js.Function
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: js.UndefOr[scala.Nothing],
      limit: integer,
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(array: js.Array[_], item: js.Any, index: integer): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: integer,
      limit: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: integer,
      limit: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: integer,
      limit: js.UndefOr[scala.Nothing],
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(array: js.Array[_], item: js.Any, index: integer, limit: integer): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: integer,
      limit: integer,
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(array: js.Array[_], item: js.Any, index: integer, limit: integer, callback: js.Function): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Any,
      index: integer,
      limit: integer,
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(array: js.Array[_], item: js.Array[_]): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: js.UndefOr[scala.Nothing],
      limit: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: js.UndefOr[scala.Nothing],
      limit: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: js.UndefOr[scala.Nothing],
      limit: js.UndefOr[scala.Nothing],
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(array: js.Array[_], item: js.Array[_], index: js.UndefOr[scala.Nothing], limit: integer): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: js.UndefOr[scala.Nothing],
      limit: integer,
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: js.UndefOr[scala.Nothing],
      limit: integer,
      callback: js.Function
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: js.UndefOr[scala.Nothing],
      limit: integer,
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(array: js.Array[_], item: js.Array[_], index: integer): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: integer,
      limit: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: integer,
      limit: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: integer,
      limit: js.UndefOr[scala.Nothing],
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(array: js.Array[_], item: js.Array[_], index: integer, limit: integer): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: integer,
      limit: integer,
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def AddAt(array: js.Array[_], item: js.Array[_], index: integer, limit: integer, callback: js.Function): js.Array[_] = js.native
    def AddAt(
      array: js.Array[_],
      item: js.Array[_],
      index: integer,
      limit: integer,
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    
    /**
      * Moves the given element to the top of the array.
      * The array is modified in-place.
      * @param array The array.
      * @param item The element to move.
      */
    def BringToTop(array: js.Array[_], item: js.Any): js.Any = js.native
    
    /**
      * Returns the total number of elements in the array which have a property matching the given value.
      * @param array The array to search.
      * @param property The property to test on each array element.
      * @param value The value to test the property against. Must pass a strict (`===`) comparison check.
      * @param startIndex An optional start index to search from.
      * @param endIndex An optional end index to search to.
      */
    def CountAllMatching(array: js.Array[_], property: String, value: js.Any): integer = js.native
    def CountAllMatching(
      array: js.Array[_],
      property: String,
      value: js.Any,
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: integer
    ): integer = js.native
    def CountAllMatching(array: js.Array[_], property: String, value: js.Any, startIndex: integer): integer = js.native
    def CountAllMatching(array: js.Array[_], property: String, value: js.Any, startIndex: integer, endIndex: integer): integer = js.native
    
    /**
      * Passes each element in the array to the given callback.
      * @param array The array to search.
      * @param callback A callback to be invoked for each item in the array.
      * @param context The context in which the callback is invoked.
      * @param args Additional arguments that will be passed to the callback, after the current array item.
      */
    def Each(array: js.Array[_], callback: js.Function, context: js.Object, args: js.Any*): js.Array[_] = js.native
    
    /**
      * Passes each element in the array, between the start and end indexes, to the given callback.
      * @param array The array to search.
      * @param callback A callback to be invoked for each item in the array.
      * @param context The context in which the callback is invoked.
      * @param startIndex The start index to search from.
      * @param endIndex The end index to search to.
      * @param args Additional arguments that will be passed to the callback, after the child.
      */
    def EachInRange(
      array: js.Array[_],
      callback: js.Function,
      context: js.Object,
      startIndex: integer,
      endIndex: integer,
      args: js.Any*
    ): js.Array[_] = js.native
    
    /**
      * Searches a pre-sorted array for the closet value to the given number.
      * 
      * If the `key` argument is given it will assume the array contains objects that all have the required `key` property name,
      * and will check for the closest value of those to the given number.
      * @param value The value to search for in the array.
      * @param array The array to search, which must be sorted.
      * @param key An optional property key. If specified the array elements property will be checked against value.
      */
    def FindClosestInSorted(value: Double, array: js.Array[_]): Double | js.Any = js.native
    def FindClosestInSorted(value: Double, array: js.Array[_], key: String): Double | js.Any = js.native
    
    /**
      * Returns all elements in the array.
      * 
      * You can optionally specify a matching criteria using the `property` and `value` arguments.
      * 
      * For example: `getAll('visible', true)` would return only elements that have their visible property set.
      * 
      * Optionally you can specify a start and end index. For example if the array had 100 elements,
      * and you set `startIndex` to 0 and `endIndex` to 50, it would return matches from only
      * the first 50 elements.
      * @param array The array to search.
      * @param property The property to test on each array element.
      * @param value The value to test the property against. Must pass a strict (`===`) comparison check.
      * @param startIndex An optional start index to search from.
      * @param endIndex An optional end index to search to.
      */
    def GetAll(array: js.Array[_]): js.Array[_] = js.native
    def GetAll(
      array: js.Array[_],
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: integer
    ): js.Array[_] = js.native
    def GetAll(
      array: js.Array[_],
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      startIndex: integer
    ): js.Array[_] = js.native
    def GetAll(
      array: js.Array[_],
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      startIndex: integer,
      endIndex: integer
    ): js.Array[_] = js.native
    def GetAll(array: js.Array[_], property: js.UndefOr[scala.Nothing], value: js.Any): js.Array[_] = js.native
    def GetAll(
      array: js.Array[_],
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: integer
    ): js.Array[_] = js.native
    def GetAll(array: js.Array[_], property: js.UndefOr[scala.Nothing], value: js.Any, startIndex: integer): js.Array[_] = js.native
    def GetAll(
      array: js.Array[_],
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      startIndex: integer,
      endIndex: integer
    ): js.Array[_] = js.native
    def GetAll(array: js.Array[_], property: String): js.Array[_] = js.native
    def GetAll(
      array: js.Array[_],
      property: String,
      value: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: integer
    ): js.Array[_] = js.native
    def GetAll(array: js.Array[_], property: String, value: js.UndefOr[scala.Nothing], startIndex: integer): js.Array[_] = js.native
    def GetAll(
      array: js.Array[_],
      property: String,
      value: js.UndefOr[scala.Nothing],
      startIndex: integer,
      endIndex: integer
    ): js.Array[_] = js.native
    def GetAll(array: js.Array[_], property: String, value: js.Any): js.Array[_] = js.native
    def GetAll(
      array: js.Array[_],
      property: String,
      value: js.Any,
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: integer
    ): js.Array[_] = js.native
    def GetAll(array: js.Array[_], property: String, value: js.Any, startIndex: integer): js.Array[_] = js.native
    def GetAll(array: js.Array[_], property: String, value: js.Any, startIndex: integer, endIndex: integer): js.Array[_] = js.native
    
    /**
      * Returns the first element in the array.
      * 
      * You can optionally specify a matching criteria using the `property` and `value` arguments.
      * 
      * For example: `getAll('visible', true)` would return the first element that had its `visible` property set.
      * 
      * Optionally you can specify a start and end index. For example if the array had 100 elements,
      * and you set `startIndex` to 0 and `endIndex` to 50, it would search only the first 50 elements.
      * @param array The array to search.
      * @param property The property to test on each array element.
      * @param value The value to test the property against. Must pass a strict (`===`) comparison check.
      * @param startIndex An optional start index to search from. Default 0.
      * @param endIndex An optional end index to search up to (but not included) Default array.length.
      */
    def GetFirst(array: js.Array[_]): js.Object = js.native
    def GetFirst(
      array: js.Array[_],
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: integer
    ): js.Object = js.native
    def GetFirst(
      array: js.Array[_],
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      startIndex: integer
    ): js.Object = js.native
    def GetFirst(
      array: js.Array[_],
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      startIndex: integer,
      endIndex: integer
    ): js.Object = js.native
    def GetFirst(array: js.Array[_], property: js.UndefOr[scala.Nothing], value: js.Any): js.Object = js.native
    def GetFirst(
      array: js.Array[_],
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: integer
    ): js.Object = js.native
    def GetFirst(array: js.Array[_], property: js.UndefOr[scala.Nothing], value: js.Any, startIndex: integer): js.Object = js.native
    def GetFirst(
      array: js.Array[_],
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      startIndex: integer,
      endIndex: integer
    ): js.Object = js.native
    def GetFirst(array: js.Array[_], property: String): js.Object = js.native
    def GetFirst(
      array: js.Array[_],
      property: String,
      value: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: integer
    ): js.Object = js.native
    def GetFirst(array: js.Array[_], property: String, value: js.UndefOr[scala.Nothing], startIndex: integer): js.Object = js.native
    def GetFirst(
      array: js.Array[_],
      property: String,
      value: js.UndefOr[scala.Nothing],
      startIndex: integer,
      endIndex: integer
    ): js.Object = js.native
    def GetFirst(array: js.Array[_], property: String, value: js.Any): js.Object = js.native
    def GetFirst(
      array: js.Array[_],
      property: String,
      value: js.Any,
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: integer
    ): js.Object = js.native
    def GetFirst(array: js.Array[_], property: String, value: js.Any, startIndex: integer): js.Object = js.native
    def GetFirst(array: js.Array[_], property: String, value: js.Any, startIndex: integer, endIndex: integer): js.Object = js.native
    
    /**
      * Returns a Random element from the array.
      * @param array The array to select the random entry from.
      * @param startIndex An optional start index. Default 0.
      * @param length An optional length, the total number of elements (from the startIndex) to choose from. Default array.length.
      */
    def GetRandom(array: js.Array[_]): js.Any = js.native
    def GetRandom(array: js.Array[_], startIndex: js.UndefOr[scala.Nothing], length: integer): js.Any = js.native
    def GetRandom(array: js.Array[_], startIndex: integer): js.Any = js.native
    def GetRandom(array: js.Array[_], startIndex: integer, length: integer): js.Any = js.native
    
    /**
      * Moves the given array element down one place in the array.
      * The array is modified in-place.
      * @param array The input array.
      * @param item The element to move down the array.
      */
    def MoveDown(array: js.Array[_], item: js.Any): js.Array[_] = js.native
    
    /**
      * Moves an element in an array to a new position within the same array.
      * The array is modified in-place.
      * @param array The array.
      * @param item The element to move.
      * @param index The new index that the element will be moved to.
      */
    def MoveTo(array: js.Array[_], item: js.Any, index: integer): js.Any = js.native
    
    /**
      * Moves the given array element up one place in the array.
      * The array is modified in-place.
      * @param array The input array.
      * @param item The element to move up the array.
      */
    def MoveUp(array: js.Array[_], item: js.Any): js.Array[_] = js.native
    
    /**
      * Create an array representing the range of numbers (usually integers), between, and inclusive of,
      * the given `start` and `end` arguments. For example:
      * 
      * `var array = numberArray(2, 4); // array = [2, 3, 4]`
      * `var array = numberArray(0, 9); // array = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]`
      * 
      * This is equivalent to `numberArrayStep(start, end, 1)`.
      * 
      * You can optionally provide a prefix and / or suffix string. If given the array will contain
      * strings, not integers. For example:
      * 
      * `var array = numberArray(1, 4, 'Level '); // array = ["Level 1", "Level 2", "Level 3", "Level 4"]`
      * `var array = numberArray(5, 7, 'HD-', '.png'); // array = ["HD-5.png", "HD-6.png", "HD-7.png"]`
      * @param start The minimum value the array starts with.
      * @param end The maximum value the array contains.
      * @param prefix Optional prefix to place before the number. If provided the array will contain strings, not integers.
      * @param suffix Optional suffix to place after the number. If provided the array will contain strings, not integers.
      */
    def NumberArray(start: Double, end: Double): js.Array[Double | String] = js.native
    def NumberArray(start: Double, end: Double, prefix: js.UndefOr[scala.Nothing], suffix: String): js.Array[Double | String] = js.native
    def NumberArray(start: Double, end: Double, prefix: String): js.Array[Double | String] = js.native
    def NumberArray(start: Double, end: Double, prefix: String, suffix: String): js.Array[Double | String] = js.native
    
    /**
      * Create an array of numbers (positive and/or negative) progressing from `start`
      * up to but not including `end` by advancing by `step`.
      * 
      * If `start` is less than `end` a zero-length range is created unless a negative `step` is specified.
      * 
      * Certain values for `start` and `end` (eg. NaN/undefined/null) are currently coerced to 0;
      * for forward compatibility make sure to pass in actual numbers.
      * @param start The start of the range. Default 0.
      * @param end The end of the range. Default null.
      * @param step The value to increment or decrement by. Default 1.
      */
    def NumberArrayStep(): js.Array[Double] = js.native
    def NumberArrayStep(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], step: Double): js.Array[Double] = js.native
    def NumberArrayStep(start: js.UndefOr[scala.Nothing], end: Double): js.Array[Double] = js.native
    def NumberArrayStep(start: js.UndefOr[scala.Nothing], end: Double, step: Double): js.Array[Double] = js.native
    def NumberArrayStep(start: Double): js.Array[Double] = js.native
    def NumberArrayStep(start: Double, end: js.UndefOr[scala.Nothing], step: Double): js.Array[Double] = js.native
    def NumberArrayStep(start: Double, end: Double): js.Array[Double] = js.native
    def NumberArrayStep(start: Double, end: Double, step: Double): js.Array[Double] = js.native
    
    /**
      * A [Floyd-Rivest](https://en.wikipedia.org/wiki/Floyd%E2%80%93Rivest_algorithm) quick selection algorithm.
      * 
      * Rearranges the array items so that all items in the [left, k] range are smaller than all items in [k, right];
      * The k-th element will have the (k - left + 1)th smallest value in [left, right].
      * 
      * The array is modified in-place.
      * 
      * Based on code by [Vladimir Agafonkin](https://www.npmjs.com/~mourner)
      * @param arr The array to sort.
      * @param k The k-th element index.
      * @param left The index of the left part of the range. Default 0.
      * @param right The index of the right part of the range.
      * @param compare An optional comparison function. Is passed two elements and should return 0, 1 or -1.
      */
    def QuickSelect(arr: js.Array[_], k: integer): Unit = js.native
    def QuickSelect(
      arr: js.Array[_],
      k: integer,
      left: js.UndefOr[scala.Nothing],
      right: js.UndefOr[scala.Nothing],
      compare: js.Function
    ): Unit = js.native
    def QuickSelect(arr: js.Array[_], k: integer, left: js.UndefOr[scala.Nothing], right: integer): Unit = js.native
    def QuickSelect(
      arr: js.Array[_],
      k: integer,
      left: js.UndefOr[scala.Nothing],
      right: integer,
      compare: js.Function
    ): Unit = js.native
    def QuickSelect(arr: js.Array[_], k: integer, left: integer): Unit = js.native
    def QuickSelect(
      arr: js.Array[_],
      k: integer,
      left: integer,
      right: js.UndefOr[scala.Nothing],
      compare: js.Function
    ): Unit = js.native
    def QuickSelect(arr: js.Array[_], k: integer, left: integer, right: integer): Unit = js.native
    def QuickSelect(arr: js.Array[_], k: integer, left: integer, right: integer, compare: js.Function): Unit = js.native
    
    /**
      * Creates an array populated with a range of values, based on the given arguments and configuration object.
      * 
      * Range ([a,b,c], [1,2,3]) =
      * a1, a2, a3, b1, b2, b3, c1, c2, c3
      * 
      * Range ([a,b], [1,2,3], qty = 3) =
      * a1, a1, a1, a2, a2, a2, a3, a3, a3, b1, b1, b1, b2, b2, b2, b3, b3, b3
      * 
      * Range ([a,b,c], [1,2,3], repeat x1) =
      * a1, a2, a3, b1, b2, b3, c1, c2, c3, a1, a2, a3, b1, b2, b3, c1, c2, c3
      * 
      * Range ([a,b], [1,2], repeat -1 = endless, max = 14) =
      * Maybe if max is set then repeat goes to -1 automatically?
      * a1, a2, b1, b2, a1, a2, b1, b2, a1, a2, b1, b2, a1, a2 (capped at 14 elements)
      * 
      * Range ([a], [1,2,3,4,5], random = true) =
      * a4, a1, a5, a2, a3
      * 
      * Range ([a, b], [1,2,3], random = true) =
      * b3, a2, a1, b1, a3, b2
      * 
      * Range ([a, b, c], [1,2,3], randomB = true) =
      * a3, a1, a2, b2, b3, b1, c1, c3, c2
      * 
      * Range ([a], [1,2,3,4,5], yoyo = true) =
      * a1, a2, a3, a4, a5, a5, a4, a3, a2, a1
      * 
      * Range ([a, b], [1,2,3], yoyo = true) =
      * a1, a2, a3, b1, b2, b3, b3, b2, b1, a3, a2, a1
      * @param a The first array of range elements.
      * @param b The second array of range elements.
      * @param options A range configuration object. Can contain: repeat, random, randomB, yoyo, max, qty.
      */
    def Range(a: js.Array[_], b: js.Array[_]): js.Array[_] = js.native
    def Range(a: js.Array[_], b: js.Array[_], options: js.Object): js.Array[_] = js.native
    
    /**
      * Removes the given item, or array of items, from the array.
      * 
      * The array is modified in-place.
      * 
      * You can optionally specify a callback to be invoked for each item successfully removed from the array.
      * @param array The array to be modified.
      * @param item The item, or array of items, to be removed from the array.
      * @param callback A callback to be invoked for each item successfully removed from the array.
      * @param context The context in which the callback is invoked.
      */
    def Remove(array: js.Array[_], item: js.Any): js.Any | js.Array[_] = js.native
    def Remove(array: js.Array[_], item: js.Any, callback: js.UndefOr[scala.Nothing], context: js.Object): js.Any | js.Array[_] = js.native
    def Remove(array: js.Array[_], item: js.Any, callback: js.Function): js.Any | js.Array[_] = js.native
    def Remove(array: js.Array[_], item: js.Any, callback: js.Function, context: js.Object): js.Any | js.Array[_] = js.native
    def Remove(array: js.Array[_], item: js.Array[_]): js.Any | js.Array[_] = js.native
    def Remove(array: js.Array[_], item: js.Array[_], callback: js.UndefOr[scala.Nothing], context: js.Object): js.Any | js.Array[_] = js.native
    def Remove(array: js.Array[_], item: js.Array[_], callback: js.Function): js.Any | js.Array[_] = js.native
    def Remove(array: js.Array[_], item: js.Array[_], callback: js.Function, context: js.Object): js.Any | js.Array[_] = js.native
    
    /**
      * Removes the item from the given position in the array.
      * 
      * The array is modified in-place.
      * 
      * You can optionally specify a callback to be invoked for the item if it is successfully removed from the array.
      * @param array The array to be modified.
      * @param index The array index to remove the item from. The index must be in bounds or it will throw an error.
      * @param callback A callback to be invoked for the item removed from the array.
      * @param context The context in which the callback is invoked.
      */
    def RemoveAt(array: js.Array[_], index: integer): js.Any = js.native
    def RemoveAt(array: js.Array[_], index: integer, callback: js.UndefOr[scala.Nothing], context: js.Object): js.Any = js.native
    def RemoveAt(array: js.Array[_], index: integer, callback: js.Function): js.Any = js.native
    def RemoveAt(array: js.Array[_], index: integer, callback: js.Function, context: js.Object): js.Any = js.native
    
    /**
      * Removes the item within the given range in the array.
      * 
      * The array is modified in-place.
      * 
      * You can optionally specify a callback to be invoked for the item/s successfully removed from the array.
      * @param array The array to be modified.
      * @param startIndex The start index to remove from.
      * @param endIndex The end index to remove to.
      * @param callback A callback to be invoked for the item removed from the array.
      * @param context The context in which the callback is invoked.
      */
    def RemoveBetween(array: js.Array[_], startIndex: integer, endIndex: integer): js.Array[_] = js.native
    def RemoveBetween(
      array: js.Array[_],
      startIndex: integer,
      endIndex: integer,
      callback: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Array[_] = js.native
    def RemoveBetween(array: js.Array[_], startIndex: integer, endIndex: integer, callback: js.Function): js.Array[_] = js.native
    def RemoveBetween(
      array: js.Array[_],
      startIndex: integer,
      endIndex: integer,
      callback: js.Function,
      context: js.Object
    ): js.Array[_] = js.native
    
    /**
      * Removes a random object from the given array and returns it.
      * Will return null if there are no array items that fall within the specified range or if there is no item for the randomly chosen index.
      * @param array The array to removed a random element from.
      * @param start The array index to start the search from. Default 0.
      * @param length Optional restriction on the number of elements to randomly select from. Default array.length.
      */
    def RemoveRandomElement(array: js.Array[_]): js.Object = js.native
    def RemoveRandomElement(array: js.Array[_], start: js.UndefOr[scala.Nothing], length: integer): js.Object = js.native
    def RemoveRandomElement(array: js.Array[_], start: integer): js.Object = js.native
    def RemoveRandomElement(array: js.Array[_], start: integer, length: integer): js.Object = js.native
    
    /**
      * Replaces an element of the array with the new element.
      * The new element cannot already be a member of the array.
      * The array is modified in-place.
      * @param array The array to search within.
      * @param oldChild The element in the array that will be replaced.
      * @param newChild The element to be inserted into the array at the position of `oldChild`.
      */
    def Replace(array: js.Array[_], oldChild: js.Any, newChild: js.Any): Boolean = js.native
    
    /**
      * Moves the element at the start of the array to the end, shifting all items in the process.
      * The "rotation" happens to the left.
      * @param array The array to shift to the left. This array is modified in place.
      * @param total The number of times to shift the array. Default 1.
      */
    def RotateLeft(array: js.Array[_]): js.Any = js.native
    def RotateLeft(array: js.Array[_], total: integer): js.Any = js.native
    
    /**
      * Moves the element at the end of the array to the start, shifting all items in the process.
      * The "rotation" happens to the right.
      * @param array The array to shift to the right. This array is modified in place.
      * @param total The number of times to shift the array. Default 1.
      */
    def RotateRight(array: js.Array[_]): js.Any = js.native
    def RotateRight(array: js.Array[_], total: integer): js.Any = js.native
    
    /**
      * Tests if the start and end indexes are a safe range for the given array.
      * @param array The array to check.
      * @param startIndex The start index.
      * @param endIndex The end index.
      * @param throwError Throw an error if the range is out of bounds. Default true.
      */
    def SafeRange(array: js.Array[_], startIndex: integer, endIndex: integer): Boolean = js.native
    def SafeRange(array: js.Array[_], startIndex: integer, endIndex: integer, throwError: Boolean): Boolean = js.native
    
    /**
      * Moves the given element to the bottom of the array.
      * The array is modified in-place.
      * @param array The array.
      * @param item The element to move.
      */
    def SendToBack(array: js.Array[_], item: js.Any): js.Any = js.native
    
    /**
      * Scans the array for elements with the given property. If found, the property is set to the `value`.
      * 
      * For example: `SetAll('visible', true)` would set all elements that have a `visible` property to `false`.
      * 
      * Optionally you can specify a start and end index. For example if the array had 100 elements,
      * and you set `startIndex` to 0 and `endIndex` to 50, it would update only the first 50 elements.
      * @param array The array to search.
      * @param property The property to test for on each array element.
      * @param value The value to set the property to.
      * @param startIndex An optional start index to search from.
      * @param endIndex An optional end index to search to.
      */
    def SetAll(array: js.Array[_], property: String, value: js.Any): js.Array[_] = js.native
    def SetAll(
      array: js.Array[_],
      property: String,
      value: js.Any,
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: integer
    ): js.Array[_] = js.native
    def SetAll(array: js.Array[_], property: String, value: js.Any, startIndex: integer): js.Array[_] = js.native
    def SetAll(array: js.Array[_], property: String, value: js.Any, startIndex: integer, endIndex: integer): js.Array[_] = js.native
    
    /**
      * Shuffles the contents of the given array using the Fisher-Yates implementation.
      * 
      * The original array is modified directly and returned.
      * @param array The array to shuffle. This array is modified in place.
      */
    def Shuffle[T](array: js.Array[T]): js.Array[T] = js.native
    
    /**
      * Removes a single item from an array and returns it without creating gc, like the native splice does.
      * Based on code by Mike Reinstein.
      * @param array The array to splice from.
      * @param index The index of the item which should be spliced.
      */
    def SpliceOne(array: js.Array[_], index: integer): js.Any = js.native
    
    /**
      * A stable array sort, because `Array#sort()` is not guaranteed stable.
      * This is an implementation of merge sort, without recursion.
      * @param arr The input array to be sorted.
      * @param comp The comparison handler.
      */
    def StableSort(arr: js.Array[_], comp: js.Function): js.Array[_] = js.native
    
    /**
      * Swaps the position of two elements in the given array.
      * The elements must exist in the same array.
      * The array is modified in-place.
      * @param array The input array.
      * @param item1 The first element to swap.
      * @param item2 The second element to swap.
      */
    def Swap(array: js.Array[_], item1: js.Any, item2: js.Any): js.Array[_] = js.native
    
    @js.native
    object Matrix extends js.Object {
      
      /**
        * Checks if an array can be used as a matrix.
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows) have the same length. There must be at least two rows:
        * 
        * ```
        *    [
        *        [ 1, 1, 1, 1, 1, 1 ],
        *        [ 2, 0, 0, 0, 0, 4 ],
        *        [ 2, 0, 1, 2, 0, 4 ],
        *        [ 2, 0, 3, 4, 0, 4 ],
        *        [ 2, 0, 0, 0, 0, 4 ],
        *        [ 3, 3, 3, 3, 3, 3 ]
        *    ]
        * ```
        * @param matrix The array to check.
        */
      def CheckMatrix[T](): Boolean = js.native
      def CheckMatrix[T](matrix: js.Array[js.Array[T]]): Boolean = js.native
      
      /**
        * Generates a string (which you can pass to console.log) from the given Array Matrix.
        * @param matrix A 2-dimensional array.
        */
      def MatrixToString[T](): String = js.native
      def MatrixToString[T](matrix: js.Array[js.Array[T]]): String = js.native
      
      /**
        * Reverses the columns in the given Array Matrix.
        * @param matrix The array matrix to reverse the columns for.
        */
      def ReverseColumns[T](): js.Array[js.Array[T]] = js.native
      def ReverseColumns[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
      
      /**
        * Reverses the rows in the given Array Matrix.
        * @param matrix The array matrix to reverse the rows for.
        */
      def ReverseRows[T](): js.Array[js.Array[T]] = js.native
      def ReverseRows[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
      
      /**
        * Rotates the array matrix 180 degrees.
        * @param matrix The array to rotate.
        */
      def Rotate180[T](): js.Array[js.Array[T]] = js.native
      def Rotate180[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
      
      /**
        * Rotates the array matrix to the left (or 90 degrees)
        * @param matrix The array to rotate.
        */
      def RotateLeft[T](): js.Array[js.Array[T]] = js.native
      def RotateLeft[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
      
      /**
        * Rotates the array matrix based on the given rotation value.
        * 
        * The value can be given in degrees: 90, -90, 270, -270 or 180,
        * or a string command: `rotateLeft`, `rotateRight` or `rotate180`.
        * 
        * Based on the routine from {@link http://jsfiddle.net/MrPolywhirl/NH42z/}.
        * @param matrix The array to rotate.
        * @param direction The amount to rotate the matrix by. Default 90.
        */
      def RotateMatrix[T](): js.Array[js.Array[T]] = js.native
      def RotateMatrix[T](matrix: js.UndefOr[scala.Nothing], direction: String): js.Array[js.Array[T]] = js.native
      def RotateMatrix[T](matrix: js.UndefOr[scala.Nothing], direction: Double): js.Array[js.Array[T]] = js.native
      def RotateMatrix[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
      def RotateMatrix[T](matrix: js.Array[js.Array[T]], direction: String): js.Array[js.Array[T]] = js.native
      def RotateMatrix[T](matrix: js.Array[js.Array[T]], direction: Double): js.Array[js.Array[T]] = js.native
      
      /**
        * Rotates the array matrix to the left (or -90 degrees)
        * @param matrix The array to rotate.
        */
      def RotateRight[T](): js.Array[js.Array[T]] = js.native
      def RotateRight[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
      
      /**
        * Transposes the elements of the given matrix (array of arrays).
        * 
        * The transpose of a matrix is a new matrix whose rows are the columns of the original.
        * @param array The array matrix to transpose.
        */
      def TransposeMatrix[T](): js.Array[js.Array[T]] = js.native
      def TransposeMatrix[T](array: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
    }
    
    @js.native
    object StableSortFunctions extends js.Object {
      
      /**
        * Sort the input array and simply copy it back if the result isn't in the original array, which happens on an odd number of passes.
        * @param arr The input array.
        * @param comp The comparison handler.
        */
      def inplace(arr: js.Array[_], comp: js.Function): js.Array[_] = js.native
    }
  }
  
  @js.native
  object Base64 extends js.Object {
    
    /**
      * Converts an ArrayBuffer into a base64 string.
      * 
      * The resulting string can optionally be a data uri if the `mediaType` argument is provided.
      * 
      * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs for more details.
      * @param arrayBuffer The Array Buffer to encode.
      * @param mediaType An optional media type, i.e. `audio/ogg` or `image/jpeg`. If included the resulting string will be a data URI.
      */
    def ArrayBufferToBase64(arrayBuffer: ArrayBuffer): String = js.native
    def ArrayBufferToBase64(arrayBuffer: ArrayBuffer, mediaType: String): String = js.native
    
    /**
      * Converts a base64 string, either with or without a data uri, into an Array Buffer.
      * @param base64 The base64 string to be decoded. Can optionally contain a data URI header, which will be stripped out prior to decoding.
      */
    def Base64ToArrayBuffer(base64: String): ArrayBuffer = js.native
  }
  
  @js.native
  object Objects extends js.Object {
    
    /**
      * Shallow Object Clone. Will not clone nested objects.
      * @param obj the object from which to clone
      */
    def Clone(obj: js.Object): js.Object = js.native
    
    /**
      * This is a slightly modified version of http://api.jquery.com/jQuery.extend/
      * @param args The objects that will be mixed.
      */
    def Extend(args: js.Any*): js.Object = js.native
    
    /**
      * Retrieves a value from an object. Allows for more advanced selection options, including:
      * 
      * Allowed types:
      * 
      * Implicit
      * {
      *     x: 4
      * }
      * 
      * From function
      * {
      *     x: function ()
      * }
      * 
      * Randomly pick one element from the array
      * {
      *     x: [a, b, c, d, e, f]
      * }
      * 
      * Random integer between min and max:
      * {
      *     x: { randInt: [min, max] }
      * }
      * 
      * Random float between min and max:
      * {
      *     x: { randFloat: [min, max] }
      * }
      * @param source The object to retrieve the value from.
      * @param key The name of the property to retrieve from the object. If a property is nested, the names of its preceding properties should be separated by a dot (`.`) - `banner.hideBanner` would return the value of the `hideBanner` property from the object stored in the `banner` property of the `source` object.
      * @param defaultValue The value to return if the `key` isn't found in the `source` object.
      */
    def GetAdvancedValue(source: js.Object, key: String, defaultValue: js.Any): js.Any = js.native
    
    /**
      * Finds the key within the top level of the {@link source} object, or returns {@link defaultValue}
      * @param source The object to search
      * @param key The key for the property on source. Must exist at the top level of the source object (no periods)
      * @param defaultValue The default value to use if the key does not exist.
      */
    def GetFastValue(source: js.Object, key: String): js.Any = js.native
    def GetFastValue(source: js.Object, key: String, defaultValue: js.Any): js.Any = js.native
    
    /**
      * Retrieves and clamps a numerical value from an object.
      * @param source The object to retrieve the value from.
      * @param key The name of the property to retrieve from the object. If a property is nested, the names of its preceding properties should be separated by a dot (`.`).
      * @param min The minimum value which can be returned.
      * @param max The maximum value which can be returned.
      * @param defaultValue The value to return if the property doesn't exist. It's also constrained to the given bounds.
      */
    def GetMinMaxValue(source: js.Object, key: String, min: Double, max: Double, defaultValue: Double): Double = js.native
    
    /**
      * Retrieves a value from an object.
      * @param source The object to retrieve the value from.
      * @param key The name of the property to retrieve from the object. If a property is nested, the names of its preceding properties should be separated by a dot (`.`) - `banner.hideBanner` would return the value of the `hideBanner` property from the object stored in the `banner` property of the `source` object.
      * @param defaultValue The value to return if the `key` isn't found in the `source` object.
      */
    def GetValue(source: js.Object, key: String, defaultValue: js.Any): js.Any = js.native
    
    /**
      * Verifies that an object contains all requested keys
      * @param source an object on which to check for key existence
      * @param keys an array of keys to ensure the source object contains
      */
    def HasAll(source: js.Object, keys: js.Array[String]): Boolean = js.native
    
    /**
      * Verifies that an object contains at least one of the requested keys
      * @param source an object on which to check for key existence
      * @param keys an array of keys to search the object for
      */
    def HasAny(source: js.Object, keys: js.Array[String]): Boolean = js.native
    
    /**
      * Determine whether the source object has a property with the specified key.
      * @param source The source object to be checked.
      * @param key The property to check for within the object
      */
    def HasValue(source: js.Object, key: String): Boolean = js.native
    
    /**
      * This is a slightly modified version of jQuery.isPlainObject.
      * A plain object is an object whose internal class property is [object Object].
      * @param obj The object to inspect.
      */
    def IsPlainObject(obj: js.Object): Boolean = js.native
    
    /**
      * Creates a new Object using all values from obj1 and obj2.
      * If a value exists in both obj1 and obj2, the value in obj1 is used.
      * 
      * This is only a shallow copy. Deeply nested objects are not cloned, so be sure to only use this
      * function on shallow objects.
      * @param obj1 The first object.
      * @param obj2 The second object.
      */
    def Merge(obj1: js.Object, obj2: js.Object): js.Object = js.native
    
    /**
      * Creates a new Object using all values from obj1.
      * 
      * Then scans obj2. If a property is found in obj2 that *also* exists in obj1, the value from obj2 is used, otherwise the property is skipped.
      * @param obj1 The first object to merge.
      * @param obj2 The second object to merge. Keys from this object which also exist in `obj1` will be copied to `obj1`.
      */
    def MergeRight(obj1: js.Object, obj2: js.Object): js.Object = js.native
    
    /**
      * Returns a new object that only contains the `keys` that were found on the object provided.
      * If no `keys` are found, an empty object is returned.
      * @param object The object to pick the provided keys from.
      * @param keys An array of properties to retrieve from the provided object.
      */
    def Pick(`object`: js.Object, keys: js.Array[_]): js.Object = js.native
    
    /**
      * Sets a value in an object, allowing for dot notation to control the depth of the property.
      * 
      * For example:
      * 
      * ```javascript
      * var data = {
      *   world: {
      *     position: {
      *       x: 200,
      *       y: 100
      *     }
      *   }
      * };
      * 
      * SetValue(data, 'world.position.y', 300);
      * 
      * console.log(data.world.position.y); // 300
      * ```
      * @param source The object to set the value in.
      * @param key The name of the property in the object. If a property is nested, the names of its preceding properties should be separated by a dot (`.`)
      * @param value The value to set into the property, if found in the source object.
      */
    def SetValue(source: js.Object, key: String, value: js.Any): Boolean = js.native
  }
  
  @js.native
  object String extends js.Object {
    
    /**
      * Takes a string and replaces instances of markers with values in the given array.
      * The markers take the form of `%1`, `%2`, etc. I.e.:
      * 
      * `Format("The %1 is worth %2 gold", [ 'Sword', 500 ])`
      * @param string The string containing the replacement markers.
      * @param values An array containing values that will replace the markers. If no value exists an empty string is inserted instead.
      */
    def Format(string: java.lang.String, values: js.Array[_]): java.lang.String = js.native
    
    /**
      * Takes the given string and pads it out, to the length required, using the character
      * specified. For example if you need a string to be 6 characters long, you can call:
      * 
      * `pad('bob', 6, '-', 2)`
      * 
      * This would return: `bob---` as it has padded it out to 6 characters, using the `-` on the right.
      * 
      * You can also use it to pad numbers (they are always returned as strings):
      * 
      * `pad(512, 6, '0', 1)`
      * 
      * Would return: `000512` with the string padded to the left.
      * 
      * If you don't specify a direction it'll pad to both sides:
      * 
      * `pad('c64', 7, '*')`
      * 
      * Would return: `**c64**`
      * @param str The target string. `toString()` will be called on the string, which means you can also pass in common data types like numbers.
      * @param len The number of characters to be added. Default 0.
      * @param pad The string to pad it out with (defaults to a space). Default " ".
      * @param dir The direction dir = 1 (left), 2 (right), 3 (both). Default 3.
      */
    def Pad(str: java.lang.String): java.lang.String = js.native
    def Pad(
      str: java.lang.String,
      len: js.UndefOr[scala.Nothing],
      pad: js.UndefOr[scala.Nothing],
      dir: integer
    ): java.lang.String = js.native
    def Pad(str: java.lang.String, len: js.UndefOr[scala.Nothing], pad: java.lang.String): java.lang.String = js.native
    def Pad(str: java.lang.String, len: js.UndefOr[scala.Nothing], pad: java.lang.String, dir: integer): java.lang.String = js.native
    def Pad(str: java.lang.String, len: integer): java.lang.String = js.native
    def Pad(str: java.lang.String, len: integer, pad: js.UndefOr[scala.Nothing], dir: integer): java.lang.String = js.native
    def Pad(str: java.lang.String, len: integer, pad: java.lang.String): java.lang.String = js.native
    def Pad(str: java.lang.String, len: integer, pad: java.lang.String, dir: integer): java.lang.String = js.native
    def Pad(str: js.Object): java.lang.String = js.native
    def Pad(str: js.Object, len: js.UndefOr[scala.Nothing], pad: js.UndefOr[scala.Nothing], dir: integer): java.lang.String = js.native
    def Pad(str: js.Object, len: js.UndefOr[scala.Nothing], pad: java.lang.String): java.lang.String = js.native
    def Pad(str: js.Object, len: js.UndefOr[scala.Nothing], pad: java.lang.String, dir: integer): java.lang.String = js.native
    def Pad(str: js.Object, len: integer): java.lang.String = js.native
    def Pad(str: js.Object, len: integer, pad: js.UndefOr[scala.Nothing], dir: integer): java.lang.String = js.native
    def Pad(str: js.Object, len: integer, pad: java.lang.String): java.lang.String = js.native
    def Pad(str: js.Object, len: integer, pad: java.lang.String, dir: integer): java.lang.String = js.native
    def Pad(str: Double): java.lang.String = js.native
    def Pad(str: Double, len: js.UndefOr[scala.Nothing], pad: js.UndefOr[scala.Nothing], dir: integer): java.lang.String = js.native
    def Pad(str: Double, len: js.UndefOr[scala.Nothing], pad: java.lang.String): java.lang.String = js.native
    def Pad(str: Double, len: js.UndefOr[scala.Nothing], pad: java.lang.String, dir: integer): java.lang.String = js.native
    def Pad(str: Double, len: integer): java.lang.String = js.native
    def Pad(str: Double, len: integer, pad: js.UndefOr[scala.Nothing], dir: integer): java.lang.String = js.native
    def Pad(str: Double, len: integer, pad: java.lang.String): java.lang.String = js.native
    def Pad(str: Double, len: integer, pad: java.lang.String, dir: integer): java.lang.String = js.native
    
    /**
      * Takes the given string and reverses it, returning the reversed string.
      * For example if given the string `Atari 520ST` it would return `TS025 iratA`.
      * @param string The string to be reversed.
      */
    def Reverse(string: java.lang.String): java.lang.String = js.native
    
    /**
      * Creates and returns an RFC4122 version 4 compliant UUID.
      * 
      * The string is in the form: `xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx` where each `x` is replaced with a random
      * hexadecimal digit from 0 to f, and `y` is replaced with a random hexadecimal digit from 8 to b.
      */
    def UUID(): java.lang.String = js.native
    
    /**
      * Capitalizes the first letter of a string if there is one.
      * @param str The string to capitalize.
      */
    def UppercaseFirst(str: java.lang.String): java.lang.String = js.native
  }
}
