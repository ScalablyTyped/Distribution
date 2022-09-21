package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Container")
@js.native
/* protected */ open class Container () extends StObject {
  
  /**
    * @remarks
    * Adds an item to the specified container. Item will be placed
    * in the first available empty slot. (use .setItem if you wish
    * to set items in a particular slot.)
    * @param itemStack
    * The stack of items to add.
    * @throws This function can throw errors.
    */
  def addItem(itemStack: ItemStack): Unit = js.native
  
  /**
    * Contains a count of the slots in the container that are
    * empty.
    * @throws This property can throw when used.
    */
  val emptySlotsCount: Double = js.native
  
  /**
    * @remarks
    * Gets the item stack for the set of items at the specified
    * slot. If the slot is empty, returns undefined. This method
    * does not change or clear the contents of the specified slot.
    * @param slot
    * Zero-based index of the slot to retrieve items from.
    * @throws This function can throw errors.
    * @example getItem.js
    * ```typescript
    *        const rightInventoryComp = rightChestCart.getComponent("inventory");
    *        const rightChestContainer = rightInventoryComp.container;
    *
    *        const itemStack = rightChestContainer.getItem(0);
    *
    *        test.assert(itemStack.id === "apple", "Expected apple");
    *        test.assert(itemStack.amount === 10, "Expected 10 apples");
    * ```
    */
  def getItem(slot: Double): ItemStack = js.native
  
  /**
    * @remarks
    * Sets an item stack within a particular slot.
    * @param slot
    * Zero-based index of the slot to set an item at.
    * @param itemStack
    * Stack of items to place within the specified slot.
    * @throws This function can throw errors.
    */
  def setItem(slot: Double, itemStack: ItemStack): Unit = js.native
  
  /**
    * Represents the size of the container. For example, a
    * standard single-block chest has a size of 27, for the 27
    * slots in their inventory.
    * @throws This property can throw when used.
    */
  val size: Double = js.native
  
  /**
    * @remarks
    * Swaps items between two different slots within containers.
    * @param slot
    * Zero-based index of the slot to swap from this container.
    * @param otherSlot
    * Zero-based index of the slot to swap with.
    * @param otherContainer
    * Target container to swap with. Note this can be the same
    * container as this source.
    * @throws This function can throw errors.
    * @example swapItems.js
    * ```typescript
    *        rightChestContainer.swapItems(1, 0, leftChestContainer); // swap the cake and emerald
    *
    * ```
    */
  def swapItems(slot: Double, otherSlot: Double, otherContainer: Container): Boolean = js.native
  
  /**
    * @remarks
    * Moves an item from one slot to another, potentially across
    * containers.
    * @param fromSlot
    * @param toSlot
    * Zero-based index of the slot to move to.
    * @param toContainer
    * Target container to transfer to. Note this can be the same
    * container as the source.
    * @throws This function can throw errors.
    * @example transferItem.js
    * ```typescript
    *        rightChestContainer.transferItem(0, 4, chestCartContainer); // transfer the apple from the right chest to a chest cart
    *
    * ```
    */
  def transferItem(fromSlot: Double, toSlot: Double, toContainer: Container): Boolean = js.native
}
