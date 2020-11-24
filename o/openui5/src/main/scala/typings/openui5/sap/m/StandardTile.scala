package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.ValueState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardTile extends Tile {
  
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): StandardTile = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): StandardTile = js.native
  
  /**
    * Gets current value of property <code>activeIcon</code>.Defines the active icon of the StandardTile.
    * @returns Value of property <code>activeIcon</code>
    */
  def getActiveIcon(): js.Any = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[_] = js.native
  
  /**
    * Gets the icon of the StandardTile control.
    */
  def getIcon(): Unit = js.native
  
  /**
    * Gets current value of property <code>iconDensityAware</code>.By default, this is set to true but
    * then one or more requests are sent trying to get the density perfect version of image if this
    * version of image doesn't exist on the server.If bandwidth is key for the application, set this value
    * to false.Default value is <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): Boolean = js.native
  
  /**
    * Gets current value of property <code>info</code>.Defines the description of the StandardTile.
    * @returns Value of property <code>info</code>
    */
  def getInfo(): String = js.native
  
  /**
    * Gets current value of property <code>infoState</code>.Defines the color of the info text. Possible
    * values are Error, Warning, Success and so on.Default value is <code>None</code>.
    * @returns Value of property <code>infoState</code>
    */
  def getInfoState(): ValueState = js.native
  
  /**
    * Gets current value of property <code>number</code>.Defines the number field of the StandardTile.
    * @returns Value of property <code>number</code>
    */
  def getNumber(): String = js.native
  
  /**
    * Gets current value of property <code>numberUnit</code>.Defines the number units qualifier of the
    * StandardTile.
    * @returns Value of property <code>numberUnit</code>
    */
  def getNumberUnit(): String = js.native
  
  /**
    * Gets current value of property <code>title</code>.Defines the title of the StandardTile.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Gets current value of property <code>type</code>.Defines the type of the StandardTile.Default value
    * is <code>None</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): StandardTileType = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  
  /**
    * Sets a new value for property <code>activeIcon</code>.Defines the active icon of the
    * StandardTile.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sActiveIcon New value for property <code>activeIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveIcon(sActiveIcon: js.Any): StandardTile = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.Defines the icon of the StandardTile.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): StandardTile = js.native
  
  /**
    * Sets a new value for property <code>iconDensityAware</code>.By default, this is set to true but then
    * one or more requests are sent trying to get the density perfect version of image if this version of
    * image doesn't exist on the server.If bandwidth is key for the application, set this value to
    * false.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: Boolean): StandardTile = js.native
  
  /**
    * Sets a new value for property <code>info</code>.Defines the description of the StandardTile.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sInfo New value for property <code>info</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInfo(sInfo: String): StandardTile = js.native
  
  /**
    * Sets a new value for property <code>infoState</code>.Defines the color of the info text. Possible
    * values are Error, Warning, Success and so on.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>None</code>.
    * @param sInfoState New value for property <code>infoState</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInfoState(sInfoState: ValueState): StandardTile = js.native
  
  /**
    * Sets a new value for property <code>number</code>.Defines the number field of the StandardTile.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sNumber New value for property <code>number</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNumber(sNumber: String): StandardTile = js.native
  
  /**
    * Sets a new value for property <code>numberUnit</code>.Defines the number units qualifier of the
    * StandardTile.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sNumberUnit New value for property <code>numberUnit</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNumberUnit(sNumberUnit: String): StandardTile = js.native
  
  /**
    * Sets a new value for property <code>title</code>.Defines the title of the StandardTile.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): StandardTile = js.native
  
  /**
    * Sets a new value for property <code>type</code>.Defines the type of the StandardTile.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>None</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: StandardTileType): StandardTile = js.native
}
