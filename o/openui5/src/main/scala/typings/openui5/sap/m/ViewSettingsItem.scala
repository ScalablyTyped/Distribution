package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewSettingsItem extends Item {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>itemPropertyChanged</code> event of this
    * <code>sap.m.ViewSettingsItem</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ViewSettingsItem</code> itself.Let the outside world know that some of its
    * properties has changed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ViewSettingsItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachItemPropertyChanged(oData: js.Any, fnFunction: js.Any): ViewSettingsItem = js.native
  def attachItemPropertyChanged(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ViewSettingsItem = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>itemPropertyChanged</code> event of
    * this <code>sap.m.ViewSettingsItem</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachItemPropertyChanged(fnFunction: js.Any, oListener: js.Any): ViewSettingsItem = js.native
  
  /**
    * Fires event <code>itemPropertyChanged</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>changedItem</code> of type <code>sap.m.ViewSettingsItem</code>Instance of
    * the item that changed.</li><li><code>propertyKey</code> of type <code>string</code>Key of the
    * changed property.</li><li><code>propertyValue</code> of type <code>mixed</code>Value of the changed
    * property.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireItemPropertyChanged(mArguments: js.Any): ViewSettingsItem = js.native
  
  /**
    * Gets current value of property <code>selected</code>.Selected state of the item. If set to "true",
    * the item will be displayed as selected in the view settings dialog.Default value is
    * <code>false</code>.
    * @returns Value of property <code>selected</code>
    */
  def getSelected(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>selected</code>.Selected state of the item. If set to "true",
    * the item will be displayed as selected in the view settings dialog.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bSelected New value for property <code>selected</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSelected(bSelected: Boolean): ViewSettingsItem = js.native
}
