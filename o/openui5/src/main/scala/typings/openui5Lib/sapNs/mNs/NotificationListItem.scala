package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.NotificationListItem")
@js.native
class NotificationListItem protected () extends NotificationListBase {
  /**
    * Constructor for a new NotificationListItem.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>description</code>.Determines the description of the
    * NotificationListItem.Default value is <code></code>.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): java.lang.String = js.native
  /**
    * Gets current value of property <code>hideShowMoreButton</code>.Determines it the "Show More" button
    * should be hidden.Default value is <code>false</code>.
    * @returns Value of property <code>hideShowMoreButton</code>
    */
  def getHideShowMoreButton(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>truncate</code>.Determines if the text in the title and the
    * description of the notification are truncated to the first two lines.Default value is
    * <code>true</code>.
    * @returns Value of property <code>truncate</code>
    */
  def getTruncate(): scala.Boolean = js.native
  /**
    * Sets a new value for property <code>description</code>.Determines the description of the
    * NotificationListItem.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code></code>.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: java.lang.String): NotificationListItem = js.native
  /**
    * Sets a new value for property <code>hideShowMoreButton</code>.Determines it the "Show More" button
    * should be hidden.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @param bHideShowMoreButton New value for property <code>hideShowMoreButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHideShowMoreButton(bHideShowMoreButton: scala.Boolean): NotificationListItem = js.native
  /**
    * Sets a new value for property <code>truncate</code>.Determines if the text in the title and the
    * description of the notification are truncated to the first two lines.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bTruncate New value for property <code>truncate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTruncate(bTruncate: scala.Boolean): NotificationListItem = js.native
}

