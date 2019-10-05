package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.ListItem")
@js.native
class ListItem protected () extends Item {
  /**
    * Constructor for a new ListItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
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

