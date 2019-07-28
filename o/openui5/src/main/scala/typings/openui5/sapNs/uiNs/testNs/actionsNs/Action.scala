package typings.openui5.sapNs.uiNs.testNs.actionsNs

import typings.openui5.sapNs.uiNs.baseNs.ManagedObject
import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.actions.Action")
@js.native
/**
  * Accepts an object literal <code>mSettings</code> that defines initialproperty values, aggregated and
  * associated objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a
  * general description of the syntax of the settings object.
  */
abstract class Action () extends ManagedObject {
  /**
    * Checks if the matcher is matching - will get an instance of sap.ui.Control as parameterShould be
    * overwritten by subclasses
    * @param element the {@link sap.ui.core.Element} or a control (extends element) the action will be
    * executed on
    */
  def executeOn(element: Control): Unit = js.native
  /**
    * Gets current value of property <code>idSuffix</code>.
    * @since 1.38
    * @returns Value of property <code>idSuffix</code>
    */
  def getIdSuffix(): String = js.native
  /**
    * Sets a new value for property <code>idSuffix</code>.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.38
    * @param sIdSuffix New value for property <code>idSuffix</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIdSuffix(sIdSuffix: String): Action = js.native
}

