package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "IntBlockProperty")
@js.native
/* protected */ open class IntBlockProperty () extends IBlockProperty {
  
  /**
    * A list of valid values for this particular property.
    */
  val validValues: js.Array[Double] = js.native
  
  /**
    * The current value of this property.
    * @throws
    * Setting this property can throw if the value passed is not
    * valid for the property. Use
    * {@link mojang-minecraft.IntBlockProperty.validValues} to check
    * allowed values.
    */
  var value: Double = js.native
}
