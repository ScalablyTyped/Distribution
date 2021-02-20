package typings.openui5.sap.ui.unified

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellHeadItem extends Element {
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): ShellHeadItem = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): ShellHeadItem = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.ui.unified.ShellHeadItem</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.ShellHeadItem</code> itself.Event is fired when the user presses the
    * item.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.ShellHeadItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): ShellHeadItem = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ShellHeadItem = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.ui.unified.ShellHeadItem</code>.The passed function and listener object must match the
    * ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): ShellHeadItem = js.native
  
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): ShellHeadItem = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Gets current value of property <code>icon</code>.The icon of the item, either defined in the
    * sap.ui.core.IconPool or an URI to a custom image. An icon must be set.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  
  /**
    * Gets current value of property <code>selected</code>.Defines the toggle state in case the item
    * represents a toggle button (see also property <code>toggleEnabled</code>).Default value is
    * <code>false</code>.
    * @returns Value of property <code>selected</code>
    */
  def getSelected(): Boolean = js.native
  
  /**
    * Gets current value of property <code>showMarker</code>.If set to true, a theme dependent marker is
    * shown on the item.Default value is <code>false</code>.
    * @returns Value of property <code>showMarker</code>
    */
  def getShowMarker(): Boolean = js.native
  
  /**
    * Gets current value of property <code>showSeparator</code>.If set to true, a separator is displayed
    * after the item.Default value is <code>true</code>.
    * @since 1.22.5
    * @returns Value of property <code>showSeparator</code>
    */
  def getShowSeparator(): Boolean = js.native
  
  /**
    * Gets current value of property <code>startsSection</code>.If set to true, a divider is displayed
    * before the item.Default value is <code>false</code>.
    * @returns Value of property <code>startsSection</code>
    */
  def getStartsSection(): Boolean = js.native
  
  /**
    * Gets current value of property <code>toggleEnabled</code>.If set to true, the item represents a
    * toggle button. The <code>selected</code> property can the be used todefine the toggle state.
    * Otherwise the item is displayed as action button. In this case the <code>selected</code> propertyis
    * ignored.Default value is <code>true</code>.
    * @since 1.34.3
    * @returns Value of property <code>toggleEnabled</code>
    */
  def getToggleEnabled(): Boolean = js.native
  
  /**
    * Gets current value of property <code>visible</code>.Invisible items are not shown on the UI.Default
    * value is <code>true</code>.
    * @since 1.18
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.The icon of the item, either defined in the
    * sap.ui.core.IconPool or an URI to a custom image. An icon must be set.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): ShellHeadItem = js.native
  
  /**
    * Sets a new value for property <code>selected</code>.Defines the toggle state in case the item
    * represents a toggle button (see also property <code>toggleEnabled</code>).When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bSelected New value for property <code>selected</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSelected(bSelected: Boolean): ShellHeadItem = js.native
  
  /**
    * Sets a new value for property <code>showMarker</code>.If set to true, a theme dependent marker is
    * shown on the item.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @param bShowMarker New value for property <code>showMarker</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowMarker(bShowMarker: Boolean): ShellHeadItem = js.native
  
  /**
    * Sets a new value for property <code>showSeparator</code>.If set to true, a separator is displayed
    * after the item.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @since 1.22.5
    * @param bShowSeparator New value for property <code>showSeparator</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSeparator(bShowSeparator: Boolean): ShellHeadItem = js.native
  
  /**
    * Sets a new value for property <code>startsSection</code>.If set to true, a divider is displayed
    * before the item.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>false</code>.
    * @param bStartsSection New value for property <code>startsSection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStartsSection(bStartsSection: Boolean): ShellHeadItem = js.native
  
  /**
    * Sets a new value for property <code>toggleEnabled</code>.If set to true, the item represents a
    * toggle button. The <code>selected</code> property can the be used todefine the toggle state.
    * Otherwise the item is displayed as action button. In this case the <code>selected</code> propertyis
    * ignored.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @since 1.34.3
    * @param bToggleEnabled New value for property <code>toggleEnabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setToggleEnabled(bToggleEnabled: Boolean): ShellHeadItem = js.native
  
  /**
    * Sets a new value for property <code>visible</code>.Invisible items are not shown on the UI.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @since 1.18
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): ShellHeadItem = js.native
}
