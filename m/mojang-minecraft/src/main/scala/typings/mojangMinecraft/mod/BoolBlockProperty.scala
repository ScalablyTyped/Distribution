package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BoolBlockProperty")
@js.native
/* protected */ open class BoolBlockProperty () extends IBlockProperty {
  
  /**
    * A list of valid values for this property.
    */
  val validValues: js.Array[Boolean] = js.native
  
  /**
    * The current value of this property.
    * @throws
    * Setting this property can throw if the value passed is not
    * valid for the property. Use
    * {@link mojang-minecraft.BoolBlockProperty.validValues} to check
    * allowed values.
    */
  var value: Boolean = js.native
}
