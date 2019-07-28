package typings.openui5.sapNs.uiNs.layoutNs.formNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.form.FormElement")
@js.native
class FormElement protected () extends Element {
  /**
    * Constructor for a new sap.ui.layout.form.FormElement.Accepts an object literal
    * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
    * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some field to the aggregation <code>fields</code>.
    * @param oField the field to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addField(oField: Control): FormElement = js.native
  /**
    * Destroys all the fields in the aggregation <code>fields</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyFields(): FormElement = js.native
  /**
    * Destroys the label in the aggregation <code>label</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyLabel(): FormElement = js.native
  /**
    * Gets content of aggregation <code>fields</code>.Formular controls that belong together to be
    * displayed in one row of a <code>Form</code>.<b>Note:</b> Do not put any layout controls in here.
    * This could destroy the visual layout,keyboard support and screen-reader support.
    */
  def getFields(): js.Array[Control] = js.native
  /**
    * Gets content of aggregation <code>label</code>.Label of the fields. Can either be a
    * <code>Label</code> object, or a string.If a <code>Label</code> object is used, the properties of the
    * <code>Label</code> can be set.If no assignment between <code>Label</code> and the fields is set, it
    * will be done automatically by the<code>FormElement</code>. In this case the <code>Label</code> is
    * assigned to the fields of the <code>FormElement</code>.
    */
  def getLabel(): js.Any | String = js.native
  /**
    * Returns the <code>Label</code> of the <code>FormElement</code>, even if the <code>Label</code> is
    * assigned as string.The <code>FormLayout</code> needs the information of the label to render the
    * <code>Form</code>.
    * @returns <code>Label</code> control used to render the label
    */
  def getLabelControl(): js.Any = js.native
  /**
    * Gets current value of property <code>visible</code>.If set to <code>false</code>, the
    * <code>FormElement</code> is not rendered.Default value is <code>true</code>.
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>fields</code>.and
    * returns its index if found or -1 otherwise.
    * @param oField The field whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfField(oField: Control): Double = js.native
  /**
    * Inserts a field into the aggregation <code>fields</code>.
    * @param oField the field to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the field should be inserted at; for             a
    * negative value of <code>iIndex</code>, the field is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the field is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertField(oField: Control, iIndex: Double): FormElement = js.native
  /**
    * Removes all the controls from the aggregation <code>fields</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllFields(): js.Array[Control] = js.native
  def removeField(vField: String): Control = js.native
  /**
    * Removes a field from the aggregation <code>fields</code>.
    * @param vField The field to remove or its index or id
    * @returns The removed field or <code>null</code>
    */
  def removeField(vField: Double): Control = js.native
  def removeField(vField: Control): Control = js.native
  def setLabel(vLabel: String): FormElement = js.native
  /**
    * Sets the aggregated <code>label</code>.
    * @param vLabel The label to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLabel(vLabel: js.Any): FormElement = js.native
  /**
    * Sets a new value for property <code>visible</code>.If set to <code>false</code>, the
    * <code>FormElement</code> is not rendered.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): FormElement = js.native
}

