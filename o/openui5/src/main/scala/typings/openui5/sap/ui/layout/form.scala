package typings.openui5.sap.ui.layout

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Element
import typings.openui5.sap.ui.core.LayoutData
import typings.openui5.sap.ui.core.Title
import typings.openui5.sap.ui.core.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.form")
@js.native
object form extends js.Object {
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
  
  @js.native
  class FormContainer protected () extends Element {
    /**
      * Constructor for a new sap.ui.layout.form.FormContainer.Accepts an object literal
      * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
      * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
      * of the syntax of the settings object.
      * @param sId Id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
      * @since 1.36.0
      * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addAriaLabelledBy(vAriaLabelledBy: js.Any): FormContainer = js.native
    def addAriaLabelledBy(vAriaLabelledBy: Control): FormContainer = js.native
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
    def getExpandable(): Boolean = js.native
    /**
      * Gets current value of property <code>expanded</code>.Container is expanded.<b>Note:</b> This
      * property only works if <code>expandable</code> is set to <code>true</code>.Default value is
      * <code>true</code>.
      * @returns Value of property <code>expanded</code>
      */
    def getExpanded(): Boolean = js.native
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
    def getTitle(): Title | String = js.native
    /**
      * Gets content of aggregation <code>toolbar</code>.Toolbar of the
      * <code>FormContainer</code>.<b>Note:</b> If a <code>Toolbar</code> is used, the <code>Title</code> is
      * ignored.If a title is needed inside the <code>Toolbar</code> it must be added at content to the
      * <code>Toolbar</code>.In this case add the <code>Title</code> to the <code>ariaLabelledBy</code>
      * association.
      * @since 1.36.0
      */
    def getToolbar(): Toolbar = js.native
    /**
      * Gets current value of property <code>visible</code>.If set to <code>false</code>, the
      * <code>FormContainer</code> is not rendered.Default value is <code>true</code>.
      * @returns Value of property <code>visible</code>
      */
    def getVisible(): Boolean = js.native
    /**
      * Checks for the provided <code>sap.ui.layout.form.FormElement</code> in the aggregation
      * <code>formElements</code>.and returns its index if found or -1 otherwise.
      * @param oFormElement The formElement whose index is looked for
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFormElement(oFormElement: FormElement): Double = js.native
    /**
      * Inserts a formElement into the aggregation <code>formElements</code>.
      * @param oFormElement the formElement to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the formElement should be inserted at; for            
      * a negative value of <code>iIndex</code>, the formElement is inserted at position 0; for a value     
      *        greater than the current size of the aggregation, the formElement is inserted at            
      * the last position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertFormElement(oFormElement: FormElement, iIndex: Double): FormContainer = js.native
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
    def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
    /**
      * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
      * @since 1.36.0
      * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
      * @returns The removed ariaLabelledBy or <code>null</code>
      */
    def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
    def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
    def removeFormElement(vFormElement: String): FormElement = js.native
    /**
      * Removes a formElement from the aggregation <code>formElements</code>.
      * @param vFormElement The formElement to remove or its index or id
      * @returns The removed formElement or <code>null</code>
      */
    def removeFormElement(vFormElement: Double): FormElement = js.native
    def removeFormElement(vFormElement: FormElement): FormElement = js.native
    /**
      * Sets a new value for property <code>expandable</code>.Defines if the <code>FormContainer</code> is
      * expandable.<b>Note:</b> The expander icon will only be shown if a <code>title</code> is set for the
      * <code>FormContainer</code>.When called with a value of <code>null</code> or <code>undefined</code>,
      * the default value of the property will be restored.Default value is <code>false</code>.
      * @param bExpandable New value for property <code>expandable</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setExpandable(bExpandable: Boolean): FormContainer = js.native
    /**
      * Sets a new value for property <code>expanded</code>.Container is expanded.<b>Note:</b> This property
      * only works if <code>expandable</code> is set to <code>true</code>.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>true</code>.
      * @param bExpanded New value for property <code>expanded</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setExpanded(bExpanded: Boolean): FormContainer = js.native
    def setTitle(vTitle: String): FormContainer = js.native
    /**
      * Sets the aggregated <code>title</code>.
      * @param vTitle The title to set
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setTitle(vTitle: Title): FormContainer = js.native
    /**
      * Sets the aggregated <code>toolbar</code>.
      * @since 1.36.0
      * @param oToolbar The toolbar to set
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setToolbar(oToolbar: Toolbar): FormContainer = js.native
    /**
      * Sets a new value for property <code>visible</code>.If set to <code>false</code>, the
      * <code>FormContainer</code> is not rendered.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>true</code>.
      * @param bVisible New value for property <code>visible</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setVisible(bVisible: Boolean): FormContainer = js.native
  }
  
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
  
  @js.native
  class FormLayout protected () extends Control {
    /**
      * Constructor for a new sap.ui.layout.form.FormLayout.Accepts an object literal <code>mSettings</code>
      * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId Id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>backgroundDesign</code>.Specifies the background color of the
      * <code>Form</code> content.The visualization of the different options depends on the used
      * theme.Default value is <code>Translucent</code>.
      * @since 1.36.0
      * @returns Value of property <code>backgroundDesign</code>
      */
    def getBackgroundDesign(): BackgroundDesign = js.native
    /**
      * Sets a new value for property <code>backgroundDesign</code>.Specifies the background color of the
      * <code>Form</code> content.The visualization of the different options depends on the used theme.When
      * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
      * property will be restored.Default value is <code>Translucent</code>.
      * @since 1.36.0
      * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): FormLayout = js.native
  }
  
  @js.native
  class GridContainerData protected () extends LayoutData {
    /**
      * Constructor for a new sap.ui.layout.form.GridContainerData.Accepts an object literal
      * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
      * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
      * of the syntax of the settings object.
      * @param sId Id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>halfGrid</code>.If set, the container takes half the width of
      * the <code>Form</code> (8 cells), if not it takes the full width (16 cells).If the
      * <code>GridLayout</code> is set to <code>singleColumn</code>, the full width of the grid is only 8
      * cells. So containers are rendered only once per row.Default value is <code>false</code>.
      * @returns Value of property <code>halfGrid</code>
      */
    def getHalfGrid(): Boolean = js.native
    /**
      * Sets a new value for property <code>halfGrid</code>.If set, the container takes half the width of
      * the <code>Form</code> (8 cells), if not it takes the full width (16 cells).If the
      * <code>GridLayout</code> is set to <code>singleColumn</code>, the full width of the grid is only 8
      * cells. So containers are rendered only once per row.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>false</code>.
      * @param bHalfGrid New value for property <code>halfGrid</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setHalfGrid(bHalfGrid: Boolean): GridContainerData = js.native
  }
  
  @js.native
  class GridElementData protected () extends LayoutData {
    /**
      * Constructor for a new sap.ui.layout.form.GridElementData.Accepts an object literal
      * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
      * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
      * of the syntax of the settings object.
      * @param sId Id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>hCells</code>.Number of cells in horizontal direction.If set to
      * "auto" the size is determined by the number of fields and the available cells. For labels the auto
      * size is 3 cells.If set to "full" only one field is allowed within the <code>FormElement</code>. It
      * gets the full width of the row and the label is displayed above. <b>Note:</b> For labels full size
      * has no effect.Default value is <code>auto</code>.
      * @returns Value of property <code>hCells</code>
      */
    def getHCells(): js.Any = js.native
    /**
      * Gets current value of property <code>vCells</code>.Number of cells in vertical
      * direction.<b>Note:</b> This property has no effect for labels.Default value is <code>1</code>.
      * @returns Value of property <code>vCells</code>
      */
    def getVCells(): Double = js.native
    /**
      * Sets a new value for property <code>hCells</code>.Number of cells in horizontal direction.If set to
      * "auto" the size is determined by the number of fields and the available cells. For labels the auto
      * size is 3 cells.If set to "full" only one field is allowed within the <code>FormElement</code>. It
      * gets the full width of the row and the label is displayed above. <b>Note:</b> For labels full size
      * has no effect.When called with a value of <code>null</code> or <code>undefined</code>, the default
      * value of the property will be restored.Default value is <code>auto</code>.
      * @param sHCells New value for property <code>hCells</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setHCells(sHCells: js.Any): GridElementData = js.native
    /**
      * Sets a new value for property <code>vCells</code>.Number of cells in vertical direction.<b>Note:</b>
      * This property has no effect for labels.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>1</code>.
      * @param iVCells New value for property <code>vCells</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setVCells(iVCells: Double): GridElementData = js.native
  }
  
  @js.native
  class GridLayout protected () extends FormLayout {
    /**
      * Constructor for a new sap.ui.layout.form.GridLayout.Accepts an object literal <code>mSettings</code>
      * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId Id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>singleColumn</code>.If set, the grid renders only one
      * <code>FormContainer</code> per column. That means one <code>FormContainer</code> is below the other.
      * The whole grid has 8 cells per row.If not set, <code>FormContainer</code> can use the full width of
      * the grid or two <code>FormContainers</code> can be placed beside each other. In this case the whole
      * grid has 16 cells per row.Default value is <code>false</code>.
      * @returns Value of property <code>singleColumn</code>
      */
    def getSingleColumn(): Boolean = js.native
    /**
      * Sets a new value for property <code>singleColumn</code>.If set, the grid renders only one
      * <code>FormContainer</code> per column. That means one <code>FormContainer</code> is below the other.
      * The whole grid has 8 cells per row.If not set, <code>FormContainer</code> can use the full width of
      * the grid or two <code>FormContainers</code> can be placed beside each other. In this case the whole
      * grid has 16 cells per row.When called with a value of <code>null</code> or <code>undefined</code>,
      * the default value of the property will be restored.Default value is <code>false</code>.
      * @param bSingleColumn New value for property <code>singleColumn</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setSingleColumn(bSingleColumn: Boolean): GridLayout = js.native
  }
  
  @js.native
  class ResponsiveGridLayout protected () extends FormLayout {
    /**
      * Constructor for a new <code>sap.ui.layout.form.ResponsiveGridLayout</code>.Accepts an object literal
      * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
      * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
      * of the syntax of the settings object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>adjustLabelSpan</code>.If set, the usage of
      * <code>labelSpanL</code> and <code>labelSpanM</code> are dependent on the number of
      * <code>FormContainers</code> in one row.If only one <code>FormContainer</code> is displayed in one
      * row, <code>labelSpanM</code> is used to define the size of the label.This is the same for medium and
      * large <code>Forms</code>.This is done to align the labels on forms where full-size
      * <code>FormContainers</code> and multiple-column rows are used in the same <code>Form</code>(because
      * every <code>FormContainer</code> has its own grid inside).If not set, the usage of
      * <code>labelSpanL</code> and <code>labelSpanM</code> are dependent on the <code>Form</code> size.The
      * number of <code>FormContainers</code> doesn't matter in this case.Default value is
      * <code>true</code>.
      * @since 1.34.0
      * @returns Value of property <code>adjustLabelSpan</code>
      */
    def getAdjustLabelSpan(): Boolean = js.native
    /**
      * Gets current value of property <code>breakpointL</code>.Breakpoint (in pixel) between Medium size
      * and Large size.Default value is <code>1024</code>.
      * @since 1.16.3
      * @returns Value of property <code>breakpointL</code>
      */
    def getBreakpointL(): Double = js.native
    /**
      * Gets current value of property <code>breakpointM</code>.Breakpoint (in pixel) between Small size and
      * Medium size.Default value is <code>600</code>.
      * @since 1.16.3
      * @returns Value of property <code>breakpointM</code>
      */
    def getBreakpointM(): Double = js.native
    /**
      * Gets current value of property <code>breakpointXL</code>.Breakpoint (in pixel) between large size
      * and extra large (XL) size.Default value is <code>1440</code>.
      * @since 1.34.0
      * @returns Value of property <code>breakpointXL</code>
      */
    def getBreakpointXL(): Double = js.native
    /**
      * Gets current value of property <code>columnsL</code>.Number of columns for large size.The number of
      * columns for large size must not be smaller than the number of columns for medium size.Default value
      * is <code>2</code>.
      * @since 1.16.3
      * @returns Value of property <code>columnsL</code>
      */
    def getColumnsL(): Double = js.native
    /**
      * Gets current value of property <code>columnsM</code>.Number of columns for medium size.Default value
      * is <code>1</code>.
      * @since 1.16.3
      * @returns Value of property <code>columnsM</code>
      */
    def getColumnsM(): Double = js.native
    /**
      * Gets current value of property <code>columnsXL</code>.Number of columns for extra large size.The
      * number of columns for extra large size must not be smaller than the number of columns for large
      * size.<b>Note:</b> If the default value -1 is not overwritten with the meaningful one then the
      * <code>columnsL</code> value is used (from the backward compatibility reasons).Default value is
      * <code>-1</code>.
      * @since 1.34.0
      * @returns Value of property <code>columnsXL</code>
      */
    def getColumnsXL(): Double = js.native
    /**
      * Gets current value of property <code>emptySpanL</code>.Number of grid cells that are empty at the
      * end of each line on large size.Default value is <code>0</code>.
      * @since 1.16.3
      * @returns Value of property <code>emptySpanL</code>
      */
    def getEmptySpanL(): Double = js.native
    /**
      * Gets current value of property <code>emptySpanM</code>.Number of grid cells that are empty at the
      * end of each line on medium size.Default value is <code>0</code>.
      * @since 1.16.3
      * @returns Value of property <code>emptySpanM</code>
      */
    def getEmptySpanM(): Double = js.native
    /**
      * Gets current value of property <code>emptySpanS</code>.Number of grid cells that are empty at the
      * end of each line on small size.Default value is <code>0</code>.
      * @since 1.16.3
      * @returns Value of property <code>emptySpanS</code>
      */
    def getEmptySpanS(): Double = js.native
    /**
      * Gets current value of property <code>emptySpanXL</code>.Number of grid cells that are empty at the
      * end of each line on extra large size.<b>Note:</b> If the default value -1 is not overwritten with
      * the meaningful one then the <code>emptySpanL</code> value is used.Default value is <code>-1</code>.
      * @since 1.34.0
      * @returns Value of property <code>emptySpanXL</code>
      */
    def getEmptySpanXL(): Double = js.native
    /**
      * Gets current value of property <code>labelSpanL</code>.Default span for labels in large
      * size.<b>Note:</b> If <code>adjustLabelSpanThis</code> is set, this property is only used if more
      * than 1 <code>FormContainer</code> is in one line. If only 1 <code>FormContainer</code> is in the
      * line, then the <code>labelSpanM</code> value is used.Default value is <code>4</code>.
      * @since 1.16.3
      * @returns Value of property <code>labelSpanL</code>
      */
    def getLabelSpanL(): Double = js.native
    /**
      * Gets current value of property <code>labelSpanM</code>.Default span for labels in medium
      * size.<b>Note:</b> If <code>adjustLabelSpanThis</code> is set this property is used for full-size
      * <code>FormContainers</code>. If more than one <code>FormContainer</code> is in one line,
      * <code>labelSpanL</code> is used.Default value is <code>2</code>.
      * @since 1.16.3
      * @returns Value of property <code>labelSpanM</code>
      */
    def getLabelSpanM(): Double = js.native
    /**
      * Gets current value of property <code>labelSpanS</code>.Default span for labels in small size.Default
      * value is <code>12</code>.
      * @since 1.16.3
      * @returns Value of property <code>labelSpanS</code>
      */
    def getLabelSpanS(): Double = js.native
    /**
      * Gets current value of property <code>labelSpanXL</code>.Default span for labels in extra large
      * size.<b>Note:</b> If the default value -1 is not overwritten with the meaningful one then the
      * <code>labelSpanL</code> value is used.Default value is <code>-1</code>.
      * @since 1.34.0
      * @returns Value of property <code>labelSpanXL</code>
      */
    def getLabelSpanXL(): Double = js.native
    /**
      * Gets current value of property <code>singleContainerFullSize</code>.If the <code>Form</code>
      * contains only one single <code>FormContainer</code> and this property is set,the
      * <code>FormContainer</code> is displayed using the full size of the <code>Form</code>.In this case
      * the properties <code>columnsXL</code>, <code>columnsL</code> and <code>columnsM</code> are
      * ignored.In all other cases the <code>FormContainer</code> is displayed in the size of one
      * column.Default value is <code>true</code>.
      * @since 1.34.0
      * @returns Value of property <code>singleContainerFullSize</code>
      */
    def getSingleContainerFullSize(): Boolean = js.native
    /**
      * Sets a new value for property <code>adjustLabelSpan</code>.If set, the usage of
      * <code>labelSpanL</code> and <code>labelSpanM</code> are dependent on the number of
      * <code>FormContainers</code> in one row.If only one <code>FormContainer</code> is displayed in one
      * row, <code>labelSpanM</code> is used to define the size of the label.This is the same for medium and
      * large <code>Forms</code>.This is done to align the labels on forms where full-size
      * <code>FormContainers</code> and multiple-column rows are used in the same <code>Form</code>(because
      * every <code>FormContainer</code> has its own grid inside).If not set, the usage of
      * <code>labelSpanL</code> and <code>labelSpanM</code> are dependent on the <code>Form</code> size.The
      * number of <code>FormContainers</code> doesn't matter in this case.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>true</code>.
      * @since 1.34.0
      * @param bAdjustLabelSpan New value for property <code>adjustLabelSpan</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setAdjustLabelSpan(bAdjustLabelSpan: Boolean): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>breakpointL</code>.Breakpoint (in pixel) between Medium size and
      * Large size.When called with a value of <code>null</code> or <code>undefined</code>, the default
      * value of the property will be restored.Default value is <code>1024</code>.
      * @since 1.16.3
      * @param iBreakpointL New value for property <code>breakpointL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setBreakpointL(iBreakpointL: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>breakpointM</code>.Breakpoint (in pixel) between Small size and
      * Medium size.When called with a value of <code>null</code> or <code>undefined</code>, the default
      * value of the property will be restored.Default value is <code>600</code>.
      * @since 1.16.3
      * @param iBreakpointM New value for property <code>breakpointM</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setBreakpointM(iBreakpointM: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>breakpointXL</code>.Breakpoint (in pixel) between large size and
      * extra large (XL) size.When called with a value of <code>null</code> or <code>undefined</code>, the
      * default value of the property will be restored.Default value is <code>1440</code>.
      * @since 1.34.0
      * @param iBreakpointXL New value for property <code>breakpointXL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setBreakpointXL(iBreakpointXL: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>columnsL</code>.Number of columns for large size.The number of
      * columns for large size must not be smaller than the number of columns for medium size.When called
      * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
      * be restored.Default value is <code>2</code>.
      * @since 1.16.3
      * @param iColumnsL New value for property <code>columnsL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setColumnsL(iColumnsL: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>columnsM</code>.Number of columns for medium size.When called
      * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
      * be restored.Default value is <code>1</code>.
      * @since 1.16.3
      * @param iColumnsM New value for property <code>columnsM</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setColumnsM(iColumnsM: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>columnsXL</code>.Number of columns for extra large size.The
      * number of columns for extra large size must not be smaller than the number of columns for large
      * size.<b>Note:</b> If the default value -1 is not overwritten with the meaningful one then the
      * <code>columnsL</code> value is used (from the backward compatibility reasons).When called with a
      * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>-1</code>.
      * @since 1.34.0
      * @param iColumnsXL New value for property <code>columnsXL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setColumnsXL(iColumnsXL: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>emptySpanL</code>.Number of grid cells that are empty at the end
      * of each line on large size.When called with a value of <code>null</code> or <code>undefined</code>,
      * the default value of the property will be restored.Default value is <code>0</code>.
      * @since 1.16.3
      * @param iEmptySpanL New value for property <code>emptySpanL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEmptySpanL(iEmptySpanL: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>emptySpanM</code>.Number of grid cells that are empty at the end
      * of each line on medium size.When called with a value of <code>null</code> or <code>undefined</code>,
      * the default value of the property will be restored.Default value is <code>0</code>.
      * @since 1.16.3
      * @param iEmptySpanM New value for property <code>emptySpanM</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEmptySpanM(iEmptySpanM: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>emptySpanS</code>.Number of grid cells that are empty at the end
      * of each line on small size.When called with a value of <code>null</code> or <code>undefined</code>,
      * the default value of the property will be restored.Default value is <code>0</code>.
      * @since 1.16.3
      * @param iEmptySpanS New value for property <code>emptySpanS</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEmptySpanS(iEmptySpanS: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>emptySpanXL</code>.Number of grid cells that are empty at the
      * end of each line on extra large size.<b>Note:</b> If the default value -1 is not overwritten with
      * the meaningful one then the <code>emptySpanL</code> value is used.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>-1</code>.
      * @since 1.34.0
      * @param iEmptySpanXL New value for property <code>emptySpanXL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEmptySpanXL(iEmptySpanXL: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>labelSpanL</code>.Default span for labels in large
      * size.<b>Note:</b> If <code>adjustLabelSpanThis</code> is set, this property is only used if more
      * than 1 <code>FormContainer</code> is in one line. If only 1 <code>FormContainer</code> is in the
      * line, then the <code>labelSpanM</code> value is used.When called with a value of <code>null</code>
      * or <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>4</code>.
      * @since 1.16.3
      * @param iLabelSpanL New value for property <code>labelSpanL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLabelSpanL(iLabelSpanL: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>labelSpanM</code>.Default span for labels in medium
      * size.<b>Note:</b> If <code>adjustLabelSpanThis</code> is set this property is used for full-size
      * <code>FormContainers</code>. If more than one <code>FormContainer</code> is in one line,
      * <code>labelSpanL</code> is used.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>2</code>.
      * @since 1.16.3
      * @param iLabelSpanM New value for property <code>labelSpanM</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLabelSpanM(iLabelSpanM: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>labelSpanS</code>.Default span for labels in small size.When
      * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
      * property will be restored.Default value is <code>12</code>.
      * @since 1.16.3
      * @param iLabelSpanS New value for property <code>labelSpanS</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLabelSpanS(iLabelSpanS: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>labelSpanXL</code>.Default span for labels in extra large
      * size.<b>Note:</b> If the default value -1 is not overwritten with the meaningful one then the
      * <code>labelSpanL</code> value is used.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>-1</code>.
      * @since 1.34.0
      * @param iLabelSpanXL New value for property <code>labelSpanXL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLabelSpanXL(iLabelSpanXL: Double): ResponsiveGridLayout = js.native
    /**
      * Sets a new value for property <code>singleContainerFullSize</code>.If the <code>Form</code> contains
      * only one single <code>FormContainer</code> and this property is set,the <code>FormContainer</code>
      * is displayed using the full size of the <code>Form</code>.In this case the properties
      * <code>columnsXL</code>, <code>columnsL</code> and <code>columnsM</code> are ignored.In all other
      * cases the <code>FormContainer</code> is displayed in the size of one column.When called with a value
      * of <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>true</code>.
      * @since 1.34.0
      * @param bSingleContainerFullSize New value for property <code>singleContainerFullSize</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setSingleContainerFullSize(bSingleContainerFullSize: Boolean): ResponsiveGridLayout = js.native
  }
  
  @js.native
  class ResponsiveLayout protected () extends FormLayout {
    /**
      * Constructor for a new sap.ui.layout.form.ResponsiveLayout.
      * @param sId Id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @js.native
  class SimpleForm protected () extends Control {
    /**
      * Constructor for a new sap.ui.layout.form.SimpleForm.Accepts an object literal <code>mSettings</code>
      * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
      * @since 1.32.0
      * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addAriaLabelledBy(vAriaLabelledBy: js.Any): SimpleForm = js.native
    def addAriaLabelledBy(vAriaLabelledBy: Control): SimpleForm = js.native
    /**
      * Adds some content to the aggregation <code>content</code>.
      * @param oContent the content to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addContent(oContent: Element): SimpleForm = js.native
    /**
      * Destroys all the content in the aggregation <code>content</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroyContent(): SimpleForm = js.native
    /**
      * Destroys the title in the aggregation <code>title</code>.
      * @since 1.16.3
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroyTitle(): SimpleForm = js.native
    /**
      * Destroys the toolbar in the aggregation <code>toolbar</code>.
      * @since 1.36.0
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroyToolbar(): SimpleForm = js.native
    /**
      * Gets current value of property <code>adjustLabelSpan</code>.If set, the usage of
      * <code>labelSpanL</code> and <code>labelSpanM</code> are dependent on the number of
      * <code>FormContainers</code> in one row.If only one <code>FormContainer</code> is displayed in one
      * row, <code>labelSpanM</code> is used to define the size of the label.This is the same for medium and
      * large <code>Forms</code>.This is done to align the labels on forms where full-size
      * <code>FormContainers</code> and multiple-column rows are used in the same <code>Form</code>(because
      * every <code>FormContainer</code> has its own grid inside).If not set, the usage of
      * <code>labelSpanL</code> and <code>labelSpanM</code> are dependent on the <code>Form</code> size.The
      * number of <code>FormContainers</code> doesn't matter in this case.<b>Note:</b> This property is only
      * used if a <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>true</code>.
      * @since 1.34.0
      * @returns Value of property <code>adjustLabelSpan</code>
      */
    def getAdjustLabelSpan(): Boolean = js.native
    /**
      * Returns array of IDs of the elements which are the current targets of the association
      * <code>ariaLabelledBy</code>.
      * @since 1.32.0
      */
    def getAriaLabelledBy(): js.Array[_] = js.native
    /**
      * Gets current value of property <code>backgroundDesign</code>.Specifies the background color of the
      * <code>SimpleForm</code> content.The visualization of the different options depends on the used
      * theme.Default value is <code>Translucent</code>.
      * @since 1.36.0
      * @returns Value of property <code>backgroundDesign</code>
      */
    def getBackgroundDesign(): BackgroundDesign = js.native
    /**
      * Gets current value of property <code>breakpointL</code>.Breakpoint between Medium size and Large
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout.Default value is <code>1024</code>.
      * @since 1.16.3
      * @returns Value of property <code>breakpointL</code>
      */
    def getBreakpointL(): Double = js.native
    /**
      * Gets current value of property <code>breakpointM</code>.Breakpoint between Small size and Medium
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout.Default value is <code>600</code>.
      * @since 1.16.3
      * @returns Value of property <code>breakpointM</code>
      */
    def getBreakpointM(): Double = js.native
    /**
      * Gets current value of property <code>breakpointXL</code>.Breakpoint between Medium size and Large
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout.Default value is <code>1440</code>.
      * @since 1.34.0
      * @returns Value of property <code>breakpointXL</code>
      */
    def getBreakpointXL(): Double = js.native
    /**
      * Gets current value of property <code>columnsL</code>.Form columns for large size.The number of
      * columns for large size must not be smaller than the number of columns for medium size.<b>Note:</b>
      * This property is only used if a <code>ResponsiveGridLayout</code> is used as a layout.Default value
      * is <code>2</code>.
      * @since 1.16.3
      * @returns Value of property <code>columnsL</code>
      */
    def getColumnsL(): Double = js.native
    /**
      * Gets current value of property <code>columnsM</code>.Form columns for medium size.<b>Note:</b> This
      * property is only used if a <code>ResponsiveGridLayout</code> is used as a layout.Default value is
      * <code>1</code>.
      * @since 1.16.3
      * @returns Value of property <code>columnsM</code>
      */
    def getColumnsM(): Double = js.native
    /**
      * Gets current value of property <code>columnsXL</code>.Form columns for extra large size.The number
      * of columns for extra large size must not be smaller than the number of columns for large
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout.If the default value -1 is not overwritten with the meaningful one then the
      * <code>columnsL</code> value is used (from the backward compatibility reasons).Default value is
      * <code>-1</code>.
      * @since 1.34.0
      * @returns Value of property <code>columnsXL</code>
      */
    def getColumnsXL(): Double = js.native
    /**
      * Gets content of aggregation <code>content</code>.The content of the form is structured in the
      * following way:<ul><li>Add a <code>Title</code> or <code>Toolbar</code> control to start a new group
      * (<code>FormContainer</code>).</li><li>Add a <code>Label</code> control to start a new row
      * (<code>FormElement</code>).</li><li>Add controls as input fields, text fields or other as
      * needed.</li><li>Use <code>LayoutData</code> to influence the layout for special cases in the single
      * controls.For example, if a <code>ResponsiveLayout</code> is used as a layout, the form content is
      * weighted using weight 3 for the labels and weight 5 for the fields part. By default the label column
      * is 192 pixels wide.If your input controls should influence their width, you can add
      * <code>sap.ui.layout.ResponsiveFlowLayoutData</code> to them via <code>setLayoutData</code>
      * method.Ensure that the sum of the weights in the <code>ResponsiveFlowLayoutData</code> is not more
      * than 5, as this is the total width of the input control part of each form row.</li></ul>Example for
      * a row where the <code>TextField</code> takes 4 and the <code>TextView</code> takes 1 weight (using
      * <code>ResponsiveLayout</code>):<pre>new sap.ui.commons.Label({text:"Label"});new
      * sap.ui.commons.TextField({value:"Weight 4",layoutData:new
      * sap.ui.layout.ResponsiveFlowLayoutData({weight:4})}),new sap.ui.commons.TextView({text:"Weight
      * 1",layoutData: new sap.ui.layout.ResponsiveFlowLayoutData({weight:1})}),</pre><b>Note:</b> Do not
      * put any layout controls in here. This could destroy the visual layout,keyboard support and
      * screen-reader support.
      */
    def getContent(): js.Array[Element] = js.native
    /**
      * Gets current value of property <code>editable</code>.Applies a device-specific and theme-specific
      * line-height to the form rows if the form has editable content.If set, all (not only the editable)
      * rows of the form will get the line height of editable fields.The accessibility aria-readonly
      * attribute is set according to this property.<b>Note:</b> The setting of the property has no
      * influence on the editable functionality of the form's content.
      * @returns Value of property <code>editable</code>
      */
    def getEditable(): Boolean = js.native
    /**
      * Gets current value of property <code>emptySpanL</code>.Number of grid cells that are empty at the
      * end of each line on large size.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>0</code>.
      * @since 1.16.3
      * @returns Value of property <code>emptySpanL</code>
      */
    def getEmptySpanL(): Double = js.native
    /**
      * Gets current value of property <code>emptySpanM</code>.Number of grid cells that are empty at the
      * end of each line on medium size.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>0</code>.
      * @since 1.16.3
      * @returns Value of property <code>emptySpanM</code>
      */
    def getEmptySpanM(): Double = js.native
    /**
      * Gets current value of property <code>emptySpanS</code>.Number of grid cells that are empty at the
      * end of each line on small size.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>0</code>.
      * @since 1.16.3
      * @returns Value of property <code>emptySpanS</code>
      */
    def getEmptySpanS(): Double = js.native
    /**
      * Gets current value of property <code>emptySpanXL</code>.Number of grid cells that are empty at the
      * end of each line on extra large size.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout. If the default value -1 is not overwritten
      * with the meaningful one then the <code>emptySpanL</code> value is used (from the backward
      * compatibility reasons).Default value is <code>-1</code>.
      * @since 1.34.0
      * @returns Value of property <code>emptySpanXL</code>
      */
    def getEmptySpanXL(): Double = js.native
    /**
      * Gets current value of property <code>labelMinWidth</code>.Specifies the min-width in pixels of the
      * label in all form containers.<b>Note:</b> This property is only used if a
      * <code>ResponsiveLayout</code> is used as a layout.Default value is <code>192</code>.
      * @returns Value of property <code>labelMinWidth</code>
      */
    def getLabelMinWidth(): Double = js.native
    /**
      * Gets current value of property <code>labelSpanL</code>.Default span for labels in large
      * size.<b>Note:</b> If <code>adjustLabelSpanThis</code> is set, this property is only used if more
      * than 1 <code>FormContainer</code> is in one line. If only 1 <code>FormContainer</code> is in the
      * line, then the <code>labelSpanM</code> value is used.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>4</code>.
      * @since 1.16.3
      * @returns Value of property <code>labelSpanL</code>
      */
    def getLabelSpanL(): Double = js.native
    /**
      * Gets current value of property <code>labelSpanM</code>.Default span for labels in medium
      * size.<b>Note:</b> If <code>adjustLabelSpanThis</code> is set, this property is used for full-size
      * <code>FormContainers</code>. If more than one <code>FormContainer</code> is in one line,
      * <code>labelSpanL</code> is used.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>2</code>.
      * @since 1.16.3
      * @returns Value of property <code>labelSpanM</code>
      */
    def getLabelSpanM(): Double = js.native
    /**
      * Gets current value of property <code>labelSpanS</code>.Default span for labels in small
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout.Default value is <code>12</code>.
      * @since 1.16.3
      * @returns Value of property <code>labelSpanS</code>
      */
    def getLabelSpanS(): Double = js.native
    /**
      * Gets current value of property <code>labelSpanXL</code>.Default span for labels in extra large
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout. If the default value -1 is not overwritten with the meaningful one then the
      * <code>labelSpanL</code> value is used (from the backward compatibility reasons).Default value is
      * <code>-1</code>.
      * @since 1.34.0
      * @returns Value of property <code>labelSpanXL</code>
      */
    def getLabelSpanXL(): Double = js.native
    /**
      * Gets current value of property <code>layout</code>.The <code>FormLayout</code> that is used to
      * render the <code>SimpleForm</code>.We suggest using the <code>ResponsiveGridLayout</code> for
      * rendering a <code>SimpleForm</code>, as its responsiveness uses the space available in the best way
      * possible.Default value is <code>ResponsiveLayout</code>.
      * @returns Value of property <code>layout</code>
      */
    def getLayout(): SimpleFormLayout = js.native
    /**
      * Gets current value of property <code>maxContainerCols</code>.The maximum amount of groups
      * (<code>FormContainers</code>) per row that is used before a new row is started.<b>Note:</b> If a
      * <code>ResponsiveGridLayout</code> is used as a layout, this property is not used. Please use the
      * properties <code>ColumnsL</code> and <code>ColumnsM</code> in this case.Default value is
      * <code>2</code>.
      * @returns Value of property <code>maxContainerCols</code>
      */
    def getMaxContainerCols(): Double = js.native
    /**
      * Gets current value of property <code>minWidth</code>.The overall minimum width in pixels that is
      * used for the <code>SimpleForm</code>. If the available width is below the given minWidth the
      * SimpleForm will create a new row for the next group (<code>FormContainer</code>).The default value
      * is -1, meaning that inner groups (<code>FormContainers</code>) will be stacked until maxCols is
      * reached, irrespective of whether a maxWidth is reached or the available parents width is
      * reached.<b>Note:</b> This property is only used if a <code>ResponsiveLayout</code> is used as a
      * layout.Default value is <code>-1</code>.
      * @returns Value of property <code>minWidth</code>
      */
    def getMinWidth(): Double = js.native
    /**
      * Gets current value of property <code>singleContainerFullSize</code>.If the <code>Form</code>
      * contains only one single <code>FormContainer</code> and this property is set,the
      * <code>FormContainer</code> is displayed using the full size of the <code>Form</code>.In this case
      * the properties <code>columnsL</code> and <code>columnsM</code> are ignored.In all other cases the
      * <code>FormContainer</code> is displayed in the size of one column.<b>Note:</b> This property is only
      * used if a <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>true</code>.
      * @since 1.34.0
      * @returns Value of property <code>singleContainerFullSize</code>
      */
    def getSingleContainerFullSize(): Boolean = js.native
    /**
      * Gets content of aggregation <code>title</code>.Title element of the <code>SimpleForm</code>. Can
      * either be a <code>Title</code> control, or a string.
      * @since 1.16.3
      */
    def getTitle(): Title | String = js.native
    /**
      * Gets content of aggregation <code>toolbar</code>.Toolbar of the <code>SimpleForm</code>.<b>Note:</b>
      * If a <code>Toolbar</code> is used, the <code>Title</code> is ignored.If a title is needed inside the
      * <code>Toolbar</code> it must be added at content to the <code>Toolbar</code>.In this case add the
      * <code>Title</code> to the <code>ariaLabelledBy</code> association.
      * @since 1.36.0
      */
    def getToolbar(): Toolbar = js.native
    /**
      * Gets current value of property <code>width</code>.Width of the form.
      * @since 1.28.0
      * @returns Value of property <code>width</code>
      */
    def getWidth(): js.Any = js.native
    /**
      * Checks for the provided <code>sap.ui.core.Element</code> in the aggregation <code>content</code>.and
      * returns its index if found or -1 otherwise.
      * @param oContent The content whose index is looked for
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(oContent: Element): Double = js.native
    /**
      * Inserts a content into the aggregation <code>content</code>.
      * @param oContent the content to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
      * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
      *  greater than the current size of the aggregation, the content is inserted at             the last
      * position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertContent(oContent: Element, iIndex: Double): SimpleForm = js.native
    /**
      * Removes all the controls in the association named <code>ariaLabelledBy</code>.
      * @since 1.32.0
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[_] = js.native
    /**
      * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
      * from the hosting UIArea.
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[Element] = js.native
    def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
    /**
      * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
      * @since 1.32.0
      * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
      * @returns The removed ariaLabelledBy or <code>null</code>
      */
    def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
    def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
    def removeContent(vContent: String): Element = js.native
    /**
      * Removes a content from the aggregation <code>content</code>.
      * @param vContent The content to remove or its index or id
      * @returns The removed content or <code>null</code>
      */
    def removeContent(vContent: Double): Element = js.native
    def removeContent(vContent: Element): Element = js.native
    /**
      * Sets a new value for property <code>adjustLabelSpan</code>.If set, the usage of
      * <code>labelSpanL</code> and <code>labelSpanM</code> are dependent on the number of
      * <code>FormContainers</code> in one row.If only one <code>FormContainer</code> is displayed in one
      * row, <code>labelSpanM</code> is used to define the size of the label.This is the same for medium and
      * large <code>Forms</code>.This is done to align the labels on forms where full-size
      * <code>FormContainers</code> and multiple-column rows are used in the same <code>Form</code>(because
      * every <code>FormContainer</code> has its own grid inside).If not set, the usage of
      * <code>labelSpanL</code> and <code>labelSpanM</code> are dependent on the <code>Form</code> size.The
      * number of <code>FormContainers</code> doesn't matter in this case.<b>Note:</b> This property is only
      * used if a <code>ResponsiveGridLayout</code> is used as a layout.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>true</code>.
      * @since 1.34.0
      * @param bAdjustLabelSpan New value for property <code>adjustLabelSpan</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setAdjustLabelSpan(bAdjustLabelSpan: Boolean): SimpleForm = js.native
    /**
      * Sets a new value for property <code>backgroundDesign</code>.Specifies the background color of the
      * <code>SimpleForm</code> content.The visualization of the different options depends on the used
      * theme.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.Default value is <code>Translucent</code>.
      * @since 1.36.0
      * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): SimpleForm = js.native
    /**
      * Sets a new value for property <code>breakpointL</code>.Breakpoint between Medium size and Large
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.Default value is <code>1024</code>.
      * @since 1.16.3
      * @param iBreakpointL New value for property <code>breakpointL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setBreakpointL(iBreakpointL: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>breakpointM</code>.Breakpoint between Small size and Medium
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.Default value is <code>600</code>.
      * @since 1.16.3
      * @param iBreakpointM New value for property <code>breakpointM</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setBreakpointM(iBreakpointM: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>breakpointXL</code>.Breakpoint between Medium size and Large
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.Default value is <code>1440</code>.
      * @since 1.34.0
      * @param iBreakpointXL New value for property <code>breakpointXL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setBreakpointXL(iBreakpointXL: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>columnsL</code>.Form columns for large size.The number of
      * columns for large size must not be smaller than the number of columns for medium size.<b>Note:</b>
      * This property is only used if a <code>ResponsiveGridLayout</code> is used as a layout.When called
      * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
      * be restored.Default value is <code>2</code>.
      * @since 1.16.3
      * @param iColumnsL New value for property <code>columnsL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setColumnsL(iColumnsL: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>columnsM</code>.Form columns for medium size.<b>Note:</b> This
      * property is only used if a <code>ResponsiveGridLayout</code> is used as a layout.When called with a
      * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>1</code>.
      * @since 1.16.3
      * @param iColumnsM New value for property <code>columnsM</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setColumnsM(iColumnsM: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>columnsXL</code>.Form columns for extra large size.The number of
      * columns for extra large size must not be smaller than the number of columns for large
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout.If the default value -1 is not overwritten with the meaningful one then the
      * <code>columnsL</code> value is used (from the backward compatibility reasons).When called with a
      * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>-1</code>.
      * @since 1.34.0
      * @param iColumnsXL New value for property <code>columnsXL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setColumnsXL(iColumnsXL: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>editable</code>.Applies a device-specific and theme-specific
      * line-height to the form rows if the form has editable content.If set, all (not only the editable)
      * rows of the form will get the line height of editable fields.The accessibility aria-readonly
      * attribute is set according to this property.<b>Note:</b> The setting of the property has no
      * influence on the editable functionality of the form's content.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param bEditable New value for property <code>editable</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEditable(bEditable: Boolean): SimpleForm = js.native
    /**
      * Sets a new value for property <code>emptySpanL</code>.Number of grid cells that are empty at the end
      * of each line on large size.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout.When called with a value of <code>null</code>
      * or <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>0</code>.
      * @since 1.16.3
      * @param iEmptySpanL New value for property <code>emptySpanL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEmptySpanL(iEmptySpanL: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>emptySpanM</code>.Number of grid cells that are empty at the end
      * of each line on medium size.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout.When called with a value of <code>null</code>
      * or <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>0</code>.
      * @since 1.16.3
      * @param iEmptySpanM New value for property <code>emptySpanM</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEmptySpanM(iEmptySpanM: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>emptySpanS</code>.Number of grid cells that are empty at the end
      * of each line on small size.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout.When called with a value of <code>null</code>
      * or <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>0</code>.
      * @since 1.16.3
      * @param iEmptySpanS New value for property <code>emptySpanS</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEmptySpanS(iEmptySpanS: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>emptySpanXL</code>.Number of grid cells that are empty at the
      * end of each line on extra large size.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout. If the default value -1 is not overwritten
      * with the meaningful one then the <code>emptySpanL</code> value is used (from the backward
      * compatibility reasons).When called with a value of <code>null</code> or <code>undefined</code>, the
      * default value of the property will be restored.Default value is <code>-1</code>.
      * @since 1.34.0
      * @param iEmptySpanXL New value for property <code>emptySpanXL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEmptySpanXL(iEmptySpanXL: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>labelMinWidth</code>.Specifies the min-width in pixels of the
      * label in all form containers.<b>Note:</b> This property is only used if a
      * <code>ResponsiveLayout</code> is used as a layout.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>192</code>.
      * @param iLabelMinWidth New value for property <code>labelMinWidth</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLabelMinWidth(iLabelMinWidth: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>labelSpanL</code>.Default span for labels in large
      * size.<b>Note:</b> If <code>adjustLabelSpanThis</code> is set, this property is only used if more
      * than 1 <code>FormContainer</code> is in one line. If only 1 <code>FormContainer</code> is in the
      * line, then the <code>labelSpanM</code> value is used.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout.When called with a value of <code>null</code>
      * or <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>4</code>.
      * @since 1.16.3
      * @param iLabelSpanL New value for property <code>labelSpanL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLabelSpanL(iLabelSpanL: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>labelSpanM</code>.Default span for labels in medium
      * size.<b>Note:</b> If <code>adjustLabelSpanThis</code> is set, this property is used for full-size
      * <code>FormContainers</code>. If more than one <code>FormContainer</code> is in one line,
      * <code>labelSpanL</code> is used.<b>Note:</b> This property is only used if a
      * <code>ResponsiveGridLayout</code> is used as a layout.When called with a value of <code>null</code>
      * or <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>2</code>.
      * @since 1.16.3
      * @param iLabelSpanM New value for property <code>labelSpanM</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLabelSpanM(iLabelSpanM: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>labelSpanS</code>.Default span for labels in small
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.Default value is <code>12</code>.
      * @since 1.16.3
      * @param iLabelSpanS New value for property <code>labelSpanS</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLabelSpanS(iLabelSpanS: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>labelSpanXL</code>.Default span for labels in extra large
      * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
      * layout. If the default value -1 is not overwritten with the meaningful one then the
      * <code>labelSpanL</code> value is used (from the backward compatibility reasons).When called with a
      * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>-1</code>.
      * @since 1.34.0
      * @param iLabelSpanXL New value for property <code>labelSpanXL</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLabelSpanXL(iLabelSpanXL: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>layout</code>.The <code>FormLayout</code> that is used to render
      * the <code>SimpleForm</code>.We suggest using the <code>ResponsiveGridLayout</code> for rendering a
      * <code>SimpleForm</code>, as its responsiveness uses the space available in the best way
      * possible.When called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.Default value is <code>ResponsiveLayout</code>.
      * @param sLayout New value for property <code>layout</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLayout(sLayout: SimpleFormLayout): SimpleForm = js.native
    /**
      * Sets a new value for property <code>maxContainerCols</code>.The maximum amount of groups
      * (<code>FormContainers</code>) per row that is used before a new row is started.<b>Note:</b> If a
      * <code>ResponsiveGridLayout</code> is used as a layout, this property is not used. Please use the
      * properties <code>ColumnsL</code> and <code>ColumnsM</code> in this case.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>2</code>.
      * @param iMaxContainerCols New value for property <code>maxContainerCols</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setMaxContainerCols(iMaxContainerCols: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>minWidth</code>.The overall minimum width in pixels that is used
      * for the <code>SimpleForm</code>. If the available width is below the given minWidth the SimpleForm
      * will create a new row for the next group (<code>FormContainer</code>).The default value is -1,
      * meaning that inner groups (<code>FormContainers</code>) will be stacked until maxCols is reached,
      * irrespective of whether a maxWidth is reached or the available parents width is reached.<b>Note:</b>
      * This property is only used if a <code>ResponsiveLayout</code> is used as a layout.When called with a
      * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>-1</code>.
      * @param iMinWidth New value for property <code>minWidth</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setMinWidth(iMinWidth: Double): SimpleForm = js.native
    /**
      * Sets a new value for property <code>singleContainerFullSize</code>.If the <code>Form</code> contains
      * only one single <code>FormContainer</code> and this property is set,the <code>FormContainer</code>
      * is displayed using the full size of the <code>Form</code>.In this case the properties
      * <code>columnsL</code> and <code>columnsM</code> are ignored.In all other cases the
      * <code>FormContainer</code> is displayed in the size of one column.<b>Note:</b> This property is only
      * used if a <code>ResponsiveGridLayout</code> is used as a layout.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>true</code>.
      * @since 1.34.0
      * @param bSingleContainerFullSize New value for property <code>singleContainerFullSize</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setSingleContainerFullSize(bSingleContainerFullSize: Boolean): SimpleForm = js.native
    def setTitle(vTitle: String): SimpleForm = js.native
    /**
      * Sets the aggregated <code>title</code>.
      * @since 1.16.3
      * @param vTitle The title to set
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setTitle(vTitle: Title): SimpleForm = js.native
    /**
      * Sets the aggregated <code>toolbar</code>.
      * @since 1.36.0
      * @param oToolbar The toolbar to set
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setToolbar(oToolbar: Toolbar): SimpleForm = js.native
    /**
      * Sets a new value for property <code>width</code>.Width of the form.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @since 1.28.0
      * @param sWidth New value for property <code>width</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setWidth(sWidth: js.Any): SimpleForm = js.native
  }
  
  @js.native
  sealed trait SimpleFormLayout extends js.Object
  
  /**
    * Available <code>FormLayouts</code> used to render a <code>SimpleForm</code>.
    */
  @js.native
  object SimpleFormLayout extends js.Object {
    @js.native
    sealed trait GridLayout extends SimpleFormLayout
    
    @js.native
    sealed trait ResponsiveGridLayout extends SimpleFormLayout
    
    @js.native
    sealed trait ResponsiveLayout extends SimpleFormLayout
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SimpleFormLayout with Double] = js.native
    /* 0 */ @js.native
    object GridLayout
      extends TopLevel[typings.openui5.sap.ui.layout.form.SimpleFormLayout.GridLayout with Double]
    
    /* 1 */ @js.native
    object ResponsiveGridLayout
      extends TopLevel[
              typings.openui5.sap.ui.layout.form.SimpleFormLayout.ResponsiveGridLayout with Double
            ]
    
    /* 2 */ @js.native
    object ResponsiveLayout
      extends TopLevel[typings.openui5.sap.ui.layout.form.SimpleFormLayout.ResponsiveLayout with Double]
    
  }
  
}

