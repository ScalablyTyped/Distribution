package typings.numberAllocator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibNumberAllocatorMod {
  
  @JSImport("number-allocator/types/lib/number-allocator", "NumberAllocator")
  @js.native
  open class NumberAllocator protected () extends StObject {
    /**
      * NumberAllocator constructor.
      * The all numbers are set to vacant status.
      * Time Complexity O(1)
      * @constructor
      * @param {number} min  - The maximum number of allocatable. The number must be integer.
      * @param {number} maxh - The minimum number of allocatable. The number must be integer.
      */
    def this(min: Double, max: Double) = this()
    
    /**
      * Allocate the first vacant number. The number become occupied status.
      * Time Complexity O(1)
      * @return {number} - The first vacant number. If all numbers are occupied, return null.
      */
    def alloc(): Double | Null = js.native
    
    /**
      * Clear all occupied numbers.
      * The all numbers are set to vacant status.
      * Time Complexity O(1)
      */
    def clear(): Unit = js.native
    
    /**
      * Dump the internal structor of the library.
      * This function is for debugging.
      * Time Complexity O(N) : N is the number of intervals (not numbers)
      */
    def dump(): Unit = js.native
    
    /**
      * Get the first vacant number. The status of the number is not updated.
      * Time Complexity O(1)
      * @return {number} - The first vacant number. If all numbers are occupied, return null.
      *                    When alloc() is called then the same value will be allocated.
      */
    def firstVacant(): Double | Null = js.native
    
    /**
      * Deallocate the number. The number become vacant status.
      * Time Complexity O(logN) : N is the number of intervals (not numbers)
      * @param {number} num - The number to deallocate. The number must be occupied status.
      *                       In other words, the number must be allocated by alloc() or occupied be use().
      */
    def free(num: Double): Unit = js.native
    
    /**
      * Get the number of intervals. Interval is internal structure of this library.
      * This function is for debugging.
      * Time Complexity O(1)
      * @return {number} - The number of intervals.
      */
    def intervalCount(): Double = js.native
    
    /**
      * Use the number. The number become occupied status.
      * If the number has already been occupied, then return false.
      * Time Complexity O(logN) : N is the number of intervals (not numbers)
      * @param {number} num - The number to request use.
      * @return {Boolean} - If `num` was not occupied, then return true, otherwise return false.
      */
    def use(num: Double): Boolean = js.native
  }
}
