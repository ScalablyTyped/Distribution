package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slider
  extends StObject
     with Control {
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Slider = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Slider = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>change</code> event of this
    * <code>sap.m.Slider</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Slider</code> itself.This event is triggered after the end user finishes interacting, if
    * there is any change.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Slider</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachChange(oData: js.Any, fnFunction: js.Any): Slider = js.native
  def attachChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Slider = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>liveChange</code> event of this
    * <code>sap.m.Slider</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Slider</code> itself.This event is triggered during the dragging period, each time the
    * slider value changes.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Slider</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLiveChange(oData: js.Any, fnFunction: js.Any): Slider = js.native
  def attachLiveChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Slider = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>change</code> event of this
    * <code>sap.m.Slider</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachChange(fnFunction: js.Any, oListener: js.Any): Slider = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>liveChange</code> event of this
    * <code>sap.m.Slider</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLiveChange(fnFunction: js.Any, oListener: js.Any): Slider = js.native
  
  /**
    * Fires event <code>change</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>float</code>The current value of the slider
    * after a change.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireChange(mArguments: js.Any): Slider = js.native
  
  /**
    * Fires event <code>liveChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>float</code>The current value of the slider
    * after a live change.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLiveChange(mArguments: js.Any): Slider = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.27.0
    */
  def getAriaLabelledBy(): js.Array[js.Any] = js.native
  
  /**
    * Gets current value of property <code>enabled</code>.Indicates whether the user can change the
    * value.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets current value of property <code>max</code>.The maximum value.Default value is <code>100</code>.
    * @returns Value of property <code>max</code>
    */
  def getMax(): Double = js.native
  
  /**
    * Gets current value of property <code>min</code>.The minimum value.Default value is <code>0</code>.
    * @returns Value of property <code>min</code>
    */
  def getMin(): Double = js.native
  
  /**
    * Gets current value of property <code>name</code>.The name property to be used in the HTML code for
    * the slider (e.g. for HTML forms that send data to the server via submit).Default value is
    * <code></code>.
    * @returns Value of property <code>name</code>
    */
  def getName(): String = js.native
  
  /**
    * Gets current value of property <code>progress</code>.Indicate whether a progress bar indicator is
    * shown.Default value is <code>true</code>.
    * @returns Value of property <code>progress</code>
    */
  def getProgress(): Boolean = js.native
  
  /**
    * Gets current value of property <code>showHandleTooltip</code>.Indicate whether the handle tooltip is
    * shown.Default value is <code>true</code>.
    * @since 1.31
    * @returns Value of property <code>showHandleTooltip</code>
    */
  def getShowHandleTooltip(): Boolean = js.native
  
  /**
    * Gets current value of property <code>step</code>.Define the amount of units to change the slider
    * when adjusting by drag and drop.Defines the size of the slider's selection intervals. (e.g. min = 0,
    * max = 10, step = 5 would result in possible selection of the values 0, 5, 10).The step must be
    * positive, if a negative number is provided, the default value will be used instead.If the width of
    * the slider converted to pixels is less than the range (max – min), the value will be rounded to
    * multiples of the step size.Default value is <code>1</code>.
    * @returns Value of property <code>step</code>
    */
  def getStep(): Double = js.native
  
  /**
    * Gets current value of property <code>value</code>.Define the value.If the value is lower/higher than
    * the allowed minimum/maximum, the value of the properties <code>min<code>/<code>max</code> are used
    * instead.Default value is <code>0</code>.
    * @returns Value of property <code>value</code>
    */
  def getValue(): Double = js.native
  
  /**
    * Gets current value of property <code>width</code>.Defines the width of the control.Default value is
    * <code>100%</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[js.Any] = js.native
  
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  
  /**
    * Sets a new value for property <code>enabled</code>.Indicates whether the user can change the
    * value.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): Slider = js.native
  
  /**
    * Sets a new value for property <code>max</code>.The maximum value.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100</code>.
    * @param fMax New value for property <code>max</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMax(fMax: Double): Slider = js.native
  
  /**
    * Sets a new value for property <code>min</code>.The minimum value.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>0</code>.
    * @param fMin New value for property <code>min</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMin(fMin: Double): Slider = js.native
  
  /**
    * Sets a new value for property <code>name</code>.The name property to be used in the HTML code for
    * the slider (e.g. for HTML forms that send data to the server via submit).When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: String): Slider = js.native
  
  /**
    * Sets a new value for property <code>progress</code>.Indicate whether a progress bar indicator is
    * shown.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bProgress New value for property <code>progress</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setProgress(bProgress: Boolean): Slider = js.native
  
  /**
    * Sets a new value for property <code>showHandleTooltip</code>.Indicate whether the handle tooltip is
    * shown.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @since 1.31
    * @param bShowHandleTooltip New value for property <code>showHandleTooltip</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowHandleTooltip(bShowHandleTooltip: Boolean): Slider = js.native
  
  /**
    * Sets a new value for property <code>step</code>.Define the amount of units to change the slider when
    * adjusting by drag and drop.Defines the size of the slider's selection intervals. (e.g. min = 0, max
    * = 10, step = 5 would result in possible selection of the values 0, 5, 10).The step must be positive,
    * if a negative number is provided, the default value will be used instead.If the width of the slider
    * converted to pixels is less than the range (max – min), the value will be rounded to multiples of
    * the step size.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>1</code>.
    * @param fStep New value for property <code>step</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStep(fStep: Double): Slider = js.native
  
  /**
    * Sets the property <code>value</code>.Default value is <code>0</code>.
    * @param fNewValue new value for property <code>value</code>.
    * @returns <code>this</code> to allow method chaining.
    */
  def setValue(fNewValue: Double): Slider = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the control.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100%</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Slider = js.native
  
  /**
    * Decrements the value by multiplying the step the <code>step</code> with the given parameter.
    * @param iStep The number of steps the slider goes down.
    * @returns <code>this</code> to allow method chaining.
    */
  def stepDown(iStep: Double): Slider = js.native
  
  /**
    * Increments the value by multiplying the <code>step</code> with the given parameter.
    * @param iStep The number of steps the slider goes up.
    * @returns <code>this</code> to allow method chaining.
    */
  def stepUp(iStep: Double): Slider = js.native
}
