package typings.phaser.global.Phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils {
  
  @JSGlobal("Phaser.Utils")
  @js.native
  val ^ : js.Any = js.native
  
  object Array {
    
    @JSGlobal("Phaser.Utils.Array")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Add(array: js.Array[Any], item: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: js.Array[Any], limit: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: js.Array[Any], limit: Double, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(
      array: js.Array[Any],
      item: js.Array[Any],
      limit: Double,
      callback: js.Function,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: js.Array[Any], limit: Double, callback: Unit, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: js.Array[Any], limit: Unit, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: js.Array[Any], limit: Unit, callback: js.Function, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: js.Array[Any], limit: Unit, callback: Unit, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
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
    inline def Add(array: js.Array[Any], item: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: Any, limit: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: Any, limit: Double, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: Any, limit: Double, callback: js.Function, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: Any, limit: Double, callback: Unit, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: Any, limit: Unit, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: Any, limit: Unit, callback: js.Function, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Add(array: js.Array[Any], item: Any, limit: Unit, callback: Unit, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Add")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def AddAt(array: js.Array[Any], item: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: js.Array[Any], index: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: js.Array[Any], index: Double, limit: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: js.Array[Any], index: Double, limit: Double, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: js.Array[Any],
      index: Double,
      limit: Double,
      callback: js.Function,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: js.Array[Any],
      index: Double,
      limit: Double,
      callback: Unit,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: js.Array[Any], index: Double, limit: Unit, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: js.Array[Any],
      index: Double,
      limit: Unit,
      callback: js.Function,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: js.Array[Any],
      index: Double,
      limit: Unit,
      callback: Unit,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: js.Array[Any], index: Unit, limit: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: js.Array[Any], index: Unit, limit: Double, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: js.Array[Any],
      index: Unit,
      limit: Double,
      callback: js.Function,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: js.Array[Any],
      index: Unit,
      limit: Double,
      callback: Unit,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: js.Array[Any], index: Unit, limit: Unit, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: js.Array[Any],
      index: Unit,
      limit: Unit,
      callback: js.Function,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: js.Array[Any],
      index: Unit,
      limit: Unit,
      callback: Unit,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
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
    inline def AddAt(array: js.Array[Any], item: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Double, limit: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Double, limit: Double, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: Any,
      index: Double,
      limit: Double,
      callback: js.Function,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Double, limit: Double, callback: Unit, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Double, limit: Unit, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: Any,
      index: Double,
      limit: Unit,
      callback: js.Function,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Double, limit: Unit, callback: Unit, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Unit, limit: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Unit, limit: Double, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: Any,
      index: Unit,
      limit: Double,
      callback: js.Function,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Unit, limit: Double, callback: Unit, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Unit, limit: Unit, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(
      array: js.Array[Any],
      item: Any,
      index: Unit,
      limit: Unit,
      callback: js.Function,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def AddAt(array: js.Array[Any], item: Any, index: Unit, limit: Unit, callback: Unit, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAt")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Moves the given element to the top of the array.
      * The array is modified in-place.
      * @param array The array.
      * @param item The element to move.
      */
    inline def BringToTop(array: js.Array[Any], item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BringToTop")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Returns the total number of elements in the array which have a property matching the given value.
      * @param array The array to search.
      * @param property The property to test on each array element.
      * @param value The value to test the property against. Must pass a strict (`===`) comparison check.
      * @param startIndex An optional start index to search from.
      * @param endIndex An optional end index to search to.
      */
    inline def CountAllMatching(array: js.Array[Any], property: String, value: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CountAllMatching")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def CountAllMatching(array: js.Array[Any], property: String, value: Any, startIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CountAllMatching")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def CountAllMatching(array: js.Array[Any], property: String, value: Any, startIndex: Double, endIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CountAllMatching")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def CountAllMatching(array: js.Array[Any], property: String, value: Any, startIndex: Unit, endIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CountAllMatching")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Passes each element in the array to the given callback.
      * @param array The array to search.
      * @param callback A callback to be invoked for each item in the array.
      * @param context The context in which the callback is invoked.
      * @param args Additional arguments that will be passed to the callback, after the current array item.
      */
    inline def Each(array: js.Array[Any], callback: js.Function, context: js.Object, args: Any*): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")((scala.List(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Any]]
    
    /**
      * Passes each element in the array, between the start and end indexes, to the given callback.
      * @param array The array to search.
      * @param callback A callback to be invoked for each item in the array.
      * @param context The context in which the callback is invoked.
      * @param startIndex The start index to search from.
      * @param endIndex The end index to search to.
      * @param args Additional arguments that will be passed to the callback, after the child.
      */
    inline def EachInRange(
      array: js.Array[Any],
      callback: js.Function,
      context: js.Object,
      startIndex: Double,
      endIndex: Double,
      args: Any*
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("EachInRange")((scala.List(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Any]]
    
    /**
      * Searches a pre-sorted array for the closet value to the given number.
      * 
      * If the `key` argument is given it will assume the array contains objects that all have the required `key` property name,
      * and will check for the closest value of those to the given number.
      * @param value The value to search for in the array.
      * @param array The array to search, which must be sorted.
      * @param key An optional property key. If specified the array elements property will be checked against value.
      */
    inline def FindClosestInSorted(value: Double, array: js.Array[Any]): Double | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("FindClosestInSorted")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[Double | Any]
    inline def FindClosestInSorted(value: Double, array: js.Array[Any], key: String): Double | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("FindClosestInSorted")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double | Any]
    
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
    inline def GetAll(array: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: String, value: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: String, value: Any, startIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: String, value: Any, startIndex: Double, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: String, value: Any, startIndex: Unit, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: String, value: Unit, startIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: String, value: Unit, startIndex: Double, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: String, value: Unit, startIndex: Unit, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: Unit, value: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: Unit, value: Any, startIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: Unit, value: Any, startIndex: Double, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: Unit, value: Any, startIndex: Unit, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: Unit, value: Unit, startIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: Unit, value: Unit, startIndex: Double, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetAll(array: js.Array[Any], property: Unit, value: Unit, startIndex: Unit, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
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
    inline def GetFirst(array: js.Array[Any]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: String, value: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: String, value: Any, startIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: String, value: Any, startIndex: Double, endIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: String, value: Any, startIndex: Unit, endIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: String, value: Unit, startIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: String, value: Unit, startIndex: Double, endIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: String, value: Unit, startIndex: Unit, endIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: Unit, value: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: Unit, value: Any, startIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: Unit, value: Any, startIndex: Double, endIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: Unit, value: Any, startIndex: Unit, endIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: Unit, value: Unit, startIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: Unit, value: Unit, startIndex: Double, endIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def GetFirst(array: js.Array[Any], property: Unit, value: Unit, startIndex: Unit, endIndex: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /**
      * Returns a Random element from the array.
      * @param array The array to select the random entry from.
      * @param startIndex An optional start index. Default 0.
      * @param length An optional length, the total number of elements (from the startIndex) to choose from. Default array.length.
      */
    inline def GetRandom(array: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRandom")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def GetRandom(array: js.Array[Any], startIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRandom")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def GetRandom(array: js.Array[Any], startIndex: Double, length: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRandom")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def GetRandom(array: js.Array[Any], startIndex: Unit, length: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRandom")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    object Matrix {
      
      @JSGlobal("Phaser.Utils.Array.Matrix")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Checks if an array can be used as a matrix.
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows)
        * have the same length. There must be at least two rows. This is an example matrix:
        * 
        * ```
        * [
        *    [ 1, 1, 1, 1, 1, 1 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 2, 0, 1, 2, 0, 4 ],
        *    [ 2, 0, 3, 4, 0, 4 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 3, 3, 3, 3, 3, 3 ]
        * ]
        * ```
        * @param matrix The array to check.
        */
      inline def CheckMatrix[T](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("CheckMatrix")().asInstanceOf[Boolean]
      inline def CheckMatrix[T](matrix: js.Array[js.Array[T]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("CheckMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Generates a string (which you can pass to console.log) from the given Array Matrix.
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows)
        * have the same length. There must be at least two rows. This is an example matrix:
        * 
        * ```
        * [
        *    [ 1, 1, 1, 1, 1, 1 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 2, 0, 1, 2, 0, 4 ],
        *    [ 2, 0, 3, 4, 0, 4 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 3, 3, 3, 3, 3, 3 ]
        * ]
        * ```
        * @param matrix A 2-dimensional array.
        */
      inline def MatrixToString[T](): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MatrixToString")().asInstanceOf[String]
      inline def MatrixToString[T](matrix: js.Array[js.Array[T]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MatrixToString")(matrix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Reverses the columns in the given Array Matrix.
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows)
        * have the same length. There must be at least two rows. This is an example matrix:
        * 
        * ```
        * [
        *    [ 1, 1, 1, 1, 1, 1 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 2, 0, 1, 2, 0, 4 ],
        *    [ 2, 0, 3, 4, 0, 4 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 3, 3, 3, 3, 3, 3 ]
        * ]
        * ```
        * @param matrix The array matrix to reverse the columns for.
        */
      inline def ReverseColumns[T](): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ReverseColumns")().asInstanceOf[js.Array[js.Array[T]]]
      inline def ReverseColumns[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ReverseColumns")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
      
      /**
        * Reverses the rows in the given Array Matrix.
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows)
        * have the same length. There must be at least two rows. This is an example matrix:
        * 
        * ```
        * [
        *    [ 1, 1, 1, 1, 1, 1 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 2, 0, 1, 2, 0, 4 ],
        *    [ 2, 0, 3, 4, 0, 4 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 3, 3, 3, 3, 3, 3 ]
        * ]
        * ```
        * @param matrix The array matrix to reverse the rows for.
        */
      inline def ReverseRows[T](): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ReverseRows")().asInstanceOf[js.Array[js.Array[T]]]
      inline def ReverseRows[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ReverseRows")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
      
      /**
        * Rotates the array matrix 180 degrees.
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows)
        * have the same length. There must be at least two rows. This is an example matrix:
        * 
        * ```
        * [
        *    [ 1, 1, 1, 1, 1, 1 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 2, 0, 1, 2, 0, 4 ],
        *    [ 2, 0, 3, 4, 0, 4 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 3, 3, 3, 3, 3, 3 ]
        * ]
        * ```
        * @param matrix The array to rotate.
        */
      inline def Rotate180[T](): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Rotate180")().asInstanceOf[js.Array[js.Array[T]]]
      inline def Rotate180[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Rotate180")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
      
      /**
        * Rotates the array matrix to the left (or 90 degrees)
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows)
        * have the same length. There must be at least two rows. This is an example matrix:
        * 
        * ```
        * [
        *    [ 1, 1, 1, 1, 1, 1 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 2, 0, 1, 2, 0, 4 ],
        *    [ 2, 0, 3, 4, 0, 4 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 3, 3, 3, 3, 3, 3 ]
        * ]
        * ```
        * @param matrix The array to rotate.
        */
      inline def RotateLeft[T](): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("RotateLeft")().asInstanceOf[js.Array[js.Array[T]]]
      inline def RotateLeft[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("RotateLeft")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
      
      /**
        * Rotates the array matrix based on the given rotation value.
        * 
        * The value can be given in degrees: 90, -90, 270, -270 or 180,
        * or a string command: `rotateLeft`, `rotateRight` or `rotate180`.
        * 
        * Based on the routine from {@link http://jsfiddle.net/MrPolywhirl/NH42z/}.
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows)
        * have the same length. There must be at least two rows. This is an example matrix:
        * 
        * ```
        * [
        *    [ 1, 1, 1, 1, 1, 1 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 2, 0, 1, 2, 0, 4 ],
        *    [ 2, 0, 3, 4, 0, 4 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 3, 3, 3, 3, 3, 3 ]
        * ]
        * ```
        * @param matrix The array to rotate.
        * @param direction The amount to rotate the matrix by. Default 90.
        */
      inline def RotateMatrix[T](): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("RotateMatrix")().asInstanceOf[js.Array[js.Array[T]]]
      inline def RotateMatrix[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("RotateMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
      inline def RotateMatrix[T](matrix: js.Array[js.Array[T]], direction: String): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateMatrix")(matrix.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
      inline def RotateMatrix[T](matrix: js.Array[js.Array[T]], direction: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateMatrix")(matrix.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
      inline def RotateMatrix[T](matrix: Unit, direction: String): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateMatrix")(matrix.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
      inline def RotateMatrix[T](matrix: Unit, direction: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateMatrix")(matrix.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
      
      /**
        * Rotates the array matrix to the left (or -90 degrees)
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows)
        * have the same length. There must be at least two rows. This is an example matrix:
        * 
        * ```
        * [
        *    [ 1, 1, 1, 1, 1, 1 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 2, 0, 1, 2, 0, 4 ],
        *    [ 2, 0, 3, 4, 0, 4 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 3, 3, 3, 3, 3, 3 ]
        * ]
        * ```
        * @param matrix The array to rotate.
        */
      inline def RotateRight[T](): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("RotateRight")().asInstanceOf[js.Array[js.Array[T]]]
      inline def RotateRight[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("RotateRight")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
      
      /**
        * Translates the given Array Matrix by shifting each column and row the
        * amount specified.
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows)
        * have the same length. There must be at least two rows. This is an example matrix:
        * 
        * ```
        * [
        *    [ 1, 1, 1, 1, 1, 1 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 2, 0, 1, 2, 0, 4 ],
        *    [ 2, 0, 3, 4, 0, 4 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 3, 3, 3, 3, 3, 3 ]
        * ]
        * ```
        * @param matrix The array matrix to translate.
        * @param x The amount to horizontally translate the matrix by. Default 0.
        * @param y The amount to vertically translate the matrix by. Default 0.
        */
      inline def Translate[T](): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Translate")().asInstanceOf[js.Array[js.Array[T]]]
      inline def Translate[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Translate")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
      inline def Translate[T](matrix: js.Array[js.Array[T]], x: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Translate")(matrix.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
      inline def Translate[T](matrix: js.Array[js.Array[T]], x: Double, y: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Translate")(matrix.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
      inline def Translate[T](matrix: js.Array[js.Array[T]], x: Unit, y: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Translate")(matrix.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
      inline def Translate[T](matrix: Unit, x: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Translate")(matrix.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
      inline def Translate[T](matrix: Unit, x: Double, y: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Translate")(matrix.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
      inline def Translate[T](matrix: Unit, x: Unit, y: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Translate")(matrix.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
      
      /**
        * Transposes the elements of the given matrix (array of arrays).
        * 
        * The transpose of a matrix is a new matrix whose rows are the columns of the original.
        * 
        * A matrix is a two-dimensional array (array of arrays), where all sub-arrays (rows)
        * have the same length. There must be at least two rows. This is an example matrix:
        * 
        * ```
        * [
        *    [ 1, 1, 1, 1, 1, 1 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 2, 0, 1, 2, 0, 4 ],
        *    [ 2, 0, 3, 4, 0, 4 ],
        *    [ 2, 0, 0, 0, 0, 4 ],
        *    [ 3, 3, 3, 3, 3, 3 ]
        * ]
        * ```
        * @param array The array matrix to transpose.
        */
      inline def TransposeMatrix[T](): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("TransposeMatrix")().asInstanceOf[js.Array[js.Array[T]]]
      inline def TransposeMatrix[T](array: js.Array[js.Array[T]]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("TransposeMatrix")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
    }
    
    /**
      * Moves the given array element above another one in the array.
      * The array is modified in-place.
      * @param array The input array.
      * @param item1 The element to move above base element.
      * @param item2 The base element.
      */
    inline def MoveAbove(array: js.Array[Any], item1: Any, item2: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MoveAbove")(array.asInstanceOf[js.Any], item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Moves the given array element below another one in the array.
      * The array is modified in-place.
      * @param array The input array.
      * @param item1 The element to move below base element.
      * @param item2 The base element.
      */
    inline def MoveBelow(array: js.Array[Any], item1: Any, item2: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MoveBelow")(array.asInstanceOf[js.Any], item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Moves the given array element down one place in the array.
      * The array is modified in-place.
      * @param array The input array.
      * @param item The element to move down the array.
      */
    inline def MoveDown(array: js.Array[Any], item: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MoveDown")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Moves an element in an array to a new position within the same array.
      * The array is modified in-place.
      * @param array The array.
      * @param item The element to move.
      * @param index The new index that the element will be moved to.
      */
    inline def MoveTo(array: js.Array[Any], item: Any, index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("MoveTo")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Moves the given array element up one place in the array.
      * The array is modified in-place.
      * @param array The input array.
      * @param item The element to move up the array.
      */
    inline def MoveUp(array: js.Array[Any], item: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MoveUp")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Create an array representing the range of numbers (usually integers), between, and inclusive of,
      * the given `start` and `end` arguments. For example:
      * 
      * `var array = Phaser.Utils.Array.NumberArray(2, 4); // array = [2, 3, 4]`
      * `var array = Phaser.Utils.Array.NumberArray(0, 9); // array = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]`
      * `var array = Phaser.Utils.Array.NumberArray(8, 2); // array = [8, 7, 6, 5, 4, 3, 2]`
      * 
      * This is equivalent to `Phaser.Utils.Array.NumberArrayStep(start, end, 1)`.
      * 
      * You can optionally provide a prefix and / or suffix string. If given the array will contain
      * strings, not integers. For example:
      * 
      * `var array = Phaser.Utils.Array.NumberArray(1, 4, 'Level '); // array = ["Level 1", "Level 2", "Level 3", "Level 4"]`
      * `var array = Phaser.Utils.Array.NumberArray(5, 7, 'HD-', '.png'); // array = ["HD-5.png", "HD-6.png", "HD-7.png"]`
      * @param start The minimum value the array starts with.
      * @param end The maximum value the array contains.
      * @param prefix Optional prefix to place before the number. If provided the array will contain strings, not integers.
      * @param suffix Optional suffix to place after the number. If provided the array will contain strings, not integers.
      */
    inline def NumberArray(start: Double, end: Double): js.Array[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberArray")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double | String]]
    inline def NumberArray(start: Double, end: Double, prefix: String): js.Array[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberArray")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double | String]]
    inline def NumberArray(start: Double, end: Double, prefix: String, suffix: String): js.Array[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberArray")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double | String]]
    inline def NumberArray(start: Double, end: Double, prefix: Unit, suffix: String): js.Array[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberArray")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double | String]]
    
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
    inline def NumberArrayStep(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("NumberArrayStep")().asInstanceOf[js.Array[Double]]
    inline def NumberArrayStep(start: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("NumberArrayStep")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def NumberArrayStep(start: Double, end: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberArrayStep")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def NumberArrayStep(start: Double, end: Double, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberArrayStep")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def NumberArrayStep(start: Double, end: Unit, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberArrayStep")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def NumberArrayStep(start: Unit, end: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberArrayStep")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def NumberArrayStep(start: Unit, end: Double, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberArrayStep")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def NumberArrayStep(start: Unit, end: Unit, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberArrayStep")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
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
    inline def QuickSelect(arr: js.Array[Any], k: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSelect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def QuickSelect(arr: js.Array[Any], k: Double, left: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSelect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def QuickSelect(arr: js.Array[Any], k: Double, left: Double, right: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSelect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def QuickSelect(arr: js.Array[Any], k: Double, left: Double, right: Double, compare: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSelect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def QuickSelect(arr: js.Array[Any], k: Double, left: Double, right: Unit, compare: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSelect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def QuickSelect(arr: js.Array[Any], k: Double, left: Unit, right: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSelect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def QuickSelect(arr: js.Array[Any], k: Double, left: Unit, right: Double, compare: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSelect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def QuickSelect(arr: js.Array[Any], k: Double, left: Unit, right: Unit, compare: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSelect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def Range(a: js.Array[Any], b: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def Range(a: js.Array[Any], b: js.Array[Any], options: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def Remove(array: js.Array[Any], item: js.Array[Any]): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
    inline def Remove(array: js.Array[Any], item: js.Array[Any], callback: js.Function): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
    inline def Remove(array: js.Array[Any], item: js.Array[Any], callback: js.Function, context: js.Object): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
    inline def Remove(array: js.Array[Any], item: js.Array[Any], callback: Unit, context: js.Object): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
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
    inline def Remove(array: js.Array[Any], item: Any): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
    inline def Remove(array: js.Array[Any], item: Any, callback: js.Function): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
    inline def Remove(array: js.Array[Any], item: Any, callback: js.Function, context: js.Object): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
    inline def Remove(array: js.Array[Any], item: Any, callback: Unit, context: js.Object): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
    
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
    inline def RemoveAt(array: js.Array[Any], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveAt")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def RemoveAt(array: js.Array[Any], index: Double, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveAt")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def RemoveAt(array: js.Array[Any], index: Double, callback: js.Function, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveAt")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def RemoveAt(array: js.Array[Any], index: Double, callback: Unit, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveAt")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
    
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
    inline def RemoveBetween(array: js.Array[Any], startIndex: Double, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveBetween")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def RemoveBetween(array: js.Array[Any], startIndex: Double, endIndex: Double, callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveBetween")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def RemoveBetween(
      array: js.Array[Any],
      startIndex: Double,
      endIndex: Double,
      callback: js.Function,
      context: js.Object
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveBetween")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def RemoveBetween(array: js.Array[Any], startIndex: Double, endIndex: Double, callback: Unit, context: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveBetween")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Removes a random object from the given array and returns it.
      * Will return null if there are no array items that fall within the specified range or if there is no item for the randomly chosen index.
      * @param array The array to removed a random element from.
      * @param start The array index to start the search from. Default 0.
      * @param length Optional restriction on the number of elements to randomly select from. Default array.length.
      */
    inline def RemoveRandomElement(array: js.Array[Any]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("RemoveRandomElement")(array.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    inline def RemoveRandomElement(array: js.Array[Any], start: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveRandomElement")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def RemoveRandomElement(array: js.Array[Any], start: Double, length: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveRandomElement")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def RemoveRandomElement(array: js.Array[Any], start: Unit, length: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveRandomElement")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /**
      * Replaces an element of the array with the new element.
      * The new element cannot already be a member of the array.
      * The array is modified in-place.
      * @param array The array to search within.
      * @param oldChild The element in the array that will be replaced.
      * @param newChild The element to be inserted into the array at the position of `oldChild`.
      */
    inline def Replace(array: js.Array[Any], oldChild: Any, newChild: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Replace")(array.asInstanceOf[js.Any], oldChild.asInstanceOf[js.Any], newChild.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Moves the element at the start of the array to the end, shifting all items in the process.
      * The "rotation" happens to the left.
      * @param array The array to shift to the left. This array is modified in place.
      * @param total The number of times to shift the array. Default 1.
      */
    inline def RotateLeft(array: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RotateLeft")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def RotateLeft(array: js.Array[Any], total: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateLeft")(array.asInstanceOf[js.Any], total.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Moves the element at the end of the array to the start, shifting all items in the process.
      * The "rotation" happens to the right.
      * @param array The array to shift to the right. This array is modified in place.
      * @param total The number of times to shift the array. Default 1.
      */
    inline def RotateRight(array: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RotateRight")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def RotateRight(array: js.Array[Any], total: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateRight")(array.asInstanceOf[js.Any], total.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Tests if the start and end indexes are a safe range for the given array.
      * @param array The array to check.
      * @param startIndex The start index.
      * @param endIndex The end index.
      * @param throwError Throw an error if the range is out of bounds. Default true.
      */
    inline def SafeRange(array: js.Array[Any], startIndex: Double, endIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SafeRange")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def SafeRange(array: js.Array[Any], startIndex: Double, endIndex: Double, throwError: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SafeRange")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], throwError.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Moves the given element to the bottom of the array.
      * The array is modified in-place.
      * @param array The array.
      * @param item The element to move.
      */
    inline def SendToBack(array: js.Array[Any], item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("SendToBack")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
    
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
    inline def SetAll(array: js.Array[Any], property: String, value: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def SetAll(array: js.Array[Any], property: String, value: Any, startIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def SetAll(array: js.Array[Any], property: String, value: Any, startIndex: Double, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def SetAll(array: js.Array[Any], property: String, value: Any, startIndex: Unit, endIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAll")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Shuffles the contents of the given array using the Fisher-Yates implementation.
      * 
      * The original array is modified directly and returned.
      * @param array The array to shuffle. This array is modified in place.
      */
    inline def Shuffle[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    /**
      * Takes the given array and runs a numeric sort on it, ignoring any non-digits that
      * may be in the entries.
      * 
      * You should only run this on arrays containing strings.
      * @param array The input array of strings.
      */
    inline def SortByDigits(array: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SortByDigits")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Removes a single item from an array and returns it without creating gc, like the native splice does.
      * Based on code by Mike Reinstein.
      * @param array The array to splice from.
      * @param index The index of the item which should be spliced.
      */
    inline def SpliceOne(array: js.Array[Any], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("SpliceOne")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * An in-place stable array sort, because `Array#sort()` is not guaranteed stable.
      * 
      * This is an implementation of merge sort, without recursion.
      * 
      * Function based on the Two-Screen/stable sort 0.1.8 from https://github.com/Two-Screen/stable
      * @param array The input array to be sorted.
      * @param compare The comparison function.
      */
    inline def StableSort(array: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("StableSort")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def StableSort(array: js.Array[Any], compare: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("StableSort")(array.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Swaps the position of two elements in the given array.
      * The elements must exist in the same array.
      * The array is modified in-place.
      * @param array The input array.
      * @param item1 The first element to swap.
      * @param item2 The second element to swap.
      */
    inline def Swap(array: js.Array[Any], item1: Any, item2: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Swap")(array.asInstanceOf[js.Any], item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  }
  
  object Base64 {
    
    @JSGlobal("Phaser.Utils.Base64")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts an ArrayBuffer into a base64 string.
      * 
      * The resulting string can optionally be a data uri if the `mediaType` argument is provided.
      * 
      * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs for more details.
      * @param arrayBuffer The Array Buffer to encode.
      * @param mediaType An optional media type, i.e. `audio/ogg` or `image/jpeg`. If included the resulting string will be a data URI.
      */
    inline def ArrayBufferToBase64(arrayBuffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayBufferToBase64")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def ArrayBufferToBase64(arrayBuffer: js.typedarray.ArrayBuffer, mediaType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayBufferToBase64")(arrayBuffer.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Converts a base64 string, either with or without a data uri, into an Array Buffer.
      * @param base64 The base64 string to be decoded. Can optionally contain a data URI header, which will be stripped out prior to decoding.
      */
    inline def Base64ToArrayBuffer(base64: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("Base64ToArrayBuffer")(base64.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  }
  
  /**
    * A NOOP (No Operation) callback function.
    * 
    * Used internally by Phaser when it's more expensive to determine if a callback exists
    * than it is to just invoke an empty function.
    */
  inline def NOOP(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("NOOP")().asInstanceOf[Unit]
  
  object Objects {
    
    @JSGlobal("Phaser.Utils.Objects")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Shallow Object Clone. Will not clone nested objects.
      * @param obj The object to clone.
      */
    inline def Clone(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * Deep Copy the given object or array.
      * @param obj The object to deep copy.
      */
    inline def DeepCopy(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * This is a slightly modified version of http://api.jquery.com/jQuery.extend/
      * @param args The objects that will be mixed.
      */
    inline def Extend(args: Any*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Extend")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Object]
    
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
    inline def GetAdvancedValue(source: js.Object, key: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAdvancedValue")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Finds the key within the top level of the {@link source} object, or returns {@link defaultValue}
      * @param source The object to search
      * @param key The key for the property on source. Must exist at the top level of the source object (no periods)
      * @param defaultValue The default value to use if the key does not exist.
      */
    inline def GetFastValue(source: js.Object, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFastValue")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def GetFastValue(source: js.Object, key: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFastValue")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Retrieves and clamps a numerical value from an object.
      * @param source The object to retrieve the value from.
      * @param key The name of the property to retrieve from the object. If a property is nested, the names of its preceding properties should be separated by a dot (`.`).
      * @param min The minimum value which can be returned.
      * @param max The maximum value which can be returned.
      * @param defaultValue The value to return if the property doesn't exist. It's also constrained to the given bounds.
      */
    inline def GetMinMaxValue(source: js.Object, key: String, min: Double, max: Double, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetMinMaxValue")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Retrieves a value from an object.
      * @param source The object to retrieve the value from.
      * @param key The name of the property to retrieve from the object. If a property is nested, the names of its preceding properties should be separated by a dot (`.`) - `banner.hideBanner` would return the value of the `hideBanner` property from the object stored in the `banner` property of the `source` object.
      * @param defaultValue The value to return if the `key` isn't found in the `source` object.
      */
    inline def GetValue(source: js.Object, key: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetValue")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Verifies that an object contains all requested keys
      * @param source an object on which to check for key existence
      * @param keys an array of keys to ensure the source object contains
      */
    inline def HasAll(source: js.Object, keys: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("HasAll")(source.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Verifies that an object contains at least one of the requested keys
      * @param source an object on which to check for key existence
      * @param keys an array of keys to search the object for
      */
    inline def HasAny(source: js.Object, keys: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("HasAny")(source.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determine whether the source object has a property with the specified key.
      * @param source The source object to be checked.
      * @param key The property to check for within the object
      */
    inline def HasValue(source: js.Object, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("HasValue")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * This is a slightly modified version of jQuery.isPlainObject.
      * A plain object is an object whose internal class property is [object Object].
      * @param obj The object to inspect.
      */
    inline def IsPlainObject(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Creates a new Object using all values from obj1 and obj2.
      * If a value exists in both obj1 and obj2, the value in obj1 is used.
      * 
      * This is only a shallow copy. Deeply nested objects are not cloned, so be sure to only use this
      * function on shallow objects.
      * @param obj1 The first object.
      * @param obj2 The second object.
      */
    inline def Merge(obj1: js.Object, obj2: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("Merge")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /**
      * Creates a new Object using all values from obj1.
      * 
      * Then scans obj2. If a property is found in obj2 that *also* exists in obj1, the value from obj2 is used, otherwise the property is skipped.
      * @param obj1 The first object to merge.
      * @param obj2 The second object to merge. Keys from this object which also exist in `obj1` will be copied to `obj1`.
      */
    inline def MergeRight(obj1: js.Object, obj2: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeRight")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /**
      * Returns a new object that only contains the `keys` that were found on the object provided.
      * If no `keys` are found, an empty object is returned.
      * @param object The object to pick the provided keys from.
      * @param keys An array of properties to retrieve from the provided object.
      */
    inline def Pick(`object`: js.Object, keys: js.Array[Any]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("Pick")(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
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
    inline def SetValue(source: js.Object, key: String, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SetValue")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object String {
    
    @JSGlobal("Phaser.Utils.String")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes a string and replaces instances of markers with values in the given array.
      * The markers take the form of `%1`, `%2`, etc. I.e.:
      * 
      * `Format("The %1 is worth %2 gold", [ 'Sword', 500 ])`
      * @param string The string containing the replacement markers.
      * @param values An array containing values that will replace the markers. If no value exists an empty string is inserted instead.
      */
    inline def Format(string: java.lang.String, values: js.Array[Any]): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Format")(string.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
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
    inline def Pad(str: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def Pad(str: java.lang.String, len: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: java.lang.String, len: Double, pad: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: java.lang.String, len: Double, pad: java.lang.String, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: java.lang.String, len: Double, pad: Unit, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: java.lang.String, len: Unit, pad: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: java.lang.String, len: Unit, pad: java.lang.String, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: java.lang.String, len: Unit, pad: Unit, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: js.Object): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def Pad(str: js.Object, len: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: js.Object, len: Double, pad: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: js.Object, len: Double, pad: java.lang.String, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: js.Object, len: Double, pad: Unit, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: js.Object, len: Unit, pad: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: js.Object, len: Unit, pad: java.lang.String, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: js.Object, len: Unit, pad: Unit, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def Pad(str: Double, len: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: Double, len: Double, pad: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: Double, len: Double, pad: java.lang.String, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: Double, len: Double, pad: Unit, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: Double, len: Unit, pad: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: Double, len: Unit, pad: java.lang.String, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def Pad(str: Double, len: Unit, pad: Unit, dir: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("Pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /**
      * Takes a string and removes the character at the given index.
      * @param string The string to be worked on.
      * @param index The index of the character to be removed.
      */
    inline def RemoveAt(string: java.lang.String, index: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveAt")(string.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /**
      * Takes the given string and reverses it, returning the reversed string.
      * For example if given the string `Atari 520ST` it would return `TS025 iratA`.
      * @param string The string to be reversed.
      */
    inline def Reverse(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("Reverse")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /**
      * Creates and returns an RFC4122 version 4 compliant UUID.
      * 
      * The string is in the form: `xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx` where each `x` is replaced with a random
      * hexadecimal digit from 0 to f, and `y` is replaced with a random hexadecimal digit from 8 to b.
      */
    inline def UUID(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("UUID")().asInstanceOf[java.lang.String]
    
    /**
      * Capitalizes the first letter of a string if there is one.
      * @param str The string to capitalize.
      */
    inline def UppercaseFirst(str: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("UppercaseFirst")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  }
}
