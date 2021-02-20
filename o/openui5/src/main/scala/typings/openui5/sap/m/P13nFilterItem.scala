package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait P13nFilterItem extends Item {
  
  /**
    * Gets current value of property <code>columnKey</code>.key of the column
    * @since 1.26.0
    * @returns Value of property <code>columnKey</code>
    */
  def getColumnKey(): String = js.native
  
  /**
    * Gets current value of property <code>exclude</code>.defines if the filter is an include or exclude
    * filter itemDefault value is <code>false</code>.
    * @since 1.26.0
    * @returns Value of property <code>exclude</code>
    */
  def getExclude(): Boolean = js.native
  
  /**
    * Gets current value of property <code>operation</code>.sap.m.P13nConditionOperation
    * @since 1.26.0
    * @returns Value of property <code>operation</code>
    */
  def getOperation(): String = js.native
  
  /**
    * Gets current value of property <code>value1</code>.value of the filter
    * @since 1.26.0
    * @returns Value of property <code>value1</code>
    */
  def getValue1(): String = js.native
  
  /**
    * Gets current value of property <code>value2</code>.to value of the between filter
    * @since 1.26.0
    * @returns Value of property <code>value2</code>
    */
  def getValue2(): String = js.native
  
  /**
    * Sets a new value for property <code>columnKey</code>.key of the columnWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.26.0
    * @param sColumnKey New value for property <code>columnKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnKey(sColumnKey: String): P13nFilterItem = js.native
  
  /**
    * Sets a new value for property <code>exclude</code>.defines if the filter is an include or exclude
    * filter itemWhen called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>false</code>.
    * @since 1.26.0
    * @param bExclude New value for property <code>exclude</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setExclude(bExclude: Boolean): P13nFilterItem = js.native
  
  /**
    * Sets a new value for property <code>operation</code>.sap.m.P13nConditionOperationWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.26.0
    * @param sOperation New value for property <code>operation</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOperation(sOperation: String): P13nFilterItem = js.native
  
  /**
    * Sets a new value for property <code>value1</code>.value of the filterWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.26.0
    * @param sValue1 New value for property <code>value1</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue1(sValue1: String): P13nFilterItem = js.native
  
  /**
    * Sets a new value for property <code>value2</code>.to value of the between filterWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.26.0
    * @param sValue2 New value for property <code>value2</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue2(sValue2: String): P13nFilterItem = js.native
}
