package typings.openui5.sapNs.mNs.semanticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.semantic.MainAction")
@js.native
class MainAction protected () extends SemanticButton {
  /**
    * Constructor for a new MainAction.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Custom initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>text</code>.Button text
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Sets a new value for property <code>text</code>.Button textWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): MainAction = js.native
}

