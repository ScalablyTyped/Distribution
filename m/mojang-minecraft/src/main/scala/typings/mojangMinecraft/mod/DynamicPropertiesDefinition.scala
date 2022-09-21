package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "DynamicPropertiesDefinition")
@js.native
open class DynamicPropertiesDefinition () extends StObject {
  
  /**
    * @remarks
    * Defines a new boolean dynamic property.
    * @param identifier
    * @throws This function can throw errors.
    */
  def defineBoolean(identifier: String): Unit = js.native
  
  /**
    * @remarks
    * Defines a new number dynamic property.
    * @param identifier
    * @throws This function can throw errors.
    */
  def defineNumber(identifier: String): Unit = js.native
  
  /**
    * @remarks
    * Defines a new string dynamic property.
    * @param identifier
    * @param maxLength
    * @throws This function can throw errors.
    */
  def defineString(identifier: String, maxLength: Double): Unit = js.native
}
