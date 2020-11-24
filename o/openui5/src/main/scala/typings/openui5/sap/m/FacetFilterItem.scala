package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetFilterItem extends ListItemBase {
  
  /**
    * Gets current value of property <code>count</code>.Defines the number of objects that match this item
    * in the target data set.
    * @returns Value of property <code>count</code>
    */
  def getCount(): Double = js.native
  
  /**
    * Gets current value of property <code>key</code>.Can be used as input for subsequent actions.
    * @returns Value of property <code>key</code>
    */
  def getKey(): String = js.native
  
  /**
    * Gets current value of property <code>text</code>.Determines the text to be displayed for the item.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Sets a new value for property <code>key</code>.Can be used as input for subsequent actions.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sKey New value for property <code>key</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKey(sKey: String): FacetFilterItem = js.native
  
  /**
    * Sets a new value for property <code>text</code>.Determines the text to be displayed for the
    * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): FacetFilterItem = js.native
}
