package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Item")
@js.native
class Item protected () extends Element {
  /**
           * Constructor for a new Item.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new Item.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Gets current value of property <code>enabled</code>.Enabled items can be selected.Default value is
           * <code>true</code>.
           * @returns Value of property <code>enabled</code>
          */
  def getEnabled(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>key</code>.Can be used as input for subsequent actions.
           * @returns Value of property <code>key</code>
          */
  def getKey(): java.lang.String = js.native
  /**
           * Gets current value of property <code>text</code>.The text to be displayed for the item.Default value
           * is <code></code>.
           * @returns Value of property <code>text</code>
          */
  def getText(): java.lang.String = js.native
  /**
           * Gets current value of property <code>textDirection</code>.Options are RTL and LTR. Alternatively, an
           * item can inherit its text direction from its parent control.Default value is <code>Inherit</code>.
           * @returns Value of property <code>textDirection</code>
          */
  def getTextDirection(): TextDirection = js.native
  /**
           * Sets a new value for property <code>enabled</code>.Enabled items can be selected.When called with a
           * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.Default value is <code>true</code>.
           * @param bEnabled New value for property <code>enabled</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setEnabled(bEnabled: scala.Boolean): Item = js.native
  /**
           * Sets a new value for property <code>key</code>.Can be used as input for subsequent actions.When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.
           * @param sKey New value for property <code>key</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setKey(sKey: java.lang.String): Item = js.native
  /**
           * Sets a new value for property <code>text</code>.The text to be displayed for the item.When called
           * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
           * be restored.Default value is <code></code>.
           * @param sText New value for property <code>text</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setText(sText: java.lang.String): Item = js.native
  /**
           * Sets a new value for property <code>textDirection</code>.Options are RTL and LTR. Alternatively, an
           * item can inherit its text direction from its parent control.When called with a value of
           * <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.Default value is <code>Inherit</code>.
           * @param sTextDirection New value for property <code>textDirection</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setTextDirection(sTextDirection: TextDirection): Item = js.native
}

