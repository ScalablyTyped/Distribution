package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait P13nGroupItem
  extends StObject
     with Item {
  
  /**
    * Gets current value of property <code>columnKey</code>.key of the column
    * @since 1.28.0
    * @returns Value of property <code>columnKey</code>
    */
  def getColumnKey(): String = js.native
  
  /**
    * Gets current value of property <code>operation</code>.sap.m.P13nConditionOperation
    * @since 1.28.0
    * @returns Value of property <code>operation</code>
    */
  def getOperation(): String = js.native
  
  /**
    * Gets current value of property <code>showIfGrouped</code>.make the grouped column as normalcolumn
    * visibleDefault value is <code>false</code>.
    * @since 1.28.0
    * @returns Value of property <code>showIfGrouped</code>
    */
  def getShowIfGrouped(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>columnKey</code>.key of the columnWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.28.0
    * @param sColumnKey New value for property <code>columnKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnKey(sColumnKey: String): P13nGroupItem = js.native
  
  /**
    * Sets a new value for property <code>operation</code>.sap.m.P13nConditionOperationWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.28.0
    * @param sOperation New value for property <code>operation</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOperation(sOperation: String): P13nGroupItem = js.native
  
  /**
    * Sets a new value for property <code>showIfGrouped</code>.make the grouped column as normalcolumn
    * visibleWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @since 1.28.0
    * @param bShowIfGrouped New value for property <code>showIfGrouped</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowIfGrouped(bShowIfGrouped: Boolean): P13nGroupItem = js.native
}
