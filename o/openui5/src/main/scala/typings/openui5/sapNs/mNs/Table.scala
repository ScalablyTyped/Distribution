package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Table")
@js.native
/**
  * Constructor for a new Table.Accepts an object literal <code>mSettings</code> that defines
  * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
  * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
  * object.
  * @param sId Id for the new control, generated automatically if no id is given
  * @param mSettings Initial settings for the new control
  */
class Table () extends ListBase {
  def this(mSettings: js.Any) = this()
  /**
    * Constructor for a new Table.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some column to the aggregation <code>columns</code>.
    * @param oColumn the column to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addColumn(oColumn: Column): Table = js.native
  /**
    * Destroys all the columns in the aggregation <code>columns</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyColumns(): Table = js.native
  /**
    * Gets current value of property <code>backgroundDesign</code>.Sets the background style of the table.
    * Depending on the theme, you can change the state of the background from <code>Solid</code> to
    * <code>Translucent</code> or to <code>Transparent</code>.Default value is <code>Translucent</code>.
    * @returns Value of property <code>backgroundDesign</code>
    */
  def getBackgroundDesign(): BackgroundDesign = js.native
  /**
    * Getter for aggregation columns.
    * @param bSort set true to get the columns in an order that respects personalization settings
    * @returns columns of the Table
    */
  def getColumns(bSort: Boolean): js.Array[Column] = js.native
  /**
    * Gets current value of property <code>fixedLayout</code>.Defines the algorithm to be used to layout
    * the table cells, rows, and columns.By default, a table is rendered with fixed layout algorithm. This
    * means the horizontal layout only depends on the table's width and the width of the columns, not the
    * contents of the cells. Cells in subsequent rows do not affect column widths. This allows a browser
    * to layout the table faster than the auto table layout since the browser can begin to display the
    * table once the first row has been analyzed.When this property is set to <code>false</code>,
    * <code>sap.m.Table</code> is rendered with auto layout algorithm. This means, the width of the table
    * and its cells depends on the contents of the cells. The column width is set by the widest
    * unbreakable content inside the cells. This can make the rendering slow, since the browser needs to
    * read through all the content in the table before determining the final layout.<b>Note:</b> Since
    * <code>sap.m.Table</code> does not have its own scrollbars, setting <code>fixedLayout</code> to false
    * can force the table to overflow, which may cause visual problems. It is suggested to use this
    * property when a table has a few columns in wide screens or within the horizontal scroll container
    * (e.g <code>sap.m.Dialog</code>) to handle overflow.In auto layout mode the <code>width</code>
    * property of <code>sap.m.Column</code> is taken into account as a minimum width.Default value is
    * <code>true</code>.
    * @since 1.22
    * @returns Value of property <code>fixedLayout</code>
    */
  def getFixedLayout(): Boolean = js.native
  /**
    * Gets current value of property <code>showOverlay</code>.Setting this property to <code>true</code>
    * will show an overlay on top of the table content and prevents the user interaction with it.Default
    * value is <code>false</code>.
    * @since 1.22.1
    * @returns Value of property <code>showOverlay</code>
    */
  def getShowOverlay(): Boolean = js.native
  /**
    * Checks for the provided <code>sap.m.Column</code> in the aggregation <code>columns</code>.and
    * returns its index if found or -1 otherwise.
    * @param oColumn The column whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfColumn(oColumn: Column): Double = js.native
  /**
    * Inserts a column into the aggregation <code>columns</code>.
    * @param oColumn the column to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the column should be inserted at; for             a
    * negative value of <code>iIndex</code>, the column is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the column is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertColumn(oColumn: Column, iIndex: Double): Table = js.native
  /**
    * Removes all the controls from the aggregation <code>columns</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllColumns(): js.Array[Column] = js.native
  def removeColumn(vColumn: String): Column = js.native
  /**
    * Removes a column from the aggregation <code>columns</code>.
    * @param vColumn The column to remove or its index or id
    * @returns The removed column or <code>null</code>
    */
  def removeColumn(vColumn: Double): Column = js.native
  def removeColumn(vColumn: Column): Column = js.native
  /**
    * Sets a new value for property <code>backgroundDesign</code>.Sets the background style of the table.
    * Depending on the theme, you can change the state of the background from <code>Solid</code> to
    * <code>Translucent</code> or to <code>Transparent</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Translucent</code>.
    * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): Table = js.native
  /**
    * Sets a new value for property <code>fixedLayout</code>.Defines the algorithm to be used to layout
    * the table cells, rows, and columns.By default, a table is rendered with fixed layout algorithm. This
    * means the horizontal layout only depends on the table's width and the width of the columns, not the
    * contents of the cells. Cells in subsequent rows do not affect column widths. This allows a browser
    * to layout the table faster than the auto table layout since the browser can begin to display the
    * table once the first row has been analyzed.When this property is set to <code>false</code>,
    * <code>sap.m.Table</code> is rendered with auto layout algorithm. This means, the width of the table
    * and its cells depends on the contents of the cells. The column width is set by the widest
    * unbreakable content inside the cells. This can make the rendering slow, since the browser needs to
    * read through all the content in the table before determining the final layout.<b>Note:</b> Since
    * <code>sap.m.Table</code> does not have its own scrollbars, setting <code>fixedLayout</code> to false
    * can force the table to overflow, which may cause visual problems. It is suggested to use this
    * property when a table has a few columns in wide screens or within the horizontal scroll container
    * (e.g <code>sap.m.Dialog</code>) to handle overflow.In auto layout mode the <code>width</code>
    * property of <code>sap.m.Column</code> is taken into account as a minimum width.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.22
    * @param bFixedLayout New value for property <code>fixedLayout</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFixedLayout(bFixedLayout: Boolean): Table = js.native
  /**
    * Sets a new value for property <code>showOverlay</code>.Setting this property to <code>true</code>
    * will show an overlay on top of the table content and prevents the user interaction with it.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @since 1.22.1
    * @param bShowOverlay New value for property <code>showOverlay</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowOverlay(bShowOverlay: Boolean): Table = js.native
}

