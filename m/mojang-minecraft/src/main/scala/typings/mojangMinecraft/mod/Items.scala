package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Items")
@js.native
/* protected */ open class Items () extends StObject
/* static members */
object Items {
  
  @JSImport("mojang-minecraft", "Items")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @remarks
    * Returns an item type given an item type identifier.
    * @param itemId
    * Type of the item to return.
    */
  inline def get(itemId: String): ItemType = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(itemId.asInstanceOf[js.Any]).asInstanceOf[ItemType]
}
