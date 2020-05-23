package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wizard extends Control {
  /**
    * Adds a new step to the Wizard.
    * @param wizardStep New WizardStep to add to the Wizard
    * @returns Pointer to the control instance for chaining
    */
  def addStep(wizardStep: WizardStep): Wizard = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>complete</code> event of this
    * <code>sap.m.Wizard</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Wizard</code> itself.The complete event is fired when the user clicks the finish button
    * of the Wizard.The finish button is only available on the last step of the Wizard.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Wizard</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachComplete(oData: js.Any, fnFunction: js.Any): Wizard = js.native
  def attachComplete(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Wizard = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>stepActivate</code> event of this
    * <code>sap.m.Wizard</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Wizard</code> itself.The StepActivated event is fired every time a new step is
    * activated.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Wizard</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachStepActivate(oData: js.Any, fnFunction: js.Any): Wizard = js.native
  def attachStepActivate(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Wizard = js.native
  /**
    * Destroys all aggregated steps in the Wizard.
    * @returns Pointer to the control instance for chaining.
    */
  def destroySteps(): Wizard = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>complete</code> event of this
    * <code>sap.m.Wizard</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachComplete(fnFunction: js.Any, oListener: js.Any): Wizard = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>stepActivate</code> event of this
    * <code>sap.m.Wizard</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachStepActivate(fnFunction: js.Any, oListener: js.Any): Wizard = js.native
  /**
    * Discards all progress done from the given step(incl.) to the end of the wizard.The verified state of
    * the steps is returned to the initial provided.
    * @param step The step after which the progress is discarded.
    * @returns Pointer to the control instance for chaining.
    */
  def discardProgress(step: WizardStep): Wizard = js.native
  /**
    * Fires event <code>complete</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireComplete(mArguments: js.Any): Wizard = js.native
  /**
    * Fires event <code>stepActivate</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>index</code> of type <code>int</code>The index of the activated step as a
    * parameter. One-based.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireStepActivate(mArguments: js.Any): Wizard = js.native
  /**
    * Gets current value of property <code>enableBranching</code>.Enables the branching functionality of
    * the Wizard.Branching gives the developer the ability to define multiple routes a useris able to take
    * based on the input in the current step.It is up to the developer to programatically check for what
    * is the input in thecurrent step and set a concrete next step amongs the available subsequent
    * steps.Note: If this property is set to false, <code>next</code> and
    * <code>subSequentSteps</code>associations of the WizardStep control are ignored.Default value is
    * <code>false</code>.
    * @returns Value of property <code>enableBranching</code>
    */
  def getEnableBranching(): Boolean = js.native
  /**
    * Returns the finish button text which will be rendered.
    * @returns The text which will be rendered in the finish button.
    */
  def getFinishButtonText(): String = js.native
  /**
    * Gets current value of property <code>height</code>.Determines the height of the Wizard.Default value
    * is <code>100%</code>.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * Returns the number of the last activated step in the Wizard.
    * @returns The last activated step.
    */
  def getProgress(): Double = js.native
  /**
    * Returns the last activated step in the Wizard.
    * @returns Pointer to the control instance for chaining.
    */
  def getProgressStep(): WizardStep = js.native
  /**
    * Gets current value of property <code>showNextButton</code>.Controls the visibility of the next
    * button. The developers can choose to control the flow of thesteps either through the API (with
    * <code>nextStep</code> and <code>previousStep</code> methods) or let the user clickthe next button,
    * and control it with <code>validateStep</code> or <code>invalidateStep</code> methods.Default value
    * is <code>true</code>.
    * @returns Value of property <code>showNextButton</code>
    */
  def getShowNextButton(): Boolean = js.native
  /**
    * Gets content of aggregation <code>steps</code>.The wizard steps to be included in the content of the
    * control.
    */
  def getSteps(): js.Array[WizardStep] = js.native
  /**
    * Gets current value of property <code>width</code>.Determines the width of the Wizard.Default value
    * is <code>auto</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Goes to the given step.
    * @param step The step to go to.
    * @param focusFirstStepElement Defines whether the focus should be changed to the first element.
    * @returns Pointer to the control instance for chaining.
    */
  def goToStep(step: WizardStep, focusFirstStepElement: Boolean): Wizard = js.native
  /**
    * Checks for the provided <code>sap.m.WizardStep</code> in the aggregation <code>steps</code>.and
    * returns its index if found or -1 otherwise.
    * @param oStep The step whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfStep(oStep: WizardStep): Double = js.native
  /**
    * Dynamic step insertion is not yet supported.
    */
  def insertStep(): Unit = js.native
  /**
    * Invalidates the given step.
    * @param step The step to be invalidated.
    * @returns Pointer to the control instance for chaining.
    */
  def invalidateStep(step: WizardStep): Wizard = js.native
  /**
    * Validates the current step, and moves one step further.
    * @returns Pointer to the control instance for chaining.
    */
  def nextStep(): Wizard = js.native
  /**
    * Discards the current step and goes one step back.
    * @returns Pointer to the control instance for chaining.
    */
  def previousStep(): Wizard = js.native
  /**
    * Removes all steps from the Wizard.
    * @returns Pointer to the Steps that were removed.
    */
  def removeAllSteps(): Control = js.native
  /**
    * Dynamic step removal is not yet supported.
    */
  def removeStep(): Unit = js.native
  /**
    * Sets a new value for property <code>enableBranching</code>.Enables the branching functionality of
    * the Wizard.Branching gives the developer the ability to define multiple routes a useris able to take
    * based on the input in the current step.It is up to the developer to programatically check for what
    * is the input in thecurrent step and set a concrete next step amongs the available subsequent
    * steps.Note: If this property is set to false, <code>next</code> and
    * <code>subSequentSteps</code>associations of the WizardStep control are ignored.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bEnableBranching New value for property <code>enableBranching</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnableBranching(bEnableBranching: Boolean): Wizard = js.native
  /**
    * Sets the text for the finish button. By default it is "Review".
    * @param value The text of the finish button.
    * @returns Reference to the control instance for chaining.
    */
  def setFinishButtonText(value: String): Wizard = js.native
  /**
    * Sets a new value for property <code>height</code>.Determines the height of the Wizard.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>100%</code>.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): Wizard = js.native
  /**
    * Sets the visiblity of the next button.
    * @param value True to show the button or false to hide it.
    * @returns Reference to the control instance for chaining.
    */
  def setShowNextButton(value: Boolean): Wizard = js.native
  /**
    * Sets a new value for property <code>width</code>.Determines the width of the Wizard.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>auto</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Wizard = js.native
  /**
    * Validates the given step.
    * @param step The step to be validated.
    * @returns Pointer to the control instance for chaining.
    */
  def validateStep(step: WizardStep): Wizard = js.native
}

