package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ObjectListItem")
@js.native
class ObjectListItem protected () extends ListItemBase {
  /**
    * Constructor for a new ObjectListItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some attribute to the aggregation <code>attributes</code>.
    * @param oAttribute the attribute to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAttribute(oAttribute: ObjectAttribute): ObjectListItem = js.native
  /**
    * Destroys all the attributes in the aggregation <code>attributes</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyAttributes(): ObjectListItem = js.native
  /**
    * Destroys the firstStatus in the aggregation <code>firstStatus</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyFirstStatus(): ObjectListItem = js.native
  /**
    * Destroys the secondStatus in the aggregation <code>secondStatus</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySecondStatus(): ObjectListItem = js.native
  /**
    * Gets current value of property <code>activeIcon</code>.Icon displayed when the ObjectListItem is
    * active.
    * @returns Value of property <code>activeIcon</code>
    */
  def getActiveIcon(): js.Any = js.native
  /**
    * Gets content of aggregation <code>attributes</code>.List of attributes displayed below the title to
    * the left of the status fields.
    */
  def getAttributes(): js.Array[ObjectAttribute] = js.native
  /**
    * Gets content of aggregation <code>firstStatus</code>.First status text field displayed on the right
    * side of the attributes.
    */
  def getFirstStatus(): ObjectStatus = js.native
  /**
    * Gets current value of property <code>icon</code>.ObjectListItem icon displayed to the left of the
    * title.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>iconDensityAware</code>.By default, this is set to true but
    * then one or more requests are sent trying to get the density perfect version of image (in case this
    * version of image dоesn't exist on the server).If bandwidth is key for the application, set this
    * value to false.Default value is <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>intro</code>.Defines the introductory text for the
    * ObjectListItem.
    * @returns Value of property <code>intro</code>
    */
  def getIntro(): java.lang.String = js.native
  /**
    * Gets current value of property <code>introTextDirection</code>.Determines the text direction of the
    * item intro.Available options for the intro direction are LTR (left-to-right) and RTL
    * (right-to-left).By default the item intro inherits the text direction from its parent.Default value
    * is <code>Inherit</code>.
    * @returns Value of property <code>introTextDirection</code>
    */
  def getIntroTextDirection(): openui5Lib.sapNs.uiNs.coreNs.TextDirection = js.native
  /**
    * Gets current value of property <code>markFavorite</code>.Sets the favorite state for the
    * ObjectListItem.
    * @since 1.16.0
    * @returns Value of property <code>markFavorite</code>
    */
  def getMarkFavorite(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>markFlagged</code>.Sets the flagged state for the
    * ObjectListItem.
    * @since 1.16.0
    * @returns Value of property <code>markFlagged</code>
    */
  def getMarkFlagged(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>markLocked</code>.Sets the locked state of the
    * ObjectListItem.Default value is <code>false</code>.
    * @since 1.28
    * @returns Value of property <code>markLocked</code>
    */
  def getMarkLocked(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>number</code>.Defines the ObjectListItem number.
    * @returns Value of property <code>number</code>
    */
  def getNumber(): java.lang.String = js.native
  /**
    * Gets current value of property <code>numberState</code>.Defines the ObjectListItem number and
    * numberUnit value state.Default value is <code>None</code>.
    * @since 1.16.0
    * @returns Value of property <code>numberState</code>
    */
  def getNumberState(): openui5Lib.sapNs.uiNs.coreNs.ValueState = js.native
  /**
    * Gets current value of property <code>numberTextDirection</code>.Determines the text direction of the
    * item number.Available options for the number direction are LTR (left-to-right) and RTL
    * (right-to-left).By default the item number inherits the text direction from its parent.Default value
    * is <code>Inherit</code>.
    * @returns Value of property <code>numberTextDirection</code>
    */
  def getNumberTextDirection(): openui5Lib.sapNs.uiNs.coreNs.TextDirection = js.native
  /**
    * Gets current value of property <code>numberUnit</code>.Defines the number units qualifier of the
    * ObjectListItem.
    * @returns Value of property <code>numberUnit</code>
    */
  def getNumberUnit(): java.lang.String = js.native
  /**
    * Gets content of aggregation <code>secondStatus</code>.Second status text field displayed on the
    * right side of the attributes.
    */
  def getSecondStatus(): ObjectStatus = js.native
  /**
    * Gets current value of property <code>showMarkers</code>.If set to true, the ObjectListItem can be
    * marked with icons such as favorite and flag.
    * @since 1.16.0
    * @returns Value of property <code>showMarkers</code>
    */
  def getShowMarkers(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>title</code>.Defines the ObjectListItem title.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): java.lang.String = js.native
  /**
    * Gets current value of property <code>titleTextDirection</code>.Determines the text direction of the
    * item title.Available options for the title direction are LTR (left-to-right) and RTL
    * (right-to-left).By default the item title inherits the text direction from its parent.Default value
    * is <code>Inherit</code>.
    * @returns Value of property <code>titleTextDirection</code>
    */
  def getTitleTextDirection(): openui5Lib.sapNs.uiNs.coreNs.TextDirection = js.native
  /**
    * Checks for the provided <code>sap.m.ObjectAttribute</code> in the aggregation
    * <code>attributes</code>.and returns its index if found or -1 otherwise.
    * @param oAttribute The attribute whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfAttribute(oAttribute: ObjectAttribute): scala.Double = js.native
  /**
    * Inserts a attribute into the aggregation <code>attributes</code>.
    * @param oAttribute the attribute to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the attribute should be inserted at; for             a
    * negative value of <code>iIndex</code>, the attribute is inserted at position 0; for a value         
    *    greater than the current size of the aggregation, the attribute is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertAttribute(oAttribute: ObjectAttribute, iIndex: scala.Double): ObjectListItem = js.native
  /**
    * Removes all the controls from the aggregation <code>attributes</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAttributes(): js.Array[ObjectAttribute] = js.native
  def removeAttribute(vAttribute: java.lang.String): ObjectAttribute = js.native
  def removeAttribute(vAttribute: ObjectAttribute): ObjectAttribute = js.native
  /**
    * Removes a attribute from the aggregation <code>attributes</code>.
    * @param vAttribute The attribute to remove or its index or id
    * @returns The removed attribute or <code>null</code>
    */
  def removeAttribute(vAttribute: scala.Double): ObjectAttribute = js.native
  /**
    * Sets a new value for property <code>activeIcon</code>.Icon displayed when the ObjectListItem is
    * active.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sActiveIcon New value for property <code>activeIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveIcon(sActiveIcon: js.Any): ObjectListItem = js.native
  /**
    * Sets the aggregated <code>firstStatus</code>.
    * @param oFirstStatus The firstStatus to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFirstStatus(oFirstStatus: ObjectStatus): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>icon</code>.ObjectListItem icon displayed to the left of the
    * title.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>iconDensityAware</code>.By default, this is set to true but then
    * one or more requests are sent trying to get the density perfect version of image (in case this
    * version of image dоesn't exist on the server).If bandwidth is key for the application, set this
    * value to false.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: scala.Boolean): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>intro</code>.Defines the introductory text for the
    * ObjectListItem.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sIntro New value for property <code>intro</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntro(sIntro: java.lang.String): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>introTextDirection</code>.Determines the text direction of the
    * item intro.Available options for the intro direction are LTR (left-to-right) and RTL
    * (right-to-left).By default the item intro inherits the text direction from its parent.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>Inherit</code>.
    * @param sIntroTextDirection New value for property <code>introTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntroTextDirection(sIntroTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>markFavorite</code>.Sets the favorite state for the
    * ObjectListItem.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @since 1.16.0
    * @param bMarkFavorite New value for property <code>markFavorite</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMarkFavorite(bMarkFavorite: scala.Boolean): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>markFlagged</code>.Sets the flagged state for the
    * ObjectListItem.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @since 1.16.0
    * @param bMarkFlagged New value for property <code>markFlagged</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMarkFlagged(bMarkFlagged: scala.Boolean): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>markLocked</code>.Sets the locked state of the
    * ObjectListItem.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>false</code>.
    * @since 1.28
    * @param bMarkLocked New value for property <code>markLocked</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMarkLocked(bMarkLocked: scala.Boolean): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>number</code>.Defines the ObjectListItem number.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sNumber New value for property <code>number</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNumber(sNumber: java.lang.String): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>numberState</code>.Defines the ObjectListItem number and
    * numberUnit value state.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>None</code>.
    * @since 1.16.0
    * @param sNumberState New value for property <code>numberState</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNumberState(sNumberState: openui5Lib.sapNs.uiNs.coreNs.ValueState): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>numberTextDirection</code>.Determines the text direction of the
    * item number.Available options for the number direction are LTR (left-to-right) and RTL
    * (right-to-left).By default the item number inherits the text direction from its parent.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>Inherit</code>.
    * @param sNumberTextDirection New value for property <code>numberTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNumberTextDirection(sNumberTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>numberUnit</code>.Defines the number units qualifier of the
    * ObjectListItem.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sNumberUnit New value for property <code>numberUnit</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNumberUnit(sNumberUnit: java.lang.String): ObjectListItem = js.native
  /**
    * Sets the aggregated <code>secondStatus</code>.
    * @param oSecondStatus The secondStatus to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSecondStatus(oSecondStatus: ObjectStatus): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>showMarkers</code>.If set to true, the ObjectListItem can be
    * marked with icons such as favorite and flag.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.16.0
    * @param bShowMarkers New value for property <code>showMarkers</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowMarkers(bShowMarkers: scala.Boolean): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>title</code>.Defines the ObjectListItem title.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: java.lang.String): ObjectListItem = js.native
  /**
    * Sets a new value for property <code>titleTextDirection</code>.Determines the text direction of the
    * item title.Available options for the title direction are LTR (left-to-right) and RTL
    * (right-to-left).By default the item title inherits the text direction from its parent.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>Inherit</code>.
    * @param sTitleTextDirection New value for property <code>titleTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleTextDirection(sTitleTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): ObjectListItem = js.native
}

