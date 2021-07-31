package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.ValueState
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepInput
  extends StObject
     with Control {
  
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): StepInput = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): StepInput = js.native
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): StepInput = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): StepInput = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[js.Any] = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[js.Any] = js.native
  
  /**
    * Gets current value of property <code>editable</code>.Defines whether the control can be modified by
    * the user or not.<b>Note:</b> A user can tab to the non-editable control, highlight it, and copy the
    * text from it.Default value is <code>true</code>.
    * @returns Value of property <code>editable</code>
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Gets current value of property <code>enabled</code>.Indicates whether the user can interact with the
    * control or not.<b>Note:</b> Disabled controls cannot be focused and they are out of the
    * tab-chain.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets current value of property <code>largerStep</code>.TIncreases/decreases the value with a larger
    * value than the set step only when using the PageUp/PageDown keys.Default value is 2 times larger
    * than the set step.Default value is <code>2</code>.
    * @returns Value of property <code>largerStep</code>
    */
  def getLargerStep(): Number = js.native
  
  /**
    * Gets current value of property <code>max</code>.Sets the maximum possible value of the defined
    * range.
    * @returns Value of property <code>max</code>
    */
  def getMax(): Number = js.native
  
  /**
    * Gets current value of property <code>min</code>.Sets the minimum possible value of the defined
    * range.
    * @returns Value of property <code>min</code>
    */
  def getMin(): Number = js.native
  
  /**
    * Gets current value of property <code>step</code>.Increases/decreases the value of the input.Default
    * value is <code>1</code>.
    * @returns Value of property <code>step</code>
    */
  def getStep(): Number = js.native
  
  /**
    * Gets current value of property <code>value</code>.Determines the value of the <code>StepInput</code>
    * and can be set initially from the app developer.Default value is <code>0</code>.
    * @returns Value of property <code>value</code>
    */
  def getValue(): Number = js.native
  
  /**
    * Gets current value of property <code>valueState</code>.Accepts the core enumeration ValueState.type
    * that supports <code>None</code>, <code>Error</code>, <code>Warning</code> and
    * <code>Success</code>.Default value is <code>None</code>.
    * @returns Value of property <code>valueState</code>
    */
  def getValueState(): ValueState = js.native
  
  /**
    * Gets current value of property <code>width</code>.Defines the width of the control.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[js.Any] = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[js.Any] = js.native
  
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  
  /**
    * Sets a new value for property <code>enabled</code>.Indicates whether the user can interact with the
    * control or not.<b>Note:</b> Disabled controls cannot be focused and they are out of the
    * tab-chain.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): StepInput = js.native
  
  /**
    * Sets a new value for property <code>largerStep</code>.TIncreases/decreases the value with a larger
    * value than the set step only when using the PageUp/PageDown keys.Default value is 2 times larger
    * than the set step.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>2</code>.
    * @param sLargerStep New value for property <code>largerStep</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLargerStep(sLargerStep: Number): StepInput = js.native
  
  /**
    * Sets a new value for property <code>step</code>.Increases/decreases the value of the input.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>1</code>.
    * @param sStep New value for property <code>step</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStep(sStep: Number): StepInput = js.native
  
  /**
    * Sets a new value for property <code>value</code>.Determines the value of the <code>StepInput</code>
    * and can be set initially from the app developer.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>0</code>.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: Number): StepInput = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the control.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): StepInput = js.native
}
