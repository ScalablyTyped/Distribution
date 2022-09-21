package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Enchantment")
@js.native
open class Enchantment protected () extends StObject {
  def this(enchantmentType: EnchantmentType) = this()
  def this(enchantmentType: EnchantmentType, level: Double) = this()
  
  /**
    * The level of this enchantment instance.
    */
  var level: Double = js.native
  
  /**
    * The enchantment type of this instance.
    */
  val `type`: EnchantmentType = js.native
}
