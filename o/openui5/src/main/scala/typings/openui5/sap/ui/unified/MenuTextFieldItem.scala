package typings.openui5.sap.ui.unified

import typings.openui5.sap.ui.core.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuTextFieldItem
  extends StObject
     with MenuItemBase {
  
  /**
    * Gets current value of property <code>icon</code>.Defines the icon of the {@link sap.ui.core.IconPool
    * sap.ui.core.IconPool} or an image which should be displayed on the item.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  
  /**
    * Gets current value of property <code>label</code>.Defines the label of the text field of the item.
    * @returns Value of property <code>label</code>
    */
  def getLabel(): String = js.native
  
  /**
    * Gets current value of property <code>value</code>.Defines the value of the text field of the item.
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  
  /**
    * Gets current value of property <code>valueState</code>.Defines the value state of the text field of
    * the item. This allows you to visualize e.g. warnings or errors.Default value is <code>None</code>.
    * @returns Value of property <code>valueState</code>
    */
  def getValueState(): ValueState = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.Defines the icon of the {@link sap.ui.core.IconPool
    * sap.ui.core.IconPool} or an image which should be displayed on the item.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): MenuTextFieldItem = js.native
  
  /**
    * Sets a new value for property <code>label</code>.Defines the label of the text field of the
    * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sLabel New value for property <code>label</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLabel(sLabel: String): MenuTextFieldItem = js.native
  
  /**
    * Sets a new value for property <code>value</code>.Defines the value of the text field of the
    * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): MenuTextFieldItem = js.native
  
  /**
    * Sets a new value for property <code>valueState</code>.Defines the value state of the text field of
    * the item. This allows you to visualize e.g. warnings or errors.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @param sValueState New value for property <code>valueState</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueState(sValueState: ValueState): MenuTextFieldItem = js.native
}
