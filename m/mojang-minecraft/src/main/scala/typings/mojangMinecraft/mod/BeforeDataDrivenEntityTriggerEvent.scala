package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeDataDrivenEntityTriggerEvent")
@js.native
/* protected */ open class BeforeDataDrivenEntityTriggerEvent () extends StObject {
  
  /**
    * If set to true, this entity event is not triggered.
    */
  var cancel: Boolean = js.native
  
  /**
    * Entity that the event triggered on.
    */
  val entity: Entity = js.native
  
  /**
    * Name of the data driven event being triggered.
    */
  val id: String = js.native
  
  /**
    * An updateable list of modifications to component state that
    * are the effect of this triggered event.
    */
  var modifiers: js.Array[DefinitionModifier] = js.native
}
