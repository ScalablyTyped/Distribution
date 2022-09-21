package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "DataDrivenEntityTriggerEvent")
@js.native
/* protected */ open class DataDrivenEntityTriggerEvent () extends StObject {
  
  /**
    * Entity that the event triggered on.
    */
  val entity: Entity = js.native
  
  /**
    * Name of the data driven event being triggered.
    */
  val id: String = js.native
  
  /**
    * A list of modifications to component state that are the
    * effect of this triggered event.
    */
  val modifiers: js.Array[DefinitionModifier] = js.native
}
