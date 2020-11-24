package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationListItem extends NotificationListBase {
  
  /**
    * Gets current value of property <code>description</code>.Determines the description of the
    * NotificationListItem.Default value is <code></code>.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): String = js.native
  
  /**
    * Gets current value of property <code>hideShowMoreButton</code>.Determines it the "Show More" button
    * should be hidden.Default value is <code>false</code>.
    * @returns Value of property <code>hideShowMoreButton</code>
    */
  def getHideShowMoreButton(): Boolean = js.native
  
  /**
    * Gets current value of property <code>truncate</code>.Determines if the text in the title and the
    * description of the notification are truncated to the first two lines.Default value is
    * <code>true</code>.
    * @returns Value of property <code>truncate</code>
    */
  def getTruncate(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>description</code>.Determines the description of the
    * NotificationListItem.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code></code>.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: String): NotificationListItem = js.native
  
  /**
    * Sets a new value for property <code>hideShowMoreButton</code>.Determines it the "Show More" button
    * should be hidden.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @param bHideShowMoreButton New value for property <code>hideShowMoreButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHideShowMoreButton(bHideShowMoreButton: Boolean): NotificationListItem = js.native
  
  /**
    * Sets a new value for property <code>truncate</code>.Determines if the text in the title and the
    * description of the notification are truncated to the first two lines.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bTruncate New value for property <code>truncate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTruncate(bTruncate: Boolean): NotificationListItem = js.native
}
