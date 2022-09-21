package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "DefinitionModifier")
@js.native
open class DefinitionModifier () extends StObject {
  
  /**
    * A list of components that will be added via this definition
    * modification.
    */
  val componentGroupsToAdd: js.Array[String] = js.native
  
  /**
    * A list of components that will be removed via this
    * definition modification.
    */
  val componentGroupsToRemove: js.Array[String] = js.native
  
  /**
    * A list of entity definition events that will be fired via
    * this update.
    */
  var triggers: js.Array[Trigger] = js.native
}
