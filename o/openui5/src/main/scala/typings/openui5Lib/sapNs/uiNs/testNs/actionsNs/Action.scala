package typings
package openui5Lib.sapNs.uiNs.testNs.actionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.actions.Action")
@js.native
abstract class Action ()
  extends openui5Lib.sapNs.uiNs.baseNs.ManagedObject {
  /**
             * Checks if the matcher is matching - will get an instance of sap.ui.Control as parameterShould be
             * overwritten by subclasses
             * @param element the {@link sap.ui.core.Element} or a control (extends element) the action will be
             * executed on
            */
  def executeOn(element: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Unit = js.native
  /**
             * Gets current value of property <code>idSuffix</code>.
             * @since 1.38
             * @returns Value of property <code>idSuffix</code>
            */
  def getIdSuffix(): java.lang.String = js.native
  /**
             * Sets a new value for property <code>idSuffix</code>.When called with a value of <code>null</code> or
             * <code>undefined</code>, the default value of the property will be restored.
             * @since 1.38
             * @param sIdSuffix New value for property <code>idSuffix</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setIdSuffix(sIdSuffix: java.lang.String): Action = js.native
}

