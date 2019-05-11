package typings
package phaserLib.PhaserNs.StructsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("Phaser.Structs.ProcessQueue")
@js.native
class ProcessQueue[T] () extends js.Object {
  /**
    * Adds a new item to the Process Queue.
    * The item is added to the pending list and made active in the next update.
    * @param item The item to add to the queue.
    */
  def add(item: T): ProcessQueue[T] = js.native
  /**
    * Immediately destroys this process queue, clearing all of its internal arrays and resetting the process totals.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Returns the current list of active items.
    */
  def getActive(): js.Array[T] = js.native
  /**
    * Removes an item from the Process Queue.
    * The item is added to the pending destroy and fully removed in the next update.
    * @param item The item to be removed from the queue.
    */
  def remove(item: T): ProcessQueue[T] = js.native
  /**
    * Update this queue. First it will process any items awaiting destruction, and remove them.
    * 
    * Then it will check to see if there are any items pending insertion, and move them to an
    * active state. Finally, it will return a list of active items for further processing.
    */
  def update(): js.Array[T] = js.native
}

