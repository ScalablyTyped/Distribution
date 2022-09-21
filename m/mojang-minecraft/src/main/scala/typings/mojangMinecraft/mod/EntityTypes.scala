package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityTypes")
@js.native
/* protected */ open class EntityTypes () extends StObject
/* static members */
object EntityTypes {
  
  @JSImport("mojang-minecraft", "EntityTypes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @remarks
    * Retrieves an entity type using a string-based identifier.
    * @param identifier
    */
  inline def get(identifier: String): EntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(identifier.asInstanceOf[js.Any]).asInstanceOf[EntityType]
  
  /**
    * @remarks
    * Retrieves an iterator of all entity types within this world.
    */
  inline def getAll(): EntityTypeIterator = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[EntityTypeIterator]
}
