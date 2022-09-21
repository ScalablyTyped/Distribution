package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemStack")
@js.native
open class ItemStack protected () extends StObject {
  /**
    * @remarks
    * Creates a new instance of a stack of items for use in the
    * world.
    * @param itemType
    * Type of item to create. See the
    * {@link mojang-minecraft.MinecraftItemTypes} enumeration for a list
    * of standard item types in Minecraft experiences.
    * @param amount
    * Number of items to place in the stack, between 1 and 64.
    * Note that certain items can only have one item in the stack.
    * @param data
    * Optional data value used for creating the item, or 0 if no
    * data value is specified.
    */
  def this(itemType: ItemType) = this()
  def this(itemType: ItemType, amount: Double) = this()
  def this(itemType: ItemType, amount: Double, data: Double) = this()
  def this(itemType: ItemType, amount: Unit, data: Double) = this()
  
  /**
    * Number of the items in the stack. Valid values range between
    * 0 and 64.
    */
  var amount: Double = js.native
  
  /**
    * A data value used to configure alternate states of the item.
    */
  var data: Double = js.native
  
  /**
    * @remarks
    * Gets a component (that represents additional capabilities)
    * for an item stack.
    * @param componentId
    * The identifier of the component (e.g., 'minecraft:food') to
    * retrieve. If no namespace prefix is specified, 'minecraft:'
    * is assumed. If the component is not present on the item
    * stack, undefined is returned.
    */
  def getComponent(componentId: String): Any = js.native
  
  /**
    * @remarks
    * Returns all components that are both present on this item
    * stack and supported by the API.
    */
  def getComponents(): js.Array[Any] = js.native
  
  /**
    * @remarks
    * Returns the lore value - a secondary display string - for an
    * ItemStack.
    */
  def getLore(): js.Array[String] = js.native
  
  /**
    * @remarks
    * Returns true if the specified component is present on this
    * item stack.
    * @param componentId
    * The identifier of the component (e.g., 'minecraft:food') to
    * retrieve. If no namespace prefix is specified, 'minecraft:'
    * is assumed.
    */
  def hasComponent(componentId: String): Boolean = js.native
  
  /**
    * Identifier of the type of items for the stack. If a
    * namespace is not specified, 'minecraft:' is assumed.
    * Examples include 'wheat' or 'apple'.
    */
  val id: String = js.native
  
  /**
    * Given name of this stack of items.
    */
  var nameTag: js.UndefOr[String] = js.native
  
  /**
    * @remarks
    * Sets the lore value - a secondary display string - for an
    * ItemStack.
    * @param loreList
    */
  def setLore(loreList: js.Array[String]): Unit = js.native
  
  /**
    * @remarks
    * Triggers an item type event. For custom items, a number of
    * events are defined in an items' definition for key item
    * behaviors.
    * @param eventName
    * Name of the item type event to trigger. If a namespace is
    * not specified, minecraft: is assumed.
    */
  def triggerEvent(eventName: String): Unit = js.native
}
