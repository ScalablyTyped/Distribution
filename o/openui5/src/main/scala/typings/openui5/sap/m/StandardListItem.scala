package typings.openui5.sap.m

import typings.openui5.sap.ui.core.TextDirection
import typings.openui5.sap.ui.core.ValueState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.StandardListItem")
@js.native
class StandardListItem protected () extends ListItemBase {
  /**
    * Constructor for a new StandardListItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>activeIcon</code>.Defines the icon that is shown while the list
    * item is pressed.
    * @returns Value of property <code>activeIcon</code>
    */
  def getActiveIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>adaptTitleSize</code>.By default, the title size adapts to the
    * available space and gets bigger if the description is empty. If you have list items with and without
    * descriptions, this results in titles with different sizes. In this case, it can be better to switch
    * the size adaption off by setting this property to <code>false</code>.Default value is
    * <code>true</code>.
    * @since 1.16.3
    * @returns Value of property <code>adaptTitleSize</code>
    */
  def getAdaptTitleSize(): Boolean = js.native
  /**
    * Gets current value of property <code>description</code>.Defines the additional information for the
    * title.<b>Note:</b> This is only visible when the <code>title</code> property is not empty.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): String = js.native
  /**
    * Gets current value of property <code>icon</code>.Defines the list item icon.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>iconDensityAware</code>.By default, one or more requests are
    * sent to get the density perfect version of the icon if the given version of the icon doesn't exist
    * on the server.<b>Note:<b> If bandwidth is a key factor for the application, set this value to
    * <code>false</code>.Default value is <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): Boolean = js.native
  /**
    * Gets current value of property <code>iconInset</code>.Defines the indentation of the icon. If set to
    * <code>false</code>, the icon will not be shown as embedded. Instead it will take the full height of
    * the list item.Default value is <code>true</code>.
    * @returns Value of property <code>iconInset</code>
    */
  def getIconInset(): Boolean = js.native
  /**
    * Gets current value of property <code>info</code>.Defines an additional information text.
    * @returns Value of property <code>info</code>
    */
  def getInfo(): String = js.native
  /**
    * Gets current value of property <code>infoState</code>.Defines the state of the information text,
    * e.g. <code>Error</code>, <code>Warning</code>, <code>Success</code>.Default value is
    * <code>None</code>.
    * @returns Value of property <code>infoState</code>
    */
  def getInfoState(): ValueState = js.native
  /**
    * Gets current value of property <code>infoTextDirection</code>.Defines the <code>info</code>
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>infoTextDirection</code>
    */
  def getInfoTextDirection(): TextDirection = js.native
  /**
    * Gets current value of property <code>title</code>.Defines the title of the list item.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  /**
    * Gets current value of property <code>titleTextDirection</code>.Defines the <code>title</code> text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>titleTextDirection</code>
    */
  def getTitleTextDirection(): TextDirection = js.native
  /**
    * Sets a new value for property <code>activeIcon</code>.Defines the icon that is shown while the list
    * item is pressed.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sActiveIcon New value for property <code>activeIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveIcon(sActiveIcon: js.Any): StandardListItem = js.native
  /**
    * Sets a new value for property <code>adaptTitleSize</code>.By default, the title size adapts to the
    * available space and gets bigger if the description is empty. If you have list items with and without
    * descriptions, this results in titles with different sizes. In this case, it can be better to switch
    * the size adaption off by setting this property to <code>false</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.16.3
    * @param bAdaptTitleSize New value for property <code>adaptTitleSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAdaptTitleSize(bAdaptTitleSize: Boolean): StandardListItem = js.native
  /**
    * Sets a new value for property <code>description</code>.Defines the additional information for the
    * title.<b>Note:</b> This is only visible when the <code>title</code> property is not empty.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: String): StandardListItem = js.native
  /**
    * Sets a new value for property <code>icon</code>.Defines the list item icon.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): StandardListItem = js.native
  /**
    * Sets a new value for property <code>iconDensityAware</code>.By default, one or more requests are
    * sent to get the density perfect version of the icon if the given version of the icon doesn't exist
    * on the server.<b>Note:<b> If bandwidth is a key factor for the application, set this value to
    * <code>false</code>.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: Boolean): StandardListItem = js.native
  /**
    * Sets a new value for property <code>iconInset</code>.Defines the indentation of the icon. If set to
    * <code>false</code>, the icon will not be shown as embedded. Instead it will take the full height of
    * the list item.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bIconInset New value for property <code>iconInset</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconInset(bIconInset: Boolean): StandardListItem = js.native
  /**
    * Sets a new value for property <code>info</code>.Defines an additional information text.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sInfo New value for property <code>info</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInfo(sInfo: String): StandardListItem = js.native
  /**
    * Sets a new value for property <code>infoState</code>.Defines the state of the information text, e.g.
    * <code>Error</code>, <code>Warning</code>, <code>Success</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @param sInfoState New value for property <code>infoState</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInfoState(sInfoState: ValueState): StandardListItem = js.native
  /**
    * Sets a new value for property <code>infoTextDirection</code>.Defines the <code>info</code>
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sInfoTextDirection New value for property <code>infoTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInfoTextDirection(sInfoTextDirection: TextDirection): StandardListItem = js.native
  /**
    * Sets a new value for property <code>title</code>.Defines the title of the list item.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): StandardListItem = js.native
  /**
    * Sets a new value for property <code>titleTextDirection</code>.Defines the <code>title</code> text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sTitleTextDirection New value for property <code>titleTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleTextDirection(sTitleTextDirection: TextDirection): StandardListItem = js.native
}

