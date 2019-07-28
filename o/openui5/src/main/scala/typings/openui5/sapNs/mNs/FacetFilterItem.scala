package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.FacetFilterItem")
@js.native
class FacetFilterItem protected () extends ListItemBase {
  /**
    * Constructor for a new FacetFilterItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>count</code>.Defines the number of objects that match this item
    * in the target data set.
    * @returns Value of property <code>count</code>
    */
  def getCount(): Double = js.native
  /**
    * Gets current value of property <code>key</code>.Can be used as input for subsequent actions.
    * @returns Value of property <code>key</code>
    */
  def getKey(): String = js.native
  /**
    * Gets current value of property <code>text</code>.Determines the text to be displayed for the item.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Sets a new value for property <code>key</code>.Can be used as input for subsequent actions.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sKey New value for property <code>key</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKey(sKey: String): FacetFilterItem = js.native
  /**
    * Sets a new value for property <code>text</code>.Determines the text to be displayed for the
    * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): FacetFilterItem = js.native
}

