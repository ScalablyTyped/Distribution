package typings
package openui5Lib.sapNs.uiNs.unifiedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.MenuTextFieldItem")
@js.native
class MenuTextFieldItem protected () extends MenuItemBase {
  /**
           * Constructor for a new MenuTextFieldItem element.Accepts an object literal <code>mSettings</code>
           * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
           * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
           * settings object.
           * @param sId Id for the new control, generated automatically if no id is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new MenuTextFieldItem element.Accepts an object literal <code>mSettings</code>
           * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
           * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
           * settings object.
           * @param sId Id for the new control, generated automatically if no id is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Gets current value of property <code>icon</code>.Defines the icon of the {@link sap.ui.core.IconPool
           * sap.ui.core.IconPool} or an image which should be displayed on the item.
           * @returns Value of property <code>icon</code>
          */
  def getIcon(): js.Any = js.native
  /**
           * Gets current value of property <code>label</code>.Defines the label of the text field of the item.
           * @returns Value of property <code>label</code>
          */
  def getLabel(): java.lang.String = js.native
  /**
           * Gets current value of property <code>value</code>.Defines the value of the text field of the item.
           * @returns Value of property <code>value</code>
          */
  def getValue(): java.lang.String = js.native
  /**
           * Gets current value of property <code>valueState</code>.Defines the value state of the text field of
           * the item. This allows you to visualize e.g. warnings or errors.Default value is <code>None</code>.
           * @returns Value of property <code>valueState</code>
          */
  def getValueState(): openui5Lib.sapNs.uiNs.coreNs.ValueState = js.native
  /**
           * Sets a new value for property <code>icon</code>.Defines the icon of the {@link sap.ui.core.IconPool
           * sap.ui.core.IconPool} or an image which should be displayed on the item.When called with a value of
           * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
           * @param sIcon New value for property <code>icon</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setIcon(sIcon: js.Any): MenuTextFieldItem = js.native
  /**
           * Sets a new value for property <code>label</code>.Defines the label of the text field of the
           * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
           * the property will be restored.
           * @param sLabel New value for property <code>label</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setLabel(sLabel: java.lang.String): MenuTextFieldItem = js.native
  /**
           * Sets a new value for property <code>value</code>.Defines the value of the text field of the
           * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
           * the property will be restored.
           * @param sValue New value for property <code>value</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setValue(sValue: java.lang.String): MenuTextFieldItem = js.native
  /**
           * Sets a new value for property <code>valueState</code>.Defines the value state of the text field of
           * the item. This allows you to visualize e.g. warnings or errors.When called with a value of
           * <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.Default value is <code>None</code>.
           * @param sValueState New value for property <code>valueState</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setValueState(sValueState: openui5Lib.sapNs.uiNs.coreNs.ValueState): MenuTextFieldItem = js.native
}

