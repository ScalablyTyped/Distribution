package typings
package openui5Lib.sapNs.uiNs.unifiedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.MenuItem")
@js.native
class MenuItem protected () extends MenuItemBase {
  /**
    * Constructor for a new MenuItem element.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>icon</code>.Defines the icon of the {@link sap.ui.core.IconPool
    * sap.ui.core.IconPool} or an image which should be displayed on the item.Default value is
    * <code></code>.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>text</code>.Defines the text which should be displayed on the
    * item.Default value is <code></code>.
    * @returns Value of property <code>text</code>
    */
  def getText(): java.lang.String = js.native
  /**
    * Sets a new value for property <code>icon</code>.Defines the icon of the {@link sap.ui.core.IconPool
    * sap.ui.core.IconPool} or an image which should be displayed on the item.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): MenuItem = js.native
  /**
    * Sets a new value for property <code>text</code>.Defines the text which should be displayed on the
    * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code></code>.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: java.lang.String): MenuItem = js.native
}

