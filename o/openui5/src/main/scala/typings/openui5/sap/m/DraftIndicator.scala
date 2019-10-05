package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.DraftIndicator")
@js.native
abstract class DraftIndicator protected () extends Control {
  /**
    * Constructor for a new DraftIndicator.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    */
  def this(sId: String) = this()
  /**
    * Clears the indicator state
    */
  def clearDraftState(): Unit = js.native
  /**
    * Gets current value of property <code>minDisplayTime</code>.Minimum time in milliseconds for showing
    * the draft indicatorDefault value is <code>1500</code>.
    * @returns Value of property <code>minDisplayTime</code>
    */
  def getMinDisplayTime(): Double = js.native
  /**
    * Gets current value of property <code>state</code>.State of the indicator. Could be "Saving", "Saved"
    * and "Clear".Default value is <code>Clear</code>.
    * @returns Value of property <code>state</code>
    */
  def getState(): DraftIndicatorState = js.native
  /**
    * Sets a new value for property <code>minDisplayTime</code>.Minimum time in milliseconds for showing
    * the draft indicatorWhen called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>1500</code>.
    * @param iMinDisplayTime New value for property <code>minDisplayTime</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinDisplayTime(iMinDisplayTime: Double): DraftIndicator = js.native
  /**
    * Sets the indicator in "Saved" state
    */
  def showDraftSaved(): Unit = js.native
  /**
    * Sets the indicator in "Saving..." state
    */
  def showDraftSaving(): Unit = js.native
}

