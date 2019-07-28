package typings.openui5.sapNs.uiNs.coreNs.utilNs

import typings.openui5.sapNs.uiNs.coreNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.ExportCell")
@js.native
class ExportCell protected () extends Element {
  /**
    * Constructor for a new ExportCell.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>content</code>.Cell content.
    * @returns Value of property <code>content</code>
    */
  def getContent(): String = js.native
  /**
    * Sets a new value for property <code>content</code>.Cell content.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sContent New value for property <code>content</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContent(sContent: String): ExportCell = js.native
}

