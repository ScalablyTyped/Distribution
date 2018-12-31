package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.DisplayListItem")
@js.native
class DisplayListItem protected () extends ListItemBase {
  /**
    * Constructor for a new DisplayListItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>label</code>.Defines the label of the list item.
    * @returns Value of property <code>label</code>
    */
  def getLabel(): java.lang.String = js.native
  /**
    * Gets current value of property <code>value</code>.Defines the value of the list item.
    * @returns Value of property <code>value</code>
    */
  def getValue(): java.lang.String = js.native
  /**
    * Gets current value of property <code>valueTextDirection</code>.Defines the <code>value</code> text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>valueTextDirection</code>
    */
  def getValueTextDirection(): openui5Lib.sapNs.uiNs.coreNs.TextDirection = js.native
  /**
    * Sets a new value for property <code>label</code>.Defines the label of the list item.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sLabel New value for property <code>label</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLabel(sLabel: java.lang.String): DisplayListItem = js.native
  /**
    * Sets a new value for property <code>value</code>.Defines the value of the list item.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: java.lang.String): DisplayListItem = js.native
  /**
    * Sets a new value for property <code>valueTextDirection</code>.Defines the <code>value</code> text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sValueTextDirection New value for property <code>valueTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueTextDirection(sValueTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): DisplayListItem = js.native
}

