package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "PropertyRegistry")
@js.native
/* protected */ open class PropertyRegistry () extends StObject {
  
  /**
    * @remarks
    * Registers a dynamic property for a particular entity type
    * (e.g., a minecraft:skeleton.).
    * @param propertiesDefinition
    * @param entityType
    * @throws This function can throw errors.
    */
  def registerEntityTypeDynamicProperties(propertiesDefinition: DynamicPropertiesDefinition, entityType: EntityType): Unit = js.native
  
  /**
    * @remarks
    * Registers a globally available dynamic property for a world.
    * @param propertiesDefinition
    * @throws This function can throw errors.
    */
  def registerWorldDynamicProperties(propertiesDefinition: DynamicPropertiesDefinition): Unit = js.native
}
