package typings.mojangMinecraft.mod

import typings.std.Iterable
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EnchantmentList")
@js.native
open class EnchantmentList protected ()
  extends StObject
     with Iterable[Enchantment] {
  def this(enchantmentSlot: Double) = this()
  
  /**
    * @remarks
    * Attempts to add the enchantment to this collection. Returns
    * true if successful.
    * @param enchantment
    */
  def addEnchantment(enchantment: Enchantment): Boolean = js.native
  
  /**
    * @remarks
    * Returns whether or not the provided EnchantmentInstance can
    * be added to this collection.
    * @param enchantment
    */
  def canAddEnchantment(enchantment: Enchantment): Boolean = js.native
  
  /**
    * @remarks
    * Returns an enchantment associated with a type.
    * @param enchantmentType
    */
  def getEnchantment(enchantmentType: EnchantmentType): Enchantment = js.native
  
  /**
    * @remarks
    * If this collection has an EnchantmentInstance with type,
    * returns the level of the enchantment. Returns 0 if not
    * present.
    * @param enchantmentType
    */
  def hasEnchantment(enchantmentType: EnchantmentType): Double = js.native
  
  def next(): IteratorResult[Enchantment, Any] = js.native
  
  /**
    * @remarks
    * Removes an EnchantmentInstance with type from this
    * collection if present.
    * @param enchantmentType
    */
  def removeEnchantment(enchantmentType: EnchantmentType): Unit = js.native
  
  /**
    * The item slot/type that this collection is applied to.
    */
  val slot: Double = js.native
}
