package typings
package openui5Lib.sapNs.uiNs.layoutNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.form.SimpleForm")
@js.native
class SimpleForm protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new sap.ui.layout.form.SimpleForm.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.32.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): SimpleForm = js.native
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): SimpleForm = js.native
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Element): SimpleForm = js.native
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
  def getAdjustLabelSpan(): scala.Boolean = js.native
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
  def getBackgroundDesign(): openui5Lib.sapNs.uiNs.layoutNs.BackgroundDesign = js.native
  /**
    * Gets current value of property <code>breakpointL</code>.Breakpoint between Medium size and Large
    * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
    * layout.Default value is <code>1024</code>.
    * @since 1.16.3
    * @returns Value of property <code>breakpointL</code>
    */
  def getBreakpointL(): scala.Double = js.native
  /**
    * Gets current value of property <code>breakpointM</code>.Breakpoint between Small size and Medium
    * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
    * layout.Default value is <code>600</code>.
    * @since 1.16.3
    * @returns Value of property <code>breakpointM</code>
    */
  def getBreakpointM(): scala.Double = js.native
  /**
    * Gets current value of property <code>breakpointXL</code>.Breakpoint between Medium size and Large
    * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
    * layout.Default value is <code>1440</code>.
    * @since 1.34.0
    * @returns Value of property <code>breakpointXL</code>
    */
  def getBreakpointXL(): scala.Double = js.native
  /**
    * Gets current value of property <code>columnsL</code>.Form columns for large size.The number of
    * columns for large size must not be smaller than the number of columns for medium size.<b>Note:</b>
    * This property is only used if a <code>ResponsiveGridLayout</code> is used as a layout.Default value
    * is <code>2</code>.
    * @since 1.16.3
    * @returns Value of property <code>columnsL</code>
    */
  def getColumnsL(): scala.Double = js.native
  /**
    * Gets current value of property <code>columnsM</code>.Form columns for medium size.<b>Note:</b> This
    * property is only used if a <code>ResponsiveGridLayout</code> is used as a layout.Default value is
    * <code>1</code>.
    * @since 1.16.3
    * @returns Value of property <code>columnsM</code>
    */
  def getColumnsM(): scala.Double = js.native
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
  def getColumnsXL(): scala.Double = js.native
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
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Element] = js.native
  /**
    * Gets current value of property <code>editable</code>.Applies a device-specific and theme-specific
    * line-height to the form rows if the form has editable content.If set, all (not only the editable)
    * rows of the form will get the line height of editable fields.The accessibility aria-readonly
    * attribute is set according to this property.<b>Note:</b> The setting of the property has no
    * influence on the editable functionality of the form's content.
    * @returns Value of property <code>editable</code>
    */
  def getEditable(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>emptySpanL</code>.Number of grid cells that are empty at the
    * end of each line on large size.<b>Note:</b> This property is only used if a
    * <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>0</code>.
    * @since 1.16.3
    * @returns Value of property <code>emptySpanL</code>
    */
  def getEmptySpanL(): scala.Double = js.native
  /**
    * Gets current value of property <code>emptySpanM</code>.Number of grid cells that are empty at the
    * end of each line on medium size.<b>Note:</b> This property is only used if a
    * <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>0</code>.
    * @since 1.16.3
    * @returns Value of property <code>emptySpanM</code>
    */
  def getEmptySpanM(): scala.Double = js.native
  /**
    * Gets current value of property <code>emptySpanS</code>.Number of grid cells that are empty at the
    * end of each line on small size.<b>Note:</b> This property is only used if a
    * <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>0</code>.
    * @since 1.16.3
    * @returns Value of property <code>emptySpanS</code>
    */
  def getEmptySpanS(): scala.Double = js.native
  /**
    * Gets current value of property <code>emptySpanXL</code>.Number of grid cells that are empty at the
    * end of each line on extra large size.<b>Note:</b> This property is only used if a
    * <code>ResponsiveGridLayout</code> is used as a layout. If the default value -1 is not overwritten
    * with the meaningful one then the <code>emptySpanL</code> value is used (from the backward
    * compatibility reasons).Default value is <code>-1</code>.
    * @since 1.34.0
    * @returns Value of property <code>emptySpanXL</code>
    */
  def getEmptySpanXL(): scala.Double = js.native
  /**
    * Gets current value of property <code>labelMinWidth</code>.Specifies the min-width in pixels of the
    * label in all form containers.<b>Note:</b> This property is only used if a
    * <code>ResponsiveLayout</code> is used as a layout.Default value is <code>192</code>.
    * @returns Value of property <code>labelMinWidth</code>
    */
  def getLabelMinWidth(): scala.Double = js.native
  /**
    * Gets current value of property <code>labelSpanL</code>.Default span for labels in large
    * size.<b>Note:</b> If <code>adjustLabelSpanThis</code> is set, this property is only used if more
    * than 1 <code>FormContainer</code> is in one line. If only 1 <code>FormContainer</code> is in the
    * line, then the <code>labelSpanM</code> value is used.<b>Note:</b> This property is only used if a
    * <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>4</code>.
    * @since 1.16.3
    * @returns Value of property <code>labelSpanL</code>
    */
  def getLabelSpanL(): scala.Double = js.native
  /**
    * Gets current value of property <code>labelSpanM</code>.Default span for labels in medium
    * size.<b>Note:</b> If <code>adjustLabelSpanThis</code> is set, this property is used for full-size
    * <code>FormContainers</code>. If more than one <code>FormContainer</code> is in one line,
    * <code>labelSpanL</code> is used.<b>Note:</b> This property is only used if a
    * <code>ResponsiveGridLayout</code> is used as a layout.Default value is <code>2</code>.
    * @since 1.16.3
    * @returns Value of property <code>labelSpanM</code>
    */
  def getLabelSpanM(): scala.Double = js.native
  /**
    * Gets current value of property <code>labelSpanS</code>.Default span for labels in small
    * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
    * layout.Default value is <code>12</code>.
    * @since 1.16.3
    * @returns Value of property <code>labelSpanS</code>
    */
  def getLabelSpanS(): scala.Double = js.native
  /**
    * Gets current value of property <code>labelSpanXL</code>.Default span for labels in extra large
    * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
    * layout. If the default value -1 is not overwritten with the meaningful one then the
    * <code>labelSpanL</code> value is used (from the backward compatibility reasons).Default value is
    * <code>-1</code>.
    * @since 1.34.0
    * @returns Value of property <code>labelSpanXL</code>
    */
  def getLabelSpanXL(): scala.Double = js.native
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
  def getMaxContainerCols(): scala.Double = js.native
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
  def getMinWidth(): scala.Double = js.native
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
  def getSingleContainerFullSize(): scala.Boolean = js.native
  /**
    * Gets content of aggregation <code>title</code>.Title element of the <code>SimpleForm</code>. Can
    * either be a <code>Title</code> control, or a string.
    * @since 1.16.3
    */
  def getTitle(): openui5Lib.sapNs.uiNs.coreNs.Title | java.lang.String = js.native
  /**
    * Gets content of aggregation <code>toolbar</code>.Toolbar of the <code>SimpleForm</code>.<b>Note:</b>
    * If a <code>Toolbar</code> is used, the <code>Title</code> is ignored.If a title is needed inside the
    * <code>Toolbar</code> it must be added at content to the <code>Toolbar</code>.In this case add the
    * <code>Title</code> to the <code>ariaLabelledBy</code> association.
    * @since 1.36.0
    */
  def getToolbar(): openui5Lib.sapNs.uiNs.coreNs.Toolbar = js.native
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
  def indexOfContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Element): scala.Double = js.native
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Element, iIndex: scala.Double): SimpleForm = js.native
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
  def removeAllContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Element] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.32.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: scala.Double): js.Any = js.native
  def removeContent(vContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  def removeContent(vContent: openui5Lib.sapNs.uiNs.coreNs.Element): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
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
  def setAdjustLabelSpan(bAdjustLabelSpan: scala.Boolean): SimpleForm = js.native
  /**
    * Sets a new value for property <code>backgroundDesign</code>.Specifies the background color of the
    * <code>SimpleForm</code> content.The visualization of the different options depends on the used
    * theme.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Translucent</code>.
    * @since 1.36.0
    * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundDesign(sBackgroundDesign: openui5Lib.sapNs.uiNs.layoutNs.BackgroundDesign): SimpleForm = js.native
  /**
    * Sets a new value for property <code>breakpointL</code>.Breakpoint between Medium size and Large
    * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
    * layout.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>1024</code>.
    * @since 1.16.3
    * @param iBreakpointL New value for property <code>breakpointL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBreakpointL(iBreakpointL: scala.Double): SimpleForm = js.native
  /**
    * Sets a new value for property <code>breakpointM</code>.Breakpoint between Small size and Medium
    * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
    * layout.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>600</code>.
    * @since 1.16.3
    * @param iBreakpointM New value for property <code>breakpointM</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBreakpointM(iBreakpointM: scala.Double): SimpleForm = js.native
  /**
    * Sets a new value for property <code>breakpointXL</code>.Breakpoint between Medium size and Large
    * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
    * layout.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>1440</code>.
    * @since 1.34.0
    * @param iBreakpointXL New value for property <code>breakpointXL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBreakpointXL(iBreakpointXL: scala.Double): SimpleForm = js.native
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
  def setColumnsL(iColumnsL: scala.Double): SimpleForm = js.native
  /**
    * Sets a new value for property <code>columnsM</code>.Form columns for medium size.<b>Note:</b> This
    * property is only used if a <code>ResponsiveGridLayout</code> is used as a layout.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>1</code>.
    * @since 1.16.3
    * @param iColumnsM New value for property <code>columnsM</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnsM(iColumnsM: scala.Double): SimpleForm = js.native
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
  def setColumnsXL(iColumnsXL: scala.Double): SimpleForm = js.native
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
  def setEditable(bEditable: scala.Boolean): SimpleForm = js.native
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
  def setEmptySpanL(iEmptySpanL: scala.Double): SimpleForm = js.native
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
  def setEmptySpanM(iEmptySpanM: scala.Double): SimpleForm = js.native
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
  def setEmptySpanS(iEmptySpanS: scala.Double): SimpleForm = js.native
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
  def setEmptySpanXL(iEmptySpanXL: scala.Double): SimpleForm = js.native
  /**
    * Sets a new value for property <code>labelMinWidth</code>.Specifies the min-width in pixels of the
    * label in all form containers.<b>Note:</b> This property is only used if a
    * <code>ResponsiveLayout</code> is used as a layout.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>192</code>.
    * @param iLabelMinWidth New value for property <code>labelMinWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLabelMinWidth(iLabelMinWidth: scala.Double): SimpleForm = js.native
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
  def setLabelSpanL(iLabelSpanL: scala.Double): SimpleForm = js.native
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
  def setLabelSpanM(iLabelSpanM: scala.Double): SimpleForm = js.native
  /**
    * Sets a new value for property <code>labelSpanS</code>.Default span for labels in small
    * size.<b>Note:</b> This property is only used if a <code>ResponsiveGridLayout</code> is used as a
    * layout.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>12</code>.
    * @since 1.16.3
    * @param iLabelSpanS New value for property <code>labelSpanS</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLabelSpanS(iLabelSpanS: scala.Double): SimpleForm = js.native
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
  def setLabelSpanXL(iLabelSpanXL: scala.Double): SimpleForm = js.native
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
  def setMaxContainerCols(iMaxContainerCols: scala.Double): SimpleForm = js.native
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
  def setMinWidth(iMinWidth: scala.Double): SimpleForm = js.native
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
  def setSingleContainerFullSize(bSingleContainerFullSize: scala.Boolean): SimpleForm = js.native
  def setTitle(vTitle: java.lang.String): SimpleForm = js.native
  /**
    * Sets the aggregated <code>title</code>.
    * @since 1.16.3
    * @param vTitle The title to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(vTitle: openui5Lib.sapNs.uiNs.coreNs.Title): SimpleForm = js.native
  /**
    * Sets the aggregated <code>toolbar</code>.
    * @since 1.36.0
    * @param oToolbar The toolbar to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setToolbar(oToolbar: openui5Lib.sapNs.uiNs.coreNs.Toolbar): SimpleForm = js.native
  /**
    * Sets a new value for property <code>width</code>.Width of the form.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.28.0
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): SimpleForm = js.native
}

