package typings.openui5.sap.m

import typings.openui5.sap.ui.core.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupHeaderListItem extends ListItemBase {
  
  /**
    * Gets current value of property <code>count</code>.Defines the count of items in the group, but it
    * could also be an amount which represents the sum of all amounts in the group.<b>Note:</b> Will not
    * be displayed if not set.
    * @returns Value of property <code>count</code>
    */
  def getCount(): String = js.native
  
  /**
    * Gets current value of property <code>title</code>.Defines the title of the group header.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Gets current value of property <code>titleTextDirection</code>.Defines the title text directionality
    * with enumerated options. By default, the control inherits text direction from the DOM.Default value
    * is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>titleTextDirection</code>
    */
  def getTitleTextDirection(): TextDirection = js.native
  
  /**
    * Gets current value of property <code>upperCase</code>.Allows to uppercase the group title.Default
    * value is <code>false</code>.
    * @since 1.13.2
    * @returns Value of property <code>upperCase</code>
    */
  def getUpperCase(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>count</code>.Defines the count of items in the group, but it
    * could also be an amount which represents the sum of all amounts in the group.<b>Note:</b> Will not
    * be displayed if not set.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sCount New value for property <code>count</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCount(sCount: String): GroupHeaderListItem = js.native
  
  /**
    * Sets a new value for property <code>title</code>.Defines the title of the group header.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): GroupHeaderListItem = js.native
  
  /**
    * Sets a new value for property <code>titleTextDirection</code>.Defines the title text directionality
    * with enumerated options. By default, the control inherits text direction from the DOM.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sTitleTextDirection New value for property <code>titleTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleTextDirection(sTitleTextDirection: TextDirection): GroupHeaderListItem = js.native
  
  /**
    * Sets a new value for property <code>upperCase</code>.Allows to uppercase the group title.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>false</code>.
    * @since 1.13.2
    * @param bUpperCase New value for property <code>upperCase</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUpperCase(bUpperCase: Boolean): GroupHeaderListItem = js.native
}
