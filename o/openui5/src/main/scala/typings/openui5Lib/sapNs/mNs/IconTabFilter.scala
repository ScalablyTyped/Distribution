package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.IconTabFilter")
@js.native
class IconTabFilter protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Item {
  /**
    * Constructor for a new IconTabFilter.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given.
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @since 1.15.0
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): IconTabFilter = js.native
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @since 1.15.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): IconTabFilter = js.native
  /**
    * Gets content of aggregation <code>content</code>.The content displayed for this item (optional).If
    * this content is set, it is displayed instead of the general content inside the IconTabBar.
    * @since 1.15.0
    */
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Gets current value of property <code>count</code>.Represents the "count" text, which is displayed in
    * the tab filter.Default value is <code></code>.
    * @returns Value of property <code>count</code>
    */
  def getCount(): java.lang.String = js.native
  /**
    * Gets current value of property <code>design</code>.Specifies whether the icon and the texts are
    * placed vertically or horizontally.Default value is <code>Vertical</code>.
    * @returns Value of property <code>design</code>
    */
  def getDesign(): IconTabFilterDesign = js.native
  /**
    * Gets current value of property <code>icon</code>.Specifies the icon to be displayed for the tab
    * filter.Default value is <code></code>.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>iconColor</code>.Specifies the icon color.If an icon font is
    * used, the color can be chosen from the icon colors (sap.ui.core.IconColor).Possible semantic colors
    * are: Neutral, Positive, Critical, Negative.Instead of the semantic icon color the brand color can be
    * used, this is named Default.Semantic colors and brand colors should not be mixed up inside one
    * IconTabBar.Default value is <code>Default</code>.
    * @returns Value of property <code>iconColor</code>
    */
  def getIconColor(): openui5Lib.sapNs.uiNs.coreNs.IconColor = js.native
  /**
    * Gets current value of property <code>iconDensityAware</code>.If set to true, it sends one or more
    * requests,trying to get the density perfect version of the image if this version ofthe image doesn't
    * exist on the server. Default value is set to true.If bandwidth is key for the application, set this
    * value to false.Default value is <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showAll</code>.Enables special visualization for disabled
    * filter (show all items).Default value is <code>false</code>.
    * @returns Value of property <code>showAll</code>
    */
  def getShowAll(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>visible</code>.Specifies whether the tab filter is
    * rendered.Default value is <code>true</code>.
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): scala.Boolean = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @since 1.15.0
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @since 1.15.0
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): IconTabFilter = js.native
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @since 1.15.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def removeContent(vContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def removeContent(vContent: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @since 1.15.0
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Sets a new value for property <code>count</code>.Represents the "count" text, which is displayed in
    * the tab filter.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code></code>.
    * @param sCount New value for property <code>count</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCount(sCount: java.lang.String): IconTabFilter = js.native
  /**
    * Sets a new value for property <code>design</code>.Specifies whether the icon and the texts are
    * placed vertically or horizontally.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Vertical</code>.
    * @param sDesign New value for property <code>design</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDesign(sDesign: IconTabFilterDesign): IconTabFilter = js.native
  /**
    * Sets a new value for property <code>icon</code>.Specifies the icon to be displayed for the tab
    * filter.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code></code>.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): IconTabFilter = js.native
  /**
    * Sets a new value for property <code>iconColor</code>.Specifies the icon color.If an icon font is
    * used, the color can be chosen from the icon colors (sap.ui.core.IconColor).Possible semantic colors
    * are: Neutral, Positive, Critical, Negative.Instead of the semantic icon color the brand color can be
    * used, this is named Default.Semantic colors and brand colors should not be mixed up inside one
    * IconTabBar.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>Default</code>.
    * @param sIconColor New value for property <code>iconColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconColor(sIconColor: openui5Lib.sapNs.uiNs.coreNs.IconColor): IconTabFilter = js.native
  /**
    * Sets a new value for property <code>iconDensityAware</code>.If set to true, it sends one or more
    * requests,trying to get the density perfect version of the image if this version ofthe image doesn't
    * exist on the server. Default value is set to true.If bandwidth is key for the application, set this
    * value to false.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: scala.Boolean): IconTabFilter = js.native
  /**
    * Sets a new value for property <code>showAll</code>.Enables special visualization for disabled filter
    * (show all items).When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @param bShowAll New value for property <code>showAll</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowAll(bShowAll: scala.Boolean): IconTabFilter = js.native
  /**
    * Sets a new value for property <code>visible</code>.Specifies whether the tab filter is rendered.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: scala.Boolean): IconTabFilter = js.native
}

