package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.ComponentSystemRegistry
  * @class Store, access and delete instances of the various ComponentSystems
  * @description Create a new ComponentSystemRegistry
  */
@JSGlobal("pc.ComponentSystemRegistry")
@js.native
class ComponentSystemRegistry () extends js.Object {
  /**
    * @private
    * @function
    * @name pc.ComponentSystemRegistry#add
    * @description Add a new Component type
    * @param {Object} name The name of the Component
    * @param {Object} component The {pc.ComponentSystem} instance
    */
  /* private */ def add(name: java.lang.String, system: ComponentSystem): scala.Unit = js.native
  /**
    * @private
    * @function
    * @name pc.ComponentSystemRegistry#list
    * @description Return the contents of the registry as an array, this order of the array
    * is the order in which the ComponentSystems must be initialized.
    * @returns {pc.ComponentSystem[]} An array of component systems.
    */
  def list(): js.Array[ComponentSystem] = js.native
  /**
    * @private
    * @function
    * @name pc.ComponentSystemRegistry#remove
    * @description Remove a Component type
    * @param {Object} name The name of the Component remove
    */
  def remove(name: java.lang.String): scala.Unit = js.native
}

