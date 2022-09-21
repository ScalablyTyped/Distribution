package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeItemUseEvent")
@js.native
/* protected */ open class BeforeItemUseEvent () extends StObject {
  
  /**
    * If set to true, this will cancel the item use behavior.
    */
  var cancel: Boolean = js.native
  
  /**
    * The impacted item stack that is being used.
    */
  var item: ItemStack = js.native
  
  /**
    * Returns the source entity that triggered this item event.
    */
  val source: Entity = js.native
}
