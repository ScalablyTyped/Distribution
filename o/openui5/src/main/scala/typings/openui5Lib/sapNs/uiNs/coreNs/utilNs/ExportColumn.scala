package typings
package openui5Lib.sapNs.uiNs.coreNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.ExportColumn")
@js.native
class ExportColumn protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.ManagedObject {
  /**
             * Constructor for a new ExportCell.Accepts an object literal <code>mSettings</code> that defines
             * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
             * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
             * object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String) = this()
  /**
             * Constructor for a new ExportCell.Accepts an object literal <code>mSettings</code> that defines
             * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
             * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
             * object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
             * Destroys the template in the aggregation <code>template</code>.
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def destroyTemplate(): ExportColumn = js.native
  /**
             * Gets current value of property <code>name</code>.Column name.
             * @returns Value of property <code>name</code>
            */
  def getName(): java.lang.String = js.native
  /**
             * Gets content of aggregation <code>template</code>.Cell template for column.
            */
  def getTemplate(): ExportCell = js.native
  /**
             * Sets a new value for property <code>name</code>.Column name.When called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
             * @param sName New value for property <code>name</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setName(sName: java.lang.String): ExportColumn = js.native
  /**
             * Sets the aggregated <code>template</code>.
             * @param oTemplate The template to set
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setTemplate(oTemplate: ExportCell): ExportColumn = js.native
}

