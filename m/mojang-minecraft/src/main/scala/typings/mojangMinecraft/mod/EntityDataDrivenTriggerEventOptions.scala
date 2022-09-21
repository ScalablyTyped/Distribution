package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityDataDrivenTriggerEventOptions")
@js.native
open class EntityDataDrivenTriggerEventOptions () extends StObject {
  
  /**
    * If this value is set, this event will only fire for entities
    * that match the entities within this collection.
    */
  var entities: js.Array[Entity] = js.native
  
  /**
    * If this value is set, this event will only fire if the
    * impacted entities' type matches this parameter.
    */
  var entityTypes: js.Array[String] = js.native
  
  /**
    * If this value is set, this event will only fire if the
    * impacted triggered event matches one of the events listed in
    * this parameter.
    */
  var eventTypes: js.Array[String] = js.native
}
