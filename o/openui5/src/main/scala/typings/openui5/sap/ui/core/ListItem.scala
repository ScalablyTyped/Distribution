package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem extends Item {
  
  /**
    * Gets current value of property <code>additionalText</code>.Some additional text of type string,
    * optionally to be displayed along with this item.
    * @returns Value of property <code>additionalText</code>
    */
  def getAdditionalText(): String = js.native
  
  /**
    * Gets current value of property <code>icon</code>.The icon belonging to this list item instance.This
    * can be an URI to an image or an icon font URI.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): String = js.native
  
  /**
    * Sets a new value for property <code>additionalText</code>.Some additional text of type string,
    * optionally to be displayed along with this item.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sAdditionalText New value for property <code>additionalText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAdditionalText(sAdditionalText: String): ListItem = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.The icon belonging to this list item instance.This
    * can be an URI to an image or an icon font URI.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: String): ListItem = js.native
}
