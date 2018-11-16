package typings
package openui5Lib.sapNs.uiNs.coreNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.ExportCell")
@js.native
class ExportCell protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
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
             * Gets current value of property <code>content</code>.Cell content.
             * @returns Value of property <code>content</code>
            */
  def getContent(): java.lang.String = js.native
  /**
             * Sets a new value for property <code>content</code>.Cell content.When called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
             * @param sContent New value for property <code>content</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setContent(sContent: java.lang.String): ExportCell = js.native
}

