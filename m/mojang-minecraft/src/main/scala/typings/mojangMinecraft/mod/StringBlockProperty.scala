package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "StringBlockProperty")
@js.native
/* protected */ open class StringBlockProperty () extends IBlockProperty {
  
  /**
    * A list of allowed values for this string property.
    */
  val validValues: js.Array[String] = js.native
  
  /**
    * The current value of this property.
    * @throws
    * Setting this property can throw if the value passed is not
    * valid for the property. Use
    * {@link mojang-minecraft.StringBlockProperty.validValues} to check
    * allowed values.
    */
  var value: String = js.native
}
