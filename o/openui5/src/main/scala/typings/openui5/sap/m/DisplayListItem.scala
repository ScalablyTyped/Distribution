package typings.openui5.sap.m

import typings.openui5.sap.ui.core.TextDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayListItem extends ListItemBase {
  
  /**
    * Gets current value of property <code>label</code>.Defines the label of the list item.
    * @returns Value of property <code>label</code>
    */
  def getLabel(): String = js.native
  
  /**
    * Gets current value of property <code>value</code>.Defines the value of the list item.
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  
  /**
    * Gets current value of property <code>valueTextDirection</code>.Defines the <code>value</code> text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>valueTextDirection</code>
    */
  def getValueTextDirection(): TextDirection = js.native
  
  /**
    * Sets a new value for property <code>label</code>.Defines the label of the list item.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sLabel New value for property <code>label</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLabel(sLabel: String): DisplayListItem = js.native
  
  /**
    * Sets a new value for property <code>value</code>.Defines the value of the list item.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): DisplayListItem = js.native
  
  /**
    * Sets a new value for property <code>valueTextDirection</code>.Defines the <code>value</code> text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sValueTextDirection New value for property <code>valueTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueTextDirection(sValueTextDirection: TextDirection): DisplayListItem = js.native
}
