package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nItem")
@js.native
class P13nItem protected () extends Item {
  /**
    * Constructor for a new P13nItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>aggregationRole</code>.Defines aggregation role
    * @since 1.34.0
    * @returns Value of property <code>aggregationRole</code>
    */
  def getAggregationRole(): String = js.native
  /**
    * Gets current value of property <code>columnKey</code>.Can be used as input for subsequent actions.
    * @since 1.26.0
    * @returns Value of property <code>columnKey</code>
    */
  def getColumnKey(): String = js.native
  /**
    * Gets current value of property <code>isDefault</code>.the column with isDefault==true will be used
    * as the selected column item on the conditionPanelDefault value is <code>false</code>.
    * @since 1.26.0
    * @returns Value of property <code>isDefault</code>
    */
  def getIsDefault(): Boolean = js.native
  /**
    * Gets current value of property <code>maxLength</code>.specifies the number of characters which can
    * be entered in the value fields of the condition panel
    * @since 1.26.0
    * @returns Value of property <code>maxLength</code>
    */
  def getMaxLength(): String = js.native
  /**
    * Gets current value of property <code>precision</code>.if type==numeric the precision will be used to
    * format the entered value (maxIntegerDigits of the used Formatter)
    * @since 1.26.0
    * @returns Value of property <code>precision</code>
    */
  def getPrecision(): String = js.native
  /**
    * Gets current value of property <code>role</code>.Defines role. The role is reflected in the manner
    * how the dimension will influence the chart layout.
    * @since 1.34.0
    * @returns Value of property <code>role</code>
    */
  def getRole(): String = js.native
  /**
    * Gets current value of property <code>scale</code>.if type==numeric the scale will be used to format
    * the entered value (maxFractionDigits of the used Formatter)
    * @since 1.26.0
    * @returns Value of property <code>scale</code>
    */
  def getScale(): String = js.native
  /**
    * Gets current value of property <code>type</code>.data type of the column (text, numeric or date is
    * supported)Default value is <code>text</code>.
    * @since 1.26.0
    * @returns Value of property <code>type</code>
    */
  def getType(): String = js.native
  /**
    * Gets current value of property <code>values</code>.the array of values for type bool. e.g. ["",
    * "Off", "On"]. The first entry can be empty (used to blank the value field). Next valuerepresent the
    * false value, last entry the true value.
    * @since 1.34.0
    * @returns Value of property <code>values</code>
    */
  def getValues(): js.Array[String] = js.native
  /**
    * Gets current value of property <code>visible</code>.Defines visibility of column
    * @since 1.26.0
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  /**
    * Gets current value of property <code>width</code>.Defines column width
    * @since 1.26.0
    * @returns Value of property <code>width</code>
    */
  def getWidth(): String = js.native
  /**
    * Sets a new value for property <code>aggregationRole</code>.Defines aggregation roleWhen called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.34.0
    * @param sAggregationRole New value for property <code>aggregationRole</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAggregationRole(sAggregationRole: String): P13nItem = js.native
  /**
    * Sets a new value for property <code>columnKey</code>.Can be used as input for subsequent
    * actions.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @since 1.26.0
    * @param sColumnKey New value for property <code>columnKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnKey(sColumnKey: String): P13nItem = js.native
  /**
    * Sets a new value for property <code>isDefault</code>.the column with isDefault==true will be used as
    * the selected column item on the conditionPanelWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.26.0
    * @param bIsDefault New value for property <code>isDefault</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIsDefault(bIsDefault: Boolean): P13nItem = js.native
  /**
    * Sets a new value for property <code>maxLength</code>.specifies the number of characters which can be
    * entered in the value fields of the condition panelWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.26.0
    * @param sMaxLength New value for property <code>maxLength</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxLength(sMaxLength: String): P13nItem = js.native
  /**
    * Sets a new value for property <code>precision</code>.if type==numeric the precision will be used to
    * format the entered value (maxIntegerDigits of the used Formatter)When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.26.0
    * @param sPrecision New value for property <code>precision</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPrecision(sPrecision: String): P13nItem = js.native
  /**
    * Sets a new value for property <code>role</code>.Defines role. The role is reflected in the manner
    * how the dimension will influence the chart layout.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param sRole New value for property <code>role</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRole(sRole: String): P13nItem = js.native
  /**
    * Sets a new value for property <code>scale</code>.if type==numeric the scale will be used to format
    * the entered value (maxFractionDigits of the used Formatter)When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.26.0
    * @param sScale New value for property <code>scale</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setScale(sScale: String): P13nItem = js.native
  /**
    * Sets a new value for property <code>type</code>.data type of the column (text, numeric or date is
    * supported)When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>text</code>.
    * @since 1.26.0
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: String): P13nItem = js.native
  /**
    * Sets a new value for property <code>values</code>.the array of values for type bool. e.g. ["",
    * "Off", "On"]. The first entry can be empty (used to blank the value field). Next valuerepresent the
    * false value, last entry the true value.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param sValues New value for property <code>values</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValues(sValues: js.Array[String]): P13nItem = js.native
  /**
    * Sets a new value for property <code>visible</code>.Defines visibility of columnWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.26.0
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): P13nItem = js.native
  /**
    * Sets a new value for property <code>width</code>.Defines column widthWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.26.0
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: String): P13nItem = js.native
}

