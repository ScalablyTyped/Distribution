package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.TextDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.GroupHeaderListItem")
@js.native
class GroupHeaderListItem protected () extends ListItemBase {
  /**
    * Constructor for a new GroupHeaderListItem.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
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

