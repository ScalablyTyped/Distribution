package typings.openui5.sapNs.uiNs.layoutNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.form.ResponsiveGridLayout")
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

