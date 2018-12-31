package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nDimMeasureItem")
@js.native
class P13nDimMeasureItem protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Item {
  /**
    * Constructor for a new P13nDimMeasureItem.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>columnKey</code>.Specifies the unique chart column key. In this
    * context a column refers to dimensions or measures of a chart.
    * @since 1.34.0
    * @returns Value of property <code>columnKey</code>
    */
  def getColumnKey(): java.lang.String = js.native
  /**
    * Gets current value of property <code>index</code>.Specifies the order of visible dimensions or
    * measures of a chart.Default value is <code>-1</code>.
    * @since 1.34.0
    * @returns Value of property <code>index</code>
    */
  def getIndex(): scala.Double = js.native
  /**
    * Gets current value of property <code>role</code>.Specifies the role of dimensions or measures. The
    * role determines how dimensions and measures influence the chart.
    * @since 1.34.0
    * @returns Value of property <code>role</code>
    */
  def getRole(): java.lang.String = js.native
  /**
    * Gets current value of property <code>visible</code>.Specifies the visibility of dimensions or
    * measures.
    * @since 1.34.0
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): scala.Boolean = js.native
  /**
    * Sets a new value for property <code>columnKey</code>.Specifies the unique chart column key. In this
    * context a column refers to dimensions or measures of a chart.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param sColumnKey New value for property <code>columnKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnKey(sColumnKey: java.lang.String): P13nDimMeasureItem = js.native
  /**
    * Sets a new value for property <code>index</code>.Specifies the order of visible dimensions or
    * measures of a chart.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>-1</code>.
    * @since 1.34.0
    * @param iIndex New value for property <code>index</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndex(iIndex: scala.Double): P13nDimMeasureItem = js.native
  /**
    * Sets a new value for property <code>role</code>.Specifies the role of dimensions or measures. The
    * role determines how dimensions and measures influence the chart.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param sRole New value for property <code>role</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRole(sRole: java.lang.String): P13nDimMeasureItem = js.native
  /**
    * Sets a new value for property <code>visible</code>.Specifies the visibility of dimensions or
    * measures.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @since 1.34.0
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: scala.Boolean): P13nDimMeasureItem = js.native
}

