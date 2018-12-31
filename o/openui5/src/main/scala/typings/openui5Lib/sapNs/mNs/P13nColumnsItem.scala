package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nColumnsItem")
@js.native
class P13nColumnsItem protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Item {
  /**
    * Constructor for a new P13nColumnsItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>columnKey</code>.This property contains the unique table column
    * key
    * @since 1.26.0
    * @returns Value of property <code>columnKey</code>
    */
  def getColumnKey(): java.lang.String = js.native
  /**
    * Gets current value of property <code>index</code>.This property contains the index of a table column
    * @since 1.26.0
    * @returns Value of property <code>index</code>
    */
  def getIndex(): scala.Double = js.native
  /**
    * Gets current value of property <code>total</code>.This property contains the total flag of a table
    * column.
    * @since 1.26.0
    * @returns Value of property <code>total</code>
    */
  def getTotal(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>visible</code>.This property decides whether a P13nColumnsItem
    * is visible
    * @since 1.26.0
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>width</code>.This property contains the with of a table column.
    * @since 1.26.0
    * @returns Value of property <code>width</code>
    */
  def getWidth(): java.lang.String = js.native
  /**
    * Sets a new value for property <code>columnKey</code>.This property contains the unique table column
    * keyWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @since 1.26.0
    * @param sColumnKey New value for property <code>columnKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnKey(sColumnKey: java.lang.String): P13nColumnsItem = js.native
  /**
    * Sets a new value for property <code>index</code>.This property contains the index of a table
    * columnWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @since 1.26.0
    * @param iIndex New value for property <code>index</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndex(iIndex: scala.Double): P13nColumnsItem = js.native
  /**
    * Sets a new value for property <code>total</code>.This property contains the total flag of a table
    * column.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @since 1.26.0
    * @param bTotal New value for property <code>total</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTotal(bTotal: scala.Boolean): P13nColumnsItem = js.native
  /**
    * Sets a new value for property <code>visible</code>.This property decides whether a P13nColumnsItem
    * is visibleWhen called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @since 1.26.0
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: scala.Boolean): P13nColumnsItem = js.native
  /**
    * Sets a new value for property <code>width</code>.This property contains the with of a table
    * column.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @since 1.26.0
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: java.lang.String): P13nColumnsItem = js.native
}

