package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base constructor for a Component.
  * @property system - The ComponentSystem used to create this Component.
  * @property entity - The Entity that this Component is attached to.
  * @property enabled - Enables or disables the component.
  * @param system - The ComponentSystem used to create this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@js.native
trait Component extends EventHandler {
  
  /**
    * Enables or disables the component.
    */
  var enabled: Boolean = js.native
  
  /**
    * The Entity that this Component is attached to.
    */
  var entity: Entity = js.native
  
  /**
    * The ComponentSystem used to create this Component.
    */
  var system: ComponentSystem = js.native
}
