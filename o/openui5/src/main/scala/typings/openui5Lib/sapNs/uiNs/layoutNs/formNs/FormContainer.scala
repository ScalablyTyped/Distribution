package typings
package openui5Lib.sapNs.uiNs.layoutNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.form.FormContainer")
@js.native
class FormContainer protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
             * Constructor for a new sap.ui.layout.form.FormContainer.Accepts an object literal
             * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
             * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
             * of the syntax of the settings object.
             * @param sId Id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String) = this()
  /**
             * Constructor for a new sap.ui.layout.form.FormContainer.Accepts an object literal
             * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
             * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
             * of the syntax of the settings object.
             * @param sId Id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
             * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
             * @since 1.36.0
             * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): FormContainer = js.native
  /**
             * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
             * @since 1.36.0
             * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): FormContainer = js.native
  /**
             * Adds some formElement to the aggregation <code>formElements</code>.
             * @param oFormElement the formElement to add; if empty, nothing is inserted
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def addFormElement(oFormElement: FormElement): FormContainer = js.native
  /**
             * Destroys all the formElements in the aggregation <code>formElements</code>.
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def destroyFormElements(): FormContainer = js.native
  /**
             * Destroys the title in the aggregation <code>title</code>.
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def destroyTitle(): FormContainer = js.native
  /**
             * Destroys the toolbar in the aggregation <code>toolbar</code>.
             * @since 1.36.0
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def destroyToolbar(): FormContainer = js.native
  /**
             * Returns array of IDs of the elements which are the current targets of the association
             * <code>ariaLabelledBy</code>.
             * @since 1.36.0
            */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
             * Gets current value of property <code>expandable</code>.Defines if the <code>FormContainer</code> is
             * expandable.<b>Note:</b> The expander icon will only be shown if a <code>title</code> is set for the
             * <code>FormContainer</code>.Default value is <code>false</code>.
             * @returns Value of property <code>expandable</code>
            */
  def getExpandable(): scala.Boolean = js.native
  /**
             * Gets current value of property <code>expanded</code>.Container is expanded.<b>Note:</b> This
             * property only works if <code>expandable</code> is set to <code>true</code>.Default value is
             * <code>true</code>.
             * @returns Value of property <code>expanded</code>
            */
  def getExpanded(): scala.Boolean = js.native
  /**
             * Gets content of aggregation <code>formElements</code>.The <code>FormElements</code> contain the
             * content (labels and fields) of the <code>FormContainers</code>.
            */
  def getFormElements(): js.Array[FormElement] = js.native
  /**
             * Gets content of aggregation <code>title</code>.Title of the <code>FormContainer</code>. Can either
             * be a <code>Title</code> object, or a string.If a <code>Title</code> object is used, the style of the
             * title can be set.<b>Note:</b> If a <code>Toolbar</code> is used, the <code>Title</code> is ignored.
            */
  def getTitle(): openui5Lib.sapNs.uiNs.coreNs.Title | java.lang.String = js.native
  /**
             * Gets content of aggregation <code>toolbar</code>.Toolbar of the
             * <code>FormContainer</code>.<b>Note:</b> If a <code>Toolbar</code> is used, the <code>Title</code> is
             * ignored.If a title is needed inside the <code>Toolbar</code> it must be added at content to the
             * <code>Toolbar</code>.In this case add the <code>Title</code> to the <code>ariaLabelledBy</code>
             * association.
             * @since 1.36.0
            */
  def getToolbar(): openui5Lib.sapNs.uiNs.coreNs.Toolbar = js.native
  /**
             * Gets current value of property <code>visible</code>.If set to <code>false</code>, the
             * <code>FormContainer</code> is not rendered.Default value is <code>true</code>.
             * @returns Value of property <code>visible</code>
            */
  def getVisible(): scala.Boolean = js.native
  /**
             * Checks for the provided <code>sap.ui.layout.form.FormElement</code> in the aggregation
             * <code>formElements</code>.and returns its index if found or -1 otherwise.
             * @param oFormElement The formElement whose index is looked for
             * @returns The index of the provided control in the aggregation if found, or -1 otherwise
            */
  def indexOfFormElement(oFormElement: FormElement): scala.Double = js.native
  /**
             * Inserts a formElement into the aggregation <code>formElements</code>.
             * @param oFormElement the formElement to insert; if empty, nothing is inserted
             * @param iIndex the <code>0</code>-based index the formElement should be inserted at; for            
             * a negative value of <code>iIndex</code>, the formElement is inserted at position 0; for a value     
             *        greater than the current size of the aggregation, the formElement is inserted at            
             * the last position
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def insertFormElement(oFormElement: FormElement, iIndex: scala.Double): FormContainer = js.native
  /**
             * Removes all the controls in the association named <code>ariaLabelledBy</code>.
             * @since 1.36.0
             * @returns An array of the removed elements (might be empty)
            */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
             * Removes all the controls from the aggregation <code>formElements</code>.Additionally, it unregisters
             * them from the hosting UIArea.
             * @returns An array of the removed elements (might be empty)
            */
  def removeAllFormElements(): js.Array[FormElement] = js.native
  /**
             * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
             * @since 1.36.0
             * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
             * @returns The removed ariaLabelledBy or <code>null</code>
            */
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
             * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
             * @since 1.36.0
             * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
             * @returns The removed ariaLabelledBy or <code>null</code>
            */
  def removeAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
             * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
             * @since 1.36.0
             * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
             * @returns The removed ariaLabelledBy or <code>null</code>
            */
  def removeAriaLabelledBy(vAriaLabelledBy: scala.Double): js.Any = js.native
  /**
             * Removes a formElement from the aggregation <code>formElements</code>.
             * @param vFormElement The formElement to remove or its index or id
             * @returns The removed formElement or <code>null</code>
            */
  def removeFormElement(vFormElement: java.lang.String): FormElement = js.native
  /**
             * Removes a formElement from the aggregation <code>formElements</code>.
             * @param vFormElement The formElement to remove or its index or id
             * @returns The removed formElement or <code>null</code>
            */
  def removeFormElement(vFormElement: FormElement): FormElement = js.native
  /**
             * Removes a formElement from the aggregation <code>formElements</code>.
             * @param vFormElement The formElement to remove or its index or id
             * @returns The removed formElement or <code>null</code>
            */
  def removeFormElement(vFormElement: scala.Double): FormElement = js.native
  /**
             * Sets a new value for property <code>expandable</code>.Defines if the <code>FormContainer</code> is
             * expandable.<b>Note:</b> The expander icon will only be shown if a <code>title</code> is set for the
             * <code>FormContainer</code>.When called with a value of <code>null</code> or <code>undefined</code>,
             * the default value of the property will be restored.Default value is <code>false</code>.
             * @param bExpandable New value for property <code>expandable</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setExpandable(bExpandable: scala.Boolean): FormContainer = js.native
  /**
             * Sets a new value for property <code>expanded</code>.Container is expanded.<b>Note:</b> This property
             * only works if <code>expandable</code> is set to <code>true</code>.When called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be
             * restored.Default value is <code>true</code>.
             * @param bExpanded New value for property <code>expanded</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setExpanded(bExpanded: scala.Boolean): FormContainer = js.native
  /**
             * Sets the aggregated <code>title</code>.
             * @param vTitle The title to set
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setTitle(vTitle: java.lang.String): FormContainer = js.native
  /**
             * Sets the aggregated <code>title</code>.
             * @param vTitle The title to set
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setTitle(vTitle: openui5Lib.sapNs.uiNs.coreNs.Title): FormContainer = js.native
  /**
             * Sets the aggregated <code>toolbar</code>.
             * @since 1.36.0
             * @param oToolbar The toolbar to set
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setToolbar(oToolbar: openui5Lib.sapNs.uiNs.coreNs.Toolbar): FormContainer = js.native
  /**
             * Sets a new value for property <code>visible</code>.If set to <code>false</code>, the
             * <code>FormContainer</code> is not rendered.When called with a value of <code>null</code> or
             * <code>undefined</code>, the default value of the property will be restored.Default value is
             * <code>true</code>.
             * @param bVisible New value for property <code>visible</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setVisible(bVisible: scala.Boolean): FormContainer = js.native
}

