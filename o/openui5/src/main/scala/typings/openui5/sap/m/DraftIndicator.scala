package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraftIndicator
  extends StObject
     with Control {
  
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
