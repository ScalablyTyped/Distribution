package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityDefinitionFeedItem")
@js.native
/* protected */ open class EntityDefinitionFeedItem () extends StObject {
  
  /**
    * The amount by which an entity's age will increase when fed
    * this item. Values usually range between 0 and 1.
    */
  val growth: Double = js.native
  
  /**
    * Identifier of type of item that can be fed. If a namespace
    * is not specified, 'minecraft:' is assumed. Example values
    * include 'wheat' or 'golden_apple'.
    */
  val item: String = js.native
}
