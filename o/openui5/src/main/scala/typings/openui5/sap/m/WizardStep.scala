package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WizardStep extends Control {
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): WizardStep = js.native
  /**
    * Adds some subsequentStep into the association <code>subsequentSteps</code>.
    * @param vSubsequentStep the subsequentSteps to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSubsequentStep(vSubsequentStep: js.Any): WizardStep = js.native
  def addSubsequentStep(vSubsequentStep: WizardStep): WizardStep = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>activate</code> event of this
    * <code>sap.m.WizardStep</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.WizardStep</code> itself.This event is fired on next step activation from the Wizard.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.WizardStep</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachActivate(oData: js.Any, fnFunction: js.Any): WizardStep = js.native
  def attachActivate(oData: js.Any, fnFunction: js.Any, oListener: js.Any): WizardStep = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>complete</code> event of this
    * <code>sap.m.WizardStep</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.WizardStep</code> itself.This event is fired after the user presses the Next button in
    * the Wizard,or on <code>nextStep</code> method call from the app developer.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.WizardStep</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachComplete(oData: js.Any, fnFunction: js.Any): WizardStep = js.native
  def attachComplete(oData: js.Any, fnFunction: js.Any, oListener: js.Any): WizardStep = js.native
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): WizardStep = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>activate</code> event of this
    * <code>sap.m.WizardStep</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachActivate(fnFunction: js.Any, oListener: js.Any): WizardStep = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>complete</code> event of this
    * <code>sap.m.WizardStep</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachComplete(fnFunction: js.Any, oListener: js.Any): WizardStep = js.native
  /**
    * Fires event <code>activate</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireActivate(mArguments: js.Any): WizardStep = js.native
  /**
    * Fires event <code>complete</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireComplete(mArguments: js.Any): WizardStep = js.native
  /**
    * Gets content of aggregation <code>content</code>.The content of the Wizard Step.
    */
  def getContent(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>icon</code>.Determines the icon that is displayed for this
    * step.The icon is visualized in the progress navigation part of the Wizard control.<b>Note:</b> In
    * order for the icon to be displayed, each step in the Wizard should havethis property defined,
    * otherwise the default numbering will be displayed.Default value is <code></code>.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * ID of the element which is the current target of the association <code>nextStep</code>, or
    * <code>null</code>.
    */
  def getNextStep(): js.Any = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>subsequentSteps</code>.
    */
  def getSubsequentSteps(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>title</code>.Determines the title of the step.The title is
    * visualized in the Wizard control.Default value is <code></code>.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  /**
    * Gets current value of property <code>validated</code>.Indicates whether or not the step is
    * validated.When a step is validated a Next button is visualized in the Wizard control.Default value
    * is <code>true</code>.
    * @returns Value of property <code>validated</code>
    */
  def getValidated(): Boolean = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: Control, iIndex: Double): WizardStep = js.native
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  /**
    * Removes all the controls in the association named <code>subsequentSteps</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSubsequentSteps(): js.Array[_] = js.native
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  def removeSubsequentStep(vSubsequentStep: js.Any): js.Any = js.native
  /**
    * Removes an subsequentStep from the association named <code>subsequentSteps</code>.
    * @param vSubsequentStep The subsequentStep to be removed or its index or ID
    * @returns The removed subsequentStep or <code>null</code>
    */
  def removeSubsequentStep(vSubsequentStep: Double): js.Any = js.native
  def removeSubsequentStep(vSubsequentStep: WizardStep): js.Any = js.native
  /**
    * Sets a new value for property <code>icon</code>.Determines the icon that is displayed for this
    * step.The icon is visualized in the progress navigation part of the Wizard control.<b>Note:</b> In
    * order for the icon to be displayed, each step in the Wizard should havethis property defined,
    * otherwise the default numbering will be displayed.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): WizardStep = js.native
  /**
    * Sets the associated <code>nextStep</code>.
    * @param oNextStep ID of an element which becomes the new target of this nextStep association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNextStep(oNextStep: js.Any): WizardStep = js.native
  def setNextStep(oNextStep: WizardStep): WizardStep = js.native
  /**
    * Sets a new value for property <code>title</code>.Determines the title of the step.The title is
    * visualized in the Wizard control.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): WizardStep = js.native
  /**
    * Sets a new value for property <code>validated</code>.Indicates whether or not the step is
    * validated.When a step is validated a Next button is visualized in the Wizard control.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>true</code>.
    * @param bValidated New value for property <code>validated</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValidated(bValidated: Boolean): WizardStep = js.native
}

