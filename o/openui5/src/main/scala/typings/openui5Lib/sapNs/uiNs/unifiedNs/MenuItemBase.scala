package typings
package openui5Lib.sapNs.uiNs.unifiedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.MenuItemBase")
@js.native
abstract class MenuItemBase protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
           * Abstract base class <code>MenuItemBase</code> for menu item elements. Please use concrete
           * subclasses.Accepts an object literal <code>mSettings</code> that defines initialproperty values,
           * aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId Id for the new control, generated automatically if no id is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Abstract base class <code>MenuItemBase</code> for menu item elements. Please use concrete
           * subclasses.Accepts an object literal <code>mSettings</code> that defines initialproperty values,
           * aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId Id for the new control, generated automatically if no id is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
           * <code>sap.ui.unified.MenuItemBase</code>.When called, the context of the event handler (its
           * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
           * to this <code>sap.ui.unified.MenuItemBase</code> itself.Fired when the item is selected by the
           * user.<b>Note:</b> The event is also available for items which have a submenu.In general,
           * applications must not handle event in this case because the user selection opens the sub menu.
           * @param oData An application-specific payload object that will be passed to the event handler along
           * with the event object when firing the event
           * @param fnFunction The function to be called when the event occurs
           * @param oListener Context object to call the event handler with. Defaults to this
           * <code>sap.ui.unified.MenuItemBase</code> itself
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def attachSelect(oData: js.Any, fnFunction: js.Any): MenuItemBase = js.native
  /**
           * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
           * <code>sap.ui.unified.MenuItemBase</code>.When called, the context of the event handler (its
           * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
           * to this <code>sap.ui.unified.MenuItemBase</code> itself.Fired when the item is selected by the
           * user.<b>Note:</b> The event is also available for items which have a submenu.In general,
           * applications must not handle event in this case because the user selection opens the sub menu.
           * @param oData An application-specific payload object that will be passed to the event handler along
           * with the event object when firing the event
           * @param fnFunction The function to be called when the event occurs
           * @param oListener Context object to call the event handler with. Defaults to this
           * <code>sap.ui.unified.MenuItemBase</code> itself
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MenuItemBase = js.native
  /**
           * Destroys the submenu in the aggregation <code>submenu</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroySubmenu(): MenuItemBase = js.native
  /**
           * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
           * <code>sap.ui.unified.MenuItemBase</code>.The passed function and listener object must match the ones
           * used for event registration.
           * @param fnFunction The function to be called, when the event occurs
           * @param oListener Context object on which the given function had to be called
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): MenuItemBase = js.native
  /**
           * Fires event <code>select</code> to attached listeners.Expects the following event
           * parameters:<ul><li><code>item</code> of type <code>sap.ui.unified.MenuItemBase</code>The current
           * item</li></ul>
           * @param mArguments The arguments to pass along with the event
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def fireSelect(mArguments: js.Any): MenuItemBase = js.native
  /**
           * Gets current value of property <code>enabled</code>.When an item is disabled the item can not be
           * selected by the user.The enabled property of the item has no effect when the menu of the item is
           * disabled ({@link sap.ui.unified.Menu#getEnabled Menu#getEnabled}).Default value is
           * <code>true</code>.
           * @returns Value of property <code>enabled</code>
          */
  def getEnabled(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>startsSection</code>.Defines whether a visual separator should
           * be rendered before the item.<b>Note:</b> If an item is invisible also the separator of this item is
           * not shown.Default value is <code>false</code>.
           * @returns Value of property <code>startsSection</code>
          */
  def getStartsSection(): scala.Boolean = js.native
  /**
           * Gets content of aggregation <code>submenu</code>.An optional submenu of the item which is opened
           * when the item is selected by the user.
          */
  def getSubmenu(): Menu = js.native
  /**
           * Gets current value of property <code>visible</code>.Invisible items do not appear in the
           * menu.Default value is <code>true</code>.
           * @returns Value of property <code>visible</code>
          */
  def getVisible(): scala.Boolean = js.native
  /**
           * Changes the visual hover state of the menu item.Subclasses may override this function.
           * @param bHovered Specifies whether the item is currently hovered or not.
           * @param oMenu The menu to which this item belongs
          */
  def hover(bHovered: scala.Boolean, oMenu: Menu): scala.Unit = js.native
  /**
           * Informs the item that the item HTML is now applied to the DOM.Subclasses may override this function.
          */
  def onAfterRendering(): scala.Unit = js.native
  /**
           * Event handler which is called whenever the submenu of the item is opened or closed.Subclasses may
           * override this function.
           * @param bOpened Specifies whether the submenu of the item is opened or closed
          */
  def onSubmenuToggle(bOpened: scala.Boolean): scala.Unit = js.native
  /**
           * Produces the HTML of an item and writes it to render-output-buffer during the rendering of the
           * corresponding menu.Subclasses may override this function.
           * @param oRenderManager The <code>RenderManager</code> that can be used for writing to the
           * render-output-buffer
           * @param oItem The item which should be rendered
           * @param oMenu The menu to which this item belongs
          */
  def render(oRenderManager: openui5Lib.sapNs.uiNs.coreNs.RenderManager, oItem: MenuItemBase, oMenu: Menu): scala.Unit = js.native
  /**
           * Sets a new value for property <code>enabled</code>.When an item is disabled the item can not be
           * selected by the user.The enabled property of the item has no effect when the menu of the item is
           * disabled ({@link sap.ui.unified.Menu#getEnabled Menu#getEnabled}).When called with a value of
           * <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.Default value is <code>true</code>.
           * @param bEnabled New value for property <code>enabled</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setEnabled(bEnabled: scala.Boolean): MenuItemBase = js.native
  /**
           * Sets a new value for property <code>startsSection</code>.Defines whether a visual separator should
           * be rendered before the item.<b>Note:</b> If an item is invisible also the separator of this item is
           * not shown.When called with a value of <code>null</code> or <code>undefined</code>, the default value
           * of the property will be restored.Default value is <code>false</code>.
           * @param bStartsSection New value for property <code>startsSection</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setStartsSection(bStartsSection: scala.Boolean): MenuItemBase = js.native
  /**
           * Sets the aggregated <code>submenu</code>.
           * @param oSubmenu The submenu to set
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setSubmenu(oSubmenu: Menu): MenuItemBase = js.native
  /**
           * Sets a new value for property <code>visible</code>.Invisible items do not appear in the menu.When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.Default value is <code>true</code>.
           * @param bVisible New value for property <code>visible</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setVisible(bVisible: scala.Boolean): MenuItemBase = js.native
}

