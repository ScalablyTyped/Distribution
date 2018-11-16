package typings
package openui5Lib.sapNs.uiNs.testNs.actionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.actions.EnterText")
@js.native
class EnterText () extends Action {
  /**
             * Gets current value of property <code>clearTextFirst</code>.Default value is <code>true</code>.
             * @since 1.38.0
             * @returns Value of property <code>clearTextFirst</code>
            */
  def getClearTextFirst(): scala.Boolean = js.native
  /**
             * Gets current value of property <code>text</code>.The Text that is going to be typed to the control.
             * If you are entering an empty string, the value will be cleared.
             * @returns Value of property <code>text</code>
            */
  def getText(): java.lang.String = js.native
  /**
             * Sets a new value for property <code>clearTextFirst</code>.When called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be
             * restored.Default value is <code>true</code>.
             * @since 1.38.0
             * @param bClearTextFirst New value for property <code>clearTextFirst</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setClearTextFirst(bClearTextFirst: scala.Boolean): EnterText = js.native
  /**
             * Sets a new value for property <code>text</code>.The Text that is going to be typed to the control.
             * If you are entering an empty string, the value will be cleared.When called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
             * @param sText New value for property <code>text</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setText(sText: java.lang.String): EnterText = js.native
}

