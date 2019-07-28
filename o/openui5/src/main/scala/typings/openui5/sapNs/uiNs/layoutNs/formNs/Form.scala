package typings.openui5.sapNs.uiNs.layoutNs.formNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.Title
import typings.openui5.sapNs.uiNs.coreNs.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.form.Form")
@js.native
class Form protected () extends Control {
  /**
    * Constructor for a new sap.ui.layout.form.Form.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Form = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Form = js.native
  /**
    * Adds some formContainer to the aggregation <code>formContainers</code>.
    * @param oFormContainer the formContainer to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addFormContainer(oFormContainer: FormContainer): Form = js.native
  /**
    * Destroys all the formContainers in the aggregation <code>formContainers</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyFormContainers(): Form = js.native
  /**
    * Destroys the layout in the aggregation <code>layout</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyLayout(): Form = js.native
  /**
    * Destroys the title in the aggregation <code>title</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyTitle(): Form = js.native
  /**
    * Destroys the toolbar in the aggregation <code>toolbar</code>.
    * @since 1.36.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyToolbar(): Form = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.28.0
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>editable</code>.Applies a device and theme specific line-height
    * to the form rows if the form has editable content.If set, all (not only the editable) rows of the
    * form will get the line height of editable fields.The accessibility aria-readonly attribute is set
    * according to this property.<b>Note:</b> The setting of the property has no influence on the editable
    * functionality of the form's content.Default value is <code>false</code>.
    * @since 1.20.0
    * @returns Value of property <code>editable</code>
    */
  def getEditable(): Boolean = js.native
  /**
    * Gets content of aggregation <code>formContainers</code>.Containers with the content of the form. A
    * <code>FormContainer</code> represents a group inside the <code>Form</code>.
    */
  def getFormContainers(): js.Array[FormContainer] = js.native
  /**
    * Gets content of aggregation <code>layout</code>.Layout of the <code>Form</code>. The assigned
    * <code>Layout</code> renders the <code>Form</code>.We suggest using the
    * <code>ResponsiveGridLayout</code> for rendering a <code>Form</code>, as its responsiveness allows
    * the available space to be used in the best way possible.
    */
  def getLayout(): FormLayout = js.native
  /**
    * Gets content of aggregation <code>title</code>.Title of the <code>Form</code>. Can either be a
    * <code>Title</code> object, or a string.If a <code>Title</code> object it used, the style of the
    * title can be set.<b>Note:</b> If a <code>Toolbar</code> is used, the <code>Title</code> is ignored.
    */
  def getTitle(): Title | String = js.native
  /**
    * Gets content of aggregation <code>toolbar</code>.Toolbar of the <code>Form</code>.<b>Note:</b> If a
    * <code>Toolbar</code> is used, the <code>Title</code> is ignored.If a title is needed inside the
    * <code>Toolbar</code> it must be added at content to the <code>Toolbar</code>.In this case add the
    * <code>Title</code> to the <code>ariaLabelledBy</code> association.
    * @since 1.36.0
    */
  def getToolbar(): Toolbar = js.native
  /**
    * Gets current value of property <code>width</code>.Width of the <code>Form</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.ui.layout.form.FormContainer</code> in the aggregation
    * <code>formContainers</code>.and returns its index if found or -1 otherwise.
    * @param oFormContainer The formContainer whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfFormContainer(oFormContainer: FormContainer): Double = js.native
  /**
    * Inserts a formContainer into the aggregation <code>formContainers</code>.
    * @param oFormContainer the formContainer to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the formContainer should be inserted at; for           
    *  a negative value of <code>iIndex</code>, the formContainer is inserted at position 0; for a value  
    *           greater than the current size of the aggregation, the formContainer is inserted at        
    *     the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertFormContainer(oFormContainer: FormContainer, iIndex: Double): Form = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the controls from the aggregation <code>formContainers</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllFormContainers(): js.Array[FormContainer] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  def removeFormContainer(vFormContainer: String): FormContainer = js.native
  /**
    * Removes a formContainer from the aggregation <code>formContainers</code>.
    * @param vFormContainer The formContainer to remove or its index or id
    * @returns The removed formContainer or <code>null</code>
    */
  def removeFormContainer(vFormContainer: Double): FormContainer = js.native
  def removeFormContainer(vFormContainer: FormContainer): FormContainer = js.native
  /**
    * Sets a new value for property <code>editable</code>.Applies a device and theme specific line-height
    * to the form rows if the form has editable content.If set, all (not only the editable) rows of the
    * form will get the line height of editable fields.The accessibility aria-readonly attribute is set
    * according to this property.<b>Note:</b> The setting of the property has no influence on the editable
    * functionality of the form's content.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.20.0
    * @param bEditable New value for property <code>editable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEditable(bEditable: Boolean): Form = js.native
  /**
    * Sets the aggregated <code>layout</code>.
    * @param oLayout The layout to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLayout(oLayout: FormLayout): Form = js.native
  def setTitle(vTitle: String): Form = js.native
  /**
    * Sets the aggregated <code>title</code>.
    * @param vTitle The title to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(vTitle: Title): Form = js.native
  /**
    * Sets the aggregated <code>toolbar</code>.
    * @since 1.36.0
    * @param oToolbar The toolbar to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setToolbar(oToolbar: Toolbar): Form = js.native
  /**
    * Sets a new value for property <code>width</code>.Width of the <code>Form</code>.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Form = js.native
}

