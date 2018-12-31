package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nFilterItem")
@js.native
class P13nFilterItem protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Item {
  /**
    * Constructor for a new P13nFilterItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>columnKey</code>.key of the column
    * @since 1.26.0
    * @returns Value of property <code>columnKey</code>
    */
  def getColumnKey(): java.lang.String = js.native
  /**
    * Gets current value of property <code>exclude</code>.defines if the filter is an include or exclude
    * filter itemDefault value is <code>false</code>.
    * @since 1.26.0
    * @returns Value of property <code>exclude</code>
    */
  def getExclude(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>operation</code>.sap.m.P13nConditionOperation
    * @since 1.26.0
    * @returns Value of property <code>operation</code>
    */
  def getOperation(): java.lang.String = js.native
  /**
    * Gets current value of property <code>value1</code>.value of the filter
    * @since 1.26.0
    * @returns Value of property <code>value1</code>
    */
  def getValue1(): java.lang.String = js.native
  /**
    * Gets current value of property <code>value2</code>.to value of the between filter
    * @since 1.26.0
    * @returns Value of property <code>value2</code>
    */
  def getValue2(): java.lang.String = js.native
  /**
    * Sets a new value for property <code>columnKey</code>.key of the columnWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.26.0
    * @param sColumnKey New value for property <code>columnKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnKey(sColumnKey: java.lang.String): P13nFilterItem = js.native
  /**
    * Sets a new value for property <code>exclude</code>.defines if the filter is an include or exclude
    * filter itemWhen called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>false</code>.
    * @since 1.26.0
    * @param bExclude New value for property <code>exclude</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setExclude(bExclude: scala.Boolean): P13nFilterItem = js.native
  /**
    * Sets a new value for property <code>operation</code>.sap.m.P13nConditionOperationWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.26.0
    * @param sOperation New value for property <code>operation</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOperation(sOperation: java.lang.String): P13nFilterItem = js.native
  /**
    * Sets a new value for property <code>value1</code>.value of the filterWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.26.0
    * @param sValue1 New value for property <code>value1</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue1(sValue1: java.lang.String): P13nFilterItem = js.native
  /**
    * Sets a new value for property <code>value2</code>.to value of the between filterWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.26.0
    * @param sValue2 New value for property <code>value2</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue2(sValue2: java.lang.String): P13nFilterItem = js.native
}

