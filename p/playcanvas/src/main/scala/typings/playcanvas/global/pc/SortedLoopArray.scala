package typings.playcanvas.global.pc

import typings.playcanvas.anon.SortBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class used to hold an array of items in a specific order. This array is safe to modify
  * while we loop through it. The class assumes that it holds objects that need to be sorted based
  * on one of their fields.
  *
  * @ignore
  */
@JSGlobal("pc.SortedLoopArray")
@js.native
open class SortedLoopArray protected ()
  extends typings.playcanvas.mod.SortedLoopArray {
  /**
    * Create a new SortedLoopArray instance.
    *
    * @param {object} args - Arguments.
    * @param {string} args.sortBy - The name of the field that each element in the array is going
    * to be sorted by.
    * @example
    * const array = new pc.SortedLoopArray({ sortBy: 'priority' });
    * array.insert(item); // adds item to the right slot based on item.priority
    * array.append(item); // adds item to the end of the array
    * array.remove(item); // removes item from array
    * for (array.loopIndex = 0; array.loopIndex < array.length; array.loopIndex++) {
    *   // do things with array elements
    *   // safe to remove and add elements into the array while looping
    * }
    */
  def this(args: SortBy) = this()
}
