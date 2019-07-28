package typings.openui5.sapNs.uiNs.coreNs

import typings.openui5.sapNs.uiNs.baseNs.ManagedObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Fragment")
@js.native
/**
  * Accepts an object literal <code>mSettings</code> that defines initialproperty values, aggregated and
  * associated objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a
  * general description of the syntax of the settings object.
  */
class Fragment () extends ManagedObject {
  /**
    * Returns an Element/Control by its ID in the context of the Fragment with the given ID
    * @param sFragmentId undefined
    * @param sId undefined
    */
  def byId(sFragmentId: String, sId: String): Unit = js.native
  /**
    * Returns the ID which a Control with the given ID in the context of the Fragment with the given ID
    * would have
    * @param sFragmentId undefined
    * @param sId undefined
    */
  def createId(sFragmentId: String, sId: String): Unit = js.native
  /**
    * Gets current value of property <code>type</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): String = js.native
  /**
    * Registers a new Fragment type
    * @param sType the Fragment type. Types "XML", "HTML" and JS" are built-in and always available.
    * @param oFragmentImpl an object having a property "init" of type "function" which is called on
    * Fragment instantiation with the settings map as argument
    */
  def registerType(sType: String, oFragmentImpl: js.Any): Unit = js.native
  /**
    * Sets a new value for property <code>type</code>.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: String): Fragment = js.native
}

